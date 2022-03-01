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

import java.time.Instant;
import java.util.*;

public interface Claims {
    /**
     * Get String claim of given name
     *
     * @param name
     * @return value, or empty optional if not present
     * @throws IllegalArgumentException when value of claim is not a string
     */
    Optional<String> getStringClaim(String name);

    /**
     * Get Numeric Date claim of given name
     *
     * @param name
     * @return value, or empty optional if not present
     * @throws IllegalArgumentException when value of claim is not a number that represents an epoch seconds
     */
    Optional<Instant> getNumericDateClaim(String name);

    /**
     * Get String List claim of given name
     *
     * @param name
     * @return a list with values of the claim, or empty list if value is not present.
     * @throws IllegalArgumentException when value of claim is neither string or array of strings
     */
    List<String> getArrayStringClaim(String name);

    /**
     * Get integer claim of given name
     *
     * @param name
     * @return value, or empty optional if not present
     * @throws IllegalArgumentException when value of claim is not a number
     */
    OptionalInt getIntClaim(String name);

    /**
     * Get long claim of given name
     *
     * @param name
     * @return value, or empty optional if not present
     * @throws IllegalArgumentException when value of claim is not a number
     */
    OptionalLong getLongClaim(String name);

    /**
     * Get double claim of given name
     *
     * @param name
     * @return value, or empty optional if not present
     * @throws IllegalArgumentException when value of claim is not a number
     */
    OptionalDouble getDoubleClaim(String name);

    /**
     * Get nested claims of given name.
     * @param name
     * @return Claims instance represented nested values within that claim, or empty optional if not present
     * @throws IllegalArgumentException when value is not a nested object
     */
    Optional<Claims> getNested(String name);
}
