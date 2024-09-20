---
title: "Jakarta Authorization 2.1"
date: 2022-02-28
summary: "Release for Jakarta EE 10"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into
these permissions.

### New features, enhancements or additions
<!-- List here -->
* [Issue #53](https://github.com/jakartaee/authorization/issues/53): Add getPolicyConfiguration methods without state requirement
* [Issue #52](https://github.com/jakartaee/authorization/issues/52): Add methods to PolicyConfiguation to read permissions
* [Issue #105](https://github.com/jakartaee/authorization/issues/105): Generic return value for getContext  

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None 

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Authorization 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.jacc/releases/2.1)
  * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Authorization 2.1 Specification Document](./jakarta-authorization-spec-2.1.pdf) (PDF)
* [Jakarta Authorization 2.1 Specification Document](./jakarta-authorization-spec-2.1.html) (HTML)
* [Jakarta Authorization 2.1 Javadoc](./apidocs)
* [Jakarta Authorization 2.1 TCK](https://download.eclipse.org/jakartaee/authorization/2.1/jakarta-authorization-tck-2.1.0.zip) ([sig](https://download.eclipse.org/jakartaee/authorization/2.1/jakarta-authorization-tck-2.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/authorization/2.1/jakarta-authorization-tck-2.1.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))

* Maven coordinates
  * [jakarta.authorization:jakarta.authorization-api:jar:2.1.0](https://central.sonatype.com/artifact/jakarta.authorization/jakarta.authorization-api/2.1.0/jar)


# Compatible Implementations

* [Eclipse Exousia 2.1.0-M1](https://github.com/eclipse-ee4j/exousia/releases/download/2.1.0-M1-RELEASE/exousia-2.1.0-M1.jar)
* [Eclipse Glassfish 7.0.0-M4](https://github.com/eclipse-ee4j/glassfish/releases/download/7.0.0-M4/glassfish-7.0.0-M4.zip)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-05-17 with the following results.

| Representative                                 | Representative for: | Vote    |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Tom Watson, Emily Jiang                        | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Petr Aubrecht                  | Payara              |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members | no vote |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  |    +1   |
|                                                | **Total**           |  **9**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02484.html).

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-06-09 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                      | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                      | Payara              |  +1  |
| Scott Stark, Mark Little                       | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Dr. Jun Qian                                   | Enterprise Members  |  +1  |
|                                                | Total               |  10  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01802.html).
