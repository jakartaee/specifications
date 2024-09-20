---
title: "Jakarta XML Binding 4.0"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
The Jakarta XML Binding provides an API and tools that automate the mapping
between XML documents and Java objects.

### New features, enhancements or additions
<!-- List here -->
* adds implementation lookup through the properties Map passed to JAXBContext.newInstance(...) methods
* provided implementation of the DatatypeConverterInterface throws exception on invalid input
* adds https scheme to the list of required to be removed schemes when mapping namespace to java package
* fixes cross-references in the specification document

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* drops compatibility with JAXB 1.0
* removes constraints on using java.desktop/java.beans.Introspector
* removes deprecated jakarta.xml.bind.Validator
* removes deprecated jakarta.xml.bind.context.factory property
* drops implementation lookup through META-INF/services/jakarta.xml.bind.JAXBContext
* drops implementation lookup through jaxb.properties file

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta XML Binding 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.jaxb/releases/4.0)
    * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta XML Binding 4.0 Specification Document](./jakarta-xml-binding-spec-4.0.pdf) (PDF)
* [Jakarta XML Binding 4.0 Specification Document](./jakarta-xml-binding-spec-4.0.html) (HTML)
* [Jakarta XML Binding 4.0 Javadoc](./apidocs)
* [Jakarta XML Binding 3.0 XML Schema](https://jakarta.ee/xml/ns/jaxb/bindingschema_3_0.xsd)
* [Jakarta XML Binding 4.0 TCK](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
    * Addresses XML Binding Challenge (Issue [#82](https://github.com/jakartaee/jaxb-tck/issues/82))  [Jakarta XML Binding 4.0.1 TCK](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.1.zip)  ([sig](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
    * Allows certification on Java SE 21+  [Jakarta XML Binding 4.0.2 TCK](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.2.zip)  ([sig](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.2.zip.sig),  [sha](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.2.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.xml.bind:jakarta.xml.bind-api:jar:4.0.2](https://central.sonatype.com/artifact/jakarta.xml.bind/jakarta.xml.bind-api/4.0.2/jar)
* [Change Log](./changelog)

# Compatible Implementations

* [Jakarta XML Binding 4.0.0-M3](https://github.com/eclipse-ee4j/jaxb-ri/releases/tag/4.0.0-M3-RI)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-04-06 with the following results.

| Representative                                 | Representative for: | Vote    |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Tom Watson, Emily Jiang                        | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Matt Gill                      | Payara              |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  | no vote |
|                                                | **Total**           |  **9**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02321.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-06-07 with the following results.

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
|                                                | **Total**           |**10**|

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01841.html)
