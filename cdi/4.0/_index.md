---
title: "Jakarta Context Dependency Injection 4.0"
date: 2022-02-22
summary: "Release for Jakarta EE 10"
---

Jakarta Contexts Dependency Injection specifies a means for obtaining objects in such a way as to maximize reusability, testability and maintainability compared to traditional approaches such as constructors, factories, and service locators (e.g., JNDI).

* [Jakarta Contexts Dependency Injection 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.cdi/releases/4.0)
  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Contexts Dependency Injection 4.0 Specification Document](jakarta-cdi-spec-4.0.pdf) (PDF)
* [Jakarta Contexts Dependency Injection 4.0 Specification Document](jakarta-cdi-spec-4.0.html) (HTML)
* [Jakarta Contexts Dependency Injection 4.0 Javadoc](./apidocs)
* [Jakarta Contexts Dependency Injection 4.0 TCK](https://download.eclipse.org/ee4j/cdi/4.0/cdi-tck-4.0.0-dist.zip)
([sig](TBD_post_ballot),
[sha](7671d6895eb57b74b52e46b63adfeb57adf965dd91efc673db21a781fedc452f),
[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))

* Maven coordinates
  * [jakarta.enterprise:jakarta.cdi-api:jar:4.0.0](https://search.maven.org/artifact/jakarta.enterprise/jakarta.enterprise.cdi-api/4.0.0/jar)

* Schemas
  * [XML Schema for the CDI 4.0 beans.xml deployment](https://jakarta.ee/xml/ns/jakartaee/beans_4_0.xsd)

# Compatible Implementations

* [Weld 5.0.0.CR1](https://weld.cdi-spec.org/download/)
=======
The Jakarta Contexts and Dependency Injection 4.0 goals for this release are:

* Split the existing 3.0 specification into pieces that separate out requirements based on the target runtime container support; Java SE, Jakarta Servlet, Jakarta Message Service, etc.
* Breakup the TCK to separate out the concers along the lines of the target runtime requirements as outlined in 1.
* Introduce a new CDI-lite specification that targets supporting build time compliation of applications.
* Java SE version will be aligned with the Core profile requirements regarding Java SE versions.
* Consider addressing open issues:
    * [Executable methods](https://github.com/eclipse-ee4j/cdi/issues/460)
    * [Removal of deprecated bits](https://github.com/eclipse-ee4j/cdi/issues/472)
    * [Improve constructor injection](https://github.com/eclipse-ee4j/cdi/issues/464)
    * [AFTER_SUCCESS Observers and Events fired from within EntityListeners](https://github.com/eclipse-ee4j/cdi/issues/467)
    * [Add methods to BeanConfigurator for applying decorators](https://github.com/eclipse-ee4j/cdi/issues/459)
    * [All issues with a Lite label](https://github.com/eclipse-ee4j/cdi/issues?q=is%3Aissue+label%3ALite)


# Ballots

## Plan Review

This Specification Project's Plan Review was covered by the [CDI 4.0 Plan Review](https://projects.eclipse.org/projects/ee4j.cdi/releases/4.0/plan).  
Please reference that ballot for the official results.


## Release Review
=======
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
