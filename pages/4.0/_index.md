---
title: "Jakarta Pages 4.0"
date: 2024-04-09
summary: "Release for Jakarta EE 11"
---
Jakarta Pages defines a template engine for web applications that supports mixing of textual content
(including HTML and XML) with custom tags, expression language, and embedded Java code, that gets compiled
into a Jakarta Servlet.

This release removes deprecated code and provides any additional updates necessary to align with changes in the Jakarta Servlet and/or Expression Language specifications.

### New features, enhancements or additions
* Updated ErrorData to add support for the new attributes jakarta.servlet.error.query_string and jakarta.servlet.error.method.

### Removals, deprecations or backwards incompatible changes
* All code deprecated as of Jakarta Server Pages 3.1 has been removed. Specifically:
  * Remove methods that override ELResolver.getFeatureDescriptors() as that method will be removed as of EL 6.0
  * Remove the isThreadSafe page directive attribute as the related Servlet API interface SingleThreadModel has been removed as of the Servlet 6.0 specification
  * Remove the jsp:plugin action and related actions as the associated HTML elements are no longer supported by any major browser

### Minimum Java SE Version
**Java SE 17 or higher**

# Details
* [Jakarta Pages 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.jsp/releases/4.0.0)

<!--

The following can be uncommented and version information updated as they become available.

  * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Pages 3.1 Specification Document](./jakarta-server-pages-spec-3.1.pdf) (PDF)
* [Jakarta Pages 3.1 Specification Document](./jakarta-server-pages-spec-3.1.html) (HTML)
* [Jakarta Pages 3.1 Javadoc](./apidocs)
* [Jakarta Pages 3.1 TCK](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip)([sig](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.pages:jakarta.pages-api:jar:3.1.0](https://search.maven.org/artifact/jakarta.servlet.jsp/jakarta.servlet.jsp-api/3.1.0/jar)
-->

# Compatible Implementations

* Apache Tomcat 11.0.0-M19-SNAPSHOT


# Ballots

## Plan Review

## Plan Review

The Specification Committee Ballot concluded successfully on 2023-06-29 with the following results.

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
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlow                      | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Jun Qian                                       | Primeton            |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02869.html)

## Release Review

TBD
