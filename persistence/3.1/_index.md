---
title: "Jakarta Persistence 3.1"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta Persistence defines a standard for management of persistence
and object/relational mapping in Java(R) environments.

### New features, enhancements or additions
<!-- List here -->
* EntityManagerFactory and EntityManager interfaces extend java.lang.AutoCloseable interface
* Fixes ClassTransformer.transform to throw Persistence API specific exception
* Adds support for java.util.UUID and GenerationType.UUID
* Adds CEILING, EXP, FLOOR, LN, POWER, ROUND, and SIGN
numeric functions to Jakarta Persistence QL and ceiling(), exp(),
floor(), ln(), power(), round(), and sign() to Criteria API
* Adds LOCAL DATE, LOCAL DATETIME, and LOCAL TIME functions to Jakarta Persistence QL and
corresponding localDate(), localDateTime(), and localTime() to Criteria API
* Adds EXTRACT function to Jakarta Persistence QL
* Adds support for Expressions as conditions in Criteria CASE expressions
* Adds missing definition of single_valued_embeddable_object_field in Jakarta Persistence QL BNF
* Clarifies mixing types of query input parameters
* Clarifies definition of the Basic type
* Clarifies the order of parameters in the LOCATE function
* Clarifies SqlResultSetMapping with multiple EntityResults and conflicting aliases

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Persistence 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.jpa/releases/3.1)
    * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Persistence 3.1 Specification Document](./jakarta-persistence-spec-3.1.pdf) (PDF)
* [Jakarta Persistence 3.1 Specification Document](./jakarta-persistence-spec-3.1.html) (HTML)
* [Jakarta Persistence 3.1 Javadoc](./apidocs)
* Jakarta Persistence 3.1 XML Schemas
    * [XML Schema for the persistence configuration file](https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd)
    * [XML Schema for the persistence object/relational mapping file](https://jakarta.ee/xml/ns/persistence/orm/orm_3_1.xsd)
* [Jakarta Persistence 3.1 TCK](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Addresses Persistence Challenge (Issue [#388](https://github.com/jakartaee/persistence/issues/388))  [Jakarta Persistence 3.1.1 TCK](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.1.zip)  ([sig](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Addresses Persistence Challenge (Issue [#391](https://github.com/jakartaee/persistence/issues/391))  [Jakarta Persistence 3.1.2 TCK](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.2.zip)  ([sig](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.2.zip.sig),  [sha](https://download.eclipse.org/jakartaee/persistence/3.1/jakarta-persistence-tck-3.1.2.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.persistence:jakarta.persistence-api:jar:3.1.0](https://search.maven.org/artifact/jakarta.persistence/jakarta.persistence-api/3.1.0/jar)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification)
    * [EclipseLink 4.0.0-M3](https://jakarta.oss.sonatype.org/content/repositories/staging/org/eclipse/persistence/eclipselink/4.0.0-M3/eclipselink-4.0.0-M3.zip)

# Compatible Implementations

* [EclipseLink 4.0.0-M3](https://jakarta.oss.sonatype.org/content/repositories/staging/org/eclipse/persistence/eclipselink/4.0.0-M3/eclipselink-4.0.0-M3.zip)
* [Hibernate ORM 6.0.0.Final](https://hibernate.org/orm/releases/6.0/)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-04-06 with the following results.

| Representative                                 | Representative for: | Vote   |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |    +1  |
| Tom Watson, Emily Jiang                        | IBM                 |    +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1  |
| Andrew Pielage, Matt Gill                      | Payara              |    +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1  |
| Ivar Grimstad                                  | EE4J PMC            |    +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1  |
| Werner Keil                                    | Committer Members   |    +1  |
| Jun Qian                                       | Enterprise Members  |    +1  |
| Zhai Luchao                                    | Enterprise Members  |    +1  |
|                                                | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02317.html)

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

