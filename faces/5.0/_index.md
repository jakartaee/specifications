---
title: "Jakarta Faces 5.0 (Under development)"
date: 2025-10-22
summary: "Release for Jakarta EE 12"
---

Jakarta Server Faces defines an MVC framework for building user interfaces for web applications,
including UI components, state management, event handing, input validation, page navigation, and
support for internationalization and accessibility.

A complete list of issues and pull requests for this version can be viewed using [Faces 5.0 Milestone](https://github.com/jakartaee/faces/milestone/22) 

Interested parties can join in the evolution/discussion in at least the following ways:

* Star the repository at https://github.com/jakartaee/faces
* Join the -dev list at https://accounts.eclipse.org/mailing-list/faces-dev
* Comment on the Faces issue tracker at https://github.com/jakartaee/faces/issues

### New features, enhancements or additions
<!-- List here -->
Currently suggested topics includes:
* All issues marked with EE12 without "remove legacy" in the Faces issue tracker


### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* All issues marked with EE12 and "remove legacy" or "backwards incompatible" in the Faces issue tracker  

### TCK What will be changed or not changed in 5.0.
 * We hope to get rid of the so-called "old" tests, which are tests using the javatest framework and Ant.
    * For this we will try the same approach as the platform TCK took to convert tests using an open rewrite script 
 * We will otherwise keep the testing structure intact, but *may* look at revising the distribution format into a binary
   only format (currently we ship as source, since it concerns maven modules)
 * We will need to evaluate the current dependency of Selenium on the "system installed version of Chrome". This is very troublesome, and we need to find some workaround for this.


### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 21 or higher**

# Details

* [Jakarta Faces 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.faces/releases/5.0)

<!--
The following can be uncommented and version information updated as they become available.

* [Jakarta Faces 5.0 Specification Document](./jakarta-faces-5.0.pdf) (PDF)
* [Jakarta Faces 5.0 Specification Document](./jakarta-faces-5.0.html) (HTML)
* [Jakarta Faces 5.0 Javadoc](./apidocs)
* [Jakarta Faces 5.0 Jsdoc](./jsdoc)
* [Jakarta Faces 5.0 Renderkitdoc](./renderkitdoc)
* [Jakarta Faces 5.0 VDLDoc](./vdldoc)
* [Jakarta Faces 5.0 TCK](https://download.eclipse.org/jakartaee/faces/5.0/jakarta-faces-tck-5.0.1.zip) ([sig](https://download.eclipse.org/jakartaee/faces/5.0/jakarta-faces-tck-5.0.1.zip.sig), [sha](https://download.eclipse.org/jakartaee/faces/5.0/jakarta-faces-tck-5.0.1.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.faces:jakarta.faces-api:jar:5.0.1](https://central.sonatype.com/artifact/jakarta.faces/jakarta.faces-api/5.0.0/jar)
* [Jakarta Faces 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.faces/releases/5.0)


* Schemas
  * no plans yet TBD
  
-->

# Compatible Implementations

* [Mojarra 5.0.0] TBD

# Ballots

## Release Review

The Specification Committee Ballot is TBD.


## Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-09 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Emilly Jiang, Tom Watson                       | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Petr Aubrecht                  | Payara              |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Jun Qian                                       | Enterprise Members  |  +1  |
| Zhai Luchao                                    | Enterprise Members  |  +1  |
|                                                | **Total**           |**10**|

| Non-binding votes                              |                     | Vote |
|------------------------------------------------|---------------------|------|
| Angelo Rubini                                  | Community           |  +1  |
|                                                | **Total**           | **1**|

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03718.html)

