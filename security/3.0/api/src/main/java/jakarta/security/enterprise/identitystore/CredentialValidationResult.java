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

import static jakarta.security.enterprise.identitystore.CredentialValidationResult.Status.INVALID;
import static jakarta.security.enterprise.identitystore.CredentialValidationResult.Status.NOT_VALIDATED;
import static jakarta.security.enterprise.identitystore.CredentialValidationResult.Status.VALID;
import static java.util.Collections.emptySet;
import static java.util.Collections.unmodifiableSet;

import java.util.HashSet;
import java.util.Set;

import jakarta.security.enterprise.CallerPrincipal;
import jakarta.security.enterprise.credential.Credential;

/**
 * <code>CredentialValidationResult</code> is the result from an attempt to
 * validate an instance of {@link Credential}.
 *
 * @see IdentityStore#validate
 */
public class CredentialValidationResult {

    public static final CredentialValidationResult INVALID_RESULT = new CredentialValidationResult(INVALID);
    public static final CredentialValidationResult NOT_VALIDATED_RESULT = new CredentialValidationResult(NOT_VALIDATED);

    private final Status status;
    private final String storeId;
    private final String callerDn;
    private final String callerUniqueId;
    private final CallerPrincipal callerPrincipal;
    private final Set<String> groups;

    public enum Status {
        /**
         * Indicates that the credential could not be validated
         */
        NOT_VALIDATED,
        /**
         * Indicates that the credential is not valid after a validation
         * attempt.
         */
        INVALID,
        /**
         * Indicates that the credential is valid after a validation attempt.
         */
        VALID
    }

    /**
     * Constructor for any result other than VALID.
     * Used only internally to construct the static
     * status instances.
     * 
     * @param status
     */
    private CredentialValidationResult(Status status) {
        this(status, null, null, null, null, null);
    }

    /**
     * Constructor for a VALID result.
     *
     * @param callerName Name of the validated caller
     */
    public CredentialValidationResult(String callerName) {
        this(new CallerPrincipal(callerName), null);
    }

    /**
     * Constructor for a VALID result.
     *
     * @param callerPrincipal CallerPrincipal of validated caller
     */
    public CredentialValidationResult(CallerPrincipal callerPrincipal) {
        this(callerPrincipal, null);
    }

    /**
     * Constructor for a VALID result.
     *
     * @param callerName Name of the validated caller
     * @param groups Groups associated with the caller from the identity store
     */
    public CredentialValidationResult(String callerName, Set<String> groups) {
        this(new CallerPrincipal(callerName), groups);
    }

    /**
     * Constructor for a VALID result.
     *
     * @param callerPrincipal CallerPrincipal of validated caller
     * @param groups Groups associated with the caller from the identity store
     */
    public CredentialValidationResult(CallerPrincipal callerPrincipal, Set<String> groups) {
        this(null, callerPrincipal, null, null, groups);
    }

    /**
     * Constructor for a VALID result.
     *
     * @param storeId Identity store unique ID
     * @param callerName Name of the validated caller
     * @param callerDn Caller's LDAP DN (distinguished name)
     * @param callerUniqueId Caller's unique identifier from the identity store
     * @param groups Groups associated with the caller from the identity store
     */
    public CredentialValidationResult(String storeId, String callerName,
            String callerDn, String callerUniqueId, Set<String> groups) {
        this(storeId, new CallerPrincipal(callerName), callerDn, callerUniqueId, groups);
    }

    /**
     * Constructor for a VALID result.
     *
     * @param storeId Identity store unique ID
     * @param callerPrincipal CallerPrincipal of validated caller
     * @param callerDn Caller's LDAP DN (distinguished name)
     * @param callerUniqueId Caller's unique identifier from the identity store
     * @param groups Groups associated with the caller from the identity store
     */
    public CredentialValidationResult(String storeId, CallerPrincipal callerPrincipal,
            String callerDn, String callerUniqueId, Set<String> groups) {
        this(VALID, storeId, callerPrincipal, callerDn, callerUniqueId, groups);
    }

    /**
     * Private constructor.
     *
     * @param status The result status
     * @param storeId Identity store unique ID
     * @param callerPrincipal CallerPrincipal of validated caller
     * @param callerDn Caller's LDAP DN (distinguished name)
     * @param callerUniqueId Caller's unique identifier from the identity store
     * @param groups Groups associated with the caller from the identity store
     */
    private CredentialValidationResult(Status status, String storeId,
            CallerPrincipal callerPrincipal, String callerDn, String callerUniqueId, Set<String> groups) {

        if (status != VALID && (storeId != null || callerPrincipal != null ||
                callerDn != null || callerUniqueId != null || groups != null)) {
            throw new IllegalArgumentException("Bad status");
        }
        if (status == VALID && (callerPrincipal == null || callerPrincipal.getName().trim().isEmpty())) {
            throw new IllegalArgumentException("Null or empty CallerPrincipal");
        }

        this.status = status;
        this.storeId = storeId;
        this.callerPrincipal = callerPrincipal;
        this.callerDn = callerDn;
        this.callerUniqueId = callerUniqueId;
        this.groups = groups != null ? unmodifiableSet(new HashSet<>(groups)) : emptySet();
    }

    /**
     * Determines the validation status.
     *
     * @return The validation status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Return the unique ID of the identity store used to validate the credentials.
     * 
     * @return String identifying the external store used to validate credentials.
     */
    public String getIdentityStoreId() {
        return storeId;
    }

    /**
     * Return the CallerPrincipal for the validated credential.
     * 
     * @return The CallerPrincipal.
     */
    public CallerPrincipal getCallerPrincipal() {
        return callerPrincipal;
    }

    /**
     * Return a string that uniquely identifies this caller within the identity store
     * (since the Principal name used may not be unique).
     * 
     * @return Caller's unique identifier.
     */
    public String getCallerUniqueId() {
        return callerUniqueId;
    }

    /**
     * Return the CallerPrincipal for the validated credential.
     * 
     * @return The CallerPrincipal.
     */
    public String getCallerDn() {
        return callerDn;
    }

    /**
     * Determines the set of groups that the specified Caller is in, based on
     * the associated identity store.
     *
     * @return The set of groups that the specified Caller is in, or empty if
     * none.
     */
    public Set<String> getCallerGroups() {
        return groups;
    }

}
