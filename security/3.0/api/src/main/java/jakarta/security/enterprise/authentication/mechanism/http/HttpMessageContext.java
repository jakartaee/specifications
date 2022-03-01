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

package jakarta.security.enterprise.authentication.mechanism.http;

import java.security.Principal;
import java.util.Set;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;

import jakarta.security.auth.message.MessageInfo;
import jakarta.security.enterprise.AuthenticationStatus;
import jakarta.security.enterprise.CallerPrincipal;
import jakarta.security.enterprise.SecurityContext;
import jakarta.security.enterprise.identitystore.CredentialValidationResult;
import jakarta.security.enterprise.identitystore.CredentialValidationResult.Status;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * <code>HttpMessageContext</code> contains all of the per-request state information and encapsulates the client request, 
 * server response, container handler for authentication callbacks, and the subject representing the caller.
 *
 */
public interface HttpMessageContext {

    /**
     * Checks if the currently requested resource is protected or not. A protected resource is a resource (e.g. a Jakarta
     * Servlet, Jakarta Faces page, Jakarta Server Pages page etc) for which a constraint has been defined in e.g.
     * <code>web.xml</code>.
     * 
     * @return true if a protected resource was requested, false if a public resource was requested.
     */
    boolean isProtected();

    /**
     * Checks if the current call to an authentication mechanism is the result from the 
     * application calling {@link SecurityContext#authenticate(HttpServletRequest, HttpServletResponse, AuthenticationParameters)}
     * <p>
     * If SecurityContext#authenticate was not called, the authentication mechanism may have been invoked by the 
     * container at the start of a request.
     * 
     * @return true if SecurityContext#authenticate was called, false if not.
     */
    boolean isAuthenticationRequest();

    /**
     * Check if the runtime has been asked to register an authentication session duing the current request.
     * 
     * @return true if code has asked to register an authentication session, false otherwise.
     */
    boolean isRegisterSession();

    /**
     * Asks the runtime to register an authentication session. This will automatically remember the logged-in status
     * as long as the current HTTP session remains valid. Without this being asked, a {@link HttpAuthenticationMechanism} 
     * has to manually re-authenticate with the runtime at the start of each request.
     * 
     * @param callerName the caller name for which authentication should be be remembered
     * @param groups the groups for which authentication should be remembered.
     */
    void setRegisterSession(String callerName, Set<String> groups);

    /**
     * Convenience method to clean the subject associated with this context.
     * 
     * <p>
     * Cleaning this subject is done as defined by the Servlet Container Profile of Jakarta Authentication
     * for the ServerAuthModule#cleanSubject method and the 
     * {@link HttpAuthenticationMechanism#cleanSubject(HttpServletRequest, HttpServletResponse, HttpMessageContext)} 
     * method defined by this specification.
     */
    void cleanClientSubject();

    /**
     * Returns the parameters that were provided with the SecurityContext#authenticate(AuthParameters) call.
     *  
     * @return the parameters that were provided with the SecurityContext#authenticate(AuthParameters) call, or a default instance. Never null.
     */
    AuthenticationParameters getAuthParameters();

    /**
     * Returns the low level Jakarta Authentication handler that the runtime provided when creating this 
     * {@link HttpMessageContext}, and which this context uses to communicate the authentication details to the runtime.
     * 
     * <p>
     * <em>Note:</em> This is a low level object that most higher level code would not need to use directly.
     * 
     * @return the handler that the runtime provided to this context
     */
    CallbackHandler getHandler();

    /**
     * Returns the the low level Jakarta Authentication message info instance for the current request.
     * 
     * <p>
     * <em>Note:</em> This is a low level object that most higher level code would not need to use directly.
     * 
     * @return the message info instance for the current request.
     */
    MessageInfo getMessageInfo();

    /**
     * Returns the subject for which authentication is to take place.
     * 
     * <p>
     * <em>Note:</em> This is a low level object that most higher level code would not need to use directly.
     * 
     * @return the subject for which authentication is to take place.
     */
    Subject getClientSubject();

    /**
     * Returns the request object associated with the current request.
     * 
     * @return the request object associated with the current request.
     */
    HttpServletRequest getRequest();
    
    /**
     * Sets the request object.
     * 
     * @param request the request object to be set
     * 
     */
    void setRequest(HttpServletRequest request);
    
    /**
     * Sets the request object.
     * 
     * @param request the request object to be set.
     * 
     * @return the HttpMessageContext instance on which this method was called, useful for
     * fluent style call call chains.
     */
    HttpMessageContext withRequest(HttpServletRequest request);

    /**
     * Returns the response object associated with the current request.
     * 
     * @return the response object associated with the current request.
     */
    HttpServletResponse getResponse();
    
    /**
     * Set the response object.
     * 
     * @param response the response object to be set.
     */
    void setResponse(HttpServletResponse response);
    
    /**
     * Sets the response status to SC_FOUND 302 (Found)
     * 
     * <p>
     * As a convenience this method returns SEND_CONTINUE, so this method can be used in
     * one fluent return statement from an {@link HttpAuthenticationMechanism}
     * 
     * @param location the location to redirect to
     * 
     * @return {@link AuthenticationStatus#SEND_CONTINUE}
     * 
     * @see HttpServletResponse#sendRedirect(String)
     */
    AuthenticationStatus redirect(String location);
    
    /**
     * Forwards to another resource (Jakarta Servlet, Jakarta Server Pages file, or HTML file) on the server.
     * 
     * <p>
     * As a convenience this method returns SEND_CONTINUE, so this method can be used in
     * one fluent return statement from an {@link HttpAuthenticationMechanism}
     * 
     * @param path a String specifying the pathname to the resource.
     * 
     * @return {@link AuthenticationStatus#SEND_CONTINUE}
     * 
     * @see RequestDispatcher#forward(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse)
     */
    AuthenticationStatus forward(String path);

    /**
     * Sets the response status to 401 (unauthorized).
     * <p>
     * As a convenience this method returns SEND_FAILURE, so this method can be used in
     * one fluent return statement from an {@link HttpAuthenticationMechanism}
     * 
     * @return {@link AuthenticationStatus#SEND_FAILURE}
     */
    AuthenticationStatus responseUnauthorized();

    /**
     * Sets the response status to 404 (not found).
     * <p>
     * As a convenience this method returns SEND_FAILURE, so this method can be used in
     * one fluent return statement from an {@link HttpAuthenticationMechanism}
     * 
     * @return {@link AuthenticationStatus#SEND_FAILURE}
     */
    AuthenticationStatus responseNotFound();

    /**
     * Asks the container to register the given caller name and groups in order to make
     * them available to the application for use with {@link SecurityContext#isCallerInRole(String)} etc.
     *
     * <p>
     * Note that after this call returned, the authenticated identity will not be immediately active. This
     * will only take place (should no errors occur) after the authentication mechanism
     * in which this call takes place returns control back to the container (runtime).
     * 
     * <p>
     * As a convenience this method returns SUCCESS, so this method can be used in
     * one fluent return statement from an {@link HttpAuthenticationMechanism}
     * 
     * @param callername the caller name that will become the caller principal
     * @param groups the groups associated with the caller principal
     * @return {@link AuthenticationStatus#SUCCESS}
     *
     */
    AuthenticationStatus notifyContainerAboutLogin(String callername, Set<String> groups);
    
    /**
     * Asks the container to register the given caller principal and groups in order to make
     * them available to the application for use with {@link SecurityContext#isCallerInRole(String)} etc.
     * 
     * <p>
     * Note that this call may result in the container establishing two caller principals to
     * represent the caller's identity -- the Principal provided here as the principal parameter,
     * and a second principal used as the container's representation of the caller identity.
     * A second principal is added only if the container uses a different Principal type to
     * represent the caller. If the types are the same, only one Principal is added.
     * 
     * <p>
     * If a second principal is added, the value returned by {@link Principal#getName()}
     * will be the same for both principals.
     * 
     * <p>
     * When two principals are added, the container's caller principal is returned from
     * {@link SecurityContext#getCallerPrincipal()}, and the principal supplied here
     * as a parameter can be retrieved using {@link SecurityContext#getPrincipalsByType(Class)}.
     * When only one is added, it is returned by {@link SecurityContext#getCallerPrincipal()}.
     *
     * <p>
     * Note that after this call returned, the authenticated identity will not be immediately active. This
     * will only take place (should no errors occur) after the authentication mechanism
     * in which this call takes place returns control back to the container (runtime).
     * 
     * <p>
     * As a convenience this method returns SUCCESS, so this method can be used in
     * one fluent return statement from an {@link HttpAuthenticationMechanism}
     * 
     * @param principal the Principal that will become the caller principal
     * @param groups the groups associated with the caller principal
     * @return {@link AuthenticationStatus#SUCCESS}
     *
     */
    AuthenticationStatus notifyContainerAboutLogin(Principal principal, Set<String> groups);
    
    /**
     * Convenience method intended to pass the <code>CredentialValidationResult</code> result of an 
     * identity store directly on to the container.
     * 
     * <p>
     * If the outcome from the given {@link CredentialValidationResult#getStatus()} equals
     * {@link Status#VALID}, the {@link CallerPrincipal} and groups are obtained from the
     * <code>CredentialValidationResult</code> and passed into 
     * {@link HttpMessageContext#notifyContainerAboutLogin(Principal, Set)}.
     * 
     * <p>
     * If the outcome from the given {@link CredentialValidationResult#getStatus()} is not 
     * equal to {@link Status#VALID} a failure result is returned.
     * 
     * @param result a CredentialValidationResult which is inspected for its status and from which the principal and groups 
     * are taken.
     * 
     * @return {@link AuthenticationStatus#SUCCESS} if {@link CredentialValidationResult#getStatus()} 
     * equals {@link Status#VALID} otherwise {@link AuthenticationStatus#SEND_FAILURE}
     *
     */
    AuthenticationStatus notifyContainerAboutLogin(CredentialValidationResult result);

    /**
     * Instructs the container to "do nothing".
     * 
     * <p>
     * When intending to do nothing, a Jakarta Security authentication mechanism has to indicate this
     * explicitly via its return value.
     * 
     * <p>
     * As a convenience this method returns NOT_DONE, so this method can be used in
     * one fluent return statement from an {@link HttpAuthenticationMechanism}
     * 
     * @return {@link AuthenticationStatus#NOT_DONE}
     */
    AuthenticationStatus doNothing();
    
    /**
     * Gets the Principal set by a call to notifyContainerAboutLogin().
     * 
     * @return The caller principal
     */
    Principal getCallerPrincipal();

    /**
     * Gets the groups set by a call to notifyContainerAboutLogin().
     * 
     * @return The groups
     */
    Set<String> getGroups();

}
