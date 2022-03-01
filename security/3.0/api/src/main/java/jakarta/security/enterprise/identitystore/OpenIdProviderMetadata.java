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
package jakarta.security.enterprise.identitystore;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * {@link OpenIdProviderMetadata} annotation overrides the openid connect
 * provider's endpoint value, discovered using providerUri.
 *
 * @author Gaurav Gupta
 * @author Rudy De Busscher
 */
@Retention(RUNTIME)
public @interface OpenIdProviderMetadata {

    /**
     * Required. The URL for the OAuth2 provider to provide authentication.
     * This must be a https endpoint.
     *
     * @return URL for the OAuth2 provider.
     */
    String authorizationEndpoint() default "";

    /**
     * Required. The URL for the OAuth2 provider to give the authorization token

     *
     * @return URL for the OAuth2 provider.
     */
    String tokenEndpoint() default "";

    /**
     * Required. An OAuth 2.0 Protected Resource that returns Claims about the
     * authenticated End-User.
     *
     * @return URL for User Info.
     */
    String userinfoEndpoint() default "";

    /**
     * Optional. OP endpoint to notify that the End-User has logged out of the
     * site and might want to log out of the OP as well.
     *
     * @return URL for logging out of server session.
     */
    String endSessionEndpoint() default "";

    /**
     * Required. An OpenId Connect Provider's JSON Web Key Set document
     * <p>
     * This contains the signing key(s) the RP uses to validate signatures from
     * the OP. The JWK Set may also contain the Server's encryption key(s),
     * which are used by RPs to encrypt requests to the Server.
     * </p>
     *
     * @return URL pointing to the JWK Set.
     */
    String jwksURI() default "";


    /**
     * Required. The issuer of the tokens issued by the Provider.
     * @return
     */
    String issuer() default "";


    /**
     * Required. The supported subject Types by the Provider.
     * @return
     */
    String subjectTypeSupported() default "public";

    /**
     * Required. The supported Signing algorithms for the ID token by provider.
     * @return
     */
    String idTokenSigningAlgorithmsSupported() default "RS256";


    /**
     * Required. The supported response types by the Provider.
     * @return
     */
    String responseTypeSupported() default "code,id_token,token id_token";
}
