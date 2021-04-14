---
title: "Jakarta Expression Language 5.0 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta Expression Language defines an expression language for Java applications.

* [Jakarta Expression Language 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.el/releases/5.0.0)
    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Expression Language 5.0 Specification Document](./jakarta-expression-language-spec-4.0.pdf) (PDF)
* [Jakarta Expression Language 5.0 Specification Document](./jakarta-expression-language-spec-4.0.html) (HTML)
* [Jakarta Expression Language 5.0 Javadoc](./apidocs)
* [Jakarta Expression Language 5.0 TCK](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip)([sig](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
     * [jakarta.el:jakarta.el-api:jar:5.0.0](https://repo1.maven.org/maven2/jakarta/el/jakarta.el-api/5.0.0/)

# Plan

The plan for the release is to tackle the open issues for the API component including:
* Potential extensions to the API to support Jakarta Faces
* Support for default methods
* Potentially removing the dependency on the java.desktop JPMS module
* Remove deprecated methods from API

# Backwards compatibility
Backward compatibility issue include:
* Removal of deprecated methods
* Removing the java.desktop dependency may create compatibility issues. The extent of those issues will be a factor in deciding whether to proceed with this or not.

# Optional features
None

# Minimum Java SE version
The JDK version required will be aligned with Jakarta EE 10.

# TCK Updates
The following TCK updates will be required:
* Updated signatures
* New tests for any new features
* Changes to support the removal of the java.desktop dependency (if implemented)

# Release Record
[Release Record](https://projects.eclipse.org/projects/ee4j.el/releases/5.0.0)

# Compatible Implementations

* [Glassfish](https://repo1.maven.org/maven2/org/glassfish/jakarta.el/5.0.0/)
* [Apache Tomcat 10.1.0](https://tomcat.apache.org/download-101.cgi)

# Ballots

## Release Review

The Release Review Specification Committee Ballot concluded successfully on 2019-12-01 with the following results.

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

The Plan Review Specification Committee Ballot concluded successfully on 2019-09-31 with the following results.

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