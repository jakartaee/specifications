---
title: "Jakarta XML Web Services 4.0"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta XML Web Services defines a means for implementing XML-Based Web Services
based on Jakarta SOAP with Attachments and Jakarta Web Services Metadata.

The release contains following changes:

* annotates jakarta.xml.ws.AsyncHandler with @FunctionalInterface
* extends jakarta.xml.ws.wsaddressing.W3CEndpointReference API with getters
* drops implementation lookup through the "jaxws.properties" configuration file
* makes implementation lookup through the system property as the first step
* removes required fallback to some default implementation from the implementation lookup
* folds Jakarta Web Services Metadata Specification into this/Jakarta Web Services Specification (Jakarta Web Services Metadata Specification is no longer available as a standalone API/project/jar)

Requires Java SE 11 or newer (aligned with Jakarta EE 10).

* [Jakarta XML Web Services 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.jaxws/releases/4.0-jakarta-xml-web-services)
    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta XML Web Services 4.0 Specification Document](./jakarta-xml-ws-spec-4.0.pdf) (PDF)
* [Jakarta XML Web Services 4.0 Specification Document](./jakarta-xml-ws-spec-4.0.html) (HTML)
* [Jakarta XML Web Services 4.0 Javadoc](./apidocs)
* [Jakarta XML Web Services 4.0 XML Schema](https://jakarta.ee/xml/ns/jaxws/wsdl_customizationschema_3_0.xsd)
* [Jakarta XML Web Services 4.0 TCK](https://download.eclipse.org/jakartaee/xml-web-services/4.0/jakarta-xml-ws-tck-4.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/xml-web-services/4.0/jakarta-xml-ws-tck-4.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/xml-web-services/4.0/jakarta-xml-ws-tck-4.0.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.xml.ws:jakarta.xml.ws-api:jar:4.0.0](https://search.maven.org/artifact/jakarta.xml.ws/jakarta.xml.ws-api/4.0.0/jar)

# Compatible Implementations

* [Eclipse Implementation of XML Web Services 4.0.0-M3](https://github.com/eclipse-ee4j/metro-jax-ws/releases/tag/4.0.0-M3)
* [Eclipse Metro 4.0.0-M3](https://github.com/eclipse-ee4j/metro-wsit/releases/tag/4.0.0-M3)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-17 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Dan Bandera, Kevin Sutter                      | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Matt Gill                      | Payara              |    +1   |
| Scott Stark, Mark Little                       | Red Hat             | no vote |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Dr. Jun Qian                                   | Enterprise Members  |    +1   |
|                                                | **Total**           |   **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01658.html)
