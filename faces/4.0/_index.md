---
title: "Jakarta Server Faces 4.0 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta Server Faces defines an MVC framework for building user interfaces for web applications,
including UI components, state management, event handing, input validation, page navigation, and
support for internationalization and accessibility.

The goal of this release is to start addressing a major concern that Faces is dragging along too much weight. This will be done by removing deprecated things. We also intend to continue modernizing by moving more things to CDI. Next to these big ticket items, we plan to add a small amount of features and refine the API.

More specifically:

Removing deprecated things:
* Removing JSP support as a VDL (deprecated since 2.0) - [FACES #1546](https://github.com/eclipse-ee4j/faces-api/issues/1546)
* Removing the native managed beans (deprecated since 2.3) - [FACES #1547](https://github.com/eclipse-ee4j/faces-api/issues/1547)
* Removing references to the native EL (deprecated since 1.2) - [FACES #1548](https://github.com/eclipse-ee4j/faces-api/issues/1548)
* Default "Fakes Faces 2.2"-mode (defaulting to the current version instead)
* Rename "jsf" everywhere to "faces" [FACES #1552](https://github.com/eclipse-ee4j/faces-api/issues/1552)

Continue re-basing on CDI:
* CDI events 
* Internal artefacts as CDI beans
* Additional artefacts injectable


Features
* Extensionless views by default [FACES #1508](https://github.com/eclipse-ee4j/faces-api/issues/1508)
* New scope ClientWindowScoped [FACES #1509](https://github.com/eclipse-ee4j/faces-api/issues/1509)
* Allow redirect via Annotation on action [FACES #1554](https://github.com/eclipse-ee4j/faces-api/issues/1554)
* New lifecycle for REST/REST-like actions (for cases where view action with empty page is used now)
* Simplified API for setting FacesMessages
* First class support for creating views in Java
* Stateless views as global option
* Annotations for various things such as components (replaces/is alternative for bulky taglib registrations)
   
API enhancements:
* StateHelper - Allow a Supplier as defaultValue
* PhaseListener - default methods
* Renderer -  generic/parameterized
* Remove duplicate SessionMap annotation
* API to register custom behavior for a composite

New deprecations:
* Full State Saving

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta Faces 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.faces/releases/4.0)

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