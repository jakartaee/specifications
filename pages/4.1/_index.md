---
title: "Jakarta Pages 4.1 (under development)"
date: 2025-10-16
summary: "Release for Jakarta EE 12"
---
Jakarta Pages defines a template engine for web applications that supports mixing of textual content
(including HTML and XML) with custom tags, expression language, and embedded Java code, that gets compiled
into a Jakarta Servlet.

This release does not plan to add new features.
It aims to address known issues in the Jakarta Pages specification and to maintain alignment with the Jakarta Servlet and Expression Language specifications.

### New features, enhancements or additions
* Add, in cooperation with the Jakarta Expression Language 6.1 specification, a performance optimisation for scoped attributes.
* Changes (currently none known) required to align with changes in the Jakarta Servlet 6.2 and/or Expression Language 6.1 specifications.

### Removals, deprecations or backwards incompatible changes
* None

### Minimum Java SE Version
**Java SE 17 or higher** - This will follow changes - if any - in Jakarta Servlet 6.2

# Details
* [Jakarta Pages 4.1 Release Record](https://projects.eclipse.org/projects/ee4j.jsp/releases/4.1.0)
* [Jakarta Pages 4.1 Release Plan](https://projects.eclipse.org/projects/ee4j.jsp/releases/4.1.0/plan)
  * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE12ReleasePlan)
* [Jakarta Pages 4.1-M1 Specification Document](./jakarta-server-pages-spec-4.1-M1.pdf) (PDF)
* [Jakarta Pages 4.1-M1 Specification Document](./jakarta-server-pages-spec-4.1-M1.html) (HTML)
* [Jakarta Pages 4.1-M1 Javadoc](./apidocs)
* [Jakarta Pages 4.1-M1 TCK](https://download.eclipse.org/ee4j/pages/jakartaee12/staged/eftl/jakarta-pages-tck-4.1.0-M1.zip), ([info](https://download.eclipse.org/ee4j/pages/jakartaee12/staged/eftl/jakarta-pages-tck-4.1.0-M1.info)
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/pages/4.1/)
* Maven coordinates
  * [jakarta.pages:jakarta.pages-api:jar:4.1.0-M1](https://central.sonatype.com/artifact/jakarta.servlet.jsp/jakarta.servlet.jsp-api/4.1.0-M1/jar)

# Compatible Implementations

* Apache Tomcat 12 (TBC)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-01 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members | no vote |
| Werner Keil                                    | Committer Members   |   +1    |
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03725.html)

