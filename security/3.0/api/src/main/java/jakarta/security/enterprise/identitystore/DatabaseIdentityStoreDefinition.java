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

package jakarta.security.enterprise.identitystore;

import static jakarta.security.enterprise.identitystore.IdentityStore.ValidationType.PROVIDE_GROUPS;
import static jakarta.security.enterprise.identitystore.IdentityStore.ValidationType.VALIDATE;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import java.util.stream.Stream;

import jakarta.security.enterprise.credential.UsernamePasswordCredential;
import jakarta.security.enterprise.identitystore.IdentityStore.ValidationType;

/**
 * Annotation used to define a container-provided {@link IdentityStore} that
 * stores caller credentials and identity attributes in a relational database,
 * and make that implementation available as an enabled CDI bean.
 * <p>
 * The container-provided {@code IdentityStore} must support validating {@link UsernamePasswordCredential},
 * and may support validating other credential types.
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface DatabaseIdentityStoreDefinition {

    /**
     * Full JNDI name of the data source that provides access to the data base
     * where the caller identities are stored.
     *
     * @return Full JNDI name of the data source
     */
    String dataSourceLookup() default "java:comp/DefaultDataSource"; // default data source

    /**
     * SQL query to validate the {caller, password} pair.
     *
     * Only needed when {@link #useFor()} contains
     * {@link ValidationType#VALIDATE}.
     *
     * <p>
     * The name of the caller that is to be authenticated has to be set as the
     * one and only placeholder. The (hashed) password should be in the first
     * column of the result.
     *
     * <p>
     * Example query:
     * <pre>
     * <code>
     * select password from callers where name = ?
     * </code>
     * </pre>
     *
     * @return SQL query to validate
     */
    String callerQuery() default "";

    /**
     * SQL query to retrieve the groups associated with the caller when
     * authentication succeeds.
     *
     * Only needed when {@link #useFor()} contains
     * {@link ValidationType#PROVIDE_GROUPS}.
     *
     * <p>
     * The name of the caller that has been authenticated has to be set as the
     * one and only placeholder. The group name should be in the first column of
     * the result.
     *
     * <p>
     * Example query:
     * <pre>
     * <code>
     * select group_name from caller_groups where caller_name = ?
     * </code>
     * </pre>
     *
     * @return SQL query to retrieve the groups
     */
    String groupsQuery() default "";

    /**
     * A {@link PasswordHash} implementation used to verify plaintext passwords
     * by generating a hash of the password and comparing it against the hashed
     * value returned from the database via the {@link #callerQuery()}.
     *
     * @return The password hash used to verify plaintext passwords.
     */
    
    Class<? extends PasswordHash> hashAlgorithm() default Pbkdf2PasswordHash.class;
    
    /**
     * Used to specify algorithm-specific parameters.
     * <p>
     * Parameters are specified as a list of name/value pairs, using the format below:
     * <blockquote><pre>
<i>parameterName=parameterValue</i>
     * </pre></blockquote>
     * <p>
     * For example:
     * <blockquote><pre>
     * <i>Algorithm.param1="value"</i>
     * <i>Algorithm.param2=32</i>
     * </pre></blockquote>
     * <p>
     * This attribute supports immediate Jakarta Expression Language expressions (${} syntax) for both the
     * <code>parameterValue</code> as well as for a full array element. If an EL
     * expression is used for a full array element, the expression must evaluate
     * to either a single string, a string array or a string {@link Stream} where
     * in each case every string must adhere to the above specified format.
     * 
     * @return The algorithm parameters.
     */
    String[] hashAlgorithmParameters() default {};

    /**
     * Determines the order in case multiple IdentityStores are found.
     *
     * @return the priority.
     */
    int priority() default 70;

    /**
     * Allow <code>priority</code> to be specified as a Jakarta Expression Language expression.
     * If set, overrides any value set with <code>priority</code>.
     * 
     * @return the <code>priority</code> Jakarta Expression Language expression
     */
    String priorityExpression() default "";

    /**
     * Determines what the identity store is used for
     *
     * @return the type the identity store is used for
     */
    ValidationType[] useFor() default {VALIDATE, PROVIDE_GROUPS};

    /**
     * Allow <code>useFor</code> to be specified as an Jakarta Expression Language expression.
     * If set, overrides any value set with useFor.
     * 
     * @return the <code>useFor</code> Jakarta Expression Language expression
     */
    String useForExpression() default "";

}
