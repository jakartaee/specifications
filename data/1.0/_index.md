---
title: "Jakarta Data 1.0"
date: 2024-05-03
summary: "Release for Jakarta EE 11"
---

The Jakarta Data specification provides an API for easier data access. A Java developer can split the persistence from the model with several features, such as the ability to compose custom query methods on a Repository interface.

Jakarta Data’s goal is to provide a familiar and consistent, Jakarta-based programming model for data access while still retaining the particular traits of the underlying data store.

## Goals

* Increase productivity performing common database operations
* Rich Object Mapping integrated
* Define Repositories

```java
@Repository
public interface Garage extends BasicRepository<Car, Long> {

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

* Define the Repository pattern
* Allows pagination on Repository
* Enhance type safety with a StaticMetamodel
* Define platform integrations with CDI, Persistence, NoSQL, Transactions, and Validation
* Produce a TCK with the ability to run against the following matrix:
  * Profiles: none, core, web, full
  * Entities: any, persistence, nosql

###  Removals, deprecations or backwards incompatible changes
None - first release

### Minimum Java SE Version
* **Java SE 17 or higher**

# Details

* [Jakarta Data 1.0 Release Record](https://projects.eclipse.org/projects/ee4j.data/releases/1.0)
  * [Jakarta Data 1.0 Release Plan](https://projects.eclipse.org/projects/ee4j.data/releases/1.0/plan)
  * [Jakarta EE Platform 11 Release Plan](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/11/plan)
* [Jakarta Data 1.0 Specification Document](./jakarta-data-1.0.pdf) (PDF)
  * [Jakarta Data 1.0 Specification Addendum](./jakarta-method-name-query-1.0.pdf) (PDF)
* [Jakarta Data 1.0 Specification Document](./jakarta-data-1.0.html) (HTML)
  * [Jakarta Data 1.0 Specification Addendum](./jakarta-method-name-query-1.0.html) (HTML)
* [Jakarta Data 1.0 Javadoc](./apidocs)
* [Jakarta Data 1.0 TCK](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.0.zip), ([sig](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.0.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * Signature tests are included with the TCK and run automatically as part of it
* Maven coordinates
  * [jakarta-data-api:jakarta.data:jar:1.0.0](https://repo1.maven.org/maven2/jakarta/data/jakarta.data-api/1.0.0/)
* Compatible Implementation used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification)
  * Persistence Entities: TBD
  * NoSQL Entities: TBD

# Compatible Implementations

* TBD

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
| Scott Stark, Scott Marlow                      | Enterprise Members  | no vote |
|                                                | **Total**           |  **8**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02857.html)

## Release Review

TBD
