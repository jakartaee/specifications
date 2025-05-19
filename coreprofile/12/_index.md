---
title: "Jakarta EE Core Profile 12 (Under development)"
date: 2025-04-14
summary: "Release of the Jakarta EE Core Profile 12"
---
The Jakarta EE Core Profile defines a profile of the Jakarta EE Platform specifically targeted at smaller runtimes.

### New features, enhancements or additions
<!-- List here -->
* Updates of the dependencies for Jakarta EE 12
  * Jakarta Annotations 3.0 to 3.1
  * Jakarta Contexts and Dependency Injection 4.1 to 5.0
  * Jakarta JSON Binding 3.0 to 3.1
  * Jakarta JSON Processing 2.1 to 2.2
  * Jakarta RESTful Web Services 4.0 to 5.0
* Possible new dependencies for Jakarta EE 12 (if approved by platform committee)
  * Jakarta Config based off of MicroProfile Config
  * Jakarta HTTP 1.0
* Add requirements for HTTP/3 support
* Add expanded programming model for use of virtual threads if applicable
* TCK updated to work with Java 25 in addition to Java 21
* Continued work to move component spec TCKs to their component repositories instead of in platform-tck repository

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Expression Language compile dependency no longer needed with introduction of CDI 5.0
* All Jakarta components in EE 12 no longer have Java SecurityManager usage in their APIs

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 21 or higher**

# Details

* [Jakarta EE Core Profile 12 Release Record](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/core-profile-12)
  * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE12ReleasePlan)
<!--
* [Jakarta EE Core Profile 12 Specification Document](./jakarta-coreprofile-spec-12.0.pdf) (PDF)
* [Jakarta EE Core Profile 12 Specification Document](./jakarta-coreprofile-spec-12.0.html) (HTML)
* [Jakarta EE Core Profile 12 Javadoc](./apidocs)
* Maven coordinates
   * [jakarta.platform:jakarta.jakartaee-core-api:jar:12.0.0](https://central.sonatype.com/artifact/jakarta.platform/jakarta.jakartaee-core-api/12.0.0/jar)

* [Jakarta EE Core Profile 12.0 TCK](https://download.eclipse.org/jakartaee/coreprofile/12.0/jakarta-core-profile-tck-12.0.0.zip)
  ([sig](https://download.eclipse.org/jakartaee/coreprofile/12.0/jakarta-core-profile-tck-12.0.0.zip.sig),
  [sha](https://download.eclipse.org/jakartaee/coreprofile/12.0/jakarta-core-profile-tck-12.0.0.zip.sha256),
  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
-->
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).

# Compatible Implementations

Compatible Implementations of the Jakarta EE Core Profile specification are eligible to use the _Jakarta EE Compatible_ logo. For more information, see [Get Listed](/compatibility/get-listed/).

{{< figure src="/images/jakarta/jakarta-ee-compatible-logo-color.svg" alt="Jakarta EE Compatible logo" width="250" >}}

<!--* [Jakarta EE Core Profile 12 Compatible Implementations](https://jakarta.ee/compatibility/certification/12/)-->

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on YYYY-MM-DD with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |         |
| Emily Jiang, Tom Watson                        | IBM                 |         |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |         |
| Andrew Pielage, Petr Aubrecht                  | Payara              |         |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |         |
| Ivar Grimstad                                  | EE4J PMC            |         |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |         |
| Werner Keil                                    | Committer Members   |         |
| Jun Qian                                       | Enterprise Members  |         |
| Zhai Luchao                                    | Enterprise Members  |         |
|                                                | **Total**           |         |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgxxxxx.html)

## Plan Review
The Specification Committee Ballot concluded successfully on 2025-05-19 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | no vote |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |   9     |
Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
| Michaal Redlich                                | Community           |   +1    |
|                                                | **Total**           |   2     |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg04138.html)
