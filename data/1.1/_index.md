---
title: "Jakarta Data 1.1 (under development)"
date: 2025-01-28
summary: "Enhancements for Jakarta EE 12"
---

Jakarta Data simplifies data access by allowing you to represent data with simple Java objects (entities), and define interfaces (repositories) with methods that perform operations on it.

### New features, enhancements or additions

* [Ability to define query restrictions dynamically](https://github.com/jakartaee/data/issues/829)
* [Life cycle events](https://github.com/jakartaee/data/issues/373)
* [Bring parameter based automatic query methods up to the level of what Query by Method Name can do for static queries](https://github.com/jakartaee/data/issues/857)
* [Query Fragments](https://github.com/jakartaee/data/issues/546)
* [Multiple item select lists/DTOs/Entity Views](https://github.com/jakartaee/data/issues/539)
* [Consider additional annotations related to Jakarta Persistence](https://github.com/jakartaee/data/issues/470)
* [Reactive patterns](https://github.com/jakartaee/data/issues/17) and [integration with Jakarta Concurrency Asynchronous](https://github.com/jakartaee/data/issues/19)
* Move Jakarta Data Query Language to Jakarta Query specification (if accepted and included in Jakarta EE 12) where it will remain fully compatible.
* Configuration via Jakarta Config (if Jakarta Config is released and makes it into Jakarta EE 12 in time)
* [Explicitly state where NoSQL databases can raise errors for function the database type is not capable of](https://github.com/jakartaee/data/issues/782)
* TCK refactoring and enhancements to more logically split out tests that are targeted at various levels of database support (key-value, column, document, graph, relational).


### Removals, deprecations or backwards incompatible changes

* Consider deprecating an [impl package](https://github.com/jakartaee/data/tree/main/api/src/main/java/jakarta/data/metamodel/impl) that should not have been made available in the API.

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
* **Java SE 21 or higher**

# Details

* [Jakarta Data 1.1 Release Record](https://projects.eclipse.org/projects/ee4j.data/releases/1.1)
* [Jakarta Data 1.1 Specification Document](./jakarta-data-1.1.pdf) (PDF) (Does not exist yet)
* [Jakarta Data 1.1 Specification Document](./jakarta-data-spec-1.1.html) (HTML) (Does not exist yet)
* [Jakarta Data 1.1 Javadoc](./apidocs) (Does not exist yet)
* [Jakarta Data 1.1 TCK](http://downloads.eclipse.org/jakarta/data/1.1/data-tck-1.1.0.zip) (Does not exist yet)
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/data/1.1) (Does not exist yet)
* Maven coordinates
  * [jakarta.data:jakarta.data-api:jar:1.1.0](https://search.maven.org/artifact/jakarta.data/jakarta.data-api/1.1.0/jar) (Does not exist yet)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [To Be Determined](https://github.com/)

# Compatible Implementations

* [To Be Determined](https://github.com/)

# Ballots

## Release Review

The Release Review Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxx.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-03-24 with the following results.

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
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03736.html)