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
package jakarta.security.enterprise.identitystore;

import static java.util.Objects.isNull;

/**
 * Prompt specifies whether the Authorization Server prompts the End-User for
 * re-authentication and consent.
 *
 * @author Gaurav Gupta
 */
public enum PromptType {

    /**
     * The Authorization Server must not display any authentication or consent 
     * user interface pages. An error is returned if an End-User is not already 
     * authenticated or the Client does not have pre-configured consent for the 
     * requested Claims.
     * ErrorCode : login_required, interaction_required
     */
    NONE,

    /**
     * The Authorization Server SHOULD prompt the End-User for reauthentication.
     * If it cannot reauthenticate the End-User, it MUST return an error.
     * ErrorCode : login_required
     * 
     */
    LOGIN,

    /**
     * The Authorization Server SHOULD prompt the End-User for consent before 
     * returning information to the Client. If it cannot obtain consent, it must
     * return an error.
     * ErrorCode : consent_required
     * 
     */
    CONSENT,

    /**
     * The Authorization Server SHOULD prompt the End-User to select a user 
     * account. If it cannot obtain an account selection choice made by the 
     * end-user, it must return an error.
     * ErrorCode : account_selection_required
     * 
     */
    SELECT_ACCOUNT;

    public static PromptType fromString(String key) {
        return isNull(key) || key.trim().isEmpty() ? null : valueOf(key.toUpperCase());
    }

}
