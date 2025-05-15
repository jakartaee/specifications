---
title: "Jakarta EE Web Profile 12 (Under development)"
date: 2025-04-14
summary: "Release of the Jakarta EE Web Profile 12"
---
The Jakarta EE Web Profile defines a profile of the Jakarta EE Platform specifically targeted at web applications.

### New features, enhancements or additions
<!-- List here -->
* Updates of the dependencies for Jakarta EE Web Profile 12
  * Updated specifications also included in Core Profile 12
    * Jakarta Annotations 3.0 to 3.1
    * Jakarta Contexts and Dependency Injection 4.1 to 5.0
    * Jakarta JSON Binding 3.0 to 3.1
    * Jakarta JSON Processing 2.1 to 2.2
    * Jakarta RESTful Web Services 4.0 to 5.0
  * Updated specifications specific to Web Profile 12
    * Jakarta Concurrency 3.1 to 3.2
    * Jakarta Data 1.0 to 1.1
    * Jakarta Enterprise Beans Lite 4.0 to 4.1
    * Jakarta Expression Language 6.0 to 6.1
    * Jakarta Faces 4.1 to 5.0
    * Jakarta Servlet 6.1 to 6.2
    * Jakarta Persistence 3.2 to 4.0
    * Jakarta Pages 4.0 to 4.1
    * Jakarta Security 4.0 to 5.0
    * Jakarta Tags 3.0 to 3.1
    * Jakarta Transaction 2.0 to 2.1
    * Jakarta Validation 3.1 to 4.0
    * Jakarta WebSocket 2.2 to 2.3
* Possible new dependencies for Jakarta EE 12 (if approved by platform committee)
  * New specifications also included in Core Profile 12
    * Jakarta Config based off of MicroProfile Config
    * Jakarta HTTP 1.0
  * New specifications specific to Web Profile 12
    * Jakarta Authorization possibly moving from platform now if it is combined in Security spec
    * Jakarta MVC 3.1
    * Jakarta NoSQL 1.1
    * Jakarta Query 1.0
* Add requirements for HTTP/3 support
* Add expanded programming model for use of virtual threads if applicable
* TCK updated to work with Java 25 in addition to Java 21
* Continued work to move component spec TCKs to their component repositories instead of in platform-tck repository

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* All Jakarta components in EE 12 no longer have Java SecurityManager usage in their APIs and specs

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 21 or higher**

# Details

* [Jakarta EE Web Profile 12 Release Record](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/web-profile-12)
  * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE12ReleasePlan)
<!--
* [Jakarta EE Web Profile 12 Specification Document](./jakarta-webprofile-spec-12.0.pdf) (PDF)
* [Jakarta EE Web Profile 12 Specification Document](./jakarta-webprofile-spec-12.0.html) (HTML)
* [Jakarta EE Web Profile 12 Javadoc](./apidocs)
* Maven coordinates
   * [jakarta.platform:jakarta.jakartaee-web-api:jar:12.0.0](https://central.sonatype.com/artifact/jakarta.platform/jakarta.jakartaee-web-api/12.0.0/jar)

* [Jakarta EE Web Profile 12 TCK](https://download.eclipse.org/jakartaee/webprofile/12.0/jakarta-web-profile-tck-12.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/webprofile/12.0/jakarta-web-profile-tck-12.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/webprofile/12.0/jakarta-web-profile-tck-12.0.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
-->
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).

# Compatible Implementations

Compatible Implementations of the Jakarta EE Web Profile specification are eligible to use the _Jakarta EE Compatible_ logo. For more information, see [Get Listed](/compatibility/get-listed/).

{{< figure src="/images/jakarta/jakarta-ee-compatible-logo-color.svg" alt="Jakarta EE Compatible logo" width="250" >}}

<!--* [Jakarta EE Web Profile 12 Compatible Implementations](https://jakarta.ee/compatibility/certification/12/)-->



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
