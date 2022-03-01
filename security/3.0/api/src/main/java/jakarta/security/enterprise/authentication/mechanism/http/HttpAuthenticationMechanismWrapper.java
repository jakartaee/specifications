/*
 * Copyright (c) 2021 Contributors to Eclipse Foundation.
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

import jakarta.security.enterprise.AuthenticationException;
import jakarta.security.enterprise.AuthenticationStatus;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * This class is an implementation of the <code>HttpAuthenticationMechanism</code> interface that
 * can be subclassed by developers wishing to provide extra or different
 * functionality.
 * <p>
 * All methods default to calling the wrapped object.
 *
 * @since 3.0
 */
public class HttpAuthenticationMechanismWrapper implements HttpAuthenticationMechanism {

    private final HttpAuthenticationMechanism httpAuthenticationMechanism;

    /**
     * This constructor is intended for proxy usuage only.
     */
    public HttpAuthenticationMechanismWrapper() {
        httpAuthenticationMechanism = null;
    }

    /**
     * Constructs the wrapper with the object being delegated to.
     * @param httpAuthenticationMechanism The wrapped object which all methods call.
     */
    public HttpAuthenticationMechanismWrapper(HttpAuthenticationMechanism httpAuthenticationMechanism) {
        this.httpAuthenticationMechanism = httpAuthenticationMechanism;
    }

    /**
     * Returns the object that's being wrapped.
     *
     * @return the object that's being wrapped.
     */
    public HttpAuthenticationMechanism getWrapped() {
        return httpAuthenticationMechanism;
    }

    @Override
    public AuthenticationStatus validateRequest(HttpServletRequest request, HttpServletResponse response,
            HttpMessageContext httpMessageContext) throws AuthenticationException {
        return getWrapped().validateRequest(request, response, httpMessageContext);
    }

    @Override
    public AuthenticationStatus secureResponse(HttpServletRequest request, HttpServletResponse response,
            HttpMessageContext httpMessageContext) throws AuthenticationException {
        return getWrapped().secureResponse(request, response, httpMessageContext);
    }

    @Override
    public void cleanSubject(HttpServletRequest request, HttpServletResponse response, HttpMessageContext httpMessageContext) {
        getWrapped().cleanSubject(request, response, httpMessageContext);
    }

}