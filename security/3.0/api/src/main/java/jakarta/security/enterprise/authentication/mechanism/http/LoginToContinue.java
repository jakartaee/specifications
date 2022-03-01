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

import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.enterprise.util.Nonbinding;
import jakarta.interceptor.InterceptorBinding;

/**
 * The <code>LoginToContinue</code> annotation provides an application the ability to declaratively
 * add login to continue functionality to an authentication mechanism.
 *
 * <p>
 * When the <code>LoginToContinue</code> annotation is used on a custom authentication mechanism, EL
 * expressions in attributes of type <code>String</code> are evaluated for every request requiring
 * authentication. Both immediate and deferred syntax is supported, but effectively the semantics
 * are always deferred.
 *
 * <p>
 * When the <code>LoginToContinue</code> annotation is used as attribute in either the
 * {@link FormAuthenticationMechanismDefinition} or {@link CustomFormAuthenticationMechanismDefinition},
 * expressions using immediate syntax are evaluated only once when the {@link HttpAuthenticationMechanism}
 * bean is created. Since these beans are application scoped, this means only once per application.
 * Expressions using deferred syntax are evaluated as described above when the <code>LoginToContinue</code> annotation
 * is used on a custom authentication mechanism.
 *
 */
@Inherited
@InterceptorBinding
@Retention(RUNTIME)
@Target(TYPE)
public @interface LoginToContinue {

    /**
     * The resource (page) a caller should get to see in case the originally requested
     * resource requires authentication, and the caller is currently not authenticated.
     *
     * @return page a caller is directed to to authenticate (login)
     */
    @Nonbinding
    String loginPage() default "/login";

    /**
     * Use a forward to reach the page set by the {@link LoginToContinue#loginPage()}
     * if true, otherwise use a redirect.
     *
     * @return true if a forward is to be used, false for a redirect
     */
    @Nonbinding
    boolean useForwardToLogin() default true;

    /**
     * Jakarta Expression Language expression variant of <code>useForwardToLogin()</code>.
     * The expression needs to evaluate to a boolean outcome. All named CDI beans are available
     * to the expression. If both this attribute and <code>useForwardToLogin()</code> are specified, this
     * attribute take precedence.
     *
     * @return an expression evaluating to true if a forward is to be used, false for a redirect
     */
    @Nonbinding
    String useForwardToLoginExpression() default "";

    /**
     * The resource (page) a caller should get to see in case an error, such as providing invalid
     * credentials, occurs on the page set by {@link LoginToContinue#loginPage()}.
     *
     * @return page a caller is directed to after an authentication (login) error
     */
    @Nonbinding
    String errorPage() default "/login-error";

    /**
     * Supports inline instantiation of the LoginToContinue annotation.
     *
     * @since 3.0
     */
    public static final class Literal extends AnnotationLiteral<LoginToContinue> implements LoginToContinue {
        private final String loginPage;
        private final boolean useForwardToLogin;
        private final String useForwardToLoginExpression;
        private final String errorPage;

        /**
         * Default instance of the {@link LoginToContinue} Interceptor Binding.
         */
        public static final Literal INSTANCE = of("/login", true, "", "/login-error");

        /**
         * Instance of the {@link LoginToContinue} Interceptor Binding.
         *
         * @param loginPage page a caller is directed to to authenticate (login)
         * @param useForwardToLogin true if a forward is to be used, false for a redirect
         * @param useForwardToLoginExpression an expression evaluating to true if a forward is to be used, false for a redirect
         * @param errorPage page a caller is directed to after an authentication (login) error
         * @return instance of the {@link LoginToContinue} Interceptor Binding.
         */
        public static Literal of(String loginPage, boolean useForwardToLogin, String useForwardToLoginExpression, String errorPage) {
            return new Literal(loginPage, useForwardToLogin, useForwardToLoginExpression, errorPage);
        }

        private Literal(String loginPage, boolean useForwardToLogin, String useForwardToLoginExpression, String errorPage) {
            this.loginPage = loginPage;
            this.useForwardToLogin = useForwardToLogin;
            this.useForwardToLoginExpression = useForwardToLoginExpression;
            this.errorPage = errorPage;
        }

        @Override
        public String loginPage() {
            return loginPage;
        }

        @Override
        public boolean useForwardToLogin() {
            return useForwardToLogin;
        }

        @Override
        public String useForwardToLoginExpression() {
            return useForwardToLoginExpression;
        }

        @Override
        public String errorPage() {
            return errorPage;
        }

    }

}
