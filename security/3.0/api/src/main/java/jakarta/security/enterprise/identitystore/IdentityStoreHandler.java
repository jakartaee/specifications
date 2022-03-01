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

import jakarta.security.auth.message.module.ServerAuthModule;

import jakarta.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import jakarta.security.enterprise.credential.Credential;

/**
 * <code>IdentityStoreHandler</code> is a mechanism for validating a caller's
 * credentials, and accessing a caller's identity attributes, by consulting
 * a set of one or more {@link IdentityStore}s.
 * <p>
 * It is intended for use by an authentication mechanism, such as an
 * {@link HttpAuthenticationMechanism} (Jakarta Security) or a {@link ServerAuthModule}
 * (Jakarta Authentication).
 * <p>
 * Beans should inject only this handler, and not {@link IdentityStore}
 * directly, as multiple stores may exist.
 * <p>
 * Implementations of Jakarta Security must supply a default implementation of 
 * {@code IdentityStoreHandler} that behaves as described in the Jakarta Security 
 * specification document.
 * Applications do not need to supply an {@code IdentityStoreHandler}
 * unless application-specific behavior is desired.
 */
public interface IdentityStoreHandler {

    /**
     * Validate the given {@link Credential} and return the identity and attributes
     * of the caller it represents.
     * <p>
     * Implementations of this method will typically invoke the {@code validate()}
     * and {@code getCallerGroups()} methods of one or more {@link IdentityStore}s
     * and return an aggregated result.
     * <p>
     * Note that the {@link IdentityStore} may check for {@link IdentityStorePermission}
     * if {@code getCallerGroups()} is called and a {@link SecurityManager} is configured.
     * (The default built-in stores do perform this check; application-supplied stores
     * may or may not.) An implementation of this method should therefore invoke
     * {@code getCallerGroups()} in the context of a {@link java.security.PrivilegedAction},
     * and arrange to be granted the appropriate {@link IdentityStorePermission} permission.
     *
     * @param credential The credential to validate.
     * @return The validation result.
     */
    CredentialValidationResult validate(Credential credential);
}
