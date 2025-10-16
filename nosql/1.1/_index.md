---
title: "Jakarta NoSQL 1.1 (Under Development)"
date: 2025-04-21
summary: "Enhancements for Jakarta EE 12"
---

Jakarta NoSQL is a Java framework that streamlines the integration of Java applications with NoSQL databases.

The 1.1 release builds upon the stable 1.0 foundation and introduces several key features to expand interoperability, improve developer productivity, and align with the broader Jakarta EE ecosystem.

This release focuses on the definition of a standard Driver Communication API, which will allow consistent and portable integration with NoSQL databases. It also includes support for Jakarta Query, prepared statement execution, and enhanced attribute mapping.

### Target Platform

This release is targeted for **Jakarta EE 12**, ensuring full compatibility with the latest specifications in the Jakarta ecosystem.



### New features, enhancements or additions

* Update dependencies
* Update Java version
* **Standardized Driver Communication API** to unify and simplify the integration of NoSQL providers
* **Jakarta Query** support for fluent, portable query definitions ([Jakarta Query GitHub](https://github.com/jakartaee/query))
* **Prepared Statement support** for parameterized and secure query execution.
* Support for `Map<K, V>` attributes where `V` is an entity or embedded class.



#### Map support with embedded values

This release introduces support for Map attributes in entity models where the map values are either entity classes or embeddable classes. These types can be defined using regular classes or Java records and must be annotated respectively with `@jakarta.nosql.Entity` or `@jakarta.nosql.Embeddable`.

This enhancement enables modeling more expressive and structured data where a key is associated with a dynamic or nested value, which is useful in many NoSQL databases that support such behavior, including several document-based databases.


```java
@Entity
public class Developer {

    @Id
    private String id;

    private String name;

    @Column
    private Map<String, Skill> skills;
}

@Embeddable
public class Skill {

    private String name;

    private int experienceInYears;
}

```

##  Support for Jakarta Query and Prepared Statements

Jakarta NoSQL 1.1 introduces support for Jakarta Query, a fluent and portable query language that allows developers to express queries consistently across both NoSQL and relational systems. In addition, this version enables the use of prepared statements, which safely bind parameters and facilitate the execution of reusable queries. This feature enhances both query performance and security, particularly in dynamic query scenarios.

```java
Query query = database.prepare( "FROM Developer WHERE language = :language");
prepared.bind("language", "Java");
var developers = prepared.result();
```

### Removals, deprecations or backwards incompatible changes

* none 

### Community Involvement

You are welcome to contribute to the development of Jakarta NoSQL 1.1 through any of the following channels:

-  **Mailing List**: Join the [nosql-dev mailing list](https://accounts.eclipse.org/mailing-list/nosql-dev) to participate in discussions and stay updated on progress.
-  **Issue Tracker**: Follow or file issues under the [1.1 Milestone](https://github.com/jakartaee/nosql/issues) on GitHub.
-  **Specification Team**: See the [Jakarta NoSQL project page](https://projects.eclipse.org/projects/ee4j.nosql/who) for a list of current committers and contributors.

### Target Implementations

Jakarta NoSQL 1.1 is designed with a **Driver Communication API** that acts as an adapter layer between the specification and NoSQL databases. As a result, vendors do not need to create a full implementation of the specification but can instead provide a **lightweight wrapper or adapter** around their existing client libraries.

- [**Eclipse JNoSQL**](https://github.com/eclipse/jnosql) – the reference implementation, developed in close collaboration with the Jakarta NoSQL specification team.
- MongoDB – expected support through an adapter wrapping the official MongoDB Java driver
- Oracle NoSQL – expected support via a wrapper around Oracle’s NoSQL client
- Other NoSQL vendors (e.g., Redis, Cassandra, Couchbase, Neo4j) are encouraged to contribute drivers by implementing the adapter interface

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

* [Jakarta NoSQL Release Plan](https://projects.eclipse.org/projects/ee4j.nosql/releases/1.0)
* [Jakarta NoSQL 1.1 M1 Specification Document](./jakarta-nosql-1.1-M1.pdf) (PDF)
* [Jakarta NoSQL 1.1 M1 Specification Document](./jakarta-nosql-1.1-M1.html) (HTML)
* [Jakarta NoSQL 1.1 M1 Specification Javadoc](./apidocs)
* Maven coordinates
  * [jakarta-nosql:jakarta.nosql-api:jar:1.1.0-M1](https://central.sonatype.com/artifact/jakarta.nosql/jakarta.nosql-api)


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
