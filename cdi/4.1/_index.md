---
title: "Jakarta Contexts and Dependency Injection 4.1 (Under development)"
date: 2022-05-30
summary: "Release for Jakarta EE 11"
---

Jakarta Contexts Dependency Injection specifies a means for obtaining objects in such a way as to maximize reusability, testability and maintainability compared to traditional approaches such as constructors, factories, and service locators (e.g., JNDI).

### New features, enhancements or additions
<!-- List here -->
Several minor issues in the Specification, APIs and TCK will be addresses as detailed in the [CDI 4.1 Milestone](https://github.com/jakartaee/cdi/milestone/1)
The overview of currently suggested topics includes:
* Executable methods
* Getting interceptor bindings in standard way
* @Priority on producers
* Review unused imports in classes in CDI 4
* How can getReference() legally be invoked during AfterDeploymentValidation event if contexts have not been created
* Programmatic access to Assignability rules
* Add methods to BeanConfigurator for applying decorators
* List of potential changes/features for next CDI version
* Improve wording of managed bean requirements WRT non-static public fields
* Inconsistent behavior when finding unproxyable bean
( possibly remove the references to the Managed Beans specification
* possible rename of Jakarta Bean Validation to Jakarta Validation
* Assignability of raw and parameterized types for type variables with multiple bounds (CDI-440) spec-clarificationAn issue requesting clarification in the specification

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* The Expression Language SPI methods on the BeanManager will be deprecated in preparation for a move to a new subinterface
that will be part of a new artifact. This removes the dependency on the Jakarta Expression Language from core API,
and refactors features that are not client facing into the subinterface.

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Contexts Dependency Injection 4.1 Release Record](https://projects.eclipse.org/projects/ee4j.cdi/releases/4.1)
<!--* [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Contexts Dependency Injection 4.1 Specification Document](./jakarta-cdi-spec-4.1.pdf) (PDF)
* [Jakarta Contexts Dependency Injection 4.1 Specification Document](./jakarta-cdi-spec-4.1.html) (HTML)
* [Jakarta Contexts Dependency Injection 4.1 Javadoc](./apidocs)
* [Jakarta Contexts Dependency Injection 4.1 TCK](https://download.eclipse.org/jakartaee/cdi/4.1/cdi-tck-4.1.0-dist.zip)
([sig](https://download.eclipse.org/jakartaee/cdi/4.1/cdi-tck-4.1.9-dist.zip.sig),
[sha](https://download.eclipse.org/jakartaee/cdi/4.1/cdi-tck-4.1.9-dist.zip.sha256),
[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))

* Maven coordinates
  * [jakarta.enterprise:jakarta.enterprise.cdi-api:4.1.0](https://search.maven.org/artifact/jakarta.enterprise/jakarta.enterprise.cdi-api/4.1.0/jar)

* Schemas
  * [XML Schema for the CDI 4.0 beans.xml deployment](https://jakarta.ee/xml/ns/jakartaee/beans_4_0.xsd)
  * No changes currently planed for the schema
-->
# Compatible Implementations

* [Weld 6.0.0](https://weld.cdi-spec.org/download/) TBD

# Ballots

## Release Review

The Specification Committee Ballot is TBD.

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02354.html)

## Plan Review

This Specification Project's Plan Review will be covered by the [CDI 4.1 Plan Review](https://projects.eclipse.org/projects/ee4j.cdi/releases/4.1/plan).  

The Specification Committee Ballot completed on 11th July 2023.
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              | No vote |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **9**   |
Non-binding votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Jun Qian                                       | Primeton            |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02950.html)

