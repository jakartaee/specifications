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

package jakarta.security.enterprise.credential;

/**
 * <code>Credential</code> represents the credential the caller will use to authenticate.
 */
public interface Credential {

    /**
     * Determines whether the credential value has been securely cleared.
     * @return <code>true</code> if the credential has been cleared, otherwise false.
     */
    default boolean isCleared() {
        return false;
    }

    /**
     * Clears the credential. For example, if the credential includes a password,
     * this method would overwrite the password value.
     */
    default void clear() {}
    
    /**
     * Determines whether the credential is valid. This would be called as part of
     * the credential validation process to check the integrity of the credential,
     * such as a signature check. This check would be self-contained,
     * not requiring identity store access.
     *
     * @return <code>true</code> if credential has integrity.
     */
    default boolean isValid() {
        return true;
    }
   
}
