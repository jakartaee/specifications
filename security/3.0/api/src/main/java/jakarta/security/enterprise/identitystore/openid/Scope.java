/*
 * Copyright (c) 2021, 2022 Contributors to the Eclipse Foundation
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
 *
 */

/*
 *
 * Contributors:
 *   2021 : Payara Foundation and/or its affiliates
 *      Initially authored in Security Connectors
 */
package jakarta.security.enterprise.identitystore.openid;

import java.util.LinkedHashSet;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Objects.isNull;

/**
 *
 * @author Gaurav Gupta
 * @author Rudy De Busscher
 */
public class Scope extends LinkedHashSet<String> {

    public Scope() {
    }

    public Scope(final List<String> values) {
        addAll(values);
    }

    public static Scope parse(final String scopeValue) {

        if (isNull(scopeValue)) {
            return null;
        }

        Scope scope = new Scope();

        if (scopeValue.trim().isEmpty()) {
            return scope;
        }

        // Multiple scope values may be used by creating a space delimited
        scope.addAll(asList(scopeValue.split(" ")));
        return scope;
    }

    @Override
    public String toString() {
        return String.join(" ", this);
    }

}
