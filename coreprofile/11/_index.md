---
title: "Jakarta EE Core Profile 11"
date: 2024-10-16
summary: "Release of the Jakarta EE Core Profile 11"
---
The Jakarta EE Core Profile defines a profile of the Jakarta EE platform specifically targeted at smaller runtimes.

### New features, enhancements or additions
<!-- List here -->
* Updates of the dependencies for Jakarta EE 11
  * Jakarta Annotations 2.1 to 3.0
  * Jakarta Interceptors 2.1 to 2.2
  * Jakarta Contexts and Dependency Injection 4.0 to 4.1
  * Jakarta RESTful Web Services 3.1 to 4.0

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta EE Core Profile 11 Release Record](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/core-profile-11)
    * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta EE 11 M4 core profile Specification Document](./jakarta-coreprofile-spec-11.0-M4.pdf) (PDF)
* [Jakarta EE 11 M4 core profile Specification Document](./jakarta-coreprofile-spec-11.0-M4.html) (HTML)
* [Jakarta Core Profile 11 M4 Javadoc](./apidocs)
* Maven coordinates
   * [jakarta.platform:jakarta.jakartaee-core-api:jar:11.0.0-M4](https://central.sonatype.com/artifact/jakarta.platform/jakarta.jakartaee-core-api/11.0.0-M4/jar)

<!--
* [Jakarta Core Profile 11.0 TCK](https://download.eclipse.org/jakartaee/coreprofile/11/jakarta-core-profile-tck-11.0.0.zip)
  ([sig](https://download.eclipse.org/jakartaee/coreprofile/11/jakarta-core-profile-tck-11.0.0.zip.sig),
  [sha](https://download.eclipse.org/jakartaee/coreprofile/11/jakarta-core-profile-tck-11.0.0.zip.sha256),
  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  -->
# Compatible Implementations

Compatible Implementations of the Jakarta EE Core Profile specification are eligible to use the _Jakarta EE Compatible_ logo. For more information, see [Get Listed](/compatibility/get-listed/).

{{< figure src="/images/jakarta/jakarta-ee-compatible-logo-color.svg" alt="Jakarta EE Compatible logo" width="250" >}}

<!--* [Jakarta EE 11 Core Profile Compatible Implementations](https://jakarta.ee/compatibility/certification/11/)-->

# Ballots

<!--## Release Review-->

## Progress Review

The Specification Committee Ballot concluded successfully on 2024-02-07 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   -1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   -1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   -1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **7**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Scott Stark                                    | Red Hat             |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03173.html)

## Plan Review
The Specification Committee Ballot concluded successfully on 2023-08-30 with the following results.

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

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03113.html)
