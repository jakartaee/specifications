---
title: "Jakarta Portlet Bridge 7.0 (under development)"
date: 2025-04-23
summary: "First release of Jakarta Portlet Bridge"
---

Jakarta Portlet Bridge defines the behavior and APIs necessary for Jakarta Faces applications to operate within a portlet environment. It provides a bridge that aligns the Jakarta Faces lifecycle with the Jakarta Portlet lifecycle. This enables developers to use features such as declarative Facelet views, navigation-rules, and component suites while maintaining compatibility with the multi-phase request and response model defined by portlet containers.

### New features, enhancements or additions

Jakarta Portlet Bridge 7.0 is focused on migrating the JSR 378 Specification and API from Java EE to Jakarta EE. This includes updating package namespaces from `javax.portlet.faces` to `jakarta.portlet.faces` and aligning Java EE dependencies such as `javax.servlet` and `javax.faces` with their Jakarta EE 10 equivalents.

Future iterations of the project may introduce new features and enhancements, but the initial scope is strictly limited to completing the namespace and dependency migration to ensure compatibility with Jakarta EE 10 and to ease the migration path for developers and organizations.

### Removals, deprecations or backwards incompatible changes

As a major release, from the perspective of semantic versioning, Jakarta Portlet Bridge 7.0 introduces breaking changes that affect both Faces applications deployed as portlets. The renaming of packages from `javax.portlet.faces` to `jakarta.portlet.faces` will require source code changes and recompilation. These changes are not binary compatible with earlier versions and reflect the transition from Java EE to Jakarta EE.

### Minimum Java SE Version

**Java SE 11 or higher**

# Details

* [Jakarta Portlet Bridge 7.0 Release Record](https://projects.eclipse.org/projects/ee4j.faces-bridge/releases/7.0) (to be created when the project is provisioned)

# Compatible Implementations
* Apache Pluto

# Ballots

## Creation/Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-14 with the following results.

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
| Michael Redlish                                | Community           |   +1    |
|                                                | **Total**           |  **2**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg04040.html)
