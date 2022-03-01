/*
 * Copyright (c) 2015, 2020 Oracle and/or its affiliates and others.
 * All rights reserved.
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

package jakarta.security.enterprise.credential;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * <code>BasicAuthenticationCredential</code> extends <code>UsernamePasswordCredential</code>
 * to represent credentials used by HTTP Basic Authentication.
 */
public class BasicAuthenticationCredential extends UsernamePasswordCredential {

    /**
     * Constructor
     *
     * @param authorizationHeader HTTP Basic Authentication header
     */
    public BasicAuthenticationCredential(String authorizationHeader) {
        super(parseUsername(authorizationHeader), parsePassword(authorizationHeader));
    }

    /**
     * Utility for decoding the HTTP Basic Authentication header.
     *
     * @param authorizationHeader  The encoded header
     * @return The decoded header
     */
    private static String decodeHeader(String authorizationHeader) {
        final String BASIC_AUTH_CHARSET = "US-ASCII";

        if (null == authorizationHeader)
            throw new NullPointerException("authorization header");
        if (authorizationHeader.isEmpty())
            throw new IllegalArgumentException("authorization header is empty");
        Base64.Decoder decoder = Base64.getMimeDecoder();
        byte[] decodedBytes = decoder.decode(authorizationHeader);
        try {
            return new String(decodedBytes, BASIC_AUTH_CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Unknown Charset: " + BASIC_AUTH_CHARSET, e);
        }
    }

    /**
     * Utility for parsing the HTTP Basic Authentication username.
     *
     * @param authorizationHeader The encoded header
     * @return The username
     */
    private static String parseUsername(String authorizationHeader) {
        String decodedAuthorizationHeader = decodeHeader(authorizationHeader);
        int delimiterIndex = decodedAuthorizationHeader.indexOf(':');
        if (delimiterIndex > -1) {
            return decodedAuthorizationHeader.substring(0, delimiterIndex);
        } else {
            return decodedAuthorizationHeader;
        }
    }

    /**
     * Utility for parsing the HTTP Basic Authentication password.
     *
     * @param authorizationHeader The encoded header
     * @return The password
     */
    private static Password parsePassword(String authorizationHeader) {
        String decodedAuthorizationHeader = decodeHeader(authorizationHeader);
        int delimiterIndex = decodedAuthorizationHeader.indexOf(':');
        if (delimiterIndex > -1) {
            return new Password(decodedAuthorizationHeader.substring(delimiterIndex + 1));
        } else {
            return new Password("");
        }
    }
}
