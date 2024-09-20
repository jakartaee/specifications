---
title: "Jakarta Servlet 6.1"
date: 2024-04-05
summary: "Release for Jakarta EE 11"
---
Jakarta Servlet defines a server-side API for handling HTTP requests and responses.

The release removes references to the SecurityManager and provides various small enhancements and clarifications.

### New features, enhancements or additions
* Allow control of status code and response body when sending a redirect
* Add a query string attribute to error dispatches
* Add constants for new HTTP status codes
* Add overloaded methods that use `CharSet` rather than `String`
* Add `ByteBuffer` support to `ServletInputStream` and `ServletOutputStream`
* Various clarifications

### Removals, deprecations or backwards incompatible changes
* All references to the SecurityManager and associated APIs have been removed

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* [Jakarta Servlet 6.1 Release Record](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.1.0)
* [Jakarta Servlet 6.1 Release Plan](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.1.0/plan)
  * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta Servlet 6.1 Specification Document](./jakarta-servlet-spec-6.1.pdf) (PDF)
* [Jakarta Servlet 6.1 Specification Document](./jakarta-servlet-spec-6.1.html) (HTML)
* [Jakarta Servlet 6.1 Javadoc](./apidocs)
* [Jakarta Servlet 6.1.0 TCK](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.0.zip), ([sig](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/servlet/6.1/jakarta-servlet-tck-6.1.0.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* XML Schema
  * web-app_6_1.xsd
  * web-common_6_1.xsd
  * web-fragment_6_1.xsd
  * jsp_4_0.xsd
  * web-jsptaglibrary_4_0.xsd
* Maven coordinates
  * [jakarta.servlet:jakarta.servlet-api:jar:6.1.0](https://central.sonatype.com/artifact/jakarta.servlet/jakarta.servlet-api/6.1.0/jar)

# Compatible Implementations

* [Tomcat 11.0.0-M20](https://archive.apache.org/dist/tomcat/tomcat-11/v11.0.0-M20/)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2024-06-04 with the following results.

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
|                                                | **Total**           |  **10** |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
| Greg Wilkins                                   | Jetty               |   +1    |
|                                                | **Total**           |  **2**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03382.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2023-07-26 with the following results.

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
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlow                      | Enterprise Members  |   +1    |
|                                                | **Total**           | **9**   |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03017.html)
