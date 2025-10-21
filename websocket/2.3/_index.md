---
title: "Jakarta WebSocket 2.3 (under development)"
date: 2025-10-16
summary: "Release for Jakarta EE 12"
---
Jakarta WebSocket defines a API for Server and Client Endpoints for the WebSocket protocol (RFC6455).

This release will review the open enhancement requests and implement as many as possible in the time available.


### New features, enhancements or additions
Transfer TCK from Platform TCK project to WebSocket project.

Review the open enhancement requests and implement as many as possible in the time available. A rough priority order for this being:
* Fixing bugs in the existing API
* Clarifying existing behaviour
* Adding new features

### Removals, deprecations or backwards incompatible changes
None.

### Minimum Java SE Version
**Java SE 8 or higher**

# Details
* [Jakarta WebSocket 2.3 Release Plan](https://projects.eclipse.org/projects/ee4j.websocket/releases/2.3.0/plan)
* [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE12ReleasePlan)
* [Jakarta WebSocket 2.3-M1 Specification Document](./jakarta-websocket-spec-2.3-M1.pdf) (PDF)
* [Jakarta WebSocket 2.3-M1 Specification Document](./jakarta-websocket-spec-2.3-M1.html) (HTML)
* Jakarta WebSocket 2.3-M1 Javadoc
    * [Client](./apidocs/client)
    * [Server](./apidocs/server)
* [Jakarta WebSocket 2.3-M1 TCK](https://download.eclipse.org/jakartaee/websocket/2.2/jakarta-websocket-tck-2.2.0.zip) ([info]())
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/websocket/2.3/)
* Maven coordinates
    * [jakarta.websocket:jakarta.websocket-api:jar:2.3.0-M1](https://central.sonatype.com/artifact/jakarta.websocket/jakarta.websocket-api/2.3.0-M1/jar)
    * [jakarta.websocket:jakarta.websocket-client-api:jar:2.3.0-M1](https://central.sonatype.com/artifact/jakarta.websocket/jakarta.websocket-client-api/2.3.0-M1/jar)


# Compatible Implementations

* Apache Tomcat 12 (TBC)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-02 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Emilly Jiang, Tom Watson                       | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Petr Aubrecht                  | Payara              |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Jun Qian                                       | Enterprise Members  |  +1  |
| Zhai Luchao                                    | Enterprise Members  |  +1  |
|                                                | **Total**           |**10**|

| Non-binding votes                              |                     | Vote |
|------------------------------------------------|---------------------|------|
| Angelo Rubini                                  | Community           |  +1  |
|                                                | **Total**           | **1**|

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03719.html)


## Release Review

TBD
