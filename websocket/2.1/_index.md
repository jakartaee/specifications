---
title: "Jakarta WebSocket 2.1 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta WebSocket defines a API for Server and Client Endpoints
for the WebSocket protocol (RFC6455).

* [Jakarta WebSocket 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.websocket/releases/2.1)
  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)

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

## Plan Review

The Plan Review Specification Committee Ballot concluded successfully on 2021-05-14 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              | no vote |
| Andrew Pielage, Matt Gill                      | Payara              |   +1    |
| Scott Stark, Mark Little                       | Red Hat             | no vote |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
|                                                | **Total**           |  **8**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01704.html)
