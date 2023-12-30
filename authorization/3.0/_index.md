---
title: "Jakarta Authorization 3.0 (under development)"
date: 2023-05-30
summary: "Release for Jakarta EE 11"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into
these permissions.

The primary goal of this release is to make Jakarta Authorization future proof by adding a replacement for the Policy and generally the removal of security manager. Also make it more suitable for cloud deployments, by adding an option to add policy providers programmatically for a single application. This mirrors the API available for Jakarta Authentication.


### New features, enhancements or additions
* Register a policy provider programmatically per application [AUTHORIZATION #98](https://github.com/jakartaee/authorization/issues/98)

### Removals, deprecations or backwards incompatible changes
* Design and implement replacement for Policy [AUTHORIZATION #99](https://github.com/jakartaee/authorization/issues/99)
* Remove references to the SecurityManager

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* [Jakarta Authorization 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.authorization/releases/3.0)

<!--
The following can be uncommented and version information updated as they become available.

* [Jakarta Authorization 3.0 Specification Document](./authorization-spec-3.0.pdf) (PDF)
* [Jakarta Authorization 3.0 Specification Document](./authorization-spec-3.0.html) (HTML)
* [Jakarta Authorization 3.0 Javadoc](./apidocs)
* [Jakarta Authorization 3.0 TCK](https://download.eclipse.org/jakartaee/authorization/3.0/jakarta-authorization-tck-3.0.0.zip)([sig](https://download.eclipse.org/jakartaee/authorization/3.0/jakarta-authorization-tck-3.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/authorization/3.0/jakarta-authorization-tck-3.0.0.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.authorization:jakarta.authorization-api:jar:3.0.0](https://search.maven.org/artifact/jakarta.authorization/jakarta.authorization-api/3.0.0/jar)
-->

# Compatible Implementations

* Exousia (TBC)

# Ballots

## Plan Review

The Specification Committee Ballot completed on 11th July 2023.
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
| Scott Stark                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |


The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02924.html)

## Release Review

TBD
