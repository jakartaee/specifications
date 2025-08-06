---
title: "Jakarta Servlet 6.2 (under development)"
date: 2025-04-11
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

<!--
The following can be uncommented and version information updated as they become available.

* [Jakarta Servlet 6.1 Release Plan](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.1.0/plan)
  * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta Servlet 6.1 Specification Document](./jakarta-servlet-spec-6.1.pdf) (PDF)
* [Jakarta Servlet 6.1 Specification Document](./jakarta-servlet-spec-6.1.html) (HTML)
* [Jakarta Servlet 6.1 Javadoc](./apidocs)
* [Jakarta Servlet 6.1.0 TCK](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.0.zip), ([sig](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.0.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * Excludes response flushBufferTest (Issue [#525](https://github.com/jakartaee/servlet/issues/525)) [Jakarta Servlet 6.1.1 TCK](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.1.zip), ([sig](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.1.zip.sig), [sha](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.1.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* XML Schema
  * web-app_6_1.xsd
  * web-common_6_1.xsd
  * web-fragment_6_1.xsd
  * jsp_4_0.xsd
  * web-jsptaglibrary_4_0.xsd
* Maven coordinates
  * [jakarta.servlet:jakarta.servlet-api:jar:6.1.0](https://central.sonatype.com/artifact/jakarta.servlet/jakarta.servlet-api/6.1.0/jar)

-->

# Compatible Implementations

* Apache Tomcat 12 (TBD)

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
