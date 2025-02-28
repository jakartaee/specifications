---
title: "Jakarta Faces 4.1"
date: 2024-05-07
summary: "Release for Jakarta EE 11"
---
Jakarta Server Faces defines an MVC framework for building user interfaces for web applications,
including UI components, state management, event handing, input validation, page navigation, and
support for internationalization and accessibility.

The removes references to the SecurityManager, further aligns with CDI where possible, and provides various small enhancements and clarifications.

### New features, enhancements or additions
* Make FacesMessage#VALUES / VALUES_MAP generic
* Require firing events for @Initialized, @BeforeDestroyed, @Destroyed for build-in scopes
* Add missing generics to API that were missed in Faces 4.0
* Support @Inject of current flow like "@Inject Flow currentFlow"
* Add UUIDConverter
* Add ExternalContext.setResponseContentLengthLong
* Add rowStatePreserved property to UIRepeat, exactly the same as UIData
* Spec: jakarta.faces.FACELETS_REFRESH_PERIOD default when ProjectStage is Development
* FacesMessage: implement equals(), hashcode(), toString()

### Removals, deprecations or backwards incompatible changes
* Deprecate full state saving (FSS)
* Deprecate unused PreDestroyCustomScopeEvent and PostConstructCustomScopeEvent
* Deprecate unused composite:extension
* Remove references to the SecurityManager

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* [Jakarta Faces 4.1 Release Record](https://projects.eclipse.org/projects/ee4j.faces/releases/4.1)
  * [Jakarta EE 11 Platform Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)

* [Jakarta Faces 4.1 Specification Document](./jakarta-faces-4.1.pdf) (PDF)
* [Jakarta Faces 4.1 Specification Document](./jakarta-faces-4.1.html) (HTML)
* [Jakarta Faces 4.1 Javadoc](./apidocs)
* [Jakarta Faces 4.1 Jsdoc](./jsdoc)
* [Jakarta Faces 4.1 Renderkitdoc](./renderkitdoc)
* [Jakarta Faces 4.1 VDLDoc](./vdldoc)
* [Jakarta Faces 4.1 TCK](https://download.eclipse.org/jakartaee/faces/4.1/jakarta-faces-tck-4.1.1.zip) ([sig](https://download.eclipse.org/jakartaee/faces/4.1/jakarta-faces-tck-4.1.1.zip.sig), [sha](https://download.eclipse.org/jakartaee/faces/4.1/jakarta-faces-tck-4.1.1.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.faces:jakarta.faces-api:jar:4.1.1](https://central.sonatype.com/artifact/jakarta.faces/jakarta.faces-api/4.1.1/jar)

# Compatible Implementations

 * [Mojarra 4.1.1](https://github.com/eclipse-ee4j/mojarra/releases/tag/4.1.1-RELEASE)
    * [Eclipse Glassfish 8.0.0-M6](https://repo1.maven.org/maven2/org/glassfish/main/distributions/glassfish/8.0.0-M6/glassfish-8.0.0-M6.zip) (JDK 21)
    * [Eclipse Glassfish 8.0.0-JDK-17-M6](https://repo1.maven.org/maven2/org/glassfish/main/distributions/glassfish/8.0.0-JDK17-M6/) (JDK 17)

# Ballots
## Release Review

The Specification Committee Ballot concluded successfully on 2024-06-04 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **10** |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03381.html)


## Plan Review

The Specification Committee Ballot completed on 11th July 2023.
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |


The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02949.html)

## Release Review

TBD
