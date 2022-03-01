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

import java.security.BasicPermission;

/**
 * Class for IdentityStore permissions.
 * <p>
 * Currently defined permission names are:
 * <ul>
 * <li>getGroups
 * </ul>
 * <p>
 * No actions are defined.
 *
 */
public class IdentityStorePermission extends BasicPermission {

    private static final long serialVersionUID = 1254057022829640365L;

    /**
     * Create an IdentityStorePermission with the specified name.
     *
     * @param name Name of the permission.
     * @throws NullPointerException If name is null.
     * @throws IllegalArgumentException If name is empty.
     */
    public IdentityStorePermission(String name) {
        super(name);
    }

    /**
     * Create an IdentityStorePermission with the specified name.
     * No actions are defined for this permission; the action parameter
     * should be specified as {code}null{code}.
     *
     * @param name Name of the permission.
     * @param action Action for the permission; always null.
     * @throws NullPointerException If name is null.
     * @throws IllegalArgumentException If name is empty.
     */
    public IdentityStorePermission(String name, String action) {
        super(name, action);
    }

}
