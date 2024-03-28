---
title: "Jakarta Validation 3.1"
date: 2024-03-27
summary: "Release for Jakarta EE 11"
---
Jakarta Validation defines a metadata model and API for JavaBean and method validation.

This release is targeting Jakarta EE 11 and has clarified support for Records introduced by https://openjdk.org/jeps/395.

### New features, enhancements or additions
<!-- List here -->
* Clarify Java Records support
* Update dependencies for Jakarta EE 11

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta Validation 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.bean-validation/releases/3.1)
* [Jakarta Validation 3.1 Specification Document](jakarta-validation-spec-3.1.pdf) (PDF)
* [Jakarta Validation 3.1 Specification Document](jakarta-validation-spec-3.1.html) (HTML)
* [Jakarta Validation 3.1 Javadoc](./apidocs)
* [Jakarta Validation 3.1 TCK](https://download.eclipse.org/jakartaee/bean-validation/3.1/validation-tck-dist-3.1.0.zip)
([sig](https://download.eclipse.org/jakartaee/bean-validation/3.1/validation-tck-dist-3.1.0.zip.sig), 
[sha](https://download.eclipse.org/jakartaee/bean-validation/3.1/validation-tck-dist-3.1.0.zip.sha256), 
[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.validation:jakarta.validation-api:jar:3.1.0-M1](https://search.maven.org/artifact/jakarta.validation/jakarta.validation-api/3.1.0-M1/jar)

# Compatible Implementations
* [Hibernate Validator TBD](https://hibernate.org/validator/releases/)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2023-08-01 with the following results.

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

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03048.html)

<!--
## Release Review

The Specification Committee Ballot concluded successfully on TBD with the following results.
-->
