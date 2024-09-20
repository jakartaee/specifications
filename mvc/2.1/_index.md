---
title: "Jakarta MVC 2.1"
date: 2021-04-15
summary: "Release supporing Jakarta EE 10"
---

Jakarta MVC defines a standard for creating web applications following the action-based model-view-controller pattern.

This release ensures alignment with Jakarta RESTful Web Services 3.1 as well as providing features requested by the community.

### New features, enhancements or additions
<!-- List here -->
* Standardized way to override HTTP methods in forms
* Added module-info

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* N/A 

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta MVC 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.mvc/releases/2.1)
* [Jakarta MVC 2.1 Specification Document](./jakarta-mvc-spec-2.1.pdf) (PDF)
* [Jakarta MVC 2.1 Specification Document](./jakarta-mvc-spec-2.1.html) (HTML)
* [Jakarta MVC 2.1 Javadoc](./apidocs)
* [Jakarta MVC 2.1 TCK](http://download.eclipse.org/jakartaee/mvc/2.1/jakarta-mvc-tck-2.1.0.zip) ([sig](http://download.eclipse.org/jakartaee/mvc/2.1/jakarta-mvc-tck-2.1.0.zip.sig), [sha](http://download.eclipse.org/jakartaee/mvc/2.1/jakarta-mvc-tck-2.1.0.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.mvc:jakarta.mvc-api:jar:2.1.0](https://central.sonatype.com/artifact/jakarta.mvc/jakarta.mvc-api/2.1.0/jar)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [Eclipse Krazo for Jersey 3.0.0](https://eclipse-ee4j.github.io/krazo/downloads/3.0.0.html)

# Compatible Implementations
* [Eclipse Krazo for Jersey 3.0.0](https://eclipse-ee4j.github.io/krazo/downloads/3.0.0.html)
* [Eclipse Krazo for RESTEasy 3.0.1](https://eclipse-ee4j.github.io/krazo/downloads/3.0.1.html)
* [Eclipse GlassFish 7.0.0-M9](https://download.eclipse.org/ee4j/glassfish/glassfish-7.0.0-M9.zip)

# Ballots

## Release Review
The Specification Committee Ballot concluded successfully on 2022-09-30 with the following results.

| Representative                     | Representative for: | Vote   |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |   +1   |
| Tom Watson, Emily Jiang            | IBM                 |   +1   |
| Ed Bratt, Dmitry Kornilov          | Oracle              |   +1   |
| Andrew Pielage                     | Payara              | no vote|
| David Blevins, Jean-Louis Monteiro | Tomitribe           | no vote|
| Ivar Grimstad                      | EE4J PMC            |   +1   |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |   +1   |
| Werner Keil                        | Committer Members   |   +1   |
| Jun Qian                           | Enterprise Members  |   +1   |
| Zhai Luchao                        | Enterprise Members  |   +1   |  
|                                    | **Total**           | **8** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02763.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-04 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Matt Gill                      | Payara              |   +1    |
| Scott Stark, Mark Little                       | Red Hat             |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | no vote |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01574.html)
