---
title: "Jakarta Connectors 2.2 (under development)"
date: 2025-04-15
summary: "Release for Jakarta EE 12"
---

The Jakarta Connectors specification defines a standard architecture for Jakarta EE application components to connect to Enterprise Information Systems.

### New features, enhancements or additions

* Support aborting a connection passing an executor for resource apdater function to destroy a connection.
* Connector Permissions feature
* Wrong OSGi relation between JCA 1.7 and JTA 1.3 (JavaEE8, JakartaEE8)
* Some observed issues in 2.0 Specification Text
* Use fully qualified name jakarta.resource.cci.Record in specification to avoid collisions with java.lang.Record
* Consider refactoring updates to TCK


Community input is encouraged. Add your comments to issues in our [issue tracker](https://github.com/jakartaee/connectors/issues) or join the Connectors Developer mailing list by following the instructions to subscribe on [this page](https://accounts.eclipse.org/mailing-list/jca-dev).

###  Removals, deprecations or backwards incompatible changes

* N/A

### Minimum Java SE Version
* **Java SE 17 or higher**

# Details

* [Jakarta Connectors 2.2 Release Record](https://projects.eclipse.org/projects/ee4j.jca/releases/2.2.0)
<!--
* [Jakarta Connectors 2.2 Specification Document](./jakarta-connectors-spec-2.2.pdf) (PDF) (Does not exist yet)
* [Jakarta Connectors 2.2 Specification Document](./jakarta-connectors-spec-2.2.html) (HTML) (Does not exist yet)
* [Jakarta Connectors 2.2 Javadoc](./apidocs) (Does not exist yet)
* [Jakarta Connectors 2.2 TCK](https://download.eclipse.org/jakartaee/connectors/2.2/connectors-tck-2.2.0.zip) (Does not exist yet)
-->
<!--
* Maven coordinates
-->
<!--
  * [jakarta.connectors:jakarta.connectors-api:2.2.0](https://central.sonatype.com/artifact/jakarta.connectors/jakarta.connectors-api/2.2.0/jar) (Does not exist yet)
-->
<!--
* Compatible Implementation used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
-->
<!--
  * [To Be Determined](https://github.com/)
-->

# Compatible Implementations

<!--
* [To Be Determined](https://github.com/)
-->

# Ballots

<!--
## Release Review

The Release Review Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxx.html)

## Plan Review

The Plan Review Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |         |
| Emily Jiang, Tom Watson                        | IBM                 |         |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |         |
| Andrew Pielage, Petr Aubrecht                  | Payara              |         |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |         |
| Ivar Grimstad                                  | EE4J PMC            |         |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |         |
| Werner Keil                                    | Committer Members   |         |
| Jun Qian                                       | Enterprise Members  |         |
| Zhai Luchao                                    | Enterprise Members  |         |
|                                                | **Total**           |         |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |         |
|                                                | **Total**           |         |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxx.html)
-->

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-24 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members | no vote |
| Werner Keil                                    | Committer Members   | no vote |
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **8**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
| Michael Redlish                                | Community           |   +1    |
|                                                | **Total**           |  **2**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03860.html)

