---
title: "Jakarta Authentication 1.1"
date: 2019-09-10
summary: "First release for Jakarta EE 8"
---
Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container. 
        
Jakarta Authentication consists of several profiles, with each profile telling how a specific container
(such as Jakarta Servlet) can integrate with- and adapt to this SPI.

* [Jakarta Authentication 1.1 Specification Document](./authentication-spec-1.1.pdf) (PDF)
* [Jakarta Authentication 1.1 Specification Document](./authentication-spec-1.1.html) (HTML)
* [Jakarta Authentication 1.1 Javadoc](./apidocs)
* [Jakarta Authentication 1.1 TCK](https://download.eclipse.org/jakartaee/authentication/1.1/jakarta-authentication-tck-1.1.1.zip) ([sig](https://download.eclipse.org/jakartaee/authentication/1.1/jakarta-authentication-tck-1.1.1.zip.sig),[sha](https://download.eclipse.org/jakartaee/authentication/1.1/jakarta-authentication-tck-1.1.1.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.security.auth.message:jakarta.security.auth.message-api:jar:1.1.3](https://central.sonatype.com/artifact/jakarta.security.auth.message/jakarta.security.auth.message-api/1.1.3/jar)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2019-09-02 with the following results.

|                       |  Yes    | No      | Abstain  |
|-----------------------|---------|---------|----------|
|Fujitsu                |   +1    |         |          |
|IBM                    |   +1    |         |          |
|Oracle                 |   +1    |         |          |
|Payara                 |   +1    |         |          |
|Red Hat                |   +1    |         |          |
|Tomitribe              |   +1    |         |          |
|EE4J PMC               |   +1    |         |          |
|Participant Members    |   +1    |         |          |
|Committer Members      |   +1    |         |          |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00504.html)


# Compatible Implementations

* [Eclipse GlassFish 5.1](https://eclipse-ee4j.github.io/glassfish)
