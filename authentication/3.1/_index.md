---
title: "Jakarta Authentication 3.1"
date: 2024-05-01
summary: "Release for Jakarta EE 11"
---
Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container.

Jakarta Authentication consists of several profiles, with each profile telling how a specific container
(such as Jakarta Servlet) can integrate with- and adapt to this SPI.

The release aims to evolve the API in a smaller way to support the overall goals of Jakarta Security.

### Removals, deprecations or backwards incompatible changes
* Remove references to the SecurityManager

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* [Jakarta Authentication 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.authentication/releases/3.1)

* [Jakarta Authentication 3.1 Specification Document](./jakarta-authentication-spec-3.1.pdf) (PDF)
* [Jakarta Authentication 3.1 Specification Document](./jakarta-authentication-spec-3.1.html) (HTML)
* [Jakarta Authentication 3.1 Javadoc](./apidocs)
* [Jakarta Authentication 3.1 TCK](https://download.eclipse.org/jakartaee/authentication/3.1/jakarta-authentication-tck-3.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/authentication/3.1/jakarta-authentication-tck-3.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/authentication/3.1/jakarta-authentication-tck-3.1.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.authentication:jakarta.authentication-api:jar:3.1.0](https://central.sonatype.com/artifact/jakarta.authentication/jakarta.authentication-api/3.1.0/jar)

# Compatible Implementations

 * [Epicyro 3.1.0](https://github.com/eclipse-ee4j/epicyro/releases/download/3.1.0-RELEASE/epicyro-3.1.0.jar)
 * [Eclipse Glassfish 8.0.0-M6](https://repo1.maven.org/maven2/org/glassfish/main/distributions/glassfish/8.0.0-M6/glassfish-8.0.0-M6.zip) (JDK 21)
 * [Eclipse Glassfish 8.0.0-JDK-17-M6](https://repo1.maven.org/maven2/org/glassfish/main/distributions/glassfish/8.0.0-JDK17-M6/) (JDK 17)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2023-06-29 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlow                      | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Jun Qian                                       | Primeton            |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02868.html)



## Release Review

The Specification Committee Ballot concluded successfully on 2024-06-19 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03452.html)
