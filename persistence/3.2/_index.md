---
title: "Jakarta Persistence 3.2"
date: 2023-05-30
summary: "Release for Jakarta EE 11"
---
Jakarta Persistence defines a standard for management of persistence
and object/relational mapping in Java(R) environments.

### New features, enhancements or additions
<!-- List here -->
* Adds support for Java record types as embeddable classes
* Adds support for _java.time.Instant_ and _java.time.Year_ and Clarifies JDBC mappings for basic types
* Adds `union`, `intersect`, `except`, `cast`, `left`, `right`, and `replace` for Jakarta Persistence QL and criteria queries
* Adds `||` string concatenation operator and `id` and `version` functions to Jakarta Persistence QL
* Adds _CriteriaSelect_, _subquery(EntityType)_ and joins on _EntityType_ to Criteria API
* Adds support for specifying null precedence when ordering Jakarta Persistence QL and criteria queries
* Adds _getSingleResultOrNull()_ to _Query_, _TypedQuery_, _StoredProcedureQuery_
* Adds _entities()_, _classes()_ and _columns()_ to _NamedNativeQuery_
* Adds _lockMode()_ to _EntityResult_ with the default being `OPTIMISTIC`
* Adds _getVersion()_, _isLoaded()_, _load()_, _isInstance()_ and _getClass()_ methods to _PersistenceUnitUtil_
* Adds overload of _entity()_ accepting an entity name to _Metamodel_
* Adds _javax.annotation.processing.Generated_ to the list of defined annotations on _StaticMetamodel_
* Adds constants for managed types, named queries, named graphs and named result set mappings to generated _StaticMetamodel_
* Adds _LocalDateTime_ and _Instant_ to supported _Version_ types
* Adds _where()_, _having()_, _and()_, and _or()_ overloads accepting _List<Predicate>_ to _CriteriaQuery_ and _CriteriaBuilder_
* Adds _equalTo()_ and _notEqualTo()_ to _Expression_
* Adds _concat()_ overload accepting list of expressions and _extract()_ to _CriteriaBuilder_
* Adds _Graph_ interface as parent of _EntityGraph_ and _Subgraph_ and moved common operations there
* Adds _addAttributeNode()_, _removeAttributeNode()_, _addTreatedSubgraph()_, _addElementSubgraph()_, _addTreatedElementSubgraph()_,
_addMapKeySubgraph()_, and _addTreatedMapKeySubgraph()_ methods to _Graph_
* Adds _getReference_ overload, _runWithConnection()_ and _callWithConnection()_ to _EntityManager_
* Adds _find()_, _refresh()_, _lock()_ overloads to _EntityManager_ taking newly introduced _FindOption_, _RefreshOption_, and _LockOption_ respectively
* Adds _setCacheStoreMode()_, and _setCacheRetrieveMode()_ methods to _EntityManager_ and _Query_
* Adds _runInTransaction()_ and _callInTransaction()_ to _EntityManagerFactory_
* Adds _getName()_ to _EntityManagerFactory_
* Adds programmatic API to obtain _EntityManagerFactory_ using _PersistenceConfiguration_
* Adds constants for properties defined by the specification to the _PersistenceConfiguration_
* Adds _SchemaManager_ API
* Adds options member to elements which result in DDL generation
* Adds _EnumeratedValue_ allowing custom mapping of fields of Java enums
* Adds _comment_ and _check_ members to Table and Column annotations, along with _CheckConstraint_
* Adds _secondPrecision_ to Column annotation and clarified semantics of Column members
* Adds factory-level access to named queries and named entity graphs, along with _TypedQueryReference_
* Adds integration points for dependency injection
* Allows scalar expressions in the _ORDER BY_ clause in Jakarta Persistence QL
* Allows usage of _TableGenerator_ and _SequenceGenerator_ at the java package level
* Makes the _name_ member of _TableGenerator_ and _SequenceGenerator_ optional
* Makes identification variables and the _SELECT_ clause in Jakarta Persistence QL optional
* Clarifies the primary key types supported for each _GenerationType_
* Clarifies availability of _SEQUENCE_, _TABLE_ and _UUID_ generated IDs on _PrePersist_
* Clarifies semantics of numeric literals and numeric type promotions, and adds support for `bi` and `bd` suffixes
* Clarifies semantics of _Convert_/_Converter_ annotations
* Clarifies rules around distinction of entity names and identification variables and case-sensitivity in Jakarta Persistence QL queries
* Clarifies the semantics of _Bindable.ENTITY_TYPE_ in javadoc
* Clarifies the semantics of collection-valued query parameters
* Entity and embeddable classes may now be static inner classes
* Primary key classes are no longer required to be public and serializable
* Pulls _getParameters()_ up from _CriteriaQuery_ to _CommonAbstractCriteria_
* Fixes wildcard types in _addSubgraph_ and _addAttributeNode_ in _Graph_
* Fixes lower type bounds to the _Path.get_ entity argument _X_
* Fixes example code in the javadoc of _AttributeOverrides_
* Partially fixes raw types warnings through the API
* Improves AsciiDoc formatting and fixes typos through the specification document


### Removals, deprecations or backwards incompatible changes

#### Deprecations

* Deprecates usage of _Calendar_, _Date_, _Time_, _Timestamp_, _Temporal_, _MapKeyTemporal_ and _TemporalType_
in new applications in favour of _java.time_ API
* Deprecates _multiselect_ methods in _CriteriaQuery_. The preference is to use _array_ or _tuple_ method defined in _CriteriaBuilder_
* Deprecates use of `Byte[]` and `Character[]` arrays types for basic attributes, in favor of primitive array types

#### Deprecations for removal

* Deprecates _addSubclassSubgraph()_ in _EntityGraph_ for removal; _addTreatedSubgraph()_ method should be used as direct replacement
* Deprecates _addSubgraph(Attribute, Class)_ and _addKeySubgraph()_ in _Graph_/_EntityGraph_/_SubGraph_ for removal; _addTreatedSubgraph(Attribute, Class)_
and _addMapKeySubgraph()_ methods should be used as direct replacements
* Deprecates _jakarta.persistence.spi.PersistenceUnitTransactionType_ for removal; _jakarta.persistence.PersistenceUnitTransactionType_
methods should be used as direct replacement
* Deprecates default public no-arg constructor in _jakarta.persistence.Persistence_ and _PERSISTENCE_PROVIDER_ and _providers_ fields 
in this class for removal with no replacement. This class is not designed for extensibility

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta Persistence 3.2 Release Record](https://projects.eclipse.org/projects/ee4j.jpa/releases/3.2)
    * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta Persistence 3.2 Specification Document](./jakarta-persistence-spec-3.2.pdf) (PDF)
* [Jakarta Persistence 3.2 Specification Document](./jakarta-persistence-spec-3.2.html) (HTML)
* [Jakarta Persistence 3.2 Javadoc](./apidocs)
* Jakarta Persistence 3.2 XML Schemas
  * [XML Schema for the persistence configuration file](https://jakarta.ee/xml/ns/persistence/persistence_3_2.xsd)
  * [XML Schema for the persistence object/relational mapping file](https://jakarta.ee/xml/ns/persistence/orm/orm_3_2.xsd)
* [Jakarta Persistence 3.2 TCK](https://download.eclipse.org/jakartaee/persistence/3.2/jakarta-persistence-tck-3.2.0.zip)  ([sig](https://download.eclipse.org/jakartaee/persistence/3.2/jakarta-persistence-tck-3.2.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/persistence/3.2/jakarta-persistence-tck-3.2.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/persistence/3.2/)
* Maven coordinates
  * [jakarta.persistence:jakarta.persistence-api:jar:3.2.0](https://central.sonatype.com/artifact/jakarta.persistence/jakarta.persistence-api/3.2.0/jar)

# Compatible Implementations

* [EclipseLink 5.0.0-B02](https://jakarta.oss.sonatype.org/content/repositories/staging/org/eclipse/persistence/eclipselink/5.0.0-B02/eclipselink-5.0.0-B02.zip)
* [Hibernate 7.0.0.Alpha2](https://hibernate.org/orm/releases/7.0/)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2024-05-20 with the following results.

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
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **10** |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03354.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2023-06-29 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   -1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlow                      | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Jun Qian                                       | Primeton            |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02869.html)
