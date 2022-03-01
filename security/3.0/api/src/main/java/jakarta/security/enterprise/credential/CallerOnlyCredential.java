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
 * <code>CallerOnlyCredential</code> represents a credential that only 
 * contains a caller name and no secret of any kind.
 * 
 * <p>
 * This kind of credential is for internal usage within an application, e.g. 
 * for "run-as" functionality in a context where the caller is already
 * sufficiently trusted.
 *
 */
public class CallerOnlyCredential implements Credential {

    private final String caller;

    /**
     * @param caller The caller name
     */
    public CallerOnlyCredential(String caller) {
        this.caller = caller;
    }
    
    public String getCaller() {
        return caller;
    }
    
}
