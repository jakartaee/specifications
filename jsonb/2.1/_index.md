---
title: "Jakarta JSON Binding 2.1 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta JSON Binding defines a binding framework for converting Java(R) objects to and from JSON documents.

The goal of this release is to provide features requested by the community, such as:

* Deserialization of the null to the JsonValue.NULL_VALUE - [JSON-B API #181](https://github.com/eclipse-ee4j/jsonb-api/issues/181)
* @JsonbTypeDeserializer and @JsonbTypeAdapter supported as a parameter/type annotation - [JSON-B API #71](https://github.com/eclipse-ee4j/jsonb-api/issues/71)
* Support for handling polymorphic types - [JSON-B API #147](https://github.com/eclipse-ee4j/jsonb-api/issues/147)
* TypeToken implementation - [JSON-B API #165](https://github.com/eclipse-ee4j/jsonb-api/issues/165)
* Default PropertyVisibilityStrategy implementations - [JSON-B API #164](https://github.com/eclipse-ee4j/jsonb-api/issues/164)
* Customization of the classes via configuration - [JSON-B API #88](https://github.com/eclipse-ee4j/jsonb-api/issues/88)
* Optional MicroProfile Configuration support - [JSON-B API #172](https://github.com/eclipse-ee4j/jsonb-api/issues/172)
* AnnotatedType deserialization method on Jsonb and JsonbTypeDeserializer - [JSON-B API #66](https://github.com/eclipse-ee4j/jsonb-api/issues/66)
* Class level annotation for PropertyNamingStrategy definition - [JSON-B API #46](https://github.com/eclipse-ee4j/jsonb-api/issues/46)
* Deprecate @JsonbProperty.nillable() - [JSON-B API #52](https://github.com/eclipse-ee4j/jsonb-api/issues/52)

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta JSON Binding 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.jsonb/releases/2.1.0)

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