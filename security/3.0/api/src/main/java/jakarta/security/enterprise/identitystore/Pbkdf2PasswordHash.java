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

/**
 * This interface represents the built-in {@code Pbkdf2PasswordHash} implementation.
 * <p>
 * To use {@code Pbkdf2PasswordHash} with the built-in Database {@link IdentityStore},
 * configure this interface type as the {@code hashAlgorithm} value
 * on the {@link DatabaseIdentityStoreDefinition} annotation.
 * <p>
 * To configure parameters for {@code Pbkdf2PasswordHash}, specify them as the
 * {@code hashAlgorithmParameters} value on the {@link DatabaseIdentityStoreDefinition} annotation.
 * <p>
 * The built-in implementation must support the following configurable parameters:
 * <blockquote><pre>
Pbkdf2PasswordHash.Algorithm      // default "PBKDF2WithHmacSHA256"
Pbkdf2PasswordHash.Iterations     // default 2048, minimum 1024
Pbkdf2PasswordHash.SaltSizeBytes  // default 32, minimum 16
Pbkdf2PasswordHash.KeySizeBytes   // default 32, minimum 16
 * </pre></blockquote>
 * <p>
 * And the following PBKDF2 algorithms:
 * <blockquote><pre>
PBKDF2WithHmacSHA224
PBKDF2WithHmacSHA256
PBKDF2WithHmacSHA384
PBKDF2WithHmacSHA512
 * </pre></blockquote>
 * Algorithm names are the string literal names documented for the corresponding algorithms by the
 * <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html" target="_top">
Java Cryptography Architecture Standard Algorithm Name Documentation</a>.
 * <p>
 * The encoded format produced by {@link #generate(char[])}, and consumed by {@link #verify(char[], String)},
 * is as follows:
 * <blockquote><pre>
{@code <algorithm>:<iterations>:<base64(salt)>:<base64(hash)>}
 * </pre></blockquote>
 * Where:
 * <ul>
 * <li><i>algorithm</i> -- the algorithm used to generate the hash
 * <li><i>iterations</i> -- the number of iterations used to generate the hash
 * <li><i>base64(salt)</i> -- the salt used to generate the hash, base64-encoded
 * <li><i>base64(hash)</i> -- the hash value, base64-encoded
 * </ul>
 * <p>
 * Because the algorithm and the parameters used to generate the hash are stored with the hash,
 * the built-in {@code Pbkdf2PasswordHash} implementation can verify hashes generated using algorithm
 * and parameter values that differ from the currently configured values. This means the configuration
 * parameters can be changed without impacting the ability to verify existing password hashes.
 * <p>
 * (Password hashes generated using algorithms/parameters outside the range supported by
 * {@code Pbkdf2PasswordHash} cannot be verified.)
 *
 * @see DatabaseIdentityStoreDefinition#hashAlgorithm()
 * @see DatabaseIdentityStoreDefinition#hashAlgorithmParameters()
 */
public interface Pbkdf2PasswordHash extends PasswordHash {

}
