---
title: "Jakarta JSON Processing 2.1"
date: 2022-03-27
summary: "Release for Jakarta EE 10"
---
Jakarta JSON Processing defines a Java(R) based framework for parsing, generating, transforming, and
querying JSON documents.

### New features, enhancements or additions
<!-- List here -->
* added API to create JsonValue from primitive types
* added API to create get JsonValue from java.lang.Number type
* added API to get current event from the JsonParser
* added standard property to handle duplicated keys
* clarified behaviour of JsonObjectBuilder.build() method
* clarified behaviour of JsonGenerator.close() method
* changed type bounds of a Map argument in Json.createObjectBuilder(Map): JsonObjectBuilder method
* added definition of exceptions thrown by JsonParser.getValue()/getObject()/getArray() methods
* removed (default) implementation from the specification API artifact and moved the implementation to the separate project
* provided standalone TCK based on Apache Maven

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta JSON Processing 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.jsonp/releases/2.1)
  * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta JSON Processing 2.1 Specification Document](./apidocs) (Javadoc is the specification document of this project)
* [Jakarta JSON Processing 2.1 Javadoc](./apidocs)
* [Jakarta JSON Processing 2.1 TCK](https://download.eclipse.org/jakartaee/jsonp/2.1/jakarta-jsonp-tck-2.1.1.zip)  ([sig](https://download.eclipse.org/jakartaee/jsonp/2.1/jakarta-jsonp-tck-2.1.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/jsonp/2.1/jakarta-jsonp-tck-2.1.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.json:jakarta.json-api:jar:2.1.3](https://search.maven.org/artifact/jakarta.json/jakarta.json-api/2.1.3/jar)
* [Change Log](./changelog)


# Compatible Implementations

* [Eclipse Parsson 1.1.2](https://github.com/eclipse-ee4j/parsson/releases/tag/1.1.2)

# Ballots

## Plan Review
The Specification Committee Ballot concluded successfully on 2021-06-22 with the following results.

| Representative                     | Representative for: |  Vote  |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |  +1    |
| Dan Bandera, Kevin Sutter          | IBM                 |  +1    |
| Ed Bratt, Dmitry Kornilov          | Oracle              |  +1    |
| Andrew Pielage, Matt Gill          | Payara              |  +1    |
| Scott Stark, Mark Little           | Red Hat             |  +1    |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |  +1    |
| Ivar Grimstad                      | EE4J PMC            |  +1    |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |  +1    |
| Werner Keil                        | Committer Members   |  +1    |
| Scott (Congquan) Wang              | Enterprise Members  |  +1    |
|                                    | **Total**           |  10 |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01870.html)

## Release Review
The Specification Committee Ballot concluded successfully on 2022-03-24 with the following results.

Release Review


| Representative                     | Representative for:     | Vote |
|------------------------------------|-------------------------|------|
| Kenji Kazumura                     | 	Fujitsu	              | +1   |
| Tom Watson, Emily Jiang            | 	IBM                   | +1   |
| Ed Bratt, Dmitry Kornilov          | 	Oracle                | +1   |
| Andrew Pielage, Petr Aubrecht      | 	Payara                | +1   |
| David Blevins, Jean-Louis Monteiro | 	Tomitribe             | +1   |
| Ivar Grimstad                      | 	EE4J PMC              | +1   |
| Marcelo Ancelmo, Martijn Verburg   | 	Participant Members   ||
| Werner Keil                        | 	Committer Members     ||
| Jun Qian                           | 	Enterprise Members    | +1   |
| Zhai Luchao                        | 	Enterprise Members    ||
|                                    | **Total**               | 7    |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02274.html)
