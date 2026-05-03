---
title: "Jakarta XML Binding 4.1 (under development)"
date: 2026-04-09
summary: "Release for Jakarta EE 12"
---

The Jakarta XML Binding provides an API and tools that automate the mapping
between XML documents and Java objects.

This release aims to remove Security Manager-related code from the API, along with implementing other changes
required by the Jakarta EE 12 platform.

### New features, enhancements or additions
<!-- List here -->
* Add @Repeatable to XmlJavaTypeAdapter, XmlElement, XmlElementRef and XmlSchemaType annotations

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Remove usages of and references to Security Manager

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta XML Binding 4.1 Release Record](https://projects.eclipse.org/projects/ee4j.jaxb/releases/4.1)
* [Jakarta XML Binding 4.1-M1 Specification Document](./jakarta-xml-binding-spec-4.1-M1.pdf) (PDF)
* [Jakarta XML Binding 4.1-M1 Specification Document](./jakarta-xml-binding-spec-4.1-M1.html) (HTML)
* [Jakarta XML Binding 4.1-M1 Javadoc](./apidocs)
* [Jakarta XML Binding 4.1-M1 XML Schema](https://jakarta.ee/xml/ns/jaxb/bindingschema_4_1.xsd)
* Maven coordinates
    * [jakarta.xml.bind:jakarta.xml.bind-api:jar:4.1.0-M1](https://central.sonatype.com/artifact/jakarta.xml.bind/jakarta.xml.bind-api/4.1.0-M1/jar)
<!--
* [Jakarta XML Binding 4.1 TCK](https://download.eclipse.org/jakartaee/xml-binding/4.1/jakarta-xml-binding-tck-4.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/xml-binding/4.1/jakarta-xml-binding-tck-4.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/xml-binding/4.1/jakarta-xml-binding-tck-4.1.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
    * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/xml-binding/4.1/)
-->

# Compatible Implementations
<!--
* [TBD](https://github.com/eclipse-ee4j/jaxb-ri)
-->

# Ballots

<!--
## Release Review

The Release Review Specification Committee Ballot concluded successfully on 2019-12-01 with the following results.

|                       |  Yes    | No      | Abstain  |
|-----------------------|---------|---------|----------|
|Fujitsu                |         |         |          |
|IBM                    |         |         |          |
|Oracle                 |         |         |          |
|Payara                 |         |         |          |
|Red Hat                |         |         |          |
|Tomitribe              |         |         |          |
|EE4J PMC               |         |         |          |
|Participant Members    |         |         |          |
|Committer Members      |         |         |          |
-->

## Plan Review

The Plan Review Specification Committee Ballot concluded successfully on 2026-04-25 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Emily Jiang, Tom Watson                        | IBM                 |    +1   |
| Dmitry Kornilov                                | Oracle              |    +1   |
| Andrew Pielage                                 | Payara              | no vote |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | no vote |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Arjan Tijms                                    | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  |    +1   |
|                                                | **Total**           |  **8**   |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Michael Redlich		                         | Community           |    +1   |
|                                                | **Total**           |  **1**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg04260.html)
