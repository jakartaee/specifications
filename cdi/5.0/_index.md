---
title: "Jakarta Contexts and Dependency Injection 5.0 (Under development)"
date: 2025-10-22
summary: "Release for Jakarta EE 12"
---

Jakarta Contexts Dependency Injection specifies a means for obtaining objects in such a way as to maximize reusability, testability and maintainability compared to traditional approaches such as constructors, factories, and service locators (e.g., JNDI).

A complete list of issues and pull requests for this version can be viewed using [CDI 5.0 Milestone](https://github.com/jakartaee/cdi/milestone/2) and [CDI TCK 5.0 Milestone](https://github.com/jakartaee/cdi-tck/milestone/2) in their respective GitHub repositories.

### New features, enhancements or additions
<!-- List here -->
Currently suggested topics includes:
* Increase minimal Java version to 17, possibly to 21
* Introduction a way to eagerly initialize CDI beans
* Allow registering `BuildCompatibleExtension` programmatically in CDI SE
* Define how `InjectionPoint` works when a bean is obtained via `CDI.current()`
* Restrict how synthetic beans registered via `BuildCompatibleExtension` declare their injection points
* Introduction of tests for unproxyability of sealed classes
* Introduction of tests for records in the TCK lang model
* Multiple small specification clarifications

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Removal of `SecurityManager` usage and references
* Removal of deprecated methods from `BeanManager` API
  * These are method related to EL and are replaced in `ElAwareBeanManager` since CDI 4.1

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta Contexts Dependency Injection 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.cdi/releases/cdi-5.0)
* [Jakarta Contexts Dependency Injection 5.0 Specification Document](./jakarta-cdi-spec-5.0.pdf) (PDF)
* [Jakarta Contexts Dependency Injection 5.0 Specification Document](./jakarta-cdi-spec-5.0.html) (HTML)
* [Jakarta Contexts Dependency Injection 5.0 Javadoc](./apidocs)
* [Jakarta Contexts Dependency Injection 5.0.0 TCK](https://www.eclipse.org/downloads/download.php?file=/ee4j/cdi/5.0/cdi-tck-5.0.0-dist.zip)
([sig](https://download.eclipse.org/jakartaee/cdi/5.0/TBD.zip.sig),
[sha](https://download.eclipse.org/jakartaee/cdi/5.0/TBD.zip.sha256),
[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))

* Maven coordinates
  * [jakarta.enterprise:jakarta.enterprise.cdi-api:5.0.0](https://central.sonatype.com/artifact/jakarta.enterprise/jakarta.enterprise.cdi-api/5.0.0/jar)
  * [jakarta.enterprise:jakarta.enterprise.lang-model:5.0.0](https://central.sonatype.com/artifact/jakarta.enterprise/jakarta.enterprise.lang-model/5.0.0/jar)
  * [jakarta.enterprise:jakarta.enterprise.cdi-el-api:5.0.0](https://central.sonatype.com/artifact/jakarta.enterprise/jakarta.enterprise.cdi-el-api/5.0.0/jar)

* Schemas
  * [XML Schema for the CDI 5.0 beans.xml deployment](https://jakarta.ee/xml/ns/jakartaee/beans_5_0.xsd)
  * The only change in the schema is the version number. The schema is backward compatible with CDI 4.1.

# Compatible Implementations

* [Weld 7.0.0](https://weld.cdi-spec.org/download/) TBD

# Ballots

## Release Review

The Specification Committee Ballot is TBD.

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02354.html)

## Plan Review

This Specification Project's Plan Review will be covered by the [CDI 5.0 Plan Review](https://projects.eclipse.org/projects/ee4j.cdi/releases/cdi-5.0/plan).

The Specification Committee Ballot concluded successfully on 2025-03-24 with the following results.

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
| Jun Qian                                       | Enterprise Members  | no vote |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **8**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03737.html)
