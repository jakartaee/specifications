---
title: "Jakarta MVC 3.0"
date: 2025-05-07
summary: "Release aligned with Jakarta EE 11"
---

Jakarta MVC defines a standard for creating web applications following the action-based model-view-controller pattern.

This release ensures alignment with Jakarta RESTful Web Services 4.0, removes the requirement to support the Facelets view engine, as well as minor features requested by the community.

### New features, enhancements or additions
<!-- List here -->
* Switch CSRF default to implicit
* Add accessor for form method overwrite field name
* Replace org.eclipse.krazo.defaultViewFileExtension with API constant

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Remove requirement for Facelets view engine

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta MVC 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.mvc/releases/3.0)
* [Jakarta MVC 3.0 Specification Document](./jakarta-mvc-spec-3.0.pdf) (PDF)
* [Jakarta MVC 3.0 Specification Document](./jakarta-mvc-spec-3.0.html) (HTML)
* [Jakarta MVC 3.0 Javadoc](./apidocs)
* [Jakarta MVC 3.0 TCK](http://download.eclipse.org/jakartaee/mvc/3.0/jakarta-mvc-tck-3.0.0.zip) ([sig](http://download.eclipse.org/jakartaee/mvc/3.0/jakarta-mvc-tck-3.0.0.zip.sig), [sha](http://download.eclipse.org/jakartaee/mvc/3.0/jakarta-mvc-tck-3.0.0.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](http://download.eclipse.org/jakartaee/mvc/3.0/).
* Maven coordinates
  * [jakarta.mvc:jakarta.mvc-api:jar:3.0.0](https://central.sonatype.com/artifact/jakarta.mvc/jakarta.mvc-api/3.0.0/jar)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [Eclipse Krazo for Jersey 4.0.0](https://eclipse-ee4j.github.io/krazo/downloads/4.0.0.html)

# Compatible Implementations
* [Eclipse Krazo for Jersey 4.0.0](https://eclipse-ee4j.github.io/krazo/downloads/4.0.0.html)

## Ballots

### Release Review

The Specification Committee Ballot concluded successfully on 2025-05-07 with the following results.

| Representative                         | Representative for: | Vote    |
|----------------------------------------|---------------------|---------|
| Kenji Kazumura                         | Fujitsu             | +1      |
| Tom Watson, Emily Jiang                | IBM                 | +1      |
| Ed Bratt, Dmitry Kornilov              | Oracle              | +1      |
| Andrew Pielage, Petr Aubrecht          | Payara              | +1      |
| David Blevins, Jean-Louis Monteiro     | Tomitribe           | +1      |
| Ivar Grimstad                          | EE4J PMC            | +1      |
| Marcelo Ancelmo, Abraham Marin-Perez   | Participant Members | no vote |
| Werner Keil                            | Committer Members   | +1      |
| Jun Qian                               | Enterprise Members  | +1      |
| Zhai Luchao                            | Enterprise Members  | +1      |
|                                        | **Total**           | **9**   |
|                                        |                     |         |
| Non-binding votes                      |                     | Vote    |
| -------------------------------------- | ------------------- | ------- |
| Michael Redlich                        |                     | +1      |
| Angelo Rubini                          |                     | +1      |
|                                        | **Total**           | **2**   |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03883.html).

### Plan Review

The Specification Committee Ballot concluded successfully on 2023-07-07 with the following results.

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
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlow                      | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02937.html).
