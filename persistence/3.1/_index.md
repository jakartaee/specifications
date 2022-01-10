---
title: "Jakarta Persistence 3.1"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta Persistence defines a standard for management of persistence
and object/relational mapping in Java(R) environments.

The goal of this release is to:

* provide features requested by the community (for example [#77](https://github.com/eclipse-ee4j/jpa-api/issues/77))
* implement requirements by other specification included in Jakarta EE 10
* editorial updates and clarifications in the specification (for example [#307](https://github.com/eclipse-ee4j/jpa-api/issues/307), [#308](https://github.com/eclipse-ee4j/jpa-api/issues/308))

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta Persistence 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.jpa/releases/3.1)
* [Jakarta Persistence 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.jpa/releases/3.1-jakarta-persistence-api)
    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Persistence 3.1 Specification Document](./jakarta-persistence-spec-3.1.pdf) (PDF)
* [Jakarta Persistence 3.1 Specification Document](./jakarta-persistence-spec-3.1.html) (HTML)
* [Jakarta Persistence 3.1 Javadoc](./apidocs)
* Jakarta Persistence 3.1 XML Schemas
    * [XML Schema for the persistence configuration file](https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd)
    * [XML Schema for the persistence object/relational mapping file](https://jakarta.ee/xml/ns/persistence/orm/orm_3_0.xsd)
* [Jakarta Persistence 3.1 TCK](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.persistence:jakarta.persistence-api:jar:3.1.0](https://search.maven.org/artifact/jakarta.persistence/jakarta.persistence-api/3.1.0/jar)


# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-04-28 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Matt Gill                      | Payara              |   +1    |
| Scott Stark, Mark Little                       | Red Hat             | no vote |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01530.html)

