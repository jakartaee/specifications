---
title: "Jakarta Annotations 2.1"
date: 2021-12-01
summary: "Release for Jakarta EE 10"
---
Jakarta Annotations defines a collection of annotations representing common semantic concepts that enable a declarative style of programming that applies across a variety of Java technologies.

### New features, enhancements or additions
<!-- List here -->
* Allow @Priority to be used everywhere [Issue #86](https://github.com/eclipse-ee4j/common-annotations-api/issues/86)
* Add @Nullable and @Nonnull annotations [Issue #89](https://github.com/eclipse-ee4j/common-annotations-api/issues/89)

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Annotations 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.ca/releases/2.1)
    * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Annotations 2.1 Specification Document](./annotations-spec-2.1.pdf) (PDF)
* [Jakarta Annotations 2.1 Specification Document](./annotations-spec-2.1.html) (HTML)
* [Jakarta Annotations 2.1 Javadoc](./apidocs)
* [Jakarta Annotations 2.1 TCK](https://download.eclipse.org/jakartaee/annotations/2.1/jakarta-annotations-tck-2.1.1.zip)  ([sig](https://download.eclipse.org/jakartaee/annotations/2.1/jakarta-annotations-tck-2.1.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/annotations/2.1/jakarta-annotations-tck-2.1.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.annotation:jakarta.annotation-api:jar:2.1.1](https://central.sonatype.com/artifact/jakarta.annotation/jakarta.annotation-api/2.1.1/jar)
* [Change Log](./changelog)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [Eclipse GlassFish 7.0.1-M1](https://github.com/eclipse-ee4j/glassfish/releases/download/7.0.0-M1/glassfish-7.0.0-M1.zip)

# Compatible Implementations

* [Eclipse GlassFish 7.0.0-M1](https://github.com/eclipse-ee4j/glassfish/releases/download/7.0.0-M1/glassfish-7.0.0-M1.zip)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-02-09 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Tom Watson, Emily Jiang                        | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Matt Gill                      | Payara              |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  |    +1   |
|                                                | **Total**           |  **10** |

The ballot was run in the [jakarta.ee-spec mailing list]https://www.eclipse.org/lists/jakarta.ee-spec/msg02183.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-10-27 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Kevin Sutter, Tom Watson                       | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Matt Gill                      | Payara              |    +1   |
| Scott Stark, Mark Little                       | Red Hat             |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  | no vote |
|                                                | **Total**           |  **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02013.html)
