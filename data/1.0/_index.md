---
title: "Jakarta Data 1.0 (under development)"
date: 2023-03-04
summary: "Under Development"
---

The Jakarta Data specification provides an API for easier data access. A Java developer can split the persistence from the model with several features, such as the ability to compose custom query methods on a Repository interface.

Jakarta Data’s goal is to provide a familiar and consistent, Jakarta-based programming model for data access while still retaining the particular traits of the underlying data store.

## Goals

* Increase productivity performing common database operations
* Rich Object Mapping integrated
* Define Reposities

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
* The CrudRepository feature
* Allows pagination on repository with PageableRepository

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* N/A 

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**


* [Jakarta Data Release Plan](https://projects.eclipse.org/projects/ee4j.data/governance)
* [Jakarta NoSQL 1.0 Specification Document](./data-1.0.0-b2.pdf) (PDF)
* [Jakarta NoSQL 1.0 Specification Document](./data-1.0.0-b2.html) (HTML)
* [Jakarta NoSQL 1.0 Specification Javadoc](./apidocs)
* Maven coordinates
  * [jakarta.nosql:nosql-core:jar:1.0.0-b2](https://repo1.maven.org/maven2/jakarta/nosql/nosql-core/1.0.0-b6/)



# Compatible Implementations

* [Eclipse JNoSQL](http://www.jnosql.org/)
* [Open Liberty](https://openliberty.io/)

# Ballots

## Plan Review
