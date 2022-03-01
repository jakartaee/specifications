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

import java.util.Map;

/**
 * {@code PasswordHash} is an interface for objects that can generate and verify password hashes.
 * <p>
 * Implementations of {@code PasswordHash} are configured for the built-in Database {@link IdentityStore}
 * by configuring the type on the {@link DatabaseIdentityStoreDefinition} annotation.
 * Parameters for the {@code PasswordHash} can also be configured on the annotation,
 * and will be passed to the {@link #initialize(Map)} method when the {@link IdentityStore} is initialized.
 *
 * @see DatabaseIdentityStoreDefinition#hashAlgorithm()
 * @see DatabaseIdentityStoreDefinition#hashAlgorithmParameters()
 */
public interface PasswordHash {

    /**
     * Initialize the instance with the parameters it should use to
     * generate and verify password hashes. The parameters are the
     * name/value pairs specified with the
     * {@link DatabaseIdentityStoreDefinition#hashAlgorithmParameters()}
     * attribute.
     * <p>
     * An implementation is not required to support parameters, and may
     * ignore parameters passed to it. It is also possible that an implementation
     * will use the specified parameters when generating a new password hash,
     * but ignore them in favor of parameters stored with an existing password
     * hash when verifying.
     * <p>
     * If no parameters were supplied, the argument is an empty {@link Map}.
     *
     * @param parameters A {@link Map} of the provided parameters, empty if no parameters were supplied.
     */
    default void initialize(Map<String, String> parameters) {
    }

    /**
     * Generate an encoded password hash value for storage in a user's account.
     * <p>
     * This method should not be used to generate a password hash for verification purposes;
     * use {@link #verify(char[], String)} for that purpose. Use this method only to generate
     * password hashes for new or changed passwords.
     * <p>
     * The returned hash value should be fully encoded, such that it can be directly stored, as is,
     * with no additional formatting or encoding applied.
     * 
     * @param password The password to generate a hash for.
     * @return The generated password hash value.
     */
    String generate(char[] password);

    /**
     * Verify a password against the hashed password value retrieved from a user's account.
     * <p>
     * The {@code hashedPassword} parameter should be provided exactly as retrieved from the database,
     * with no decoding or formatting applied. The {@code password} parameter should be hashed and
     * compared to the hashed password.
     * 
     * @param password The password to verify.
     * @param hashedPassword The hashed password to compare against.
     * @return True if the password matched the hashed password, false otherwise.
     */
    boolean verify(char[] password, String hashedPassword);

}
