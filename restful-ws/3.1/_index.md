---
title: "Jakarta RESTful Web Services 3.1"
date: 2021-11-26
summary: "Release for Jakarta EE 10""
---
Jakarta RESTful Web Services provides a foundational API to develop web services following the Representational
State Transfer (REST) architectural pattern.

The goal of this release is to provide an update of the API with some recently requested features while maintaining 
backward compatibility with earlier releases. Originally planned to be an independent release, it is now
being proposed for inclusion in Jakarta EE 10.

Summary of changes:

* Java SE Bootstrap API - [Issue #509](https://github.com/eclipse-ee4j/jaxrs-api/issues/509)
* Support for multipart media type - [Issue #418](https://github.com/eclipse-ee4j/jaxrs-api/issues/418)
* Better alignment with JSON-B - [Issue #742](https://github.com/eclipse-ee4j/jaxrs-api/issues/742)
* Automatic loading of provider extensions - [Issue #751](https://github.com/eclipse-ee4j/jaxrs-api/issues/751)
* Deprecation of `@Context` in preparation for better alignment with CDI
    
The JDK version required will be aligned with Jakarta EE 10. The latest details and progress for this work 
may be found on the [Project Site](https://projects.eclipse.org/projects/ee4j.jaxrs) as well as the
[Github Wiki](https://github.com/eclipse-ee4j/jaxrs-api/wiki).

* [Jakarta RESTful Web Services 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.jaxrs/releases/3.1.0)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-XX-XX with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |         |
| Dan Bandera, Kevin Sutter                      | IBM                 |         |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |         |
| Andrew Pielage, Matt Gill                      | Payara              |         |
| Scott Stark, Mark Little                       | Red Hat             |         |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |         |
| Ivar Grimstad                                  | EE4J PMC            |         |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |         |
| Werner Keil                                    | Committer Members   |         |
| Dr. Jun Qian                                   | Enterprise Members  |         |
|                                                | **Total**           |         |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msgXXXXX.html)