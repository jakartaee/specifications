---
title: "Jakarta EE Platform 10"
date: 2022-06-09
summary: "Release of the Jakarta EE 10 Platform"
---
The Jakarta EE Platform defines a standard platform for hosting Jakarta EE applications.

### New features, enhancements or additions
<!-- List here -->
* Added basic module-info.class requirements to API artifacts
* Added restrictions concerning where jakarta package name usage is appropriate
* Added SecurityManager deprecation
* Refactored profile requirements to reduce base requirements in Core Profile

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Removed applet requirements
* Removed requirement for Entity Beans, both Container and Bean Managed Persistence (Jakarta
Enterprise Beans 4.0, Optional Features, Chapters 3 - 7)
* Removed requirement for embeddable EJB Container (Jakarta Enterprise Beans, Core Features 4.0,
Chapter 17)

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta EE Platform 10 Release Record](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/10)
  * [Staged Jakarta EE 10 Release Plan](https://docs.google.com/document/d/1U24VmTzAfXcn3WBnVcolb8vhZO-Pnk_bit0CKh_d2jM/edit#)
  * [Final Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta EE Platform 10 Specification Document](./jakarta-platform-spec-10.0.pdf) (PDF)
* [Jakarta EE Platform 10 Specification Document](./jakarta-platform-spec-10.0.html) (HTML)
* [Jakarta EE Platform 10 Javadoc](./apidocs)
* [Jakarta EE Platform 10 TCK](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Addresses Servlet Challenge (Issue [#472](https://github.com/eclipse-ee4j/servlet-api/issues/472))  [Jakarta EE Platform 10.0.1 TCK](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.1.zip) ([sig](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.1.zip.sig),[sha](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.1.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Addresses Persistence Challenge (Issue [#391](https://github.com/jakartaee/persistence/issues/391))  [Jakarta EE Platform 10.0.2 TCK](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.2.zip) ([sig](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.2.zip.sig),[sha](https://download.eclipse.org/jakartaee/platform/10/jakarta-jakartaeetck-10.0.2.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.platform:jakarta.jakartaee-api:jar:10.0.0](https://search.maven.org/artifact/jakarta.platform/jakarta.jakartaee-api/10.0.0/jar)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [Eclipse GlassFish-7.0.0-M8](https://download.eclipse.org/ee4j/glassfish/glassfish-7.0.0-M8.zip)

# Jakarta EE 10 Schedule
* [Jakarta EE 10 Schedule](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10#jakarta-ee-10-schedule)

# Compatible Implementations

Compatible Implementations of the Jakarta EE Platform specification are eligible to use the _Jakarta EE Compatible_ logo. For more information, see [Get Listed](/compatibility/get-listed/).

{{< figure src="/images/jakarta/jakarta-ee-compatible-logo-color.svg" alt="Jakarta EE Compatible logo" width="250" >}}

* [Jakarta EE 10 Compatible Implementations](https://jakarta.ee/compatibility/certification/10/)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-08-19 with the following results.

| Representative                                 | Representative for: |  Vote  |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |   +1   |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1   |
| Andrew Pielage, Matt Gill                      | Payara              |   +1   |
| Scott Stark, Mark Little                       | Red Hat             |   +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1   |
| Ivar Grimstad                                  | EE4J PMC            |   +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1   |
| Werner Keil                                    | Committer Members   |   +1   |
| Jun Qian                                       | Enterprise Members  |   +1   |
|                                                | Total               | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01927.html).


## Release Review

The Specification Committee Ballot concluded successfully on 2022-09-13 with the following results.

| Representative                                 | Representative for: |  Vote  |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |   +1   |
| Tom Watson, Emily Jiang                        | IBM                 |   +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1   |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1   |
| Ivar Grimstad                                  | EE4J PMC            |   +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1   |
| Werner Keil                                    | Committer Members   |   +1   |
| Jun Qian                                       | Enterprise Members  |   +1   |
| Zhai Luchao                                    | Enterprise Members  |   +1   |
|                                                | **Total**           | **10** |

Non-binding votes
| Representative                                 | Representative for: |  Vote  |
|------------------------------------------------|---------------------|--------|
| Arjan Tijms                                    | OmniFish            |   +1   |
| Edward Burns                                   | Microsoft           |   +1   |
| Brian Stansberry                               | Red Hat             |   +1   |
|                                                | **Total**           | **3**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02714.html)
