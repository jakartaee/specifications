/*
 * Copyright (c) 2015, 2021 Oracle and/or its affiliates and others. All rights reserved.
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

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.el.ELProcessor;
import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.enterprise.util.Nonbinding;
import jakarta.interceptor.InterceptorBinding;
import jakarta.security.enterprise.identitystore.IdentityStore;
import jakarta.security.enterprise.identitystore.RememberMeIdentityStore;
import jakarta.servlet.http.Cookie;

/**
 * The RememberMe annotation provides an application the ability to declaratively designate
 * that an authentication mechanism effectively "remembers" the authentication and auto
 * applies this with every request.
 *
 * <p>
 * For the remember me function the credentials provided by the caller are exchanged for a (long-lived) token
 * which is send to the user as the value of a cookie, in a similar way to how the HTTP session ID is send.
 * It should be realized that this token effectively becomes the credential to establish the caller's
 * identity within the application and care should be taken to handle and store the token securely. E.g.
 * by using this feature with a secure transport (SSL/HTTPS), storing a strong hash instead of the actual
 * token, and implementing an expiration policy.
 *
 * <p>
 * The token is vended by a special purpose {@link IdentityStore}-like artifact; an implementation of the
 * {@link RememberMeIdentityStore}.
 *
 * <p>
 * This support is provided via an implementation of an interceptor spec interceptor that conducts the
 * necessary logic.
 *
 * <p>
 * Example:
 *
 * <pre>
 * <code>
 *     {@literal @}RequestScoped
 *     {@literal @}RememberMe
 *     public class CustomAuthenticationMechanism implements HttpAuthenticationMechanism {
 *         // ...
 *     }
 * </code>
 * </pre>
 *
 * <p>
 * Jakarta Expression Language expressions in attributes of type <code>String</code> are evaluated for every request requiring
 * authentication. Both immediate and deferred syntax is supported, but effectively the semantics
 * are always deferred.
 *
 * <p>
 * <b>Note:</b> this facility <em>DOES NOT</em> constitute any kind of "session management" system, but instead
 * represents a special purpose authentication mechanism using a long-lived token, that is vended and validated by the
 * {@link RememberMeIdentityStore}.
 *
 */
@Inherited
@InterceptorBinding
@Retention(RUNTIME)
@Target(TYPE)
public @interface RememberMe {

    /**
     * Max age in seconds for the remember me cookie.
     * Defaults to one day.
     *
     * @see Cookie#setMaxAge(int)
     *
     * @return Max age in seconds
     */
    @Nonbinding
    int cookieMaxAgeSeconds() default 86400; // 1 day

    /**
     * Jakarta Expression Language expression variant of <code>cookieMaxAgeSeconds()</code>. The expression needs to
     * evaluate to an integer outcome. All named CDI beans are available to the expression as well as default classes as
     * specified by Jakarta Expression Language 3.0 for the {@link ELProcessor} and the implicit objects "self" which refers
     * to the interceptor target and "httpMessageContext" which refers to the current {@link HttpMessageContext}. If both
     * this attribute and <code>cookieMaxAgeSeconds()</code> are specified, this attribute takes precedence.
     *
     * @return an expression evaluating to an integer designating the max age in seconds for the remember me cookie.
     */
    @Nonbinding
    String cookieMaxAgeSecondsExpression() default "";

    /**
     * Flag to indicate that the remember me cookie should only be
     * sent using a secure protocol (e.g. HTTPS or SSL).
     *
     * @see Cookie#setSecure(boolean)
     *
     * @return true if the cookie should be sent using a secure protocol only
     * false for any protocol.
     */
    @Nonbinding
    boolean cookieSecureOnly() default true;

    /**
     * Jakarta Expression Language expression variant of <code>cookieSecureOnly()</code>. The expression needs to evaluate
     * to a boolean outcome. All named CDI beans are available to the expression as well as default classes as specified by
     * Jakarta Expression Language 3.0 for the {@link ELProcessor} and the implicit objects "self" which refers to the
     * interceptor target and "httpMessageContext" which refers to the current {@link HttpMessageContext}. If both this
     * attribute and <code>cookieSecureOnly()</code> are specified, this attribute takes precedence.
     *
     * @return an expression evaluating to an integer designating the max age in seconds for the remember me cookie.
     */
    @Nonbinding
    String cookieSecureOnlyExpression() default "";

    /**
     * Flag to indicate that the remember me cookie should not be exposed to
     * client-side scripting code, and should only be sent with HTTP requests.
     *
     * @see Cookie#setHttpOnly(boolean)
     *
     * @return true if the cookie should be sent only with HTTP requests
     * (and not be made available to client-side scripting code), false otherwise.
     */
    @Nonbinding
    boolean cookieHttpOnly() default true;

    /**
     * Jakarta Expression Language expression variant of <code>cookieHttpOnly()</code>. The expression needs to evaluate to
     * a boolean outcome. All named CDI beans are available to the expression as well as default classes as specified by
     * Jakarta Expression Language 3.0 for the {@link ELProcessor} and the implicit objects "self" which refers to the
     * interceptor target and "httpMessageContext" which refers to the current {@link HttpMessageContext}. If both this
     * attribute and <code>cookieHttpOnly()</code> are specified, this attribute takes precedence.
     *
     * @return an expression evaluating to true if the cookie should be sent only with HTTP requests , false otherwise.
     */
    @Nonbinding
    String cookieHttpOnlyExpression() default "";

    /**
     * Name of the remember me cookie.
     *
     * @see Cookie#getName()
     *
     * @return The name of the cookie
     */
    @Nonbinding
    String cookieName() default "JREMEMBERMEID";

    /**
     * Flag to determine if remember me should be used.
     *
     * @return Flag to determine if remember me should be used
     */
    @Nonbinding
    boolean isRememberMe() default true;

    /**
     * Jakarta Expression Language expression to determine if remember me should be used. This is evaluated for every
     * request requiring authentication. The expression needs to evaluate to a boolean outcome. All named CDI beans are
     * available to the expression as well as default classes as specified by Jakarta Expression Language 3.0 for the
     * {@link ELProcessor} and the implicit objects "self" which refers to the interceptor target and "httpMessageContext"
     * which refers to the current {@link HttpMessageContext}.
     *
     * @return Jakarta Expression Language expression to determine if remember me should be used
     */
    @Nonbinding
    String isRememberMeExpression() default "";

    /**
     * Supports inline instantiation of the RememberMe annotation.
     *
     * @since 3.0
     */
    public static final class Literal extends AnnotationLiteral<RememberMe> implements RememberMe {

        private static final long serialVersionUID = 1L;

        private final int       cookieMaxAgeSeconds;
        private final String    cookieMaxAgeSecondsExpression;
        private final boolean   cookieSecureOnly;
        private final String    cookieSecureOnlyExpression;
        private final boolean   cookieHttpOnly;
        private final String    cookieHttpOnlyExpression;
        private final String    cookieName;
        private final boolean   isRememberMe;
        private final String    isRememberMeExpression;

        /**
         * Default instance of the {@link RememberMe} Interceptor Binding.
         */
        public static final Literal INSTANCE = of(
            86400,
            "",
            true,
            "",
            true,
            "",
            "JREMEMBERMEID",
            true,
            ""
        );

        /**
         * Instance of the {@link RememberMe} Interceptor Binding.
         *
         * @param cookieMaxAgeSeconds Max age in seconds for the remember me cookie.
         * @param cookieMaxAgeSecondsExpression Jakarta Expression Language expression variant of <code>cookieMaxAgeSeconds</code>
         * @param cookieSecureOnly Flag to indicate that the remember me cookie should only be sent using a secure protocol
         * @param cookieSecureOnlyExpression Jakarta Expression Language expression variant of <code>cookieSecureOnly</code>
         * @param cookieHttpOnly true if the cookie should be sent only with HTTP requests
         * @param cookieHttpOnlyExpression Jakarta Expression Language expression variant of <code>cookieHttpOnly</code>
         * @param cookieName Name of the remember me cookie.
         * @param isRememberMe Flag to determine if remember me should be used.
         * @param isRememberMeExpression Jakarta Expression Language expression variant of <code>isRememberMe</code>
         * @return instance of the {@link RememberMe} Interceptor Binding
         */
        public static Literal of(
            int     cookieMaxAgeSeconds,
            String  cookieMaxAgeSecondsExpression,
            boolean cookieSecureOnly,
            String  cookieSecureOnlyExpression,
            boolean cookieHttpOnly,
            String  cookieHttpOnlyExpression,
            String  cookieName,
            boolean isRememberMe,
            String  isRememberMeExpression


            ) {
            return new Literal(
                    cookieMaxAgeSeconds,
                    cookieMaxAgeSecondsExpression,
                    cookieSecureOnly,
                    cookieSecureOnlyExpression,
                    cookieHttpOnly,
                    cookieHttpOnlyExpression,
                    cookieName,
                    isRememberMe,
                    isRememberMeExpression
                );
        }

        private Literal(
            int     cookieMaxAgeSeconds,
            String  cookieMaxAgeSecondsExpression,
            boolean cookieSecureOnly,
            String  cookieSecureOnlyExpression,
            boolean cookieHttpOnly,
            String  cookieHttpOnlyExpression,
            String  cookieName,
            boolean isRememberMe,
            String  isRememberMeExpression
                ) {

            this.cookieMaxAgeSeconds =              cookieMaxAgeSeconds;
            this.cookieMaxAgeSecondsExpression =    cookieMaxAgeSecondsExpression;
            this.cookieSecureOnly =                 cookieSecureOnly;
            this.cookieSecureOnlyExpression =       cookieSecureOnlyExpression;
            this.cookieHttpOnly =                   cookieHttpOnly;
            this.cookieHttpOnlyExpression =         cookieHttpOnlyExpression;
            this.cookieName =                       cookieName;
            this.isRememberMe =                     isRememberMe;
            this.isRememberMeExpression =           isRememberMeExpression;
        }

        @Override
        public boolean cookieHttpOnly() {
            return cookieHttpOnly;
        }

        @Override
        public String cookieHttpOnlyExpression() {
            return cookieHttpOnlyExpression;
        }

        @Override
        public int cookieMaxAgeSeconds() {
            return cookieMaxAgeSeconds;
        }

        @Override
        public String cookieMaxAgeSecondsExpression() {
            return cookieMaxAgeSecondsExpression;
        }

        @Override
        public boolean cookieSecureOnly() {
            return cookieSecureOnly;
        }

        @Override
        public String cookieSecureOnlyExpression() {
            return cookieSecureOnlyExpression;
        }

        @Override
        public String cookieName() {
            return cookieName;
        }

        @Override
        public boolean isRememberMe() {
            return isRememberMe;
        }

        @Override
        public String isRememberMeExpression() {
            return isRememberMeExpression;
        }
    }
}

