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

import java.security.GeneralSecurityException;

import jakarta.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;

/**
 * A generic authentication exception.
 * 
 * This exception corresponds to the Jakarta Authentication <code>AuthException</code> in that whenever a 
 * method from the {@link HttpAuthenticationMechanism} throws this exception, the Jakarta Authentication 
 * bridge has to throw an <code>AuthException</code> back to the Jakarta Authentication runtime wrapping 
 * this exception.
 *
 */
public class AuthenticationException extends GeneralSecurityException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new <code>AuthenticationException</code> exception with <code>null</code> as its detail message.
     */
    public AuthenticationException() {
        super();
    }

    /**
     * Constructs a new <code>AuthenticationException</code> exception with the specified detail message.
     * 
     * @param message
     *            the detail message.
     */
    public AuthenticationException(String message) {
        super(message);
    }

    /**
     * Constructs a new <code>AuthenticationException</code> exception with the specified detail message and cause.
     * 
     * @param message
     *            the detail message.
     * @param cause
     *            the cause.
     */
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new <code>AuthenticationException</code> exception with the specified cause.
     * 
     * @param cause
     *            the cause.
     */
    public AuthenticationException(Throwable cause) {
        super(cause);
    }

}
