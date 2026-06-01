---
title: "Jakarta Persistence 4.0 (under development)"
date: 2026-06-01
summary: "Release for Jakarta EE 12"
---
Jakarta Persistence defines the industry standard for management of persistence and object/relational mapping in Java&reg; environments. It is the most widely used persistence solution in the Java ecosystem and by far the most successful object/relational mapping API in any programming language.

This specification was originally developed by the Java Community Process and was known as JPA (the Java Persistence API) prior to it being made open source and donated to the Eclipse Foundation.

Jakarta Persistence 4.0 is a major revision of the specification and is currently under very active development, with release targeted for late 2026. Milestone 4 of the API, specification, and TCK is already available.


### New features, enhancements, and additions

- Added `EntityAgent` for working with detached entities; added `@PersistenceAgent` for injection of a Jakarta EE container-managed `EntityAgent`
- Added `@JakartaQuery`, `@NativeQuery` and `@QueryOptions` for declaring static queries at the method level and integrating with Jakarta Data
- Added a new programmatic API for expressing native SQL query result set mappings
- Added `Statement`, `CriteriaStatement`, `@NamedStatement` and `@NamedNativeStatement` to clearly distinguish statements which modify data from queries which return data; added `StatementOrTypedQuery` as a migration path
- Added `@Fetch`, `FetchOption`, and `AttributeNode.addOption()` for more elegant definition of named entity graphs and for specifying per-attribute fetch options
- Added `get()` operation as an alternative to `find()`; added `findMultiple()` and `getMultiple()` for batch loading entities by id
- Added `getResultCount()` to `TypedQuery`
- Added the ability to select `LAZY` fetching as the default for `@OneToOne` and `@ManyToOne` associations via `<default-to-one-fetch-type>` in `persistence.xml` or `PersistenceConfiguration.defaultToOneFetchType()`
- Added specialized expression types `ComparableExpression`, `NumericExpression`, `TextExpression`, `TemporalExpression`, `BooleanExpression` to criteria API, along with matching attribute types `ComparableAttribute`, `NumericAttribute`, `TextAttribute`, `TemporalAttribute`, `BooleanAttribute` to metamodel API, to reduce the verbosity of criteria queries
- Added operations to `CriteriaBuilder` accepting JPQL query strings, returning corresponding criteria objects
- Improved and reworked the `StoredProcedureQuery` API
- Added `@ExcludedFromVersioning`
- Added `FETCHED` to `PessimisticLockScope`; added `lockScope` to `@NamedQuery` and `setLockScope()` to `TypedQuery`
- Added new lifecycle callback types: `@PreMerge`, `@PreInsert`, `@PostInsert`, `@PreUpsert`, `@PostUpsert`, `@PreDelete`, `@PostDelete`
- Added `addListener()` to `EntityManagerFactory`; added `@EntityListener`; allowed `@EntityListeners` on a package descriptor or module descriptor; allowed an entity listener may have multiple callbacks of the same type
- Added `BatchSize` typed option
- Added overloads of `setParameter()` which accept a disambiguating `Class` or `Type`; added `setConvertedParameter()` to `Query` and `registerConvertedParameter()` to `StoredProcedureQuery`; added `convertedParameter()` to `CriteriaBuilder`
- Allow named queries to be declared by a module or package descriptor
- Improved `@Index` and `@Table` to allow more customization of the generated DDL
- Added `QueryFlushMode`, `Query.setQueryFlushMode()`, and `flush` to `@NamedQuery` and `@NamedNativeQuery`; added `FlushModeType.EXPLICIT`
- Added specialized `Option` types to `EntityManager`, `EntityAgent`, `TypedQuery`, `Statement`, `StoredProcedureQuery`, and `CreationOption` types to `EntityManager` and `EntityAgent`
- Made `select new X(...)` optional in JPQL queries with an explicit result class of type `X`, and allowed the result class of a native SQL query to be interpreted as a constructor result
- Added static lists of standard property names to inner interfaces of `Persistence`
- Added `SchemaManager.populate()`
- Introduced `@Discoverable` annotation types to formalize Jakarta EE container-assisted discovery of managed classes
- Reworked integration with Jakarta Validation

The above in an incomplete list. 

### Removals, deprecations or backwards incompatible changes

- Drop APIs already marked `forRemoval` in 3.2
- Change return type of `createNativeQuery()` to `TypedQuery`
- Drop use of `SecurityManager`
- Clarify the format of entity names
- Removed deprecated support for use of `Byte[]` and `Character[]` as basic types
- Deprecated many operations of `Query`, since those operations should now be executed via a `Statement` or `TypedQuery`
- Deprecated `createEntityGraph(String)`
- Deprecated `EntityManager.getDelegate()` in favor of `unwrap()`
- Deprecated `name` member of `@MapKey` in favor of `value`

### Architectural changes

- Donate definition of Jakarta Persistence Query Language to [Jakarta Query](https://jakarta.ee/specifications/query/1.0/)
- Take ownership of standalone TCK

### Minimum Java SE Version

**Java SE 21 or higher**

# Details

* [Jakarta Persistence 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.jpa/releases/4.0)
    * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE12ReleasePlan)
* [Jakarta Persistence 4.0-M4 Specification Document](./jakarta-persistence-spec-4.0-M4.pdf) (PDF)
* [Jakarta Persistence 4.0-M4 Specification Document](./jakarta-persistence-spec-4.0-M4.html) (HTML)
* [Jakarta Persistence 4.0-M4 Javadoc](./apidocs)
<!--
* [Jakarta Persistence 4.0 Specification Document](./jakarta-persistence-spec-4.0.pdf) (PDF)
* [Jakarta Persistence 4.0 Specification Document](./jakarta-persistence-spec-4.0.html) (HTML)
* [Jakarta Persistence 4.0 Javadoc](./apidocs)
* Jakarta Persistence 4.0 XML Schemas
    * [XML Schema for the persistence configuration file](https://jakarta.ee/xml/ns/persistence/persistence_4.0.xsd)
    * [XML Schema for the persistence object/relational mapping file](https://jakarta.ee/xml/ns/persistence/orm/orm_4.0.xsd)
* [Jakarta Persistence 4.0 TCK](https://download.eclipse.org/jakartaee/persistence/4.0/jakarta-persistence-tck-4.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/persistence/4.0/jakarta-persistence-tck-4.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/persistence/4.0/jakarta-persistence-tck-4.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/persistence/4.0/)
* Maven coordinates
    * [jakarta.persistence:jakarta.persistence-api:jar:4.0.0](https://central.sonatype.com/artifact/jakarta.persistence/jakarta.persistence-api/4.0.0/jar)
-->


# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-23 with the following results.

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
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
| Michael Redlich                                | Community           |   +1    |
|                                                | **Total**           |  **2**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03845.html)
