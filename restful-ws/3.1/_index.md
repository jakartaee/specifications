---
title: "Jakarta RESTful Web Services 3.1"
date: 2022-03-28
summary: "Release for Jakarta EE 10"
---
Jakarta RESTful Web Services provides a foundational API to develop web services following the Representational
State Transfer (REST) architectural pattern.

The goal of this release was to provide an update of the API with some recently requested features while maintaining 
backward compatibility with earlier releases.
  
### New features, enhancements or additions
<!-- List here -->
* Java SE Bootstrap API - [Issue #509](https://github.com/eclipse-ee4j/jaxrs-api/issues/509)
* Support for multipart media type - [Issue #418](https://github.com/eclipse-ee4j/jaxrs-api/issues/418)
* Better alignment with JSON-B - [Issue #742](https://github.com/eclipse-ee4j/jaxrs-api/issues/742)
* Automatic loading of provider extensions - [Issue #751](https://github.com/eclipse-ee4j/jaxrs-api/issues/751)

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Deprecation of `@Context` in preparation for better alignment with CDI

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta RESTful Web Services 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.jaxrs/releases/3.1.0)
    * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10#jakarta-ee-10-release-plan)
* [Jakarta RESTful Web Services 3.1 Specification Document](./jakarta-restful-ws-spec-3.1.pdf) (PDF)
* [Jakarta RESTful Web Services 3.1 Specification Document](./jakarta-restful-ws-spec-3.1.html) (HTML)
* [Jakarta RESTful Web Services 3.1 Javadoc](./apidocs)
* [Jakarta RESTful Web Services 3.1.0 TCK](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * First service release [Jakarta RESTful Web Services 3.1.1 TCK](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.1.zip)  ([sig](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Second service release [Jakarta RESTful Web Services 3.1.2 TCK](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.2.zip)  ([sig](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.2.zip.sig),  [sha](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.2.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Third service release [Jakarta RESTful Web Services 3.1.3 TCK](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.3.zip)  ([sig](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.3.zip.sig),  [sha](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.3.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Fourth service release [Jakarta RESTful Web Services 3.1.4 TCK](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.4.zip)  ([sig](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.4.zip.sig),  [sha](https://download.eclipse.org/jakartaee/restful-ws/3.1/jakarta-restful-ws-tck-3.1.4.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.jaxrs:jakarta.jaxrs-api:jar:3.1.0](https://search.maven.org/artifact/jakarta.ws.rs/jakarta.ws.rs-api/3.1.0/jar)

# Compatible Implementations

* [Eclipse Jersey 3.1.0](https://eclipse-ee4j.github.io/jersey/download.html)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-04-06 with the following results.

| Representative                                 | Representative for: | Vote   |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |    +1  |
| Tom Watson, Emily Jiang                        | IBM                 |    +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1  |
| Andrew Pielage, Matt Gill                      | Payara              |    +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1  |
| Ivar Grimstad                                  | EE4J PMC            |    +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1  |
| Werner Keil                                    | Committer Members   |    +1  |
| Jun Qian                                       | Enterprise Members  |    +1  |
| Zhai Luchao                                    | Enterprise Members  |    +1  |
|                                                | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02318.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-04-29 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Matt Gill                      | Payara              |   +1    |
| Scott Stark, Mark Little                       | Red Hat             |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01533.html)
