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
 * Display specifies how the Authorization Server displays the authentication
 * and consent user interface pages to the End-User.
 *
 * @author Gaurav Gupta
 */
public enum DisplayType {

    /**
     * The Authorization Server should display authentication and consent UI
     * consistent with a full User-Agent page view. If the display parameter is
     * not specified this is the default display mode.
     *
     */
    PAGE,
    /**
     * The Authorization Server should display authentication and consent UI
     * consistent with a popup User-Agent window.
     *
     */
    POPUP,
    /**
     * The Authorization Server should display authentication and consent UI
     * consistent with a device that leverages a touch interface.
     *
     */
    TOUCH,
    /**
     * The Authorization Server should display authentication and consent UI
     * consistent with a "feature phone" type display.
     *
     */
    WAP;

    public static DisplayType fromString(String key) {
        return isNull(key) || key.trim().isEmpty() ? null : valueOf(key.toUpperCase());
    }

}
