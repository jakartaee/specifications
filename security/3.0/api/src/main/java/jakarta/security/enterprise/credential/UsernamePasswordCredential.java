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
 * Represents the credentials typically used by standard caller name/password authentication.
 */
public class UsernamePasswordCredential extends AbstractClearableCredential {

    private final String caller;
    private final Password password;

    /**
     * Constructor.
     *
     * @param callerName The caller name
     * @param password The password, as a String
     */
    public UsernamePasswordCredential(String callerName, String password) {
        this.caller = callerName;
        this.password = new Password(password);
    }
    
    /**
     * Constructor.
     *
     * @param callerName The caller name
     * @param password The password
     */
    public UsernamePasswordCredential(String callerName, Password password) {
        this.caller = callerName;
        this.password = password;
    }

    /**
     * Determines the password.
     * @return The password.
     */
    public Password getPassword() {
        return password;
    }
    
    /**
     * Determines the password.
     * @return The password, as a String.
     */
    public String getPasswordAsString() {
        return String.valueOf(getPassword().getValue());
    }

    @Override
    public void clearCredential() {
        password.clear();
    }

    public String getCaller() {
        return caller;
    }
    
    public boolean compareTo(String callerName, String password) {
        return getCaller().equals(callerName) && getPassword().compareTo(password);
    }

}
