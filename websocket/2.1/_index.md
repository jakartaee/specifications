---
title: "Jakarta WebSocket 2.1 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta WebSocket defines a API for Server and Client Endpoints
for the WebSocket protocol (RFC6455).

* [Jakarta WebSocket 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.websocket/releases/2.1)
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta WebSocket 2.1 Specification Document](./websocket-spec-2.1.pdf) (PDF)
* [Jakarta WebSocket 2.1 Specification Document](./websocket-spec-2.1.html) (HTML)
* [Jakarta WebSocket 2.1 Javadoc](./apidocs)
* [Jakarta WebSocket 2.1 TCK](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip)([sig](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.websocket:jakarta.websocket-api:2.1.0](https://search.maven.org/artifact/jakarta.websocket/jakarta.websocket-api/2.1.0/jar)

# Plan

The plan for the release is to tackle the open issues with a view to implementing as many as possible in the time available. A rough priority order for this being:

* Fixing bugs in the existing API
* Clarifying existing behaviour
* Adding new features

# Backwards compatibility
None known at this time.

# Optional features
None.

# Minimum Java SE version
The JDK version required will be aligned with Jakarta EE 10.

# TCK Updates
The following TCK updates will be required:
* Updated signatures
* New tests for any new features

# Release Record
[Release Record](https://projects.eclipse.org/projects/ee4j.websocket/releases/2.1.0)

# Compatible Implementations

* Eclipse Tyrus. Version TBD
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