---
title: "Jakarta NoSQL 1.1 (Under Development)"
date: 2025-04-21
summary: "Standardized NoSQL driver API, Jakarta Query integration, and advanced mapping support"
---

Jakarta NoSQL is a Java framework that streamlines the integration of Java applications with NoSQL databases.

The 1.1 release builds upon the stable 1.0 foundation and introduces several key features to expand interoperability, improve developer productivity, and align with the broader Jakarta EE ecosystem.

This release focuses on the definition of a standard Driver Communication API, which will allow consistent and portable integration with NoSQL databases. It also includes support for Jakarta Query, prepared statement execution, and enhanced attribute mapping.

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
String query = "FROM Developer WHERE language = :language";
var prepared = database.prepare(query);
prepared.bind("language", "Java");
var developers = prepared.result();
```

### Removals, deprecations or backwards incompatible changes

* none 

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
* **Java SE 21 or higher**

# Details

* [Jakarta NoSQL 1.1 Release Record](https://projects.eclipse.org/projects/ee4j.nosql/releases/1.1)
