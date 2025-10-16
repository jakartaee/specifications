---
title: "Jakarta Servlet 6.2 (under development)"
date: 2025-10-16
summary: "Release for Jakarta EE 12"
---
Jakarta Servlet defines a server-side API for handling HTTP requests and responses.

This release is a maintenance release that will review the open enhancement requests and implement as many as possible in the time available.

### New features, enhancements or additions
Review the open enhancement requests and implement as many as possible in the time available. A rough priority order for this being:
* Fixing bugs in the existing API
* Clarifying existing behaviour
* Adding new features

### Removals, deprecations or backwards incompatible changes
None

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* [Jakarta Servlet 6.2 Release Record](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.2.0)
* [Jakarta Servlet 6.2 Release Plan](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.2.0/plan)
  * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE12ReleasePlan)
* [Jakarta Servlet 6.2-M1 Specification Document](./jakarta-servlet-spec-6.2-M1.pdf) (PDF)
* [Jakarta Servlet 6.2-M1 Specification Document](./jakarta-servlet-spec-6.2-M1.html) (HTML)
* [Jakarta Servlet 6.2-M1 Javadoc](./apidocs)
* [Jakarta Servlet 6.2-M1 TCK](https://download.eclipse.org/ee4j/servlet/jakartaee12/staged/eftl/jakarta-servlet-tck-6.2.0-M1.zip), ([info](https://download.eclipse.org/ee4j/servlet/jakartaee12/staged/eftl/jakarta-servlet-tck-6.2.0-M1.info))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/servlet/6.2/)
<!-- XMl Schema go here -->
* Maven coordinates
  * [jakarta.servlet:jakarta.servlet-api:jar:6.2.0-M1](https://central.sonatype.com/artifact/jakarta.servlet/jakarta.servlet-api/6.2.0-M1/jar)

<!--
The following can be uncommented and version information updated as they become available.

* XML Schema
  * web-app_6_1.xsd
  * web-common_6_1.xsd
  * web-fragment_6_1.xsd
  * jsp_4_0.xsd
  * web-jsptaglibrary_4_0.xsd

-->

# Compatible Implementations

* Apache Tomcat 12 (TBC)

# Ballots

<!--
## Release Review
-->

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-11 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              | no vote |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
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

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03812.html)
