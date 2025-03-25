---
title: "Jakarta Faces 5.0 (Under development)"
date: 2025-10-22
summary: "Release for Jakarta EE 12"
---

Jakarta Server Faces defines an MVC framework for building user interfaces for web applications,
including UI components, state management, event handing, input validation, page navigation, and
support for internationalization and accessibility.

A complete list of issues and pull requests for this version can be viewed using [Faces 5.0 Milestone](https://github.com/jakartaee/faces/milestone/22) 

### New features, enhancements or additions
<!-- List here -->
Currently suggested topics includes:
* API will be split off from the implementation code
* Some kind of improved state management; allowing the application code to manually restore/recompute state
* Introduce FacesServletFactory
* Add context param attributes to @FacesConfig
* Add missing Generics
* Unify NavigationHandler and ConfigurableNavigationHandler
* Enhance UIViewRoot#resetValues() to pass VisitHints
* Migrate phase id to enum 
* Enhance UIViewRoot#resetValues() to pass VisitHints
* UIViewRoot#resetValues Must walk all child components 
* Add new @BeforePhase and @AfterPhase PhaseEvent qualifiers 
* Add PartialResponseWriterWrapper 
* Add type literal constants for annotation literals of generic types 
* Allow listing to PhaseEvents via @Observes
* Automatically pass through all on* event attributes 
* Add new FacesMessage Severity "SUCCESS"
* Specify that expression language 6.0 Optional and Record resolvers should be in chain
* Allow non-component Faces events observeable by CDI
* Fire faces system events via CDI as well 
* TextHandler should extends FaceletHandler
* FaceletContext: add static utility methods
* Formalize "abandoned flows" in spec
* Add clearModel to f:resetValues
* Specify what Faces should do when f:metadata is not a direct child of f:view
* ui:repeat clarification on attributes, such as offset and size
* Fix behavior attachment for composites / provide an API
* Allow refreshable ValueExpression for validator/converter/behavior tags


### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Remove UIComponent.bindings field and rename PropertyKeys.bindings to PropertyKeys.valueExpressions
* Remove unused jakarta.faces.event.ScopeContext
* Remove deprecated code (composite:extension, PreDestroyCustomScopeEvent, PostConstructCustomScopeEvent)
* Remove things marked @Deprecated(forRemoval = true, since = "4.0") and higher (since 4.1)
* Evaluate everything marked @Deprecated (without the "forRemoval" attribute) and remove as much as we can. Potentially mark already deprecated things "forRemoval" in this release.
* Remove class scanning and rely on CDI only?
* Deprecate phase id (see migrate phase id to enum)
* Deprecating h:form prependId 
* Fix StateManager#STATE_SAVING_METHOD_PARAM_NAME specifies wrong default

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

# Compatible Implementations

* [Mojarra 5.0.0] TBD

# Ballots

## Release Review

The Specification Committee Ballot is TBD.


## Plan Review

The Specification Committee Ballot is TBD.

