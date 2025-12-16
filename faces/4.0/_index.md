---
title: "Jakarta Faces 4.0"
date: 2022-05-18
summary: "Release for Jakarta EE 10"
---
Jakarta Faces defines an MVC framework for building user interfaces for web applications,
including UI components, state management, event handing, input validation, page navigation, and
support for internationalization and accessibility.

### New features, enhancements or additions
<!-- List here -->
* [Issue #1581](https://github.com/eclipse-ee4j/faces-api/issues/1581): New API to programmatically create Facelets
* [Issue #1508](https://github.com/eclipse-ee4j/faces-api/issues/1508): New automatic extensionless mapping
* [Issue #1509](https://github.com/eclipse-ee4j/faces-api/issues/1509): New annotation @ClientWindowScoped
* [Issue #1570](https://github.com/eclipse-ee4j/faces-api/issues/1570): Support custom cookie attributes such as SameSite in ExternalContext#addResponseCookie()
* [Issue #1555](https://github.com/eclipse-ee4j/faces-api/issues/1555): New attribute &lt;h:inputFile multiple="...">
* [Issue #1556](https://github.com/eclipse-ee4j/faces-api/issues/1556): New attribute &lt;h:inputFile accept="...">
* [Issue #1557](https://github.com/eclipse-ee4j/faces-api/issues/1557): New method FacesContext#getLifecycle()
* [Issue #1559](https://github.com/eclipse-ee4j/faces-api/issues/1559): New tag &lt;f:selectItemGroups>
* [Issue #1560](https://github.com/eclipse-ee4j/faces-api/issues/1560): New attribute &lt;h:inputText type="...">
* [Issue #1563](https://github.com/eclipse-ee4j/faces-api/issues/1563): New tag &lt;f:selectItemGroup>
* [Issue #1568](https://github.com/eclipse-ee4j/faces-api/issues/1568): New method UIViewRoot#getDoctype()
* [Issue #1573](https://github.com/eclipse-ee4j/faces-api/issues/1573): New attribute &lt;f:websocket onerror="...">
* [Issue #1574](https://github.com/eclipse-ee4j/faces-api/issues/1574): New layout="list" for &lt;h:selectManyCheckbox> and &lt;h:selectOneRadio>
* [Issue #1582](https://github.com/eclipse-ee4j/faces-api/issues/1582): New annotation literals for all @Qualifiers
* [Issue #1558](https://github.com/eclipse-ee4j/faces-api/issues/1558): Make UIComponent#subscribeToEvent() more convenient
* [Issue #1565](https://github.com/eclipse-ee4j/faces-api/issues/1565): Skip type attribute from &lt;link> and &lt;script> when doctype is HTML5
* [Issue #1567](https://github.com/eclipse-ee4j/faces-api/issues/1567): Improve &lt;f:ajax> behavior in composite components

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* [Issue #1552](https://github.com/eclipse-ee4j/faces-api/issues/1552): Rename "JSF" to "Faces" over all place
* [Issue #1553](https://github.com/eclipse-ee4j/faces-api/issues/1553): Rename "http://xmlns.jcp.org/jsf/*" URL to "jakarta.faces.*" URN
* [Issue #1546](https://github.com/eclipse-ee4j/faces-api/issues/1546): Remove all JSP support
* [Issue #1547](https://github.com/eclipse-ee4j/faces-api/issues/1547): Remove native Managed Beans (@ManagedBean and related)
* [Issue #1548](https://github.com/eclipse-ee4j/faces-api/issues/1548): Remove MethodBinding, ValueBinding and friends
* [Issue #1571](https://github.com/eclipse-ee4j/faces-api/issues/1571): Remove CURRENT_COMPONENT constants from UIComponent class
* [Issue #1578](https://github.com/eclipse-ee4j/faces-api/issues/1578): Remove deprecated methods of StateManager class
* [Issue #1583](https://github.com/eclipse-ee4j/faces-api/issues/1583): Remove entire ResourceResolver class

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Faces 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.faces/releases/4.0)
    * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10#jakarta-ee-10-release-plan)
* [Jakarta Faces 4.0 Specification Document](./jakarta-faces-4.0.pdf) (PDF)
* [Jakarta Faces 4.0 Specification Document](./jakarta-faces-4.0.html) (HTML)
* [Jakarta Faces 4.0 Javadoc](./apidocs)
* [Jakarta Faces 4.0 Jsdoc](./jsdoc)
* [Jakarta Faces 4.0 Renderkitdoc](./renderkitdoc)
* [Jakarta Faces 4.0 VDLDoc](./vdldoc)
* [Jakarta Faces 4.0 TCK](https://download.eclipse.org/jakartaee/faces/4.0/jakarta-faces-tck-4.0.4.zip)([sig](https://download.eclipse.org/jakartaee/faces/4.0/jakarta-faces-tck-4.0.4.zip.sig),[sha](https://download.eclipse.org/jakartaee/faces/4.0/jakarta-faces-tck-4.0.4.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/faces/4.0/)
* Maven coordinates
  * [jakarta.faces:jakarta.faces-api:jar:4.0.1](https://central.sonatype.com/artifact/jakarta.faces/jakarta.faces-api/4.0.1/jar)

# Compatible Implementations

* [Mojarra 4.0.4](https://github.com/eclipse-ee4j/mojarra/releases/download/4.0.4-RELEASE/jakarta.faces-4.0.4.jar)

# Ballots
## Release Review

The Specification Committee Ballot concluded successfully on 2022-05-18 with the following results.

| Representative                                 | Representative for: | Vote   |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |    +1  |
| Tom Watson, Emily Jiang                        | IBM                 |    +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1  |
| Andrew Pielage, Petr Aubrecht                  | Payara              |    +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1  |
| Ivar Grimstad                                  | EE4J PMC            |    +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1  |
| Werner Keil                                    | Committer Members   | no vote|
| Jun Qian                                       | Enterprise Members  |    +1  |
| Zhai Luchao                                    | Enterprise Members  |    +1  |
|                                                | **Total**           |  **9** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02500.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-04 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Dan Bandera, Kevin Sutter                      | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Matt Gill                      | Payara              |   +1    |
| Scott Stark, Mark Little                       | Red Hat             |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | no vote |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Dr. Jun Qian                                   | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01624.html)

## Release Review


