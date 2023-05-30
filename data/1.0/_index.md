---
title: "Jakarta Data 1.0 (under development)"
date: 2023-05-30
summary: "Release supporing Jakarta EE 11"
---

The Jakarta Data specification provides an API for easier data access. A Java developer can split the persistence from the model with several features, such as the ability to compose custom query methods on a Repository interface.

Jakarta Data’s goal is to provide a familiar and consistent, Jakarta-based programming model for data access while still retaining the particular traits of the underlying data store.

## Goals

* Increase productivity performing common database operations
* Rich Object Mapping integrated
* Define Reposities

```java
@Repository
public interface Garage extends CrudRepository<Car, Long> {

  List<Car> findByType(CarType type);

  Optional<Car> findByName(String name);

}
...

@Inject
Garage garage;
...
Car ferrari = Car.id(10L).name("Ferrari").type(CarType.SPORT);
garage.save(ferrari);
```

### New features, enhancements or additions

* The CrudRepository feature
* Allows pagination on repository with PageableRepository


### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**


* [Jakarta Data Release Record](https://projects.eclipse.org/projects/ee4j.data/releases/1.0)
* [Jakarta NoSQL 1.0 Specification Document](./data-1.0.0-b2.pdf) (PDF)
* [Jakarta NoSQL 1.0 Specification Document](./data-1.0.0-b2.html) (HTML)
* [Jakarta NoSQL 1.0 Specification Javadoc](./apidocs)
* Maven coordinates
  * [jakarta-data-api:jakarta.data:jar:1.0.0-b2](https://repo1.maven.org/maven2/jakarta/data/jakarta-data-api/1.0.0-b2/)


# Details

* [Jakarta Data 1.0 Release Record](https://projects.eclipse.org/projects/ee4j.data/releases/1.0)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2023-04-03 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | no vote |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlow                     | Enterprise Members  | no vote |
|                                                | **Total**           |  **8**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02857.html)

