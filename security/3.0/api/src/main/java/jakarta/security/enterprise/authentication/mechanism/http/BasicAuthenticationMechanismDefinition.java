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

package jakarta.security.enterprise.authentication.mechanism.http;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * Annotation used to define a container authentication mechanism that implements
 * the HTTP basic access authentication protocol as defined by the Servlet spec (13.6.1)  
 * and make that implementation available as an enabled CDI bean.
 *
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface BasicAuthenticationMechanismDefinition {
    
    /**
     * Name of realm that will be sent via the <code>WWW-Authenticate</code> header.
     * <p>
     * Note that this realm name <b>does not</b> couple a named identity store
     * configuration to the authentication mechanism.
     * 
     * @return Name of realm
     */
    String realmName() default "";
}
