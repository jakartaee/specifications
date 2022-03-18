---
title: "Jakarta JSON Binding 3.0"
date: 2021-11-11
summary: "Release for Jakarta EE 10"
---
Jakarta JSON Binding defines a binding framework for converting Java(R) objects to and from JSON documents.

This release contains following changes:

* Deserialization of the null to the JsonValue.NULL_VALUE
* @JsonbTypeDeserializer and @JsonbTypeAdapter supported as a parameter/type annotation
* Support for handling polymorphic types
* Deprecate @JsonbProperty.nillable()

Including the following backwards incompatible changes:

* Optional @JsonbCreator parameters

This release requires Java SE 11 or newer (aligned with Jakarta EE 10).

* [Jakarta JSON Binding 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jsonb/releases/3.0.0)
  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta JSON Binding 3.0 Specification Document](./jakarta-jsonb-spec-3.0.pdf) (PDF)
* [Jakarta JSON Binding 3.0 Specification Document](./jakarta-jsonb-spec-3.0.html) (HTML)
* [Jakarta JSON Binding 3.0 Javadoc](./apidocs)
* [Jakarta JSON Binding 3.0 TCK](https://download.eclipse.org/jakartaee/jsonb/3.0/jakarta-jsonb-tck-3.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/jsonb/3.0/jakarta-jsonb-tck-3.0.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/jsonb/3.0/jakarta-jsonb-tck-3.0.0.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.json.bind:jakarta.json.bind-api:jar:3.0.0](https://search.maven.org/artifact/jakarta.json.bind/jakarta.json.bind-api/3.0.0/jar)

# Compatible Implementations

* [Eclipse Yasson 3.0.0-RC1](https://github.com/eclipse-ee4j/yasson/releases/tag/3.0.0-RC1)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-03-15 with the following results.

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
| Jun Qian                                       | Enterprise Members  | no vote|
| Zhai Luchao                                    | Enterprise Members  |    +1  |
|                                                | **Total**           | **9** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02255.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-11-18 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Kevin Sutter, Tom Watson                       | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Matt Gill                      | Payara              |    +1   |
| Scott Stark, Mark Little                       | Red Hat             |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  |    +1   |
|                                                | **Total**           |  **11** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02028.html)