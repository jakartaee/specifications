---
title: "Jakarta Faces 4.1 (under development)"
date: 2023-05-30
summary: "Release for Jakarta EE 11"
---
Jakarta Server Faces defines an MVC framework for building user interfaces for web applications,
including UI components, state management, event handing, input validation, page navigation, and
support for internationalization and accessibility.

The release removes references to the SecurityManager, further aligns with CDI where possible, and provides various small enhancements and clarifications.

### New features, enhancements or additions
* Make FacesMessage#VALUES / VALUES_MAP generic
* Require firing events for @Initialized, @BeforeDestroyed, @Destroyed for build-in scopes
* Remove unused PreDestroyCustomScopeEvent and PostConstructCustomScopeEventAdd missing generics to API that were missed in Faces 4.0
* Setting/overriding components default value
* <f:ajax> execute="@this" and render="@this" does not behave as expected when nested in composite component
* Re-add #{request} in CDI mode
* Enhance UIInput events with HTML5 like oninput
* importConstants should be allowed everywhere, not only in f:metadata
* Support @Inject of current flow like "@Inject Flow currentFlow"
* Make SelectItem#value generic Component: Components/Renderers

### Removals, deprecations or backwards incompatible changes
* Remove class scanning and rely on CDI only
* Remove unused PreDestroyCustomScopeEvent and PostConstructCustomScopeEvent
* Remove unused composite:extension
* Remove references to the SecurityManager

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* [Jakarta Faces 4.1 Release Record](https://projects.eclipse.org/projects/ee4j.faces/releases/4.1)

<!--
The following can be uncommented and version information updated as they become available.

* [Jakarta Faces 4.1 Specification Document](./jakarta-faces-5.0.pdf) (PDF)
* [Jakarta Faces 4.1 Specification Document](./jakarta-faces-5.0.html) (HTML)
* [Jakarta Faces 4.1 Javadoc](./apidocs)
* [Jakarta Faces 4.1 Jsdoc](./jsdoc)
* [Jakarta Faces 4.1 Renderkitdoc](./renderkitdoc)
* [Jakarta Faces 4.1 VDLDoc](./vdldoc)
* [Jakarta Faces 4.1 TCK](https://download.eclipse.org/jakartaee/faces/4.1/jakarta-faces-tck-4.1.0.zip)([sig](https://download.eclipse.org/jakartaee/faces/4.1/jakarta-faces-tck-4.1.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/faces/4.1/jakarta-faces-tck-4.1.0.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
-->

# Compatible Implementations

* Mojarra 4.1 (TBC)

# Ballots

## Plan Review

TBD

## Release Review

TBD
