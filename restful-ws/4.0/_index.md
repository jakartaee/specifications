---
title: "Jakarta RESTful Web Services 4.0"
date: 2024-03-05
summary: "Release for Jakarta EE 11"
---

Jakarta RESTful Web Services provides a foundational API to develop web services following the Representational
State Transfer (REST) architectural pattern.

The goal of this release is to remove the JAXB dependency and ManagedBean support from Jakarta RESTful
Web Services and add TCK test to fill verification gaps while maintaining  backward compatibility with
earlier releases.  

### New features, enhancements or additions
* Add TCK tests for multipart/form-data API - [Issue #962](https://github.com/jakartaee/rest/issues/962)
* Add TCK tests for default ExceptionMapper - [Issue #1188](https://github.com/jakartaee/rest/issues/1188)
* Convenience method for checking header value lists - [PR #1066](https://github.com/jakartaee/rest/pull/1066 )
* Add Required TCK for convenience method merged in PR 1066 - [Issue #1227](https://github.com/jakartaee/rest/issues/1227)
* Clarify JavaSE support in Section 2.3 of specification - [Issue #1127](https://github.com/jakartaee/rest/issues/1127)
* Add getMatchedResourceTemplate method to UriInfo - [Issue #1191](https://github.com/jakartaee/rest/issues/1191)
* Add JSON Merge Patch: [Issue #1141](https://github.com/jakartaee/rest/issues/1141)


### Removals, deprecations or backwards incompatible changes
* Remove JAXB dependency from Jakarta Rest - [Issue #1226](https://github.com/jakartaee/rest/issues/1226)
* Remove ManagedBean support from Jakarta Rest specification - [Issue #1216](https://github.com/jakartaee/rest/issues/1216)

### Minimum Java SE Version
* **Java SE 17 or higher**

# Details

* [Jakarta RESTful Web Services 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.jaxrs/releases/4.0.0)
    * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/#jakarta-ee-11-release-plan)
* [Jakarta RESTful Web Services 4.0 Specification Document](./jakarta-restful-ws-spec-4.0.pdf) (PDF)
* [Jakarta RESTful Web Services 4.0 Specification Document](./jakarta-restful-ws-spec-4.0.html) (HTML)
* [Jakarta RESTful Web Services 4.0 Javadoc](./apidocs)
* [Jakarta RESTful Web Services 4.0.0 TCK](https://download.eclipse.org/jakartaee/restful-ws/4.0/jakarta-restful-ws-tck-4.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/restful-ws/4.0/jakarta-restful-ws-tck-4.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/restful-ws/4.0/jakarta-restful-ws-tck-4.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* First service release [Jakarta RESTful Web Services 4.0.1 TCK]
(https://download.eclipse.org/jakartaee/restful-ws/4.0/jakarta-restful-ws-tck-4.0.1.zip) ([sig](https://download.eclipse.org/jakartaee/restful-ws/4.0/jakarta-restful-ws-tck-4.0.1.zip.sig), [sha](https://download.eclipse.org/jakartaee/restful-ws/4.0/jakarta-restful-ws-tck-4.0.1.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.jaxrs:jakarta.jaxrs-api:jar:4.0.0](https://search.maven.org/artifact/jakarta.ws.rs/jakarta.ws.rs-api/4.0.0/jar)

# Compatible Implementations
* [RESTEasy 7.0.0.Alpha1](https://github.com/resteasy/resteasy/releases/tag/7.0.0.Alpha1)
* [Eclipse Jersey 4.0.0-M1](https://github.com/eclipse-ee4j/jersey/releases/tag/4.0.0-M1)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2024-04-24 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | no vote |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03307.html)

## Progress Review

The Specification Committee Ballot concluded successfully on 2024-03-20 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | no vote |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Dr. Jun Qian                                   | Primeton            |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03204.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2022-12-08 with the following results.
Note that this is a revised plan from the approved plan review of June 2021.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Tom Watson, Emily Jiang                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlo0w                     | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Arjan Tijms                                    | Omnifish            |   +1    |
| Dr. Jun Qian                                   | Primeton            |   +1    |
|                                                | **Total**           |  **2**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02802.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-06-01 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Matt Gill                      | Payara              |   +1    |
| Scott Stark, Mark Little                       | Red Hat             |   -1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   -1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
|                                                | **Total**           |  **8**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01809.html)
