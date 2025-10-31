---
title: "Jakarta Messaging 3.1"
date: 2022-05-11
summary: "Jakarta EE 10 Release"
---

Jakarta Messaging describes a means for Java applications to create, send, and receive messages via loosely coupled, reliable asynchronous communication services.

### New features, enhancements or additions
<!-- List here -->
* Bump maven-bundle-plugin version from 4.2.1 to 5.1.4
* Remove useless parentheses
* Repeatable annotation for the connection factory
* Repeatable annotation for the destination definition

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Messaging 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.messaging/releases/3.1.0)
* [Jakarta Messaging 3.1 Specification Document](./jakarta-messaging-spec-3.1.pdf) (PDF)
* [Jakarta Messaging 3.1 Specification Document](./jakarta-messaging-spec-3.1.html) (HTML)
* [Jakarta Messaging 3.1 Javadoc](./apidocs)
* [Jakarta Messaging 3.1 TCK](https://download.eclipse.org/jakartaee/messaging/3.1/jakarta-messaging-tck-3.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/messaging/3.1/jakarta-messaging-tck-3.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/messaging/3.1/jakarta-messaging-tck-3.1.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/messaging/3.1/)
* Maven coordinates
  * [jakarta.jms:jakarta.jms-api:jar:3.1.0](https://central.sonatype.com/artifact/jakarta.jms/jakarta.jms-api/3.1.0/jar)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [Eclipse OpenMQ 6.3.0](https://repo1.maven.org/maven2/org/glassfish/mq/mq-distribution/6.3.0/mq-distribution-6.3.0.zip)

# Compatible Implementations
* [Eclipse OpenMQ 6.3.0](https://repo1.maven.org/maven2/org/glassfish/mq/mq-distribution/6.3.0/mq-distribution-6.3.0.zip)
* [Eclipse OpenMQ 6.4.0](https://repo1.maven.org/maven2/org/glassfish/mq/mq-distribution/6.4.0/mq-distribution-6.4.0.zip)


# Compatible Implementations


# Ballots

## Release Review

The Release Review Specification Committee Ballot concluded successfully on 11/05/2022 (May 11th 2022) with the following results.

| Representative                     | Representative for: | Vote   |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |    +1  |
| Tom Watson, Emily Jiang            | IBM                 |    +1  |
| Ed Bratt, Dmitry Kornilov          | Oracle              |    +1  |
| Andrew Pielage, Petr Aubrecht      | Payara              |    +1  |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |    +1  |
| Ivar Grimstad                      | EE4J PMC            |    +1  |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |    +1  |
| Werner Keil                        | Committer Members   |    +1  |
| Jun Qian                           | Enterprise Members  |    +1  |
| Zhai Luchao                        | Enterprise Members  |    +1  |
|                                    | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02418.html)


## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-19 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Matt Gill                      | Payara              |   +1    |
| Scott Stark, Mark Little                       | Red Hat             |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01793.html)
