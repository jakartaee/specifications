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

import static java.util.Arrays.copyOf;
import java.util.Objects;

import java.util.Arrays;

/**
 * Represents a text-based password, and includes a built-in mechanism for securely
 * clearing the value.
 */
public class Password {

    private static final char[] EMPTY_VALUE = new char[0];
    private volatile char[] value;

    /**
     * Constructor
     *
     * @param value The password value
     * @throws java.lang.NullPointerException Value is null
     */
    public Password(char[] value) {
        Objects.requireNonNull(value, "Password value may not be null");

        this.value = copyOf(value, value.length);
    }

    /**
     * Constructor
     *
     * @param value The password value
     * @throws java.lang.NullPointerException Value is null
     */
    public Password(String value) {
        this(null == value ? null : value.toCharArray());
    }

    /**
     * Determines the password value.
     *
     * @return The password value, empty array if cleared.
     */
    public char[] getValue() {
        return value;
    }

    /**
     * Securely clears the password value.
     */
    public void clear() {
        if (EMPTY_VALUE == value)
            return;

        char[] tempValue = value;
        value = EMPTY_VALUE;

        for (int i = 0; i < tempValue.length; i++) {
            tempValue[i] = 0x00;
        }
    }
    
    public boolean compareTo(String password) {
        if (password == null) {
            return false;
        }
        
        return Arrays.equals(password.toCharArray(), value);
    }
}
