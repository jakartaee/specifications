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

import jakarta.security.enterprise.credential.Credential;
import jakarta.security.enterprise.identitystore.RememberMeIdentityStore;

/**
 * Parameters that are provided along with an authentication request.
 *
 */
public class AuthenticationParameters {

    private Credential credential;
    private boolean newAuthentication;
    private boolean rememberMe;

    /**
     * Creates a new instance of AuthenticationParameters, useful for a fluent/builder
     * style creation of parameters.
     * 
     * @return a new AuthenticationParameters instance.
     */
    public static AuthenticationParameters withParams() {
        return new AuthenticationParameters();
    }

    /**
     * Sets the credential to be used by the authentication mechanism responding
     * to the authenticate call in which these AuthenticationParameters are passed.
     * 
     * @param credential the credential to be used by the authentication mechanism
     * 
     * @return the instance of AuthenticationParameters on which this call was made, useful for a fluent/builder
     * style creation of parameters.
     */
    public AuthenticationParameters credential(Credential credential) {
        setCredential(credential);
        return this;
    }

    /**
     * Signal to the authentication mechanism responding to the authenticate call in which these 
     * AuthenticationParameters are passed, that an explicit new authentication dialog is required, as opposed to
     * continuing a potentially existing one.
     * 
     * @param newAuthentication whether a new authentication dialog is required to be started.
     * 
     * @return the instance of AuthenticationParameters on which this call was made, useful for a fluent/builder
     * style creation of parameters.
     */
    public AuthenticationParameters newAuthentication(boolean newAuthentication) {
        setNewAuthentication(newAuthentication);
        return this;
    }

    /**
     * Signals that for this call to the authentication mechanism "remember me" should be applied, IFF the
     * "remember me" feature is configured for the authentication mechanism responding to the authenticate call.
     * 
     * <p>
     * If "remember me" is not configured, this parameter is silently ignored.
     * 
     * @see RememberMe
     * @see RememberMeIdentityStore
     * 
     * @param rememberMe if <code>true</code> the "remember me" feature will be used if authentication succeeds and if so configured.
     * 
     * @return the instance of AuthenticationParameters on which this call was made, useful for a fluent/builder
     * style creation of parameters.
     */
    public AuthenticationParameters rememberMe(boolean rememberMe) {
        setRememberMe(rememberMe);
        return this;
    }

    /**
     * The credential set as parameter in this instance. 
     * 
     * @see AuthenticationParameters#credential(Credential)
     * 
     * @return the credential set as parameter in this instance
     */
    public Credential getCredential() {
        return credential;
    }

    /**
     * Sets the credential as parameter in this instance.
     * 
     * @see AuthenticationParameters#credential(Credential)
     *  
     * @param credential the credential to be set as parameter in this instance.
     */
    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    /**
     * Whether a new authentication dialog is required.
     * 
     * @see AuthenticationParameters#newAuthentication(boolean)
     * 
     * @return whether a new authentication dialog is required.
     */
    public boolean isNewAuthentication() {
        return newAuthentication;
    }

    /**
     * Sets whether a new authentication dialog is required.
     * 
     * @see AuthenticationParameters#newAuthentication(boolean)
     * 
     * @param newAuthentication whether a new authentication dialog is required
     */
    public void setNewAuthentication(boolean newAuthentication) {
        this.newAuthentication = newAuthentication;
    }

    /**
     * Whether "remember me" should be used.
     * 
     * @see AuthenticationParameters#rememberMe(boolean)
     * 
     * @return whether "remember me" should be used.
     */
    public boolean isRememberMe() {
        return rememberMe;
    }

    /**
     * Sets whether "remember me" should be used.
     * 
     *  @see AuthenticationParameters#rememberMe(boolean)
     * 
     * @param rememberMe whether "remember me" should be used.
     */
    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

}
