---
title: "Jakarta RESTful Web Services 4.0 (under development)"
date: 2022-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta RESTful Web Services provides a foundational API to develop web services following the Representational
State Transfer (REST) architectural pattern.

The goal of this release is to provide better alignment between Jakarta RESTful Web Services and 
Jakarta Contexts Dependency Injection (CDI). This will be the first _backward incompatible_ release of 
Jakarta REST.  

* Drop support for @Context injection and related artifacts - [Issue #951](https://github.com/eclipse-ee4j/jaxrs-api/issues/951)
* Define CDI scopes for all Jakarta REST types - [Issue #952](https://github.com/eclipse-ee4j/jaxrs-api/issues/952)
* Define CDI integration and startup for Java SE applications - [Issue #953](https://github.com/eclipse-ee4j/jaxrs-api/issues/953)
* Enhance discovery of application artifacts using CDI scanning - [Issue #953](https://github.com/eclipse-ee4j/jaxrs-api/issues/953)
* Review integration with legacy Jakarta EE specifications (e.g., EJB) - [Issue #954](https://github.com/eclipse-ee4j/jaxrs-api/issues/954)
* Explore integration with Jakarta Concurrency - [Issue #950](https://github.com/eclipse-ee4j/jaxrs-api/issues/950)
* Features inherited from Jakarta REST 3.1 (to be released before Jakarta EE 10):
    * Java SE Bootstrap API - [Issue #509](https://github.com/eclipse-ee4j/jaxrs-api/issues/509)
    * Support for multipart media type - [Issue #418](https://github.com/eclipse-ee4j/jaxrs-api/issues/418)
    * Better alignment with JSON-B - [Issue #742](https://github.com/eclipse-ee4j/jaxrs-api/issues/742)
    * Automatic loading of provider extensions - [Issue #751](https://github.com/eclipse-ee4j/jaxrs-api/issues/751)
    
The JDK version required will be aligned with Jakarta EE 10. The latest details and progress for this work 
may be found on the [Project Site](https://projects.eclipse.org/projects/ee4j.jaxrs) as well as the
[Github Wiki](https://github.com/eclipse-ee4j/jaxrs-api/wiki).

* [Jakarta RESTful Web Services 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.jaxrs/releases/4.0.0)

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
