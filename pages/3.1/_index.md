---
title: "Jakarta Server Pages 3.1"
date: 2022-05-01
summary: "Release for Jakarta EE 10"
---
Jakarta Server Pages defines a template engine for web applications that supports mixing of textual content
(including HTML and XML) with custom tags, expression language, and embedded Java code, that gets compiled
into a Jakarta Servlet.

### New features, enhancements or additions
<!-- List here -->
* [40](https://github.com/eclipse-ee4j/jsp-api/issues/40) Add an option to raise a PropertyNotFoundException
when an EL expression contains an unknown identifier
* [42](https://github.com/eclipse-ee4j/jsp-api/issues/42) Clarify the meaning of 'scope' in the context of
scripting variables associated with custom actions
* [44](https://github.com/eclipse-ee4j/jsp-api/issues/44) Clarify that the EL environment within a JSP has a
set of default imports consistent with the default imports for the scripting environment. Refactor
the ScopedAttributeELResolver to remove the special handling for imports and unresolved
variables

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Deprecate methods that override ELResolver.getFeatureDescriptors() as that method has been
deprecated as of EL 5.0
* Deprecate the isThreadSafe page directive attribute as the related Servlet API interface
SingleThreadModel has been removed as of the Servlet 6.0 specification
* [226](https://github.com/eclipse-ee4j/jsp-api/issues/226) Deprecate the jsp:plugin action and related
actions as the associated HTML elements are no longer supported by any major borowser
 
### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Server Pages 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.jsp/releases/3.1.0)
  * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Server Pages 3.1 Specification Document](./jakarta-server-pages-spec-3.1.pdf) (PDF)
* [Jakarta Server Pages 3.1 Specification Document](./jakarta-server-pages-spec-3.1.html) (HTML)
* [Jakarta Server Pages 3.1 Javadoc](./apidocs)
* [Jakarta Server Pages 3.1 TCK](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip)([sig](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/pages/3.1/jakarta-pages-tck-3.1.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.pages:jakarta.pages-api:jar:3.1.0](https://central.sonatype.com/artifact/jakarta.servlet.jsp/jakarta.servlet.jsp-api/3.1.0/jar)

# Compatible Implementations

* [Eclipse WaSP 3.1.0-M3](https://github.com/eclipse-ee4j/wasp)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-05-15 with the following results.

| Representative                                 | Representative for: | Vote    |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Tom Watson, Emily Jiang                        | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Petr Aubrecht                  | Payara              |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  |    +1   |
|                                                | **Total**           |  **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02456.html).


## Plan Review

The Specification Committee Ballot concluded successfully on 2021-06-23 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                      | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                      | Payara              |  +1  |
| Scott Stark, Mark Little                       | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Dr. Jun Qian                                   | Enterprise Members  |  +1  |
|                                                | Total               |  10  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01876.html).
