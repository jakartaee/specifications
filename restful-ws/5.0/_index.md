---
title: "Jakarta RESTful Web Services 5.0 (under development)"
date: 2025-04-15
summary: "Release for Jakarta EE 12"
---

Jakarta RESTful Web Services provides a foundational API to develop web services following the 
Representational State Transfer (REST) architectural pattern.

The goal of this release it to continue the path towards full integration with CDI whilst 
maintaining compatibility with previous releases. A few annotations and types may be 
deprecated and marked for removal in preparation for future work.

### New features, enhancements or deprecations

* Deprecate @Context and context resolvers in preparation for CDI adoption [#569](https://github.com/jakartaee/rest/issues/569)
  * Evaluate alternatives using CDI as part of this release
  * Consider introduction of new @Entity annotation
* Deprecate @Suspended [#1209](https://github.com/jakartaee/rest/issues/1209)
* Remove Security Manager uses in API [#1295](https://github.com/jakartaee/rest/issues/1295)
* Evaluate integration with Jakarta HTTP specification [#1314](https://github.com/jakartaee/rest/issues/1314)
* Consider support for default @Param annotations [#579](https://github.com/jakartaee/rest/issues/579)
* Clarify provider injection support in Jakarta REST Client API [#746](https://github.com/jakartaee/rest/issues/746) [#842](https://github.com/jakartaee/rest/issues/842)
* Review Servlet integration in preparation for CDI adoption [#1214](https://github.com/jakartaee/rest/issues/1214)
* Support for Java records [#913](https://github.com/jakartaee/rest/issues/913)

See the [Jakarta RESTful Web Services 5.0 Release Plan](https://projects.eclipse.org/projects/ee4j.rest/releases/5.0.0/plan).

### Minimum Java SE Version
* **Java SE 21 or higher**

# Details

* [Jakarta RESTful Web Services 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.rest/releases/5.0.0)
    * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee11/#jakarta-ee-12-release-plan)
<!--
* [Jakarta RESTful Web Services 5.0 Specification Document](./jakarta-restful-ws-spec-5.0.pdf) (PDF)
* [Jakarta RESTful Web Services 5.0 Specification Document](./jakarta-restful-ws-spec-5.0.html) (HTML)
* [Jakarta RESTful Web Services 5.0 Javadoc](./apidocs)
* [Jakarta RESTful Web Services 5.0.0 TCK](https://download.eclipse.org/jakartaee/restful-ws/5.0/jakarta-restful-ws-tck-5.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/restful-ws/5.0/jakarta-restful-ws-tck-5.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/restful-ws/5.0/jakarta-restful-ws-tck-5.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
    * For all TCK releases, see the download directory [here](http://download.eclipse.org/jakartaee/restful-ws/5.0/).
 * Maven coordinates
    * [jakarta.ws.rs:jakarta.ws.rs-api:jar:5.0.0](https://central.sonatype.com/artifact/jakarta.ws.rs/jakarta.ws.rs-api/5.0.0/jar)

# Compatible Implementations
* [RESTEasy XXXXX](https://github.com/resteasy/resteasy/releases/tag/XXXXX)
* [Eclipse Jersey XXXXX](https://github.com/eclipse-ee4j/jersey/releases/tag/XXXXX)
-->
# Ballots
<!--
## Release Review

The Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |      |
| Emily Jiang, Tom Watson                        | IBM                 |      |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |      |
| Andrew Pielage, Petr Aubrecht                  | Payara              |      |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
| Dr. Jun Qian                                   | Enterprise Members  |      |
| Zhai Luchao                                    | Enterprise Members  |      |
|                                                | **Total**           |      |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxxx.html)

## Progress Review

The Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |      |
| Emily Jiang, Tom Watson                        | IBM                 |      |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |      |
| Andrew Pielage, Petr Aubrecht                  | Payara              |      |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
| Dr. Jun Qian                                   | Enterprise Members  |      |
| Zhai Luchao                                    | Enterprise Members  |      |
|                                                | **Total**           |      |

Non-binding votes

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Dr. Jun Qian                                   | Primeton            |      |
|                                                | **Total**           |      |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxxx.html)

## Plan Review

The Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.
Note that this is a revised plan from the approved plan review of MONTH YEAR.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |      |
| Tom Watson, Emily Jiang                        | IBM                 |      |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |      |
| Andrew Pielage, Petr Aubrecht                  | Payara              |      |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
| Zhai Luchao                                    | Enterprise Members  |      |
| Scott Stark, Scott Marlo0w                     | Enterprise Members  |      |
|                                                | **Total**           |      |

Non-binding votes

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Arjan Tijms                                    | Omnifish            |      |
| Dr. Jun Qian                                   | Primeton            |      |
|                                                | **Total**           |      |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxxx.html)

## Plan Review

The Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |      |
| Dan Bandera, Kevin Sutter                      | IBM                 |      |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |      |
| Andrew Pielage, Matt Gill                      | Payara              |      |
| Scott Stark, Mark Little                       | Red Hat             |      |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
| Dr. Jun Qian                                   | Enterprise Members  |      |
|                                                | **Total**           |      |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxxx.html)
-->
