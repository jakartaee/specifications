---
title: "Jakarta WebSocket 2.2"
date: 2024-05-31
summary: "Release for Jakarta EE 11"
---
Jakarta WebSocket defines a API for Server and Client Endpoints for the WebSocket protocol (RFC6455).

This release removes references to the SecurityManager and provides some minor updates and clarifications.


### New features, enhancements or additions
* Clarify the responsibilities for sending ping and pong messages.

* Add the `getSession()` method to `SendResult`.

* Clarify the behaviour if `@OnMessage.maxMessageSize` it is set to a value larger than `Integer.MAX_VALUE`.

### Removals, deprecations or backwards incompatible changes
* None

### Minimum Java SE Version
**Java SE 8 or higher**

# Details
* [Jakarta WebSocket 2.2 Release Plan](https://projects.eclipse.org/projects/ee4j.websocket/releases/2.2.0/plan)
* [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta WebSocket 2.2 Specification Document](./jakarta-websocket-spec-2.2.pdf) (PDF)
* [Jakarta WebSocket 2.2 Specification Document](./jakarta-websocket-spec-2.2.html) (HTML)
<!--
The following can be uncommented and version information updated as they become available.

* [Jakarta WebSocket 2.1 Javadoc]
    * [Client](./apidocs/client)
    * [Server](./apidocs/server)
* [Jakarta WebSocket 2.1 TCK](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.websocket:jakarta.websocket-api:jar:2.1.0](https://search.maven.org/artifact/jakarta.websocket/jakarta.websocket-api/2.1.0/jar)
    * [jakarta.websocket:jakarta.websocket-client-api:jar:2.1.0](https://search.maven.org/artifact/jakarta.websocket/jakarta.websocket-client-api/2.1.0/jar)
-->

# Compatible Implementations

* Apache Tomcat 11.0.0-M19-SNAPSHOT

# Ballots

## Plan Review

The Specification Committee Ballot completed on 11th July 2023.
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
| Scott Stark                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |


The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02948.html)

## Release Review
TBD
