---
title: "Jakarta XML Registries Spec 1.0"
date: 2019-09-10
summary: "Initial version of the Jakarta XML Registries spec for Jakarta EE 8."
---
Jakarta XML Registries describes Java API’s designed specifically for an open and interoperable set of registry
services that enable sharing of information between interested parties.
The shared information is maintained as objects in a compliant registry.
All access to registry content is exposed via the interfaces defined for the Registry Services.

This specification is a re-release of [JSR 93](http://jcp.org/en/jsr/detail?id=93) under the [EFSL](https://www.eclipse.org/legal/efsl/).

* [Jakarta XML Registries 1.0 Specification Document](./xml-registries-spec-1.0.pdf) (PDF)
* [Jakarta XML Registries 1.0 Specification Document](./xml-registries-spec-1.0.html) (HTML)
* [Jakarta XML Registries 1.0 Javadoc](./apidocs)
* [Jakarta XML Registries 1.0 TCK](https://download.eclipse.org/jakartaee/xml-registries/1.0/jakarta-xml-registries-tck-1.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/xml-registries/1.0/jakarta-xml-registries-tck-1.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/xml-registries/1.0/jakarta-xml-registries-tck-1.0.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.xml.registry:jakarta.xml.registry-api:jar:1.0.10](https://central.sonatype.com/artifact/jakarta.xml.registry/jakarta.xml.registry-api/1.0.10/jar)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2019-09-04 with the following results.

|                       |  Yes    | No      | Abstain  |
|-----------------------|---------|---------|----------|
|Fujitsu                |   +1    |         |          |
|IBM                    |   +1    |         |          |
|Oracle                 |   +1    |         |          |
|Payara                 |   +1    |         |          |
|Red Hat                |   +1    |         |          |
|Tomitribe              |   +1    |         |          |
|EE4J PMC               |   +1    |         |          |
|Participant Members    |   +1    |         |          |
|Committer Members      |         |         |          |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00508.html)

# Compatible Implementations

* [Glassfish 5.1](https://projects.eclipse.org/projects/ee4j.glassfish/downloads)
