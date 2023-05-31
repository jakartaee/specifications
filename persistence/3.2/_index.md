---
title: "Jakarta Persistence 3.2 (under development)"
date: 2023-05-30
summary: "Release for Jakarta EE 11"
---
Jakarta Persistence defines a standard for management of persistence
and object/relational mapping in Java(R) environments.

### New features, enhancements or additions
<!-- List here -->
* support for subqueries in the `select`, `from` and `join` clauses
* allow Java records as embeddable types
* provide programmatic way to perform schema management
* improvements of JPQL/Criteria API - add additional functions and operations such as `left()`, `right`, `replace`, `||` operator,
`cast`, `union`, `union all`, `intersect`, `intersect all`, `except`, `except all`
* define stateless `EntityManager`
* improve type safety of the `find()` and `refresh` methods
* provide support for spatial queries and data types
* add comment and check to `@Table` and `@Column`
* provide standalone TCK based on Apache Maven

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* deprecates support for `java.util.Calendar`, `java.util.Date`, `java.sql.Time`, `java.sql.Timestamp`
* bug fixes [#108](https://github.com/jakartaee/persistence/issues/108), [#158](https://github.com/jakartaee/persistence/issues/158) 

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta Persistence 3.2 Release Record](https://projects.eclipse.org/projects/ee4j.jpa/releases/3.2)
    * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/jakartaee-platform/jakartaee11/JakartaEE11ReleasePlan)
<!-- fix/uncomment once available: -->
<!--
* [Jakarta Persistence 3.2 Specification Document](./jakarta-persistence-spec-3.2.pdf) (PDF)
* [Jakarta Persistence 3.2 Specification Document](./jakarta-persistence-spec-3.2.html) (HTML)
* [Jakarta Persistence 3.2 Javadoc](./apidocs)
* Jakarta Persistence 3.2 XML Schemas
    * [XML Schema for the persistence configuration file](https://jakarta.ee/xml/ns/persistence/persistence_3_2.xsd)
    * [XML Schema for the persistence object/relational mapping file](https://jakarta.ee/xml/ns/persistence/orm/orm_3_2.xsd)
* [Jakarta Persistence 3.2 TCK](https://download.eclipse.org/jakartaee/persistence/3.2/jakarta-persistence-tck-3.2.0.zip)  ([sig](https://download.eclipse.org/jakartaee/persistence/3.2/jakarta-persistence-tck-3.2.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/persistence/3.2/jakarta-persistence-tck-3.2.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.persistence:jakarta.persistence-api:jar:3.2.0](https://search.maven.org/artifact/jakarta.persistence/jakarta.persistence-api/3.2.0/jar)
-->

# Compatible Implementations

* TBD

# Ballots

## Release Review

TBD

## Plan Review

TBD

