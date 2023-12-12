---
title: "Jakarta Authentication"
summary: "Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container."
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "Low-level container SPI for authentication mechanisms"
project_id: "ee4j.authentication"
---

## Jakarta Authentication Explained

Security is a major component of application development.  Jakarta EE provides
the robust [Jakarta Security specification](/specifications/security/) that
when paired with the Jakarta Authentication and Jakarta Authorization
specifications, provides APIs that deliver end-to-end security. There are a
large number of application processes that require security measures, and these
specifications provide the ability to do so in a straightforward manner using
annotations and minimal XML configurations. Jakarta EE compliant containers and
deployment environments adhere to the constructs of the Authentication and
Authorization policies to ensure that applications can be secured in a standard
way and deployed across a number of different environments.

### Jakarta Authentication

Jakarta Authentication is integrated into Jakarta Security as a low level
Service Provider Implementation (SPI) for authentication mechanisms.  Mentioned
in the previous section, authentication mechanisms are controllers that
interact with a caller and a container’s environment to obtain the caller’s
credentials, validate the credentials, and pass an authenticated identity to
the container. Jakarta Authentication consists of several profiles, with each
telling how a specific container can integrate with and adapt to this SPI.

- Servlet Container Lite Profile
- REST Profile
- SOAP Profile

The authentication specification covers a wide focus on client and server
authentication. An authentication context is responsible for constructing,
initializing, and coordinating the invocation of one or more encapsulated
authentication modules. At a high level, a typical authentication process flow
works as follows:

1) Client sends a secure request to the server
2) Server validates the request
3) Server dispatches request to service and sends back a secure response
4) Client validates the response

Request and response messages are implementations of a `MessageInfo` interface.
Typically, a runtime would perform the following steps to secure or validate a
message. Steps 1-4 below are performed one time, while 5 is repeated for each
message.

1) Acquire `AuthConfigProvider`, which is used for obtaining an authentication
   configuration for relevant messaging layer and application identifier.
2) Acquire AuthConfig from the provider:
  a) `ClientAuthConfig`: Client configuration
  b) `ServerAuthConfig`: Server configuration
3) Acquire `AuthContext` Identifier for client or server from the corresponding
   `AuthConfig`.
4) Acquire Authentication Context which will be used to process identified
   messages.
  a) `ClientAuthContext`: Client context
  b) `ServerAuthContext`: Server Context
5) Process Messages

An authentication module is invoked to validate a message, and it is passed a
`Subject` object to receive the credentials of the source of the message and a
separate `Subject` object to represent the credentials of the recipient of the
message. The authentication modules contexts return `AuthStatus` values with
the status, and `AuthExceptions` if an exception occurs. It should be noted
that there can be more than one authentication module, and these can be invoked
independently and concurrently.
