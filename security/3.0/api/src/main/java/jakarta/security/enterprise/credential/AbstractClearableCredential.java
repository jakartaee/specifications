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
 * <code>AbstractClearableCredential</code> contains behavior common to
 * <code>{@link Credential}</code> implementations that can be meaningfully
 * cleared.
 */
public abstract class AbstractClearableCredential implements Credential {

    private volatile boolean cleared = false;

    @Override
    public final boolean isCleared() {
        return cleared;
    }

    /**
     * Specifies that the credential value has been securely cleared.
     */
    protected final void setCleared() {
        this.cleared = true;
    }

    @Override
    public final void clear() {
        clearCredential();
        setCleared();
    }

    /**
     * Invokes the specific subclass to securely clear the credential value.
     * Some <code>{@link Credential}</code> subclasses contain credential values
     * which are inherently secure, such as tokens, for which clearing the
     * credential may not be necessary.
     * <p>
     * For example, if the credential includes a password,
     * this method would overwrite the password value.
     */
    protected abstract void clearCredential();
}
