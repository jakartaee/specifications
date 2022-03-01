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

/**
 * The main Jakarta Security package. This package contains classes and interfaces that span authentication,
 * authorization and identity concerns.
 * 
 * <h2>EL Support in annotations</h2>
 * 
 * This specification supports the use of expression language 3.0 in annotations. This is described in more detail
 * below:
 * 
 * <h3>...Definition annotations</h3>
 * 
 * Jakarta Security features several annotations, with names that end with <code>Definition</code>, which, when used,
 * make CDI beans available. For completeness, this concerns the following annotations:
 * 
 * <ul>
 * <li>{@link jakarta.security.enterprise.identitystore.DatabaseIdentityStoreDefinition}</li>
 * <li>{@link jakarta.security.enterprise.identitystore.LdapIdentityStoreDefinition}</li>
 * <li>{@link jakarta.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition}</li>
 * <li>{@link jakarta.security.enterprise.authentication.mechanism.http.CustomFormAuthenticationMechanismDefinition}</li>
 * <li>{@link jakarta.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition}</li>
 * </ul>
 * 
 * For all attributes of type <code>String</code> on these annotations, Jakarta Expression Language 3.0 expressions can
 * be used. All named CDI beans are available to that expression, as well as the default classes as specified by
 * Expression Language 3.0 for the {@link ELProcessor}.
 * 
 * <p>
 * Expressions can be either immediate (<code>${}</code> syntax), or deferred (<code>#{}</code> syntax). Immediate
 * expressions are evaluated once when the bean instance corresponding to the "...Definition" annotation is actually
 * created. Since such beans are application scoped, that means once for the entire application. Deferred expressions
 * are evaluated in each request where the security runtime needs to use the value of these attributes.
 * 
 * <p>
 * Attributes that are documented as being Expression Language alternatives to non-<code>String</code> type attributes
 * (attributes for which the name ends with <code>Expression</code>, hereafter called Expression alternative attribute) MUST
 * evaluate to the same type as the attribute they are an alternative to. If the Expression alternative attribute has a non
 * empty value, it takes precedence over the attribute which it is an alternative to.
 * 
 * <p>
 * The Expression alternative attribute MUST contain a valid Expression Language expression. Attributes of type
 * string that are not Expression alternative attributes can contain either an expression or a string value
 * that is not an expression.
 * 
 * <h3>Jakarta Interceptors annotations</h3>
 * 
 * Jakarta Security features several annotations with attributes that denote Jakarta Interceptors. For completeness,
 * this concerns the following annotations:
 * 
 * <ul>
 * <li>{@link jakarta.security.enterprise.authentication.mechanism.http.LoginToContinue}</li>
 * <li>{@link jakarta.security.enterprise.authentication.mechanism.http.RememberMe}</li>
 * </ul>
 * 
 * <p>
 * Expression Language is supported for these annotations as well, but in a slightly different way. See the javadoc of
 * both these annotations for how the expression language support differs.
 *
 * @version 1.0
 */
package jakarta.security.enterprise;

import jakarta.el.ELProcessor;
