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
* All references to the SecurityManager have been removed.

### Minimum Java SE Version
**Java SE 8 or higher**

# Details
* [Jakarta WebSocket 2.2 Release Plan](https://projects.eclipse.org/projects/ee4j.websocket/releases/2.2.0/plan)
* [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta WebSocket 2.2 Specification Document](./jakarta-websocket-spec-2.2.pdf) (PDF)
* [Jakarta WebSocket 2.2 Specification Document](./jakarta-websocket-spec-2.2.html) (HTML)
* Jakarta WebSocket 2.2 Javadoc
    * [Client](./apidocs/client)
    * [Server](./apidocs/server)
* [Jakarta WebSocket 2.2 TCK](https://www.eclipse.org/downloads/download.php?file=/ee4j/jakartaee-tck/jakartaee11/staged/eftl/jakarta-websocket-tck-2.2.0.zip) ([sig](tbd), [sha](https://www.eclipse.org/downloads/download.php?file=/ee4j/jakartaee-tck/jakartaee11/staged/eftl/jakarta-websocket-tck-2.2.0.zip#btn-ajax-checksum-sha512), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.websocket:jakarta.websocket-api:jar:2.2.0](https://search.maven.org/artifact/jakarta.websocket/jakarta.websocket-api/2.2.0/jar)
    * [jakarta.websocket:jakarta.websocket-client-api:jar:2.2.0](https://search.maven.org/artifact/jakarta.websocket/jakarta.websocket-client-api/2.2.0/jar)

# Compatible Implementations

* Apache Tomcat 11.0.0-M20 ([Maven](https://repo1.maven.org/maven2/org/apache/tomcat/tomcat/11.0.0-M20/tomcat-11.0.0-M20.tar.gz), [ASF Archive](https://archive.apache.org/dist/tomcat/tomcat-11/v11.0.0-M20/)
* Eclipse Tyrus 2.2.0-M1
    * [tyrus-client](https://jakarta.oss.sonatype.org/content/repositories/staging/org/glassfish/tyrus/tyrus-client/2.2.0-M1/tyrus-client-2.2.0-M1.jar)
    * [tyrus-container-glassfish-cdi](https://jakarta.oss.sonatype.org/content/repositories/staging/org/glassfish/tyrus/tyrus-container-glassfish-cdi/2.2.0-M1/tyrus-container-glassfish-cdi-2.2.0-M1.jar)
    * [tyrus-container-glassfish-ejb](https://jakarta.oss.sonatype.org/content/repositories/staging/org/glassfish/tyrus/tyrus-container-glassfish-ejb/2.1.0-M3/tyrus-container-glassfish-ejb-2.2.0-M1.jar)
    * [tyrus-container-grizzly-client](https://jakarta.oss.sonatype.org/content/repositories/staging/org/glassfish/tyrus/tyrus-container-grizzly-client/2.2.0-M1/tyrus-container-grizzly-client-2.2.0-M1.jar)
    * [tyrus-container-servlet](https://jakarta.oss.sonatype.org/content/repositories/staging/org/glassfish/tyrus/tyrus-container-servlet/2.2.0-M1/tyrus-container-servlet-2.2.0-M1.jar)
    * [tyrus-core](https://jakarta.oss.sonatype.org/content/repositories/staging/org/glassfish/tyrus/tyrus-core/2.2.0-M1/tyrus-core-2.2.0-M1.jar)
    * [tyrus-server](https://jakarta.oss.sonatype.org/content/repositories/staging/org/glassfish/tyrus/tyrus-server/2.2.0-M1/tyrus-server-2.2.0-M1.jar)
    * [tyrus-spi](https://jakarta.oss.sonatype.org/content/repositories/staging/org/glassfish/tyrus/tyrus-spi/2.2.0-M1/tyrus-spi-2.2.0-M1.jar)

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
