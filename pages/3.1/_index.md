---
title: "Jakarta Server Pages 3.1 (under development)"
date: 2021-10-15
summary: "Release for Jakarta EE 10"
---
Jakarta Server Pages defines a template engine for web applications that supports mixing of textual content
(including HTML and XML) with custom tags, expression language, and embedded Java code, that gets compiled
into a Jakarta Servlet.

* [Jakarta Server Pages 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.jsp/releases/3.1.0)
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Server Pages 3.1 Specification Document](./jakarta-server-pages-spec-3.1.pdf) (PDF)
* [Jakarta Server Pages 3.1 Specification Document](./jakarta-server-pages-spec-3.1.html) (HTML)
* [Jakarta Server Pages 3.1 Javadoc](./apidocs)
* [Jakarta Server Pages 3.1 TCK](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip)([sig](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.pages:jakarta.pages-api:jar:3.1.0](https://search.maven.org/artifact/jakarta.servlet.jsp/jakarta.servlet.jsp-api/3.1.0/jar)

# Plan
Minor update to address the small number of open issues (2 clarifications and 1 enhancement) currently open against the API. Any new issues opened will also be considered.

# Backwards compatibility
None.

# Optional features
None

# Minimum Java SE version
The JDK version required will be aligned with Jakarta EE 10.

# TCK Updates
It is anticipated that some additional tests will be required to provide test coverage for the areas where the specification has been clarified and for any new features.

# Release Record
[Release Record](https://projects.eclipse.org/projects/ee4j.jsp/releases/3.1.0)

# Compatible Implementations

* Glassfish version TBD
* Apache Tomcat 10.1.x ?

# Ballots

## Release Review

The Release Review Specification Committee Ballot concluded successfully on TBD with the following results.

|                       |  Yes    | No      | Abstain  |
|-----------------------|---------|---------|----------|
|Fujitsu                |         |         |          |
|IBM                    |         |         |          |
|Oracle                 |         |         |          |
|Payara                 |         |         |          |
|Red Hat                |         |         |          |
|Tomitribe              |         |         |          |
|EE4J PMC               |         |         |          |
|Participant Members    |         |         |          |
|Committer Members      |         |         |          |

## Plan Review

The Plan Review Specification Committee Ballot concluded successfully on TBD with the following results.

|                       |  Yes    | No  | Abstain  |
|-----------------------|---------|-----|----------|
|Fujitsu                |         |     |          |
|IBM                    |         |     |          |
|Oracle                 |         |     |          |
|Payara                 |         |     |          |
|Red Hat                |         |     |          |
|Tomitribe              |         |     |          |
|EE4J PMC               |         |     |          |
|Participant Members    |         |     |          |
|Committer Members      |         |     |          |