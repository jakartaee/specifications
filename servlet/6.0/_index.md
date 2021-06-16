---
title: "Jakarta Servlet 6.0 (under development)"
date: 2021-06-16
summary: "Release for Jakarta EE 10"
---
Jakarta Servlet defines a server-side API for handling HTTP requests and responses.

* [Jakarta Servlet 6.0 Release Record](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.0)
  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* Jakarta Servlet 6.0 Specification Document
* Jakarta Servlet 6.0 Javadoc
* Jakarta Servlet 6.0 TCK
* Maven coordinates
  * [jakarta.servlet:jakarta.servlet-api:jar:6.0.0](https://search.maven.org/artifact/jakarta.servlet/jakarta.servlet-api/6.0.0/jar)

# Plan

The plan for 6.0.0 is:
* remove currently deprecated features
* consider removing / deprecating additional features
* add clarity to existing features
* implement requested enhancements

Prioritisation to be determined by the community as work progresses.

# Backwards compatibility
Backward compatibility issue include:
* Removal of deprecated code
* Removal of other features not currently deprecated

# Optional features
None

# Minimum Java SE version
The JDK version required will be aligned with Jakarta EE 10.

# TCK Updates
The following TCK updates will be required:
* Updated signatures
* New tests for any new features
* Remove tests associated with removed features

# Release Record
[Release Record](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.0.0)

# Compatible Implementations

* Glassfish (version TBD)
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