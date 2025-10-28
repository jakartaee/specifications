---
title: "Jakarta Concurrency 3.2 (under development)"
date: 2025-10-28
summary: "Release for Jakarta EE 12"
---

Jakarta Concurrency provides a specification for using concurrency from application components without compromising container integrity while still preserving the Jakarta EE platform's fundamental benefits.

### New features, enhancements or additions

* Continue to become more CDI-centric
* [Lock annotation](https://github.com/jakartaee/concurrency/issues/135)
* [MaxConcurrency annotation](https://github.com/jakartaee/concurrency/issues/136)
* [Schedule annotation to be used directly on methods for schedule at startup](https://github.com/jakartaee/concurrency/issues/624)
* [Add annotation literals](https://github.com/jakartaee/concurrency/issues/176)
* Specification bug fixes and clarifications, including
  * [Removal of Java 17 references from spec and Javadoc](https://github.com/jakartaee/concurrency/issues/675)
  * [Discrepancy around ManagedThreadFactory/ManagedThread](https://github.com/jakartaee/concurrency/issues/32)
  * [Correction to Maven artifact name](https://github.com/jakartaee/concurrency/pull/555)
* TCK fixes and enhancements, including
  * [Switch to JUnit5](https://github.com/jakartaee/concurrency/pull/666)

Community input is encouraged. Add your comments to issues in our [issue tracker](https://github.com/jakartaee/concurrency/issues) or join the Concurrency Developer mailing list by following the instructions to subscribe on [this page](https://accounts.eclipse.org/mailing-list/cu-dev).

###  Removals, deprecations, or backwards incompatible changes

* N/A

### Minimum Java SE Version
* **Java SE 21 or higher**

# Details

* [Jakarta Concurrency 3.2 Release Record](https://projects.eclipse.org/projects/ee4j.cu/releases/3.2)
* [Jakarta Concurrency 3.2 M1 Specification Document](./jakarta-concurrency-spec-3.2.pdf) (PDF)
* [Jakarta Concurrency 3.2 M1 Specification Document](./jakarta-concurrency-spec-3.2.html) (HTML)
* [Jakarta Concurrency 3.2 M1 Javadoc](./apidocs)
* [Jakarta Concurrency 3.2 TCK](https://download.eclipse.org/jakartaee/concurrency/) (Does not exist yet)
* Maven coordinates
  * [jakarta.enterprise.concurrent:jakarta.enterprise.concurrent-api:3.2.0-M1](https://central.sonatype.com/artifact/jakarta.enterprise.concurrent/jakarta.enterprise.concurrent-api/3.2.0-M1/jar)
* Compatible Implementation used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [To Be Determined](https://github.com/jakartaee/concurrency/issues?q=sort%3Aupdated-desc%20is%3Aissue%20state%3Aclosed%20label%3Acertification%20milestone%3A3.2.0)

# Compatible Implementations

* [To Be Determined](https://github.com/jakartaee/concurrency/issues?q=sort%3Aupdated-desc%20is%3Aissue%20state%3Aclosed%20label%3Acertification%20milestone%3A3.2.0)

# Ballots

<!--
## Release Review

The Release Review Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxx.html)
-->
## Plan Review

The Plan Review Specification Committee Ballot concluded successfully on 2025-04-16 with the following results.

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
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03821.html)
