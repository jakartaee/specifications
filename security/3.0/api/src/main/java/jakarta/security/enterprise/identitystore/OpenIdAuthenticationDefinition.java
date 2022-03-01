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

import jakarta.security.enterprise.identitystore.openid.OpenIdConstant;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * {@link OpenIdAuthenticationDefinition} annotation defines openid connect
 * client configuration and The value of each parameter can be defined as Expression.
 * Supports the Authorization Code flow of OpenId Connect specification https://openid.net/specs/openid-connect-core-1_0.html#CodeFlowAuth
 * and Refresh tokens https://openid.net/specs/openid-connect-core-1_0.html#RefreshTokens.
 * It can make use of the user endpoint for retrieving claims about the user.
 *
 * @author Gaurav Gupta
 * @author Rudy De Busscher
 */
@Target({TYPE, METHOD})
@Retention(RUNTIME)
public @interface OpenIdAuthenticationDefinition {

    /**
     * Required or information need to be defined through providerMetadata member.
     * The provider uri ( http://openid.net/specs/openid-connect-discovery-1_0.html ) to read /
     * discover the metadata of the openid provider.
     *
     * @return
     */
    String providerURI() default "";

    /**
     * To override the openid connect provider's metadata property discovered
     * via providerUri.
     *
     * @return OpenIdProviderMetadata instance.
     */
    OpenIdProviderMetadata providerMetadata() default @OpenIdProviderMetadata;

    /**
     * Optional. The claims definition defines the custom claims mapping of
     * caller name and groups.
     *
     * @return
     */
    ClaimsDefinition claimsDefinition() default @ClaimsDefinition;

    /**
     * Optional. The Logout definition defines the logout and RP session
     * management configuration.
     *
     * @return
     */
    LogoutDefinition logout() default @LogoutDefinition;

    /**
     * Required. The client identifier issued when the application was
     * registered.
     *
     * @return the client identifier
     */
    String clientId() default "";

    /**
     * Required. The client secret, it is recommended to set this using an Expression so that value
     * is not hardcoded within the code..
     *
     * @return
     */
    String clientSecret() default "";

    /**
     * The redirect URI to which the response will be sent by OpenId Connect
     * Provider. This URI must exactly match one of the Redirection URI values
     * for the Client pre-registered at the OpenID Provider.
     *
     * @return
     */
    String redirectURI() default "${baseURL}/Callback";

    /**
     * Optional. The scope value defines the access privileges. The basic (and
     * required) scope for OpenID Connect is the openid scope.
     *
     * @return
     */
    String[] scope() default {OpenIdConstant.OPENID_SCOPE, OpenIdConstant.EMAIL_SCOPE, OpenIdConstant.PROFILE_SCOPE};

    /**
     * Optional. Allows The scope value to be specified as Jakarta Expression Language expression.
     * If Set, overrides any values set by scope.
     *
     * @return
     */
    String scopeExpression() default "";

    /**
     * Optional. Response Type value defines the processing flow to be used. By
     * default, the value is code (Authorization Code Flow).
     *
     * @return
     */
    String responseType() default OpenIdConstant.CODE;

    /**
     * Optional. Informs the Authorization Server of the mechanism to be used
     * for returning parameters from the Authorization Endpoint.
     *
     * @return
     */
    String responseMode() default "";

    /**
     * Optional. The prompt value specifies whether the authorization server
     * prompts the user for reauthentication and consent. If no value is
     * specified and the user has not previously authorized access, then the
     * user is shown a consent screen.
     *
     * @return
     */
    PromptType[] prompt() default {};

    /**
     * Optional. Allows the  prompt value to be specified as Jakarta Expression Language expression.
     * If Set, overirdes the value defined by the prompt value.
     *
     * @return
     */
    String promptExpression() default "";

    /**
     * Optional. The display value specifying how the authorization server
     * displays the authentication and consent user interface pages.
     *
     * @return
     */
    DisplayType display() default DisplayType.PAGE;

    /**
     * Optional. Allows the display value to be specified as Jakarta Expression Language expression.
     * If set, overrides the value defined by display.
     *
     * @return
     */
    String displayExpression() default "";

    /**
     * Optional. Enables string value used to mitigate replay attacks.
     *
     * @return
     */
    boolean useNonce() default true;

    /**
     * Optional. Allows the nonce activation to be specified as Jakarta Expression Language expression.
     * If set, overrides the value defined by the useNonce value.
     *
     * @return
     */
    String useNonceExpression() default "";

    /**
     * Optional. If enabled state and nonce value stored in session otherwise in
     * cookies.
     *
     * @return
     */
    boolean useSession() default true;

    /**
     * Optional. Allows the configuration of the session through a Jakarta Expression Language expression.
     * If set, overwrites the value of useSession value.
     *
     * @return
     */
    String useSessionExpression() default "";

    /**
     * An array of extra options that will be sent to the OAuth provider.
     * <p>
     * These must be in the form of {@code "key=value"} i.e.
     * <code> extraParameters={"key1=value", "key2=value2"} </code>
     *
     * @return
     */
    String[] extraParameters() default {};

    /**
     * Allows the extra parameters to be defined as a Jakarta Expression Language expression.
     * If set, overrides the extraParameters value.
     *
     * @return
     */
    String extraParametersExpression() default "";

    /**
     * Optional. Sets the connect timeout(in milliseconds) for Remote JWKS
     * retrieval. Value must not be negative and if value is zero then infinite
     * timeout.
     *
     * @return
     */
    int jwksConnectTimeout() default 500;

    /**
     * Optional. Allows the connect timeout(in milliseconds) for Remote JWKS to be defined as
     * Jakarta Expression Language expression.
     * If set, overwrites the  jwksConnectTimeout value.
     *
     * @return
     */
    String jwksConnectTimeoutExpression() default "";

    /**
     * Optional. Sets the read timeout(in milliseconds) for Remote JWKS
     * retrieval. Value must not be negative and if value is zero then infinite
     * timeout.
     *
     * @return
     */
    int jwksReadTimeout() default 500;

    /**
     * Optional. Allows the read timeout(in milliseconds) for Remote JWKS
     * retrieval to be defined as Jakarta Expression Language expression.
     * If set, overwrites the jwksReadTimeout value.
     *
     * @return
     */
    String jwksReadTimeoutExpression() default "";

    /**
     * Optional. Enables or disables the automatically performed refresh of
     * Access and Refresh Token.
     *
     * @return {@code true}, if Access and Refresh Token shall be refreshed
     * automatically when they are expired.
     */
    boolean tokenAutoRefresh() default false;

    /**
     * Optional. Allows the automatically performed refresh of
     * Access and Refresh Token to be defined as Jakarta Expression Language expression.
     * If set, overwrites the value of  tokenAutoRefresh.
     */
    String tokenAutoRefreshExpression() default "";

    /**
     * Optional. Sets the minimum validity time in milliseconds the Access Token
     * must be valid before it is considered expired. Value must not be
     * negative.
     *
     * @return
     */
    int tokenMinValidity() default 10 * 1000;

    /**
     * Optional. Allows the minimum validity time in milliseconds the Access Token
     * must be valid before it is considered expired to be defined as Jakarta Expression Language expression.
     * If Set, overwrites the tokenMinValidity value.
     *
     * @return
     */
    String tokenMinValidityExpression() default "";
}
