---
title: "Jakarta Security"
summary: "Jakarta Security defines a standard for creating secure Jakarta EE applications in modern application paradigms."
description: "Find all releases of the Jakarta Security specification. Jakarta
Security defines a standard for creating secure Jakarta EE applications."
seo_title: Jakarta Security Specification | Jakarta EE
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "Defines a standard for creating secure EE applications"
project_id: "ee4j.es"
---

{{< grid/div class="specifications-content" >}}

## Jakarta Security Explained

Security is a major component of application development.  Jakarta EE provides
the robust Jakarta Security specification that when paired with the 
[Jakarta Authentication](/specifications/authentication/) and 
[Jakarta Authorization specifications](/specifications/authorization/),
provides APIs that deliver end-to-end security. There are a large number of
application processes that require security measures, and these specifications
provide the ability to do so in a straightforward manner using annotations and
minimal XML configurations. Jakarta EE compliant containers and deployment
environments adhere to the constructs of the Authentication and Authorization
policies to ensure that applications can be secured in a standard way and
deployed across a number of different environments.

### Overview of Application Security

Applications consist of both protected and unprotected resources, and
application security is involved with protected resources. With respect to web
applications, security begins when the initial request is made to the main
application URL, at which point the application container determines whether
the client is authorized access to the resource.  Part of this initial process
is to also determine whether the client is required to be authenticated to
visit the requested URL, and if so, an authentication process needs to occur.
Authentication requires some type of credential from the client, oftentimes a
username/password, or perhaps a JWT Token, and this credential then needs to be
validated.

Once the credential has been validated, the application container then consults
a security policy to determine if the client has authorization to access the
requested resource.  The security policy outlines different roles required to
access the resource, and the validation process attempts to map the user to one
of the roles which has access.

Each of the steps outlined thus far are required for front end security,
providing access to requested resources.  There are also security mechanisms
required to protect business methods in a similar manner.  Jakarta Security
contains APIs for securing the entire application.  Given this explanation, the
following sections provide an overview of what role these specifications play
in the process.

### Configuration for Jakarta Security

Jakarta Security is part of any container that is compatible with the Jakarta
EE Platform.  However, to explicitly add the Jakarta Security API to a maven
application, add the following dependency:

```xml
<dependency>
    <groupId>jakarta.security.enterprise</groupId>
    <artifactId>jakarta.security.enterprise-api</artifactId>
    <version>3.0.0</version>
</dependency>

Along with an implementation:
<dependency>
    <groupId>org.glassfish.soteria</groupId>
    <artifactId>jakarta.security.enterprise</artifactId>
    <version>3.0.0</version>
</dependency>
```

### Jakarta Security

The Jakarta Security specification provides a standard means for securing
Jakarta EE applications through the use of Authentication mechanisms.  The
mechanisms provide implementations for the `HttpAuthenticationMechanism`
interface, which are used to specify how a user is authenticated, and whether
an authenticated user gains access to a requested resource. The
`HttpAuthenticationMechanism` interface enables developers to work with code
configuring through annotations, rather than XML.  Jakarta Security enables
security for each of the authentication methods that are defined by the Servlet
specification by providing authentication mechanisms for each:

- Basic HTTP:  When the `BasicAuthenticationMechanismDefinition` annotation is
  applied, if an unauthorized request is received, the container will negotiate
  with the client to achieve authorization.
- Form-Based: The `FormAuthenticationMechanismDefinition` provides options for
  specifying a login page and an error page.  When the login page is specified,
  the server will send the standard login form to the client, which will then
  send the form contents through authentication business logic.
- Custom Form: The `CustomFormAuthenticationMechanism` annotation allows one to
  specify a login page just like the form-based authentication, but a custom
  login page incorporating logic which invokes the SecurityContext is used. The
  SecurityContext enables a custom authentication implementation to be applied.
- OpenID Connect: The `OpenIdAuthenticationMechanismDefinition` annotation
  authenticates according to the Authorization Code flow and Refresh tokens, as
  defined by the OpenID Connect specification.  The mechanism requires metadata
  about the OpenID Connect Provider to function properly.

It should be noted that custom authentication mechanisms can be developed by
implementing the `HttpAuthenticationMechanism` interface. This interface
defines methods which align with those contained within the Jakarta
Authentication `ServerAuth` interface to ensure that a caller is properly
authenticated and authorized to access a requested resource.

- `validateRequest` (required): Provided to allow a caller to authenticate to a resource.
- `secureResponse`: Provided to allow post processing to occur on the response
  generated by a servlet and/or servlet filter.
- `cleanSubject`: Provided to allow for cleanup after logout.

Authentication mechanisms are configured by placing an annotation respective to
the desired type of authentication, onto a Jakarta CDI bean.  For instance, to
apply Basic authentication, the following annotation can be placed on an
ApplicationScoped Jakarta CDI bean.

```java
@BasicAuthenticationMechanismDefinition(
  realmName = "myRealm")
@ApplicationScoped
public class MyClass {}
```

In a similar manner, form based authentication can be configured using the
following.  In this case, the `@LoginToContinue` method redirects the user to
the login screen or to an error page if the login attempt is unsuccessful.

```java
@FormAuthenticationMechanismDefinition (
    loginToContinue = @LoginToContinue (
        loginPage = "/authenticate.html",
        errorPage = "/loginError.html"))
@ApplicationScoped
public class MyClass {}
```

Jakarta Security defines an IdentityStore API which can be used to communicate
with Identity Stores used to authenticate a user and obtain a user’s defined
roles. Default identity stores are provided by the compliant container for
database and LDAP authentication using the `@DatabaseIdentityStoreDefinition`
or `@LdapIdentityStoreDefinition`, respectively. It is also possible to create
a custom Identity store by implementing the `IdentityStore` interface. For
instance, to configure an LDAP identity store, one may do the following:

```java
@LdapIdentityStoreDefinition(
    url = "ldap://myserver:port",
    callerBaseDn = "ou=caller,dc=example,dc=org",
    gropuSearchBase = "ou=group,dc=example,dc=org",
    groupSearchFilter = "")
@ApplicationScoped
public class MyClass {}
```
The SecurityContext provides an elegant way to programmatically work with
security APIs via a Jakarta CDI bean.  The `SecurityContext` interface is
available at runtime, so it can be injected and utilized to do things such as
authenticate a user, check role membership, and more.

{{</ grid/div >}}
