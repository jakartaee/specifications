---
title: "Jakarta EE Web Profile 11"
date: 2025-03-10
summary: "Release of the Jakarta EE 11 Web Profile"
---
The Jakarta EE Web Profile defines a profile of the Jakarta EE Platform specifically targeted at web applications.

### New features, enhancements or additions
<!-- List here -->
* Support for Java Records 
* JDK Runtime aware support for Virtual Threads
* Jakarta Data 1.0
### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Prune ManagedBeans
* Remove all use of SecurityManager

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta Web Profile 11 Release Record](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/web-profile-11)
  * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta EE 11 web profile Specification Document](./jakarta-webprofile-spec-11.0.pdf) (PDF)
* [Jakarta EE 11 web profile Specification Document](./jakarta-webprofile-spec-11.0.html) (HTML)
* [Jakarta Web Profile 11 Javadoc](./apidocs)
* Maven coordinates
   * [jakarta.platform:jakarta.jakartaee-web-api:jar:11.0.0](https://central.sonatype.com/artifact/jakarta.platform/jakarta.jakartaee-web-api/11.0.0/jar)

* [Jakarta Web Profile 11 TCK](https://www.eclipse.org/downloads/download.php?file=/ee4j/jakartaee-tck/jakartaee11/staged/eftl/jakartaeetck-11.0.0-dist.zip) 

<!-- PENDING- edburns: jea-511 https://dev.azure.com/jakarta-ee-azdo/jakarta-ee-azdo/_workitems/edit/511

([sig](https://download.eclipse.org/jakartaee/platform/11/jakarta-jakartaeetck-11.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/platform/11/jakarta-jakartaeetck-11.0.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub)) -->

# Compatible Implementations

Compatible Implementations of the Jakarta EE Web Profile specification are eligible to use the _Jakarta EE Compatible_ logo. For more information, see [Get Listed](/compatibility/get-listed/).

{{< figure src="/images/jakarta/jakarta-ee-compatible-logo-color.svg" alt="Jakarta EE Compatible logo" width="250" >}}

<!--* [Jakarta EE 11 Compatible Implementations](https://jakarta.ee/compatibility/certification/11/)-->

- [Eclipse GlassFish Web Profile](https://repo1.maven.org/maven2/org/glassfish/main/distributions/web/8.0.0-M10/web-8.0.0-M10.zip)

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
The Specification Committee Ballot concluded successfully on 2023-09-07 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   -1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlow                      | Enterprise Members  |   -1    |
|                                                | **Total**           |  **8**  |
Non-binding votes
| Representative                                 | Representative for: |  Vote  |
|------------------------------------------------|---------------------|--------|
| Maximillian Arruda                             | Community Member    |   +1   |
|                                                | **Total**           | **1**  |
The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03110.html)

