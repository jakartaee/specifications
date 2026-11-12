---
title: "Jakarta NoSQL 1.1 (Under Development)"
date: 2025-04-21
summary: "Enhancements for Jakarta EE 12"
---


Jakarta NoSQL is a Jakarta EE specification that defines a common Mapping API for integrating Java applications with NoSQL databases.

Jakarta NoSQL addresses several NoSQL database models, including key-value, document, column, graph, time series, and vector databases. These models are not an exhaustive list, and providers may expose database-specific capabilities through extensions.

The 1.1 release builds upon the stable 1.0 foundation, improving Jakarta Query integration, entity mapping, parameterized query execution, and projection support. It also introduces an optional Communication API for database-provider integration.

### Target Platform

This release is targeted for **Jakarta EE 12**, aligning Jakarta NoSQL with the latest Jakarta EE specifications.

### New features, enhancements or additions

* Updated dependencies and Java SE 21 baseline.
* **Jakarta Query integration and parameterized queries**, supporting query expressions, named parameter binding, and record-based projections.
* **Enhanced attribute mapping**, including support for `Map<K, V>` attributes where `V` is an entity or embeddable class.
* **Automatic attribute conversion** through `@Converter(autoApply = true)`.
* **Optional Communication API**, providing minimal record-oriented and key-value integration contracts.

#### Map support with embedded values

Jakarta NoSQL 1.1 introduces support for `Map<K, V>` attributes where the map values are mapped entity or embeddable types.

These values may be represented by regular Java classes or records, using `@Entity` or `@Embeddable` as appropriate. Actual persistence capabilities depend on the database provider.

```java
@Entity
public class Developer {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String language;

    @Column
    private Map<String, Skill> skills;
}

@Embeddable
public class Skill {

    @Column
    private String name;

    @Column
    private int experienceInYears;
}
```

#### Automatic Attribute Conversion

Jakarta NoSQL 1.1 introduces automatic attribute conversion through `@Converter(autoApply = true)`, allowing converters to be applied automatically to mapped attributes of a particular Java type without requiring individual `@Convert` declarations.

```java
@Converter(autoApply = true)
public class EmailConverter
        implements AttributeConverter<Email, String> {

    @Override
    public String convertToDatabaseColumn(Email email) {
        return email == null ? null : email.value();
    }

    @Override
    public Email convertToEntityAttribute(String value) {
        return value == null ? null : new Email(value);
    }
}
```

Mapped attributes of type `Email` can use this converter automatically, reducing repetitive mapping configuration.

### Jakarta Query Integration and Parameterized Queries

Jakarta NoSQL 1.1 integrates with Jakarta Query, enabling applications to express queries using a common query language while respecting the capabilities of the underlying NoSQL database.

The Mapping API supports parameter binding, allowing developers to supply values separately from query expressions without manually concatenating user-provided input into query strings.

```java
var developers = template
    .query("FROM Developer WHERE language = :language")
    .bind("language", "Java")
    .result();
```

The availability of specific query operations depends on the database model and provider.

#### Record-Based Projections

Jakarta NoSQL 1.1 introduces `@Projection` to map query results directly to Java records. Combined with Jakarta Query and typed queries, projections allow applications to retrieve selected entity attributes without loading the entire entity.

```java
@Projection(from = Developer.class)
public record DeveloperView(String name, String language) {
}

var developers = template
    .typedQuery(
        "FROM Developer WHERE language = :language",
        DeveloperView.class
    )
    .bind("language", "Java")
    .result();
```

Projection components are mapped by name or through `@Column` when different attribute names or nested mappings are required.

### Communication API

Jakarta NoSQL 1.1 introduces an optional Communication API for database-provider integration, defining two abstractions: key-value operations and a generic record model.

The Communication API is not required for Mapping API compatibility. Providers may use native database drivers and expose database-specific capabilities through extensions.

#### Key-Value Communication

The `KeyValueManager` supports key-based operations, including `put()` and optional time-to-live (TTL) capabilities.

```java
KeyValueManager manager = factory.get("sessions");

// KeyValueRecord implementation supplied by the provider
KeyValueRecord session = ...;

manager.put(session);
manager.put(session, Duration.ofMinutes(30));

var result = manager.findByKey("session-123");
```

#### Record Communication

The `RecordManager` provides basic persistence operations for provider-defined record representations.

```java
RecordManager<CustomerRecord> manager =
    factory.get("customers");

CustomerRecord customer = ...;

manager.insert(customer);
manager.update(customer);

var result = manager.findByKey("customer-123");
manager.deleteByKey("customer-123");
```

These abstractions allow providers to integrate with underlying database drivers while preserving database-specific capabilities and behavior.

### Removals, deprecations or backwards incompatible changes

* none 

### Community Involvement

You are welcome to contribute to the development of Jakarta NoSQL 1.1 through any of the following channels:

-  **Mailing List**: Join the [nosql-dev mailing list](https://accounts.eclipse.org/mailing-list/nosql-dev) to participate in discussions and stay updated on progress.
-  **Issue Tracker**: Follow or file issues under the [1.1 Milestone](https://github.com/jakartaee/nosql/issues) on GitHub.
-  **Specification Team**: See the [Jakarta NoSQL project page](https://projects.eclipse.org/projects/ee4j.nosql/who) for a list of current committers and contributors.

### Target Implementations

Jakarta NoSQL 1.1 defines a common Mapping API while allowing
implementations to integrate with different NoSQL databases
according to their capabilities.

The Communication API provides an optional integration foundation.
Providers are not required to use it, and may rely on native
database drivers or other integration mechanisms.

- [**Eclipse JNoSQL**](https://github.com/eclipse-jnosql/jnosql) –
  an implementation of Jakarta NoSQL supporting multiple
  NoSQL database technologies.

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
* **Java SE 21 or higher**
<!-- Doesn't exist yet
* [Jakarta NoSQL 1.0 TCK](https://download.eclipse.org/jakartaee/nosql/1.1/nosql-1-1-0-tck.zip), [sha](https://download.eclipse.org/jakartaee/nosql/1.1/nosql-1-1-0-tck.zip.sha256),
[sig](https://download.eclipse.org/jakartaee/nosql/1.1/nosql-1-1-0-tck.zip.sig)
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/nosql/1.1/)
-->
# Details

* [Jakarta NoSQL 1.1 Release Record](https://projects.eclipse.org/projects/ee4j.nosql/releases/1.1)

* [Jakarta NoSQL Release Plan](https://projects.eclipse.org/projects/ee4j.nosql/releases/1.1)
* [Jakarta NoSQL 1.1 M4 Specification Document](./jakarta-nosql-1.1.0-M4.pdf) (PDF)
* [Jakarta NoSQL 1.1 M4 Specification Document](./jakarta-nosql-1.1.0-M4.html) (HTML)
* [Jakarta NoSQL 1.1 M4 Specification Javadoc](./apidocs)
* Maven coordinates
  * [jakarta-nosql:jakarta.nosql-api:jar:1.1.0-M4](https://central.sonatype.com/artifact/jakarta.nosql/jakarta.nosql-api)


# Plan Review
The Specification Committee Ballot concluded successfully on 2025-04-30 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Emilly Jiang, Tom Watson                       | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Petr Aubrecht                  | Payara              |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members | no vote  |
| Werner Keil                                    | Committer Members   | no vote  |
| Jun Qian                                       | Enterprise Members  | no vote  |
| Zhai Luchao                                    | Enterprise Members  |  +1  |
|                                                | **Total**           |**7**|

| Non-binding votes                              |                     | Vote |
|------------------------------------------------|---------------------|------|
| Michael Redich                                 | Community           |  +1  |
|                                                | **Total**           | **1**|

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03916.html)
