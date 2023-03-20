---
title: "Jakarta Context Dependency Injection 4.0"
date: 2022-03-28
summary: "Release for Jakarta EE 10"
---

Jakarta Contexts Dependency Injection specifies a means for obtaining objects in such a way as to maximize reusability, testability and maintainability compared to traditional approaches such as constructors, factories, and service locators (e.g., JNDI).

### New features, enhancements or additions
<!-- List here -->
* Splits the CDI core into Lite and Full. Lite contains a subset of original features which are designed to work in more restricted environments
* A new jakarta.enterprise:jakarta.enterprise.lang-model API artifact has been added for the Build
Compatible (Reflection-Free)
* Java Platform Module System(JPMS) module-info.class files have been added to the CDI API artifacts

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* The bean-discovery-mode attribute default to annotated and to use annotated as the default when an empty beans.xml is seen in a deployment

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Contexts Dependency Injection 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.cdi/releases/4.0)
* [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Contexts Dependency Injection 4.0 Specification Document](./jakarta-cdi-spec-4.0.pdf) (PDF)
* [Jakarta Contexts Dependency Injection 4.0 Specification Document](./jakarta-cdi-spec-4.0.html) (HTML)
* [Jakarta Contexts Dependency Injection 4.0 Javadoc](./apidocs)
* [Jakarta Contexts Dependency Injection 4.0 TCK](https://download.eclipse.org/jakartaee/cdi/4.0/cdi-tck-4.0.9-dist.zip)
([sig](https://download.eclipse.org/jakartaee/cdi/4.0/cdi-tck-4.0.9-dist.zip.sig),
[sha](https://download.eclipse.org/jakartaee/cdi/4.0/cdi-tck-4.0.9-dist.zip.sha256),
[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))

* Maven coordinates
  * [jakarta.enterprise:jakarta.enterprise.cdi-api:4.0.1](https://search.maven.org/artifact/jakarta.enterprise/jakarta.enterprise.cdi-api/4.0.1/jar)

* Schemas
  * [XML Schema for the CDI 4.0 beans.xml deployment](https://jakarta.ee/xml/ns/jakartaee/beans_4_0.xsd)

# Compatible Implementations

* [Weld 5.0.0.SP2](https://weld.cdi-spec.org/download/)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-04-19 with the following results.

| Representative                     | Representative for: | Vote   |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             | +1     |
| Tom Watson, Emily Jiang            | IBM                 | +1     |
| Ed Bratt, Dmitry Kornilov          | Oracle              | +1     |
| Andrew Pielage                     | Payara              | +1     |
| David Blevins, Jean-Louis Monteiro | Tomitribe           | no vote |
| Ivar Grimstad                      | EE4J PMC            | +1     |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members | +1     |
| Werner Keil                        | Committer Members   | +1     |
| Jun Qian                           | Enterprise Members  | +1     |
| Zhai Luchao                        | Enterprise Members  | +1     |  
|                                    | **Total**           | **9** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02354.html)

## Plan Review

This Specification Project's Plan Review was covered by the [CDI 4.0 Plan Review](https://projects.eclipse.org/projects/ee4j.cdi/releases/4.0/plan).  
The Specification Committee Ballot concluded successfully on 2021-10-01 with the following results.

| Representative                                 | Representative for: | Vote   |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |   +1   |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1   |
| Andrew Pielage, Matt Gill                      | Payara              |   +1   |
| Scott Stark, Mark Little                       | Red Hat             |   +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1   |
| Ivar Grimstad                                  | EE4J PMC            |   +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1   |
| Werner Keil                                    | Committer Members   |   +1   |
| Dr. Jun Qian                                   | Enterprise Members  |   +1   |
|                                                | Total               | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01977.html)
