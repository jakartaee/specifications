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

import java.security.Principal;
import java.util.Set;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;

import jakarta.security.auth.message.MessageInfo;
import jakarta.security.enterprise.AuthenticationStatus;
import jakarta.security.enterprise.identitystore.CredentialValidationResult;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * This class is an implementation of the HttpMessageContext interface that
 * can be subclassed by developers wishing to provide extra or different
 * functionality.
 * <p>
 * All methods default to calling the wrapped object.
 *
 */
public class HttpMessageContextWrapper implements HttpMessageContext {

    private final HttpMessageContext httpMessageContext;
 
    public HttpMessageContextWrapper(HttpMessageContext httpMessageContext) {
        this.httpMessageContext = httpMessageContext;
    }
    
    public HttpMessageContext getWrapped() {
        return httpMessageContext;
    }

    @Override
    public boolean isProtected() {
        return getWrapped().isProtected();
    }

    @Override
    public boolean isAuthenticationRequest() {
        return getWrapped().isAuthenticationRequest();
    }

    @Override
    public boolean isRegisterSession() {
        return getWrapped().isRegisterSession();
    }

    @Override
    public void setRegisterSession(String callerName, Set<String> groups) {
        getWrapped().setRegisterSession(callerName, groups);
    }

    @Override
    public void cleanClientSubject() {
        getWrapped().cleanClientSubject();
    }

    @Override
    public AuthenticationParameters getAuthParameters() {
        return getWrapped().getAuthParameters();
    }

    @Override
    public CallbackHandler getHandler() {
        return getWrapped().getHandler();
    }

    @Override
    public MessageInfo getMessageInfo() {
        return getWrapped().getMessageInfo();
    }

    @Override
    public Subject getClientSubject() {
        return getWrapped().getClientSubject();
    }

    @Override
    public HttpServletRequest getRequest() {
        return getWrapped().getRequest();
    }

    @Override
    public void setRequest(HttpServletRequest request) {
        getWrapped().setRequest(request);
    }

    @Override
    public HttpMessageContext withRequest(HttpServletRequest request) {
        return getWrapped().withRequest(request);
    }

    @Override
    public HttpServletResponse getResponse() {
        return getWrapped().getResponse();
    }

    @Override
    public void setResponse(HttpServletResponse response) {
        getWrapped().setResponse(response);
    }

    @Override
    public AuthenticationStatus redirect(String location) {
        return getWrapped().redirect(location);
    }

    @Override
    public AuthenticationStatus forward(String path) {
        return getWrapped().forward(path);
    }

    @Override
    public AuthenticationStatus responseUnauthorized() {
        return getWrapped().responseUnauthorized();
    }

    @Override
    public AuthenticationStatus responseNotFound() {
        return getWrapped().responseNotFound();
    }

    @Override
    public AuthenticationStatus notifyContainerAboutLogin(String username, Set<String> roles) {
        return getWrapped().notifyContainerAboutLogin(username, roles);
    }

    @Override
    public AuthenticationStatus notifyContainerAboutLogin(Principal principal, Set<String> roles) {
        return getWrapped().notifyContainerAboutLogin(principal, roles);
    }

    @Override
    public AuthenticationStatus notifyContainerAboutLogin(CredentialValidationResult result) {
        return getWrapped().notifyContainerAboutLogin(result);
    }

    @Override
    public AuthenticationStatus doNothing() {
        return getWrapped().doNothing();
    }

    @Override
    public Principal getCallerPrincipal() {
        return getWrapped().getCallerPrincipal();
    }

    @Override
    public Set<String> getGroups() {
        return getWrapped().getGroups();
    }
    
}
