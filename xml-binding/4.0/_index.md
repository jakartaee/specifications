---
title: "Jakarta XML Binding 4.0"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
The Jakarta XML Binding provides an API and tools that automate the mapping
between XML documents and Java objects.

The goal of this release is to:

* provide features requested by the community
* implement requirements by other specification included in Jakarta EE 10
* drop explicit dependency on JavaBeans (Has transitive relationship to any dependent specifications; major API change)
* editorial updates, clarifications and removal of JAXB 1 from the specification (May have transitive relationship to any dependent specifications; major API change)

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta XML Binding 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.jaxb/releases/4.0)
    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta XML Binding 4.0 Specification Document](./jakarta-xml-binding-spec-4.0.pdf) (PDF)
* [Jakarta XML Binding 4.0 Specification Document](./jakarta-xml-binding-spec-4.0.html) (HTML)
* [Jakarta XML Binding 4.0 Javadoc](./apidocs)
* [Jakarta XML Binding 3.0 XML Schema](https://jakarta.ee/xml/ns/jaxb/bindingschema_3_0.xsd)
* [Jakarta XML Binding 4.0 TCK](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/xml-binding/4.0/jakarta-xml-binding-tck-4.0.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.xml.bind:jakarta.xml.bind-api:jar:4.0.0](https://search.maven.org/artifact/jakarta.xml.bind/jakarta.xml.bind-api/4.0.0/jar)

# Ballots

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
