---
title: "Jakarta Authentication Specification 1.1"
date: 2019-07-22T13:45:02+0200
summary: "First release for Jakarta EE 8"
---
Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container. 
        
Jakarta Authentication consists of several profiles, with each profile telling how a specific container
(such as Jakarta Servlet) can integrate with- and adapt to this SPI.

* [Jakarta Authentication 1.1 Specification Document](./authentication_1.1.pdf) (PDF)
* [Jakarta Authentication 1.1 Specification Document](./authentication_1.1.html) (HTML)
* [Jakarta Authentication 1.1 Javadoc](./apidocs)
* Maven coordinates
  * [jakarta.security.auth.message:jakarta.security.auth.message-api:jar:1.1.3](https://search.maven.org/artifact/jakarta.security.auth.message/jakarta.security.auth.message-api/1.1.3/jar)

# Ballots

## Release Review


|                       |  Yes    | No      | Abstain  |
|-----------------------|---------|---------|----------|
|Fujitsu                |         |         |          |
|IBM                    |         |         |          |
|Oracle                 |         |         |          |
|Payara                 |         |         |          |
|Red Hat                |         |         |          |
|Tomitribe              |         |         |          |
|EE4J PMC               |         |         |          |
|Participant Members    |         |         |          |
|Committer Members      |         |         |          |


# Compatible Implementations

* GlassFish 5.1