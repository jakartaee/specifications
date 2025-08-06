---
title: "Jakarta Security 5.0 (under development)"
date: 2025-04-15
summary: "Release for Jakarta EE 12"
---
Jakarta Security defines a standard for creating secure Jakarta EE applications in modern application paradigms.

The major theme of this release is absorbing the separate specifications Jakarta Authentication and Jakarta Authorization into Jakarta Security as sub-specs (for example, as JPA once was to EJB).

Whether Jakarta Authentication and Jakarta Authorization will remain available as sub-specs or even whether they will keep their current package name is up to discussion for a release beyond Jakarta Security 5.0. Being lower level SPIs, not directly targeted at the end user, we could allow us some freedom here, but we do have to keep the deprecation and pruning rules of the Jakarta EE platform into account.

Permission stores is a big ticket feature. This can build on the lower level Policy from Jakarta Authorization and would allow users to add permissions (or their alternative form "security constraints") in a user friendly way.

The release furthermore focuses on evolving the API in various ways, and specifically providing APIs for the authorization theme (including interceptors and the above mentioned abstraction for the permission store). 

### New features, enhancements or additions
* Add support for permission stores [#296](https://github.com/jakartaee/security/issues/296)
* @RolesAllowed alternative  [#295](https://github.com/jakartaee/security/issues/295)
* Add SameSite attribute to cookie value for RememberMe annotation [#202](https://github.com/jakartaee/security/issues/202)
* Easily adding an interceptor to a build-in CDI bean [#200](https://github.com/jakartaee/security/issues/200)
* Add authentication mechanism for DIGEST [#190](https://github.com/jakartaee/security/issues/190)
* Add authentication mechanism for CLIENT-CERT [#120](https://github.com/jakartaee/security/issues/120)
* Authentication mechanism per URL pattern [#86](https://github.com/jakartaee/security/issues/86)
   * User choice of authentication mechanism (login with provider X, login with provider Y, etc) 
   * Multiple authentication mechanisms (try JWT, fallback to BASIC, etc) 



### Removals, deprecations or backwards incompatible changes
* None yet

### Minimum Java SE Version
**Java SE 21 or higher**

# Details

* [Jakarta Security 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.security/releases/5.0)

<!--
The following can be uncommented and version information updated as they become available.

* [Jakarta Security 5.0 Specification Document](./jakarta-security-spec-5.0.pdf) (PDF)
* [Jakarta Security 5.0 Specification Document](./jakarta-security-spec-5.0.html) (HTML)
* [Jakarta Security 5.0 Javadoc](./apidocs)
* [Jakarta Security 5.0 TCK](https://download.eclipse.org/jakartaee/security/5.0/jakarta-security-tck-5.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/security/5.0/jakarta-security-tck-5.0.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/security/5.0/jakarta-security-tck-5.0.0.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
-->

# Compatible Implementations

* Soteria (TBC)

# Ballots

<!--
## Release Review
-->

# Plan Review

The Specification Committee Ballot concluded successfully on 2025-05-08 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members | no vote |
| Werner Keil                                    | Committer Members   |   +1    |
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
| Michael Redlish                                | Community           |   +1    |
|                                                | **Total**           |  **2**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg04009.html)
