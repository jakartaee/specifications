---
title: "Jakarta Faces 5.0 (Under development)"
date: 2025-05-22
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

### Big ticket features

- [#590 CSP support](https://github.com/jakartaee/faces/issues/1590)
- [#1507 Enhance UIInput events with HTML5 like oninput](https://github.com/jakartaee/faces/issues/1507)

### API modernization, generics, and enum support

- [#206 Make SelectItem#value generic](https://github.com/jakartaee/faces/issues/206)
- [#912 FacesMessage.Severity should be Serializable](https://github.com/jakartaee/faces/issues/912)
- [#1592 Add new FacesMessage Severity "SUCCESS"](https://github.com/jakartaee/faces/issues/1592)
- [#1822 Missing Generics in Faces Standard Converters](https://github.com/jakartaee/faces/issues/1822)
- [#1824 Create TypeLiteral Constants](https://github.com/jakartaee/faces/issues/1824)
- [#1831 String based context params having fixed set of allowed values should be represented by enums](https://github.com/jakartaee/faces/issues/1831)
- [#1934 Migrate FacesMessage.Severity to ENUM](https://github.com/jakartaee/faces/issues/1934)
- [#1938 EnumConverter - try to dynamically extract enum type from ValueExpression](https://github.com/jakartaee/faces/issues/1938)
- [#1948 5:0 Migrate PhaseId to ENUM](https://github.com/jakartaee/faces/issues/1948)
- [#1950 5.0: Missing generics in Faces Standard Validators](https://github.com/jakartaee/faces/issues/1950)
- [#2012 UIComponent getFacesListeners: Class => Class<? extends FacesListener>](https://github.com/jakartaee/faces/issues/2012)
- [#2026 Better implement generics in Application#createConverter and createValidator](https://github.com/jakartaee/faces/issues/2026)
- [#2027 Better implement generics in UIData#getDataModel](https://github.com/jakartaee/faces/issues/2027)
- [#2028 StateHelper: make methods generics aware](https://github.com/jakartaee/faces/issues/2028)
- [#2033 Add generics to ValueChangeEvent for oldValue and newValue](https://github.com/jakartaee/faces/issues/2033)
- [#2034 Extend UIComponent#getFacet for using enums](https://github.com/jakartaee/faces/issues/2034)

### API cleanup, removals, and refactoring

- [#1462 Add PartialResponseWriterWrapper](https://github.com/jakartaee/faces/issues/1462)
- [#1725 Remove UIComponent.bindings field and rename PropertyKeys.bindings to PropertyKeys.valueExpressions](https://github.com/jakartaee/faces/issues/1725)
- [#1830 Faces 5.0: remove things marked @Deprecated(forRemoval = true, since = "4.0")](https://github.com/jakartaee/faces/issues/1830)
- [#1833 Unify NavigationHandler and ConfigurableNavigationHandler](https://github.com/jakartaee/faces/issues/1833)
- [#1839 API will be split off from the implementation code - step 1](https://github.com/jakartaee/faces/issues/1839)
- [#1861 Introduce FacesServletFactory](https://github.com/jakartaee/faces/issues/1861)
- [#1871 Remove deprecated code (composite:extension, PreDestroyCustomScopeEvent, PostConstructCustomScopeEvent)](https://github.com/jakartaee/faces/issues/1871)
- [#1937 Remove unused jakarta.faces.event.ScopeContext](https://github.com/jakartaee/faces/issues/1937)
- [#1972 Consider deprecating and dropping h:form prependId](https://github.com/jakartaee/faces/issues/1972)
- [#2008 TextHandler should extends FaceletHandler](https://github.com/jakartaee/faces/issues/2008)
- [#2015 FaceletContext: add static utility methods getCurrentInstance() and getCurrentInstance(FacesContext context) ](https://github.com/jakartaee/faces/issues/2015)
- [#2024 Add StateHelper#computeIfAbsent](https://github.com/jakartaee/faces/issues/2024)
- [#2031 Should we introduce UIComponent#getFacetNames()?](https://github.com/jakartaee/faces/issues/2031)

### CDI, EL, Facelets, and event integration

- [#1202 cc:attributes type attribute: fallback case: use what the ELResolver returns.](https://github.com/jakartaee/faces/issues/1202)
- [#1244 Reword requirements for EL expressions inlined in Facelets pages, but outside of components.](https://github.com/jakartaee/faces/issues/1244)
- [#1368 EL import handler doesn't work](https://github.com/jakartaee/faces/issues/1368)
- [#1443 CDI: Allow listing to PhaseEvents via @Observes](https://github.com/jakartaee/faces/issues/1443)
- [#1466 importConstants should be allowed everywhere, not only in f:metadata](https://github.com/jakartaee/faces/issues/1466)
- [#1501 CDI: Allow non-component Faces events observeable by CDI](https://github.com/jakartaee/faces/issues/1501)
- [#1564 Clarify EL / CDI integration: implicit object or CDI producer for artifacts without required inject point support (request, session, component, cc)](https://github.com/jakartaee/faces/issues/1564)
- [#1954 Specify that expression language 6.0 Optional and Record resolvers should be in chain](https://github.com/jakartaee/faces/issues/1954)

### Lifecycle, view handling, metadata, and state/reset behavior

- [#816 ViewHandler.initView() called too late](https://github.com/jakartaee/faces/issues/816)
- [#1160 Clarify intended workings of includeViewParams](https://github.com/jakartaee/faces/issues/1160)
- [#1709 Spec: Missing description of jakarta.faces.AUTOMATIC_EXTENSIONLESS_MAPPING parameter](https://github.com/jakartaee/faces/issues/1709)
- [#1713 ui:repeat clarification on attributes, such as offset and size](https://github.com/jakartaee/faces/issues/1713)
- [#1835 Clarification: Firing of PostAddToViewEvent during Restore View Phase](https://github.com/jakartaee/faces/issues/1835)
- [#1849 Specify what Faces should do when f:metadata is not a direct child of f:view](https://github.com/jakartaee/faces/issues/1849)
- [#1883 Enhance UIViewRoot#resetValues() to pass VisitHints](https://github.com/jakartaee/faces/issues/1883)
- [#1936 ResetValues: UIViewRoot#resetValues() Must walk all children components and reset ](https://github.com/jakartaee/faces/issues/1936)
- [#1940 Add clearModel to f:resetValues](https://github.com/jakartaee/faces/issues/1940)
- [#1999 StateManager#STATE_SAVING_METHOD_PARAM_NAME specifies wrong default](https://github.com/jakartaee/faces/issues/1999)

### Components, rendering, resources, and validation behavior

- [#583 Message/Messages Rendering When No Messages](https://github.com/jakartaee/faces/issues/583)
- [#908 StylesheetRenderer RenderKit Docs Request Path Rendering](https://github.com/jakartaee/faces/issues/908)
- [#1278 UIInput.validateValue() oversteps its authority](https://github.com/jakartaee/faces/issues/1278)
- [#1366 Within Resource Identifier, allow resourceName to have path separator](https://github.com/jakartaee/faces/issues/1366)
- [#1415 Broken link in JSF vdldocs, to "General Notes on Encoding"](https://github.com/jakartaee/faces/issues/1415)
- [#1791 SelectItems: var attribute is not honored when using f:selectItems](https://github.com/jakartaee/faces/issues/1791)
- [#1875 UISelectItems: missing method setVar simialr as in class UIData](https://github.com/jakartaee/faces/issues/1875)
- [#2014 Documentation for group attribute of h:selectOneRadio needs improvement](https://github.com/jakartaee/faces/issues/2014)
- [#2025 Add placeholder attribute to h:inputText and h:inputTextarea](https://github.com/jakartaee/faces/issues/2025)
- [#2029 ByteConverter: incorrect error message](https://github.com/jakartaee/faces/issues/2029)
- [#2032 Allow passthrough on facets](https://github.com/jakartaee/faces/issues/2032)
- [#2041 BeanValidator should use EL-coerced value as bean property value](https://github.com/jakartaee/faces/issues/2041)

### Security, configuration, compatibility, and specification/documentation fixes

- [#1112 Security bug with FacesContext in application startup](https://github.com/jakartaee/faces/issues/1112)
- [#1201 Require that the cookie used to store the Flash key is setHttpOnly(true)](https://github.com/jakartaee/faces/issues/1201)
- [#1457 11.4.6 should specify "search-expression-context-factory"  rather than "search-expression-context-kit-factory"](https://github.com/jakartaee/faces/issues/1457)
- [#1460 JSF 2.3 spec section 2.5.2.1 typo](https://github.com/jakartaee/faces/issues/1460)
- [#2097 Add EXCEPTION_TYPES_TO_IGNORE_IN_LOGGING context param](https://github.com/jakartaee/faces/issues/2097)
- [#2105 Remove support for old xml namespaces](https://github.com/jakartaee/faces/issues/2105)


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


* [Jakarta Faces 5.0 M1 Specification Document](./jakarta-faces-5.0-M1.pdf) (PDF)
* [Jakarta Faces 5.0 M1 Specification Document](./jakarta-faces-5.0-M1.html) (HTML)
* [Jakarta Faces 5.0 M1 Javadoc](./apidocs)
* [Jakarta Faces 5.0 M1 Tsdoc](./tsdoc)
* [Jakarta Faces 5.0 M1 Renderkitdoc](./renderkitdoc)
* [Jakarta Faces 5.0 M1 VDLDoc](./vdldoc)
* Maven coordinates
  * [jakarta.faces:jakarta.faces-api:jar:5.0.0-M1](https://central.sonatype.com/artifact/jakarta.faces/jakarta.faces-api/5.0.0-M1)
* [Jakarta Faces 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.faces/releases/5.0)


* Schemas
  * no plans yet TBD
  

# Compatible Implementations

* [Mojarra 5.0.0] (Mojarra 5.0.0-M1 implements Faces 5.0-M1)

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

