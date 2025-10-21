---
title: "Jakarta Activation 2.1"
date: 2022-01-26
summary: "Release for Jakarta EE 10"
---

Jakarta Activation defines a set of standard services to: determine the
MIME type of an arbitrary piece of data; encapsulate access to it;
discover the operations available on it; and instantiate the
appropriate bean to perform the operation(s).

### New features, enhancements or additions
<!-- List here -->
* Provided standalone API jar fully independent on the particular implementation

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Activation 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.jaf/releases/2.1)
* [Jakarta Activation 2.1 Specification Document](./jakarta-activation-spec-2.1.pdf) (PDF)
* [Jakarta Activation 2.1 Specification Document](./jakarta-activation-spec-2.1.html) (HTML)
* [Jakarta Activation 2.1 Javadoc](./apidocs)
* [Jakarta Activation 2.1 TCK](https://download.eclipse.org/jakartaee/activation/2.1/jakarta-activation-tck-2.1.0.zip)
  ([sig](https://download.eclipse.org/jakartaee/activation/2.1/jakarta-activation-tck-2.1.0.zip.sig),
  [sha](https://download.eclipse.org/jakartaee/activation/2.1/jakarta-activation-tck-2.1.0.zip.sha256),
  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/activation/2.1)
* Maven coordinates
    * [jakarta.activation:jakarta.activation-api:jar:2.1.3](https://central.sonatype.com/artifact/jakarta.activation/jakarta.activation-api/2.1.3/jar)
* [Change Log](./changelog)

# Compatible Implementations

* [Eclipse Angus/Activation 2.0.2](https://eclipse-ee4j.github.io/angus-activation/)


# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-01-26 with the following results.

| Representative                                 | Representative for: | Vote   |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |    +1  |
| Tom Watson, Emily Jiang                        | IBM                 |    +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1  |
| Andrew Pielage, Matt Gill                      | Payara              |    +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1  |
| Ivar Grimstad                                  | EE4J PMC            |    +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1  |
| Werner Keil                                    | Committer Members   |    +1  |
| Jun Qian                                       | Enterprise Members  |    +1  |
| Zhai Luchao                                    | Enterprise Members  |    +1  |
|                                                | **Total**           | **10** |

| Non-binding Votes                  | Representative for: |  Vote  |
|------------------------------------|---------------------|--------|
| Scott Stark                        | Red Hat             |   +1   |
|                                    | **Total**           |  **1** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02175.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-27 with the following results.

| Representative                     | Representative for: |  Vote  |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter          | IBM                 | no vote |
| Ed Bratt, Dmitry Kornilov          | Oracle              |  +1  |
| Andrew Pielage, Matt Gill          | Payara              |  +1  |
| Scott Stark, Mark Little           | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |  +1  |
| Ivar Grimstad                      | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |  +1  |
| Werner Keil                        | Committer Members   |  +1  |
| Scott (Congquan) Wang              | Enterprise Members  |  +1  |
|                                    | **Total**           | 9 |
The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01747.html)

