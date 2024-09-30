---
title: "Jakarta Data 1.0"
date: 2024-09-30
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
  * Profiles: none (standalone), core, web, platform
  * Entities: persistence, nosql

###  Removals, deprecations or backwards incompatible changes
None - first release

### Minimum Java SE Version
* **Java SE 17 or higher**

# Details

* [Jakarta Data 1.0 Release Record](https://projects.eclipse.org/projects/ee4j.data/releases/1.0)
  * [Jakarta Data 1.0 Release Plan](https://projects.eclipse.org/projects/ee4j.data/releases/1.0/plan)
  * [Jakarta EE Platform 11 Release Plan](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/11/plan)
* [Jakarta Data 1.0 Specification Document](./jakarta-data-1.0.pdf) (PDF)
  * [Jakarta Data 1.0 Specification Addendum](./jakarta-data-addendum-1.0.pdf) (PDF)
* [Jakarta Data 1.0 Specification Document](./jakarta-data-1.0.html) (HTML)
  * [Jakarta Data 1.0 Specification Addendum](./jakarta-data-addendum-1.0.html) (HTML)
* [Jakarta Data 1.0 Javadoc](./apidocs)
* [Jakarta Data 1.0 TCK](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.0.zip), ([sig](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.0.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * First service release [Jakarta Data 1.0.1 TCK](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.1.zip), ([sig](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.1.zip.sig), [sha](https://download.eclipse.org/jakartaee/data/1.0/data-tck-1.0.1.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * Signature tests are included with the TCK and run automatically as part of it
* Maven coordinates
  * [jakarta-data-api:jakarta.data:jar:1.0.1](https://repo1.maven.org/maven2/jakarta/data/jakarta.data-api/1.0.1/)
* Compatible Implementation used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification)
  * Persistence (Hibernate): https://github.com/jakartaee/data/issues/714
  * Persistence (Open Liberty): https://github.com/jakartaee/data/issues/741
<!-- TODO add NoSQL once they have submitted a CCR -->

# Compatible Implementations

* [Hibernate 6.6](https://hibernate.org/orm/releases/6.6/)
* [Open Liberty 24.0.0.6](https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/tck/2024-05-06_1951/openliberty-24.0.0.6-beta.zip)

# Ballots
## Release Review

The Specification Committee Ballot concluded successfully on 2024-06-06 with the following results.

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

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03389.html)


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
