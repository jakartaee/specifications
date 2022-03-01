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
 *  Contributors:
 *   2021 : Payara Foundation and/or its affiliates
 *      Initially authored in Security Connectors
 */

package jakarta.security.enterprise.identitystore;

import jakarta.security.enterprise.identitystore.openid.OpenIdConstant;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * {@link ClaimsDefinition} annotation defines claims mapping in openid connect
 * client configuration.
 *
 * @author jGauravGupta
 * @author Rudy De Busscher
 */
@Retention(RUNTIME)
public @interface ClaimsDefinition {


    /**
     * Maps the callerNameClaim's value to caller name value in
     * jakarta.security.enterprise.identitystore.IdentityStore#validate
     *
     *
     * @return Claim name to be used as caller.
     */
    String callerNameClaim() default OpenIdConstant.PREFERRED_USERNAME;

    /**
     * Maps the callerGroupsClaim's value to caller groups value in
     * jakarta.security.enterprise.identitystore.IdentityStore#validate
     *
     *
     * @return Claim name to be used as caller Group.
     */
    String callerGroupsClaim() default OpenIdConstant.GROUPS;

}
