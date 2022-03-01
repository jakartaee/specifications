/*
 * Copyright (c) 2021, 2022 Contributors to the Eclipse Foundation
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
 *
 */

/*
 *
 * Contributors:
 *   2021 : Payara Foundation and/or its affiliates
 *      Initially authored in Security Connectors
 */
package jakarta.security.enterprise.identitystore.openid;

import java.util.Map;

/**
 * The Access Token is used by an application to access protected resources.
 *
 * @author jGauravGupta
 * @author Rudy De Busscher
 */
public interface AccessToken {

    /**
     * @return The access token
     */
    String getToken();

    /**
     * Signify, if access token is JWT based, or opaque.
     *
     * @return true if access token is JWT token.
     */
    boolean isJWT();

    /**
     * Access token's claims
     *
     * @return access token claims if it is a JWT Token, {@link JwtClaims#NONE} otherwise.
     */
    JwtClaims getJwtClaims();

    /**
     * @return the access token's claims that was received from the OpenId Connect
     * provider
     */
    Map<String, Object> getClaims();

    /**
     * @param key the claim key
     * @return the identity token's claim based on requested key type or null if not provided
     */
    Object getClaim(String key);

    /**
     * Optional. Expiration time of the Access Token in seconds since the
     * response was generated.
     *
     * @return the expiration time of the Access Token or null if expiration time is not known
     */
    Long getExpirationTime();

    /**
     * Checks if the Access Token is expired, taking into account the min
     * validity time configured by the user.
     *
     * @return {@code true}, if access token is expired or it will be expired in
     * the next X milliseconds configured by user.
     */
    boolean isExpired();

    /**
     * Optional. Scope of the Access Token.
     *
     * @return the scope of the Access Token
     */
    Scope getScope();

    /**
     * @return the Type of the Access Token
     */
    Type getType();

    enum Type {
        BEARER, // Json Web Token (JWT) format
        MAC; // Message Authentication Code format
    }
}
