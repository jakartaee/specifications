---
title: "Jakarta Standard Tag Library 3.0 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta Standard Tag Library encapsulates as simple tags the core functionality common to many Web applications.
Jakarta Standard Tag Library has support for common, structural tasks such as iteration and conditionals, tags
for manipulating XML documents, internationalization tags, and SQL tags. It also provides a framework for integrating
existing custom tags with Jakarta Standard Tag Library tags.

* [Jakarta Standard Tag Library 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jstl/releases/3.0.0)
  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Standard Tag Library 3.0 Specification Document](./jakarta-tags-spec-3.0.pdf) (PDF)
* [Jakarta Standard Tag Library 3.0 Specification Document](./jakarta-tags-spec-3.0.html) (HTML)
* [Jakarta Standard Tag Library 3.0 Javadoc](./apidocs)
* [Jakarta Standard Tag Library 3.0 Tagdoc](./tagdocs)
* [Jakarta Standard Tag Library 3.0 TCK](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip)([sig](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:jar:3.0.0](https://search.maven.org/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/3.0.0/jar)

# Plan

The plan for the release is to clean up open issues:
* General specification document cleanup.
* Clean up issues found during the Jakarta EE9 review ballot process: update if possible the tagdocs to include EFSL, Update tlddoc generation if possible to jakarta.
* Remove any deprecated methods from the API if they exist.
* Rename java.sun.com / xmlns.jcp.org taglib URIs to new jakarta.tags.\* URNs. [Issue 144](https://github.com/eclipse-ee4j/jstl-api/issues/144)
    * This alone should require a major release.
* Other small clean up issues
 
# Backwards compatibility
Backward compatibility issue include:
* Removal of deprecated methods if any exist and are removed.
* Rename java.sun.com / xmlns.jcp.org taglib URIs to new jakarta.tags.\* URNs.

# Optional features
None

# Minimum Java SE version
The JDK version required will be aligned with Jakarta EE 10.

# TCK Updates
The following TCK updates will be required:
* Updated tests for new jakarta.tags.* URNs
* New tests for any new features

# Release record
* [Jakarta Standard Tag Library 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jstl/releases/3.0.0)

# Compatible Implementations
* [EE4J implementation of Jakarta Standard Tag Library 3.0.0](https://github.com/eclipse-ee4j/jstl-api/releases/download/3.0.0-IMPL-RELEASE/jakarta.servlet.jsp.jstl-3.0.0.jar) using vehicle [Eclipse Glassfish x.0.0-x](https://github.com/eclipse-ee4j/glassfish/releases/download/)

# Ballots

## Release Review

The Release Review Specification Committee Ballot concluded successfully on 2021-xx-xx with the following results.

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

The Plan Review Specification Committee Ballot concluded successfully on 2021-xx-xx with the following results.

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
