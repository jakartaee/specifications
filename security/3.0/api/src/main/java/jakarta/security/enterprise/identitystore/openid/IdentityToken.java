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
 * Identity tokens is a security token that issued in authentication flow
 * process.
 *
 * @author jGauravGupta
 * @author Rudy De Busscher
 */
public interface IdentityToken {

    /**
     * @return the identity token
     */
    String getToken();

    /**
     * Claims of this token
     * @return claims of this token
     */
    JwtClaims getJwtClaims();

    /**
     * Checks if the Identity Token is expired.
     *
     * @return {@code true}, if identity token is expired or it will be expired in
     * the next X milliseconds configured by user.
     */
    boolean isExpired();

    /**
     * @return the identity token's claims that was received from the OpenId
     * Connect provider
     */
    Map<String, Object> getClaims();

}
