---
title: "Jakarta WebSocket 2.1"
date: 2022-05-31
summary: "Release for Jakarta EE 10"
---
Jakarta WebSocket defines a API for Server and Client Endpoints
for the WebSocket protocol (RFC6455).

### New features, enhancements or additions
<!-- List here -->
* Issue 190 and Issue 192 Clarify that once the container has identified a MessageHandler for a
message, the MessageHandler is used for the entirety of the message irrespective of any subsequent
changes to the MessageHandlers configured for the Session.
* Issue 207 Add a getter for the default platform configurator.
* Issue 210 Provide an API for client-side TLS configuration.
* Issue 211 Remove the restriction that, in a Jakarta web container environment, endpoints can only
registered during the deployment of the web application. Also add a new method,
ServerContainer.upgradeHttpToWebSocket() that allows a web application to programmatically
dispatch a request to a WebSocket endpoint.
* Issue 228 Clarify the expected behaviour for Session.getRequestURI(). The full URI should be
returned.
* Issue 235 Clarify the expected handling of user properties.
* Issue 382 Clarify that a zero or negative value disables the session idle timeout and improve the
language used in the Javadoc for the other timeouts.
* Removed the copy of the jakarta.websocket.* classes from the jakarta.websocket-api jar and
replaced the copy with a dependency on the jakarta.websocket-client-api jar.
* Added JPMS module descriptors that define the client module name as jakarta.websocket.client
and the server module name as jakarta.websocket with the server module depending on the client
module.

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None 

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta WebSocket 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.websocket/releases/2.1)
    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta WebSocket 2.1 Specification Document](./jakarta-websocket-spec-2.1.pdf) (PDF)
* [Jakarta WebSocket 2.1 Specification Document](./jakarta-websocket-spec-2.1.html) (HTML)
* [Jakarta WebSocket 2.1 Javadoc]
    * [Client](./apidocs/client)
    * [Server](./apidocs/server)
* [Jakarta WebSocket 2.1 TCK](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/websocket/2.1/jakarta-websocket-tck-2.1.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.websocket:jakarta.websocket-api:jar:2.1.0](https://search.maven.org/artifact/jakarta.websocket/jakarta.websocket-api/2.1.0/jar)
    * [jakarta.websocket:jakarta.websocket-client-api:jar:2.1.0](https://search.maven.org/artifact/jakarta.websocket/jakarta.websocket-client-api/2.1.0/jar)

# Compatible Implementations

* Eclipse Tyrus 2.1.0-M3

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-05-04 with the following results.

| Representative                                 | Representative for: | Vote   |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |    +1  |
| Tom Watson, Emily Jiang                        | IBM                 |    +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1  |
| Andrew Pielage, Petr Aubrecht                  | Payara              |    +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1  |
| Ivar Grimstad                                  | EE4J PMC            |    +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1  |
| Werner Keil                                    | Committer Members   |    +1  |
| Jun Qian                                       | Enterprise Members  |    +1  |
| Zhai Luchao                                    | Enterprise Members  |    +1  |
|                                                | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02410.html)


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
