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

import jakarta.servlet.http.HttpServletRequest;

import jakarta.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;

/**
 * The AuthenticationStatus is used as a return value by primarily
 * the {@link HttpAuthenticationMechanism} to indicate the result (status)
 * of the authentication process.
 * 
 * <p>
 * For the result from {@link HttpAuthenticationMechanism#validateRequest(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse, jakarta.security.enterprise.authentication.mechanism.http.HttpMessageContext)} 
 * an AuthenticationStatus must be transformed by the Jakarta EE server into the corresponding Jakarta Authentication <code>AuthStatus</code>
 * according to the following rules:
 * 
 * <ul>
 *   <li> AuthenticationStatus.NOT_DONE to AuthStatus.SUCCESS </li>
 *   <li> AuthenticationStatus.SEND_CONTINUE to AuthStatus.SEND_CONTINUE </li>
 *   <li> AuthenticationStatus.SUCCESS to AuthStatus.SUCCESS </li>
 *   <li> AuthenticationStatus.SEND_FAILURE to AuthStatus.SEND_FAILURE </li>
 * </ul>
 * 
 * <p>
 * After the transformation as outlined above the transformed result has to be processed by the Jakarta EE server as 
 * specified by the Servlet Container Profile of the Jakarta Authentication spec.
 * 
 * <p>
 * <b>Implementation note:</b> while the Jakarta Authentication Servlet Container Profile is the authoritative
 * source on how to process the <code>AuthStatus.SUCCESS</code> result and this specification puts no constraints 
 * of any kind on that, the expectation is that Jakarta EE servers in practice will mainly look at the 
 * result being <code>AuthStatus.SUCCESS</code> or not <code>AuthStatus.SUCCESS</code>. Simply said, if the result is 
 * <code>AuthStatus.SUCCESS</code> the authenticated identity (if any) must be set (established) for the current HTTP request, 
 * otherwise not.
 * 
 * <p>
 * The return value of {@link SecurityContext#authenticate(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse, jakarta.security.enterprise.authentication.mechanism.http.AuthenticationParameters)}
 * , which is also of type AuthenticationStatus, strongly relates to the outcome of the <code>HttpAuthenticationMechanism#validateRequest</code>
 * method as described above, but must be transformed by the Jakarta EE server from the corresponding outcome of the
 * {@link HttpServletRequest#authenticate(jakarta.servlet.http.HttpServletResponse)} call as follows:
 * 
 * <ul>
 *   <li> <code>true</code> to <code>AuthenticationStatus.SUCCESS</code> </li>
 *   <li> <code>false</code> to <code>[last status]</code> (see below) </li>
 *   <li> <code>ServletException</code> or <code>IOException</code> to <code>AuthenticationStatus.SEND_FAILURE</code> </li>
 * </ul>
 * 
 * <p>
 * When an <code>HttpAuthenticationMechanism</code> was used <code>[last status]</code> must be
 * the value returned by <code>HttpAuthenticationMechanism#validateRequest</code>.
 * 
 * <p>
 * When a Jakarta Authentication ServerAuthModule (SAM) was used and an <code>HttpAuthenticationMechanism</code> 
 * was <em>not</em> used Jakarta EE servers are encouraged, but not required, to set <code>[last status]</code> 
 * to the value returned by <code>ServerAuthModule#validateRequest</code> transformed as follows:
 * 
 * <ul>
 *   <li> AuthStatus.SEND_CONTINUE to AuthenticationStatus.SEND_CONTINUE </li>
 *   <li> AuthStatus.SUCCESS to AuthenticationStatus.SUCCESS </li>
 *   <li> AuthStatus.SEND_FAILURE to AuthenticationStatus.SEND_FAILURE </li>
 *   <li> (all other outcomes) to AuthenticationStatus.NOT_DONE </li>
 * </ul>
 * 
 * <p>
 * When a Jakarta EE Server proprietary identity store equivalent was used and an 
 * <code>HttpAuthenticationMechanism</code> was <em>not</em> used 
 * Jakarta EE servers are encouraged, but not required, to set <code>[last status]</code> to a value
 * that logically corresponds to the description of each enum constant of AuthenticationStatus. This outcome
 * should never be depended on by application code as being portable.
 * 
 * <p>
 * Application code calling <code>SecurityContext#authenticate</code> is expected to act on all possible
 * values of AuthenticationStatus.
 * 
 */
public enum AuthenticationStatus {

    /**
     * The authentication mechanism was called, but decided not to authenticate.
     * This status would be typically returned in pre-emptive security; the authentication
     * mechanism is called, but authentication is optional and would only take place when for
     * instance a specific request header is present.
     */
    NOT_DONE,
    
    /**
     * The authentication mechanism was called and a multi-step authentication dialog with the caller
     * has been started (for instance, the caller has been redirected to a login page). Simply said 
     * authentication is "in progress". Calling application code (if any) should not write to the response
     * when this status is received. 
     */
    SEND_CONTINUE,
    
    /**
     * The authentication mechanism was called and the caller was successfully authenticated. After the
     * Jakarta EE server has processed this outcome, the caller principal is available.
     */
    SUCCESS,
    
    /**
     * The authentication mechanism was called but the caller was <em>not</em> successfully authenticated and
     * therefore the caller principal will not be made available.
     * <p>
     * Note that this status should be used to indicate a logical problem (such as a credential not matching or a caller
     * ID that can not be found). Exceptions should be used for system level problems (such as a database connection timing out).
     */
    SEND_FAILURE
}
