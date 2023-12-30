---
title: "Jakarta Annotations 3.0 (Under development)"
date: 2023-07-24
summary: "Release for Jakarta EE 11"
---
Jakarta Annotations defines a collection of annotations representing common semantic concepts that enable a declarative style of programming that applies across a variety of Java technologies.

The purpose of this release is to fully remove the deprecated @ManagedBean annotation.

### New features, enhancements or additions
<!-- List here -->
* **N/A**

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Remove @ManagedBean [Issue #114](https://github.com/jakartaee/common-annotations-api/issues/114)

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Annotations 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.ca/releases/3.0)
    * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta Annotations 3.0 Specification Document](./annotations-spec-3.0-M1.pdf) (PDF)
* [Jakarta Annotations 3.0 Specification Document](./annotations-spec-3.0-M1.html) (HTML)
* [Jakarta Annotations 3.0 Javadoc](./apidocs)
* Maven coordinates
    * [jakarta.annotation:jakarta.annotation-api:jar:3.0.0-M1](https://search.maven.org/artifact/jakarta.annotation/jakarta.annotation-api/3.0.0-M1/jar)

# Compatible Implementations

NA

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

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03046.html)
