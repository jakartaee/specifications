/*
 * Copyright (c) 2015, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.security.enterprise;

import java.security.Principal;
import java.util.Set;

import jakarta.security.enterprise.authentication.mechanism.http.AuthenticationParameters;
import jakarta.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * The SecurityContext provides an access point for programmatic security; an injectable type that is intended to be
 * used by application code to query and interact with Jakarta Security.
 *
 * <p>
 * Unless otherwise indicated, this type must be usable in all Jakarta EE containers, specifically the Jakarta Servlet
 * and Jakarta Enterprise Beans containers.
 *
 */
public interface SecurityContext {

    /**
     * Retrieve the platform-specific <code>java.security.Principal</code> that represents
     * the name of authenticated caller, or null if the current caller is not authenticated.
     *
     * @return Principal representing the name of the current authenticated user, or null if not authenticated.
     */
    Principal getCallerPrincipal();

    /**
     * Retrieve all Principals of the given type from the authenticated caller's Subject,
     * or an empty set if the current caller is not authenticated, or if the specified type
     * isn't found in the Subject.
     * <p>
     * This can be used to retrieve application-specific
     * Principals when the platform's representation of the caller uses a different principal type.
     * <p>
     * The returned Set is not backed by the Subject's internal Principal Set.
     * A new Set is created and returned for each method invocation.
     * Modifications to the returned Set will not affect the internal Principal Set.
     *
     * @param pType Class object representing the type of Principal to return.
     * @param <T> The actual type represented by the <code>pType</code> argument
     *
     * @return Set of Principals of the given type, or an empty set.
     */
    <T extends Principal> Set<T> getPrincipalsByType(Class<T> pType);

    /**
     * Checks whether the authenticated caller is included in the specified logical <em>application</em> "role".
     * If the caller is not authenticated, this always returns <code>false</code>.
     *
     * <p>
     * This method <em>can not</em> be used to test for roles that are mapped to specific named Jakarta Servlets or
     * named Jakarta Enterprise Beans. For a Servlet an example of this would be the <code>role-name</code> nested in a
     * <code>security-role-ref</code> element nested in a <code>servlet</code> element in <code>web.xml</code>.
     *
     * <p>
     * Should code in either such Jakarta Servlet or Jakarta Enterprise Bean wish to take such mapped (aka referenced, linked)
     * roles into account, the facilities for that specific container should be used instead. For instance for Servlet that
     * would be {@link HttpServletRequest#isUserInRole(String)} and for Jakarta Enterprise Beans that would be
     * {@link jakarta.ejb.SessionContext#isCallerInRole(String)}.
     *
     * @param role a <code>String</code> specifying the name of the logical application role
     * @return <code>true</code> if the authenticated caller is in the given role, false if the caller is not authentication or
     * is not in the given role.
     */
    boolean isCallerInRole(String role);

    /**
     * Checks whether the caller has access to the provided "web resource" using the given methods,
     * as specified by section 13.8 of the Servlet specification.
     *
     * <p>
     * A caller has access if the web resource is either not protected (constrained), or when it is protected by a role
     * and the caller is in that role.
     *
     * @param resource the name of the web resource to test access for. This is a <code>URLPatternSpec</code> that
     * identifies the application specific web resources to which the permission pertains. For a full specification of this
     * pattern see {@link jakarta.security.jacc.WebResourcePermission#WebResourcePermission(String, String)}.
     * @param methods one or more methods to check for whether the caller has access to the web resource using one of those methods.
     *
     * @return <code>true</code> if the caller has access to the web resource using one of the given methods, <code>false</code> otherwise.
     */
    boolean hasAccessToWebResource(String resource, String... methods);

    /**
     * Signal to the container (programmatically trigger) that it should start or continue a web/HTTP based authentication dialog with
     * the caller.
     *
     * <p>
     * Programmatically triggering means that the container responds as if the caller had attempted to access a constrained resource
     * and acts by invoking a configured authentication mechanism (such as the {@link HttpAuthenticationMechanism}).
     *
     * <p>
     * Whether the authentication dialog is to be started or continued depends on the (logical) state of the authentication dialog. If
     * such dialog is currently in progress, a call to this method will continue it. If such dialog is not in progress a new one will be
     * started. A new dialog can be forced to be started regardless of one being in progress or not by providing a value of
     * <code>true</code> for the {@link AuthenticationParameters#newAuthentication} parameter with this call.
     *
     * <p>
     * This method requires an {@link HttpServletRequest} and {@link HttpServletResponse} argument to be passed in, and
     * can therefore only be used in a valid Servlet context.
     *
     * @param request The <code>HttpServletRequest</code> associated with the current web resource invocation.
     * @param response The <code>HttpServletResponse</code> associated with the given <code>HttpServletRequest</code>.
     * @param parameters The parameters that are provided along with a programmatic authentication request, for instance the credentials.
     * collected by the application for continuing an authentication dialog.
     *
     * @return The state of the authentication mechanism after being triggered by this call
     */
    AuthenticationStatus authenticate(HttpServletRequest request, HttpServletResponse response, AuthenticationParameters parameters);

}
