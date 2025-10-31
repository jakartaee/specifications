---
title: "Jakarta EE Core Profile 10"
date: 2022-05-30
summary: "Release of the Jakarta EE Core Profile 10"
---
The Jakarta EE Core Profile defines a profile of the Jakarta EE platform specifically targeted at smaller runtimes.

The goals for this release were:
1. To provide a profile that contains a set of Jakarta EE Specifications targeting smaller runtimes suitable for microservices and ahead-of-time compilation.
2. The TCK(s) for the Core profile run independently of the Full Platform TCK.

### New features, enhancements or additions
<!-- List here -->
* Initial version

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta EE Core Profile 10 Release Record](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/core-profile-10)
    * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Core Profile 10.0 Specification Document](jakarta-coreprofile-spec-10.0.pdf) (PDF)
* [Jakarta Core Profile 10.0 Specification Document](jakarta-coreprofile-spec-10.0.html) (HTML)
* [Jakarta Core Profile 10.0 Javadoc](./apidocs)
* [Jakarta Core Profile 10.0 TCK](https://download.eclipse.org/jakartaee/coreprofile/10.0/jakarta-core-profile-tck-10.0.1.zip)
  ([sig](https://download.eclipse.org/jakartaee/coreprofile/10.0/jakarta-core-profile-tck-10.0.1.zip.sig),
  [sha](https://download.eclipse.org/jakartaee/coreprofile/10.0/jakarta-core-profile-tck-10.0.1.zip.sha256),
  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/coreprofile/10.0)
* Maven coordinates
    * [jakarta.platform:jakarta.jakartaee-core-api:jar:10.0.0](https://central.sonatype.com/artifact/jakarta.platform/jakarta.jakartaee-core-api/10.0.0/jar)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [WildFly Preview 27.0.0.Alpha1 (JDK 17)](https://github.com/wildfly/wildfly/releases/download/27.0.0.Alpha1/wildfly-preview-27.0.0.Alpha1.zip)
  * [WildFly Preview 27.0.0.Alpha1 (JDK 11)](https://github.com/wildfly/wildfly/releases/download/27.0.0.Alpha1/wildfly-preview-27.0.0.Alpha1.zip)

# Compatible Implementations

Compatible Implementations of the Jakarta EE Core Profile specification are eligible to use the _Jakarta EE Compatible_ logo. For more information, see [Get Listed](/compatibility/get-listed/).

{{< figure src="/images/jakarta/jakarta-ee-compatible-logo-color.svg" alt="Jakarta EE Compatible logo" width="250" >}}

* [Jakarta EE 10 Core Profile Compatible Implementations](https://jakarta.ee/compatibility/certification/10/)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-08-15 with the following results.

| Representative                                 | Representative for: | Vote    |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Tom Watson, Emily Jiang                        | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Petr Aubrecht                  | Payara              |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  |    +1   |
|                                                | **Total**           |  **10** |
|                                                                                |
| Non-binding votes                              | Role                |   Vote  |
| Arjan Tijms                                    |                     |    +1   |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02712.html).

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-19 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |  +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1   |
| Andrew Pielage, Matt Gill                      | Payara              |  +1    |
| Scott Stark, Mark Little                       | Red Hat             |  +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1    |
| Ivar Grimstad                                  | EE4J PMC            |  +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1    |
| Werner Keil                                    | Committer Members   |  +1    |
| Dr. Jun Qian                                   | Enterprise Members  |  +1    |
|                                                | Total               |  10  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01679.html)
