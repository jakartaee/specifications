---
title: "Jakarta JSON Binding 3.0"
date: 2021-11-11
summary: "Release for Jakarta EE 10"
---
Jakarta JSON Binding defines a binding framework for converting Java(R) objects to and from JSON documents.

The goal of this release is to provide features requested by the community, such as:

* Deserialization of the null to the JsonValue.NULL_VALUE - [JSON-B API #181](https://github.com/eclipse-ee4j/jsonb-api/issues/181)
* @JsonbTypeDeserializer and @JsonbTypeAdapter supported as a parameter/type annotation - [JSON-B API #71](https://github.com/eclipse-ee4j/jsonb-api/issues/71)
* Support for handling polymorphic types - [JSON-B API #147](https://github.com/eclipse-ee4j/jsonb-api/issues/147)
* Deprecate @JsonbProperty.nillable() - [JSON-B API #52](https://github.com/eclipse-ee4j/jsonb-api/issues/52)

Including the following backwards incompatible changes:

* Optional @JsonbCreator parameters - [JSON-B API #121](https://github.com/eclipse-ee4j/jsonb-api/issues/121)

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta JSON Binding 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jsonb/releases/3.0.0)
* [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)

# Ballots

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