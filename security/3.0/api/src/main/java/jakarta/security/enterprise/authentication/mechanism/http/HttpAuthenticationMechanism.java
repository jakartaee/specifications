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

import static jakarta.security.enterprise.AuthenticationStatus.SUCCESS;

import jakarta.security.auth.message.module.ServerAuthModule;
import jakarta.security.enterprise.AuthenticationException;
import jakarta.security.enterprise.AuthenticationStatus;
import jakarta.security.enterprise.identitystore.IdentityStore;
import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * <code>HttpAuthenticationMechanism</code> is a mechanism for obtaining a caller's
 * credentials in some way, using the HTTP protocol where necessary.
 * 
 * <p>
 * This is used to help in securing Jakarta Servlet endpoints, including
 * endpoints that may be build on top of Jakarta Servlets like Jakarta RESTful Web Services endpoints and 
 * Jakarta Faces views. It specifically <b>is not</b> used for endpoints such as remote Jakarta Enterprise Beans
 * or (Jakarta Messaging) message driven beans.
 * 
 * <p>
 * A <code>HttpAuthenticationMechanism</code> is essentially a Jakarta Servlet specific and CDI enabled version of
 * the {@link ServerAuthModule} that adheres to the Servlet Container Profile. See the Jakarta Authentication spec for 
 * further details on this.
 * 
 * <p>
 * Implementations of this class can notify the Jakarta Servlet container about a successful authentication by using the
 * {@link HttpMessageContext#notifyContainerAboutLogin(java.security.Principal, java.util.Set)} method.
 * 
 * <p>
 * Implementations are expected and encouraged to delegate the actual credential validation and/or retrieval of the
 * caller name with optional groups to an {@link IdentityStore}. This is however <b>not</b> required and implementations
 * can either do the validation checks for authentication completely autonomously, or delegate only certain aspects of
 * the process to the store (e.g. use the store only for retrieving the groups an authenticated user is in).
 */
public interface HttpAuthenticationMechanism {

    /**
     * Authenticate an HTTP request.
     * 
     * <p>
     * This method is called in response to an HTTP client request for a resource, and is always invoked 
     * <strong>before</strong> any {@link Filter} or {@link HttpServlet}. Additionally this method is called
     * in response to {@link HttpServletRequest#authenticate(HttpServletResponse)}
     * 
     * <p>
     * Note that by default this method is <strong>always</strong> called for every request, independent of whether
     * the request is to a protected or non-protected resource, or whether a caller was successfully authenticated
     * before within the same HTTP session or not.
     * 
     * <p>
     * A CDI/Interceptor spec interceptor can be used to prevent calls to this method if needed. 
     * See {@link AutoApplySession} and {@link RememberMe} for two examples.
     * 
     * @param request contains the request the client has made
     * @param response contains the response that will be send to the client
     * @param httpMessageContext context for interacting with the container
     * @return the completion status of the processing performed by this method
     * @throws AuthenticationException when the processing failed
     */
    AuthenticationStatus validateRequest(HttpServletRequest request, HttpServletResponse response, HttpMessageContext httpMessageContext) throws AuthenticationException;
   
    /**
     * Secure the response, optionally.
     * 
     * <p>
     * This method is called to allow for any post processing to be done on the request, and is always invoked 
     * <strong>after</strong> any {@link Filter} or {@link HttpServlet}. 
     * 
     * <p>
     * Note that this method is only called when a (Servlet) resource has indeed been invoked, i.e. if a previous call
     * to <code>validateRequest</code> that was invoked before any {@link Filter} or {@link HttpServlet} returned SUCCESS.
     *  
     * @param request contains the request the client has made
     * @param response contains the response that will be send to the client
     * @param httpMessageContext context for interacting with the container
     * @return the completion status of the processing performed by this method
     * @throws AuthenticationException when the processing failed
     */
    default AuthenticationStatus secureResponse(HttpServletRequest request, HttpServletResponse response, HttpMessageContext httpMessageContext) throws AuthenticationException {
        return SUCCESS;
    }
    
    /**
     * Remove mechanism specific principals and credentials from the subject and any other state the mechanism
     * might have used.
     * 
     * <p>
     * This method is called in response to {@link HttpServletRequest#logout()} and gives the authentication mechanism
     * the option to remove any state associated with an earlier established authenticated identity. For example, an
     * authentication mechanism that stores state within a cookie can send remove that cookie here.
     * 
     * @param request contains the request the client has made
     * @param response contains the response that will be send to the client
     * @param httpMessageContext context for interacting with the container
     */
    default void cleanSubject(HttpServletRequest request, HttpServletResponse response, HttpMessageContext httpMessageContext) {
        httpMessageContext.cleanClientSubject();
    }

}
