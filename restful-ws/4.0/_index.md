---
title: "Jakarta RESTful Web Services 4.0 (under development)"
date: 2022-04-15
summary: "Release for Jakarta EE 11"
---

Jakarta RESTful Web Services provides a foundational API to develop web services following the Representational
State Transfer (REST) architectural pattern.

The goal of this release is to provide better alignment between Jakarta RESTful Web Services and 
Jakarta Contexts Dependency Injection (CDI). This will be the first _backward incompatible_ release of 
Jakarta REST.  

### New features, enhancements or additions
* Define CDI scopes for all Jakarta REST types - [Issue #952](https://github.com/jakartaee/rest/issues/952)
* Define CDI integration and startup for Java SE applications - [Issue #953](https://github.com/jakartaee/rest/issues/953)
* Enhance discovery of application artifacts using CDI scanning - [Issue #953](https://github.com/jakartaee/rest/issues/953)
* Explore integration with Jakarta Concurrency - [Issue #950](https://github.com/jakartaee/rest/issues/950)
* Explore alignment with CDI lite and potentially built-time injection support - [Issue #1137](https://github.com/jakartaee/rest/issues/1137)

### Removals, deprecations or backwards incompatible changes
* Drop support for @Context injection and related artifacts - [Issue #951](https://github.com/jakartaee/rest/issues/951)
* Review integration with legacy Jakarta EE specifications (e.g. EJB) - [Issue #954](https://github.com/jakartaee/rest/issues/954)

### Minimum Java SE Version
* Likely Java 17+

# Details
The latest details and progress for this work
may be found on the [Project Site](https://projects.eclipse.org/projects/ee4j.rest) as well as the
[Github Wiki](https://github.com/jakartaee/rest/wiki). Also see 
[Jakarta RESTful Web Services 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.rest/releases/4.0.0).

# Compatible Implementations
* [Eclipse Jersey 4.0](https://projects.eclipse.org/projects/ee4j.jersey)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-06-01 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Matt Gill                      | Payara              |   +1    |
| Scott Stark, Mark Little                       | Red Hat             |   -1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   -1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
|                                                | **Total**           |  **8**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01809.html)
