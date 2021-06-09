---
title: "Jakarta Authorization 2.1 (under development)"
date: 2021-05-19
summary: "Release for Jakarta EE 10"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into
these permissions.

The primary goal of this release is to make Jakarta Authorization more suitable for cloud deployments, by adding an option to add policy providers programmatically for a single application. This mirrors the API available for Jakarta Authentication.

More specifically:

* Register a policy provider programmatically per application [AUTHORIZATION #98](https://github.com/eclipse-ee4j/authorization/issues/98)
* getPolicyConfiguration without open requirement [AUTHORIZATION #53](https://github.com/eclipse-ee4j/authorization/issues/53)
* Add methods to the PolicyConfiguration to read permissions [AUTHORIZATION #52](https://github.com/eclipse-ee4j/authorization/issues/52)

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta Authorization 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.jacc/releases/2.1)

# Ballots

## Plan Review
<!--
The Specification Committee Ballot concluded successfully on 2021-xx-xx with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |      |
| Dan Bandera, Kevin Sutter                      | IBM                 |      |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |      |
| Andrew Pielage, Matt Gill                      | Payara              |      |
| Scott Stark, Mark Little                       | Red Hat             |      |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
| Scott (Congquan) Wang                          | Enterprise Members  |      |
|                                                | Total               |      |

The ballot was run in the [jakarta.ee-spec mailing list]()
-->
