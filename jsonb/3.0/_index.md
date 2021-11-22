---
title: "Jakarta JSON Binding 3.0 (under development)"
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