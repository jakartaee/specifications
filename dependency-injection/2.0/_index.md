---
title: "Jakarta Dependency Injection 2.0"
date: 2020-06-7
summary: "Release for Jakarta EE 9"
---

Jakarta Dependency Injection specifies a means for obtaining objects in such a way as to maximize reusability, testability and maintainability compared to traditional approaches such as constructors, factories, and service locators (e.g., JNDI).

* [Jakarta Dependency Injection 2.0 Release Record]()
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Dependency Injection 2.0 Specification Document](./injection-spec-2.0.pdf) (PDF)
* [Jakarta Dependency Injection 2.0 Specification Document](./injection-spec-2.0.html) (HTML)
* [Jakarta Dependency Injection 2.0 Javadoc](./apidocs)
* [Jakarta Dependency Injection 2.0 TCK](https://download.eclipse.org/jakartaee/dependency-injection/2.0/jakarta.inject-tck-2.0.1-bin.zip)
([sig](https://download.eclipse.org/jakartaee/dependency-injection/2.0/jakarta.inject-tck-2.0.1-bin.zip.sig),
[sha](7853d02d372838f8300f5a18cfcc23011c9eb9016cf3980bba9442e4b1f8bfc6),
[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * TCK Summary Results [Weld 4.0.0.Alpha2](https://github.com/jakartaredhat/weld-inject-tck/wiki/Jakarta-Dependency-Injection-2.0-TCK-Results)

* Maven coordinates
  * [jakarta.inject:jakarta.inject-api:jar:2.0.0](https://repo1.maven.org/maven2/jakarta/inject/jakarta.inject-api/2.0.0/)


# Compatible Implementations

* [Weld 4.0.0.Alpha2](https://weld.cdi-spec.org/download/)

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-mm-dd with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura, Michael DeNicola               | Fujitsu             |      |
| Dan Bandera, Kevin Sutter                      | IBM                 |      |
| Bill Shannon, Ed Bratt                         | Oracle              |      |
| Mark Wareham, Steve Millidge                   | Payara              |      |
| Scott Stark, Mark Little                       | Red Hat             |      |
| David Blevins, Cesar Hernandez                 | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Alex Theedom                                   | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
|                                                | Total               |      |

The ballot was run in the [jakarta.ee-spec mailing list]()
