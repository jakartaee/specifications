---
title: "Jakarta Dependency Injection 2.0"
date: 2020-08-26
summary: "Release for Jakarta EE 9"
---

Jakarta Dependency Injection specifies a means for obtaining objects in such a way as to maximize reusability, testability and maintainability compared to traditional approaches such as constructors, factories, and service locators (e.g., JNDI).

* [Jakarta Dependency Injection 2.0 Release Record](https://projects.eclipse.org/projects/ee4j.cdi/releases/3.0)
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Dependency Injection 2.0 Specification Document](jakarta-injection-spec-2.0.pdf) (PDF)
* [Jakarta Dependency Injection 2.0 Specification Document](jakarta-injection-spec-2.0.html) (HTML)
* [Jakarta Dependency Injection 2.0 Javadoc](./apidocs)
* [Jakarta Dependency Injection 2.0 TCK](https://download.eclipse.org/jakartaee/dependency-injection/2.0/jakarta.inject-tck-2.0.1-bin.zip)
([sig](https://download.eclipse.org/jakartaee/dependency-injection/2.0/jakarta.inject-tck-2.0.1-bin.zip.sig),
[sha](https://download.eclipse.org/jakartaee/dependency-injection/2.0/jakarta.inject-tck-2.0.1-bin.zip.sha256),
[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
    * Service Release, 2022-06-13 --  [Jakarta Dependency Injection 2.0 TCK](https://download.eclipse.org/jakartaee/dependency-injection/2.0/jakarta.inject-tck-2.0.2-bin.zip)
([sig](https://download.eclipse.org/jakartaee/dependency-injection/2.0/jakarta.inject-tck-2.0.2-bin.zip.sig), 
[sha](https://download.eclipse.org/jakartaee/dependency-injection/2.0/jakarta.inject-tck-2.0.2-bin.zip.sha256), 
[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))

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

The Specification Committee Ballot concluded successfully on 2020-08-27 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                      | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                      | Payara              |  +1  |
| Scott Stark, Mark Little                       | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Scott (Congquan) Wang                          | Enterprise Members  |  +1  |
|                                                | Total               |  10  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00786.html)
