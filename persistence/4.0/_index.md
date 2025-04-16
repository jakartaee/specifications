---
title: "Jakarta Persistence 4.0 (Under development)"
date: 2025-04-14
summary: "Release for Jakarta EE 12"
---
Jakarta Persistence defines a standard for management of persistence
and object/relational mapping in Java(R) environments.

### New features, enhancements or additions

- Add new API for working with detached entities, along with associated lifecycle callbacks
- Add programmatic API for expressing native query result set mappings
- New annotations for expressing named entity graphs
- Allow entities to be loaded in read-only mode
- Allow batch loading of entities by id
- Add operation to obtain the number of query results
- Add an annotation to exclude a field from optimistic locking
- Allow `@NamedQuery` and `@NamedNativeQuery` more control over query execution
- Allow passing an `EntityGraph` to `refresh()`, and improve usability of entity graphs
- Make `select new` implicit when a query result type is given
- Add a `@PreMerge` lifecycle callback
- Add support for `SequencedCollection` and friends
- Decouple entity discovery/enhancement from `EntityManagerFactory` initialization in container environments
- Specify that the `jakarta.persistence.database-xxxx` configuration properties are available for use by the application program, and not only by containers

### Removals, deprecations or backwards incompatible changes

- Drop APIs already marked `forRemoval` in 3.2
- Change return type of `createNativeQuery()` to `TypedQuery`
- Drop use of `SecurityManager`
- Clarify the format of entity names

### Architectural changes

- Donate definition of Jakarta Persistence Query Language to Jakarta Query
- Take ownership of standalone TCK

### Minimum Java SE Version

**Java SE 21 or higher**

# Details

* [Jakarta Persistence 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.jpa/releases/4.0)
    * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE11ReleasePlan)
<!--
* [Jakarta Persistence 4.0 Specification Document](./jakarta-persistence-spec-4.0.pdf) (PDF)
* [Jakarta Persistence 4.0 Specification Document](./jakarta-persistence-spec-4.0.html) (HTML)
* [Jakarta Persistence 4.0 Javadoc](./apidocs)
* Jakarta Persistence 4.0 XML Schemas
    * [XML Schema for the persistence configuration file](https://jakarta.ee/xml/ns/persistence/persistence_4.0.xsd)
    * [XML Schema for the persistence object/relational mapping file](https://jakarta.ee/xml/ns/persistence/orm/orm_4.0.xsd)
* [Jakarta Persistence 4.0 TCK](https://download.eclipse.org/jakartaee/persistence/4.0/jakarta-persistence-tck-4.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/persistence/4.0/jakarta-persistence-tck-4.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/persistence/4.0/jakarta-persistence-tck-4.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.persistence:jakarta.persistence-api:jar:4.0.0](https://central.sonatype.com/artifact/jakarta.persistence/jakarta.persistence-api/4.0.0/jar)
-->
