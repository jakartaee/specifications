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

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.security.enterprise.credential.UsernamePasswordCredential;
import jakarta.security.enterprise.identitystore.IdentityStore;
import jakarta.security.enterprise.identitystore.IdentityStore.ValidationType;

import static jakarta.security.enterprise.identitystore.IdentityStore.ValidationType.PROVIDE_GROUPS;
import static jakarta.security.enterprise.identitystore.IdentityStore.ValidationType.VALIDATE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation used to define a container-provided {@link IdentityStore} that stores
 * caller credentials and identity attributes (together caller identities) in an
 * LDAP store, and make that implementation available as an enabled CDI bean.
 * <p>
 * The container-provided {@code IdentityStore} must support validating {@link UsernamePasswordCredential},
 * and may support validating other credential types.
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface LdapIdentityStoreDefinition {

    /**
     * Enum representing LDAP search scope values.
     */
    enum LdapSearchScope { ONE_LEVEL, SUBTREE }

    /**
     * URL where the LDAP server can be reached.
     * <p>
     * E.g.: <code>ldap://localhost:33389</code>
     *
     * @return URL where the LDAP server can be reached
     */
    String url() default "";

    /**
     * Distinguished name for the application or administrative user that will be used to
     * make the initial connection to the LDAP and to perform searches and lookups.
     * <p>
     * This value is needed if caller or group lookup will be done. It is not needed if the
     * store will be used only to authenticate callers using direct binding (see callerBaseDn).
     * <p>
     * This user needs search permission in the LDAP for persons and/or groups.
     * <p>
     * E.g.: <code>uid=ldap,ou=apps,dc=eclipse,dc=net</code>
     *
     * @return The distinguished name for the application user.
     */
    String bindDn() default "";

    /**
     * Password for the application/admin user defined by the bindDn member.
     * Only used when the member bindDn is filled in.
     *
     * @return password for the application user.
     */
    String bindDnPassword() default "";

    /**
     * Base distinguished name for callers in the LDAP store
     * (e.g., "<code>ou=caller,dc=eclipse,dc=net</code>").
     * <p>
     * When this member value is specified, and callerSearchBase is not, direct binding is attempted.
     * <p>
     * The callerNameAttribute must be specified along with this attribute so that the
     * runtime can create the "leaf" RDN needed to concatenate with the base DN to create the
     * full DN of the caller.
     *
     * @return The base distinguished name for callers.
     */
    String callerBaseDn() default "";

    /**
     * Name of the attribute that contains the callers name in the person object
     * (e.g., "<code>uid</code>").
     * <p>
     * This attribute will be used, with callerBaseDn, to construct caller DNs for direct binding.
     * It is also used to retrieve the caller's name when the caller object is instead looked up
     * using search.
     * <p>
     * The value of this attribute is returned as the caller principal name
     * for a successful credential validation.
     * <p>
     * The following gives an example in ldif format:
     * <pre>
     * <code>
     * dn: uid=peter,ou=caller,dc=eclipse,dc=net
     * objectclass: top
     * objectclass: uidObject
     * objectclass: person
     * uid: peter
     * cn: Peter Smith
     * sn: Peter
     * userPassword: secret1
     * </code>
     * </pre>
     *
     * @return Name of the attribute that represents the caller name
     */
    String callerNameAttribute() default "uid";

    /**
     * Search base for looking up callers
     * (e.g., "<code>ou=caller,dc=eclipse,dc=net</code>").
     * <p>
     * Overrides callerBaseDn, if configured, causing caller search
     * to be used instead of direct binding.
     * Requires that the bindDn member be filled in.
     *
     * @return Base DN for searching the LDAP tree for callers.
     */
    String callerSearchBase() default "";

    /**
     * Search filter to find callers when callerSearchBase is set.
     * The search is performed starting from the callerSearchBase DN
     * with the scope specified by callerSearchScope.
     *
     * @return Search expression to find callers.
     */
    String callerSearchFilter() default "";

    /**
     * Search scope for caller searches: determines depth
     * of the search in the LDAP tree.
     * 
     * @return The search scope
     */
    LdapSearchScope callerSearchScope() default LdapSearchScope.SUBTREE;

    /**
     * Allow callerSearchScope to be specified as a Jakarta Expression Language expression.
     * If set, overrides any value set with callerSearchScope.
     * 
     * @return the callerSearchScope Jakarta Expression Language expression
     */
    String callerSearchScopeExpression() default "";

    /**
     * Search base for looking up groups
     * (e.g., "<code>ou=group,dc=eclipse,dc=net</code>").
     * <p>
     * Needed only for a store that performs group lookup.
     * Requires that the bindDn member be filled in.
     * 
     * @return Base DN for searching the LDAP tree for groups.
     */
    String groupSearchBase() default "";

    /**
     * Search filter to find groups when groupSearchBase is set.
     * The search is performed starting from the groupSearchBase DN
     * with the scope specified by groupSearchScope.
     *
     * @return Search expression to find groups.
     */
    String groupSearchFilter() default "";

    /**
     * Search scope for group searches, determines depth
     * of the search in the LDAP tree.
     * 
     * @return The search scope
     */
    LdapSearchScope groupSearchScope() default LdapSearchScope.SUBTREE;

    /**
     * Allow groupSearchScope to be specified as a Jakarta Expression Language expression.
     * If set, overrides any value set with groupSearchScope.
     * 
     * @return the groupSearchScope Jakarta Expression Language expression
     */
    String groupSearchScopeExpression() default "";

    /**
     * Name of the attribute of a group object that represents the group name
     * (e.g., "<code>cn</code>")
     *
     * @return Name of the attribute that represents the group name
     */
    String groupNameAttribute() default "cn";

    /**
     * Name of the attribute in a group object that identifies the
     * members of the  group
     * (e.g., "<code>member</code>").
     * <p>
     * The value of this attribute must be the full DN of the caller. The following gives an example
     * entry in ldif format:
     * <pre>
     * <code>
     * dn: cn=foo,ou=group,dc=eclipse,dc=net
     * objectclass: top
     * objectclass: groupOfNames
     * cn: foo
     * member: uid=pete,ou=caller,dc=eclipse,dc=net
     * member: uid=john,ou=caller,dc=eclipse,dc=net
     * </code>
     * </pre>
     *
     * @return Attribute for the group members
     */
    String groupMemberAttribute() default "member";

    /**
     * Name of the attribute in a person object that identifies the groups
     * the caller belongs to
     * (e.g., "<code>memberOf</code>").
     * <p>
     * This attribute is used only if: a) group search is not configured
     * (i.e., no groupSearchBase and groupSearchFilter configured); and,
     * b) the caller's DN is available, either because groups are being returned
     * during the credential validation phase by an identity store that performs
     * both validation and group lookup, or because the DN is available in the
     * {@link CredentialValidationResult} passed to the
     * {@link IdentityStore#getCallerGroups(CredentialValidationResult)} method.
     * <p>
     * The value of this attribute must be the full DN of the group. The following gives an example
     * entry in ldif format:
     * <pre>
     * <code>
     * dn: uid=peter,ou=caller,dc=eclipse,dc=net
     * objectclass: top
     * objectclass: uidObject
     * objectclass: person
     * uid: peter
     * cn: Peter Smith
     * memberOf: cn=foo,ou=group,dc=eclipse,dc=net
     * memberOf: cn=bar,ou=group,dc=eclipse,dc=net
     * </code>
     * </pre>
     *
     * @return Attribute for group membership
     */
    String groupMemberOfAttribute() default "memberOf";

    /**
     * Set the timeout value that should be used when waiting for
     * the LDAP server to return results. Note that this is different
     * from the connection timeout for the underlying socket connection;
     * <p>
     * The default value of 0 means wait forever (assuming the connection
     * itself does not time out).
     * 
     * @return The readTimeout value.
     */
    int readTimeout() default 0;

    /**
     * Allow readTimeout to be specified as an Jakarta Expression Language expression.
     * If set, overrides any value set with readTimeout.
     * 
     * @return The readTimeout Jakarta Expression Language expression
     */
    String readTimeoutExpression() default "";

    /**
     * Set the maximum number of results (objects) the server should
     * return in response to a search.
     * <p>
     * The default value is set to 1000, which corresponds to the
     * maximum number of results most LDAP servers will return for
     * in a single response. Most LDAP servers support paging through
     * result sets larger than 1000, but doing so should rarely be
     * necessary for normal validation and group lookup use cases.
     * Implementations of the built-in LDAP IdentityStore MAY support
     * paging through larger result sets, but are NOT REQUIRED to.
     * 
     * @return The maximum number of results the LDAP server should return.
     */
    int maxResults() default 1000;

    /**
     * Allow maxResults to be specified as Jakarta Expression Language expression.
     * If set, overrides any value set with maxResults.
     * 
     * @return The maxResults Jakarta Expression Language expression
     */
    String maxResultsExpression() default "";

    /**
     * Determines the order in case multiple IdentityStores are found.
     * @return The priority.
     */
    int priority() default 80;

    /**
     * Allow priority to be specified as a Jakarta Expression Language expression.
     * If set, overrides any value set with priority.
     * 
     * @return The priority Jakarta Expression Language expression
     */
    String priorityExpression() default "";

    /**
     * Determines what the identity store is used for
     * 
     * @return The type the identity store is used for
     */
    ValidationType[] useFor() default {VALIDATE, PROVIDE_GROUPS};

    /**
     * Allow useFor to be specified as a Jakarta Expression Language expression.
     * If set, overrides any value set with useFor.
     * 
     * @return The useFor Jakarta Expression Language expression
     */
    String useForExpression() default "";

}
