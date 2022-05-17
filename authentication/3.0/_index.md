---
title: "Jakarta Authentication 3.0"
date: 2022-02-28
summary: "Release for Jakarta EE 10"
---
Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container.

Jakarta Authentication consists of several profiles, with each profile telling how a specific container
(such as Jakarta Servlet) can integrate with- and adapt to this SPI.

This release contains the following changes:

* [Issue #87](https://github.com/jakartaee/authentication/issues/87): Add generics to the API
* [Issue #128](https://github.com/jakartaee/authentication/issues/128): Add methods for adding and removing a single server auth module
* [Issue #5](https://github.com/jakartaee/authentication/issues/5): Add key for isAuthenticationRequest to server container profile.
* [Issue #130](https://github.com/jakartaee/authentication/issues/130): Add default methods to ServerAuth and ClientAuth
* [Issue #132](https://github.com/jakartaee/authentication/issues/132): Add constructor variants taking a cause to AuthException
* [Issue #134](https://github.com/jakartaee/authentication/issues/134): Clarify interaction of Servlet profile with some other specs
* [Issue #136](https://github.com/jakartaee/authentication/issues/136): Clarify PasswordValidationCallback
* [Issue #119](https://github.com/jakartaee/authentication/issues/119): Clarified state expectations of callbackhander for per-request state
* [Issue #138](https://github.com/jakartaee/authentication/issues/138): Deprecate SecurityManager usage in light of JDK 17/JEP 411

This release requires Java SE 11 or newer (aligned with Jakarta EE 10).

* [Jakarta Authentication 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.authentication/releases/3.0)
  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Authentication 3.0 Specification Document](./jakarta-authentication-spec-3.0.pdf) (PDF)
* [Jakarta Authentication 3.0 Specification Document](./jakarta-authentication-spec-3.0.html) (HTML)
* [Jakarta Authentication 3.0 Javadoc](./apidocs)
* [Jakarta Authentication 3.0 TCK](https://download.eclipse.org/jakartaee/authentication/3.0/jakarta-authentication-tck-3.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/authentication/3.0/jakarta-authentication-tck-3.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/authentication/3.0/jakarta-authentication-tck-3.0.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.authentication:jakarta.authentication-api:jar:3.0.0](https://search.maven.org/artifact/jakarta.authentication/jakarta.authentication-api/3.0.0/jar)


# Compatible Implementations

* [Eclipse Glassfish 7.0.0-M4](https://github.com/eclipse-ee4j/glassfish/releases/download/7.0.0-M4/glassfish-7.0.0-M4.zip)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-05-16 with the following results.

| Representative                                 | Representative for: | Vote    |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Tom Watson, Emily Jiang                        | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Petr Aubrecht                  | Payara              |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | no vote |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  |    +1   |
|                                                | **Total**           |  **9**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02457.html).

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-06-15 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                      | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                      | Payara              |  +1  |
| Scott Stark, Mark Little                       | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Dr. Jun Qian                                   | Enterprise Members  |  +1  |
|                                                | Total               |  10  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01845.html).
