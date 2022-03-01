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
import jakarta.interceptor.InterceptorBinding;

/**
 * The AutoApplySession annotation provides an application the ability to declaratively designate
 * that an authentication mechanism uses the <code>jakarta.servlet.http.registerSession</code>
 * and auto applies this for every request.
 *
 * <p>
 * See the Jakarta Authentication spec for further details on <code>jakarta.servlet.http.registerSession</code>.
 *
 * <p>
 * This support is provided via an implementation of a Jakarta Interceptors interceptor that conducts the
 * necessary logic.
 *
 * <p>
 * Example:
 *
 * <pre>
 * <code>
 *     {@literal @}RequestScoped
 *     {@literal @}AutoApplySession
 *     public class CustomAuthenticationMechanism implements HttpAuthenticationMechanism {
 *         // ...
 *     }
 * </code>
 * </pre>
 *
 */
@Inherited
@InterceptorBinding
@Retention(RUNTIME)
@Target(TYPE)
public @interface AutoApplySession {

    /**
     * Supports inline instantiation of the AutoApplySession annotation.
     *
     * @since 3.0
     */
    public static final class Literal extends AnnotationLiteral<AutoApplySession> implements AutoApplySession {
        private static final long serialVersionUID = 1L;

        /**
         * Instance of the {@link AutoApplySession} Interceptor Binding.
         */
        public static final Literal INSTANCE = new Literal();
    }
}
