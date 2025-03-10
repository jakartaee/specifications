---
title: "Jakarta NoSQL 1.0"
date: 2023-05-30
summary: "Jakarta NoSQL 1.0 offers a standardized API for integrating NoSQL databases with Jakarta EE applications, which improves productivity and interoperability across different NoSQL technologies. Although it is not part of Jakarta EE 11, the aim is to lay the groundwork for its future inclusion in the platform."
---

Jakarta NoSQL is a Java framework that streamlines the integration of Java applications with NoSQL databases.


## Goals

* Increase productivity performing common NoSQL operations.
* Rich Object Mapping integrated.
* Java-based Query and Fluent-API.
* It is designed to work with various NoSQL databases and can quickly adapt to support new types and behaviors through extensions.
* Annotation-oriented using Jakarta Persistence-like naming when it makes sense.


```java
@Inject
Template template;
...

Car ferrari = Car.id(1L)
        .name("Ferrari")
        .type(CarType.SPORT);

template.insert(ferrari);
Optional<Car> car = template.find(Car.class, 1L);
template.delete(Car.class, 1L);
```

```java
@Entity
public class Car {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private CarType type;
 //...
}
```

The annotations from the Mapping API will look familiar to Jakarta Persistence developers:

| Annotation             | Description                                                                                                                                     |
|------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| `@Entity`              | Specifies that the class is an entity. This annotation is applied to the entity class.                                                         |
| `@Id`                  | Specifies the primary key of an entity.                                                                                                        |
| `@Column`              | Specifies the mapped column for a persistent property or field.                                                                                |
| `@MappedSuperclass`    | Specifies a class whose mapping information is applied to entities that inherit from it.                                                       |
| `@Embeddable`          | Declares a class whose instances are stored as an intrinsic part of an owning entity, sharing the identity of the entity.                      |
| `@Inheritance`         | Specifies the inheritance mapping strategy for the entity class hierarchy.                                                                     |
| `@DiscriminatorColumn` | Specifies the discriminator column for the mapping strategy.                                                                                   |
| `@DiscriminatorValue`  | Specifies the value of the discriminator column for the annotated entity type.                                                                 |
| `@Convert`             | Specifies how the values of a field or property are converted to a basic type or a type that can be persisted by a persistence provider.       |

These annotations provide a powerful toolkit for defining and mapping entities in NoSQL databases, analogous to their counterparts in Jakarta Persistence.


After mapping an entity, you can explore the advantage of using a `Template` interface, which can increase productivity on NoSQL operations.

```java
@Inject
Template template;
...

Car ferrari = Car.id(1L)
        .name("Ferrari")
        .type(CarType.SPORT);

template.insert(ferrari);
Optional<Car> car = template.find(Car.class, 1L);
template.delete(Car.class, 1L);

var cars = template.select(Car.class).where("type").eq(CarType.SPORT).result();
```


### New features, enhancements or additions

* The mapping annotations (Entity, Id and Column)
* The Template that increase productivity on NoSQL operations.


###  Removals, deprecations or backwards incompatible changes

None - first release

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta NoSQL 1.0 Release Record](https://projects.eclipse.org/projects/ee4j.nosql/releases/1.0)


* [Jakarta NoSQL Release Plan](https://projects.eclipse.org/projects/ee4j.nosql/releases/1.0)
* [Jakarta NoSQL 1.0 Specification Document](./jakarta-nosql-1.0.0.pdf) (PDF)
* [Jakarta NoSQL 1.0 Specification Document](./jakarta-nosql-1.0.0.html) (HTML)
* [Jakarta NoSQL 1.0 Specification Javadoc](./apidocs)
* Maven coordinates
  * [jakarta-nosql:jakarta.nosql-api:jar:1.0.0](https://repo1.maven.org/maven2/jakarta/nosql/jakarta.nosql-api/1.0.0)
* [Jakarta NoSQL 1.0 TCK](https://www.eclipse.org/downloads/download.php?file=/nosql/1.0/staged/eftl/nosql-1-0-0-tck.zip), [sha](https://download.eclipse.org/nosql/1.0/staged/eftl/nosql-1-0-0-tck.zip.sha256),
[sig](https://download.eclipse.org/nosql/1.0/staged/eftl/nosql-tck-1.0.0.zip.sig)

# Compatible Implementations

* [Eclipse JNoSQL](http://www.jnosql.org/)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2020-10-12 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                      | IBM                 |   0  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                      | Payara              |  +1  |
| Scott Stark, Mark Little                       | Red Hat             |   0  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Scott (Congquan) Wang                          | Enterprise Members  |  +1  |
|                                                | **Total**           | **8**|

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00984.html)
