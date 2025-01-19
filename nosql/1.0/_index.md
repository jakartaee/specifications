---
title: "Jakarta NoSQL 1.0 (under development)"
date: 2023-05-30
summary: "Release supporting Jakarta EE 11"
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

### New features, enhancements or additions
<!-- List here -->
* The mapping annotations (Entity, Id and Column)
* The Template that increase productivity on NoSQL operations.
* Three Template specializations (DocumentTemplate, ColumnTemplate, KeyValueTemplate)

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta NoSQL 1.0 Release Record](https://projects.eclipse.org/projects/ee4j.nosql/releases/1.0)


* [Jakarta NoSQL Release Plan](https://projects.eclipse.org/projects/ee4j.nosql/governance)
* [Jakarta NoSQL 1.0 Specification Document](./jakarta-nosql-1.0.0.pdf) (PDF)
* [Jakarta NoSQL 1.0 Specification Document](./jakarta-nosql-1.0.0.html) (HTML)
* [Jakarta NoSQL 1.0 Specification Javadoc](./apidocs)
* Maven coordinates
  * [jakarta-nosql:jakarta.nosql-api:jar:1.0.0](https://repo1.maven.org/maven2/jakarta/nosql/jakarta.nosql-api/1.0.0)
* [Jakarta NoSQL 1.0 TCK](nosql-tck-1.0.0.zip), [sha](nosql-tck-1.0.0.zip.sha256)

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
