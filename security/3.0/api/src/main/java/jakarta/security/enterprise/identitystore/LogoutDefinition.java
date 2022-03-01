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
 * {@link LogoutDefinition} annotation defines logout and RP session management
 * configuration in openid connect client.
 *
 * @author jGauravGupta
 */
@Retention(RUNTIME)
public @interface LogoutDefinition {

    /**
     * Optional. Notify the OIDC provider (OP) that the user has logged out of
     * the application and might want to log out of the OP as well. If true then
     * after having logged out the user from RP, redirects the End-User's User
     * Agent to the OP's logout endpoint URL. This URL is normally obtained via
     * the end_session_endpoint element of the OP's metadata or can be
     * customized via
     * {@code OpenIdProviderMetadata#endSessionEndpoint}.
     *
     * @return true when OIDC provider is notified of logout.
     */
    boolean notifyProvider() default false;

    /**
     * Optional. Allows the OIDC provider (OP) notification that the user has logged
     * using the Jakarta Expression Language expression. If set, overrides the value set by notifyProvider.
     */
    String notifyProviderExpression() default "";

    /**
     * Optional. The post logout redirect URI to which the RP is requesting that
     * the End-User's User Agent be redirected after a logout has been
     * performed. If redirect URI is empty then redirect to OpenID connect
     * provider authorization_endpoint for re-authentication.
     * *
     *
     * @return URL after logout is performed on the client.
     */
    String redirectURI() default "";

    /**
     * Session timeout on the expiry of Access Token.
     *
     * @return
     */
    boolean accessTokenExpiry() default false;

    /**
     * Allow the session timeout definition using a Jakarta Expression Language expression.
     * If set, overrides the value defined with accessTokenExpiry.
     *
     * @return
     */
    String accessTokenExpiryExpression() default "";

    /**
     * Session timeout on the expiry of Identity Token.
     *
     * @return
     */
    boolean identityTokenExpiry() default false;

    /**
     * Allow the session timeout using the Jakarta Expression Language expression.
     * If set, overrides the identityTokenExpiry value.
     *
     * @return
     */
    String identityTokenExpiryExpression() default "";

}
