---
title: "Jakarta Web Services Metadata 3.0"
date: 2020-08-05
summary: "Release for Jakarta EE 9"
---
Jakarta Web Services Metadata defines a programming model for Web Services in Java,
use of metadata, a non-normative processing model for metadata annotated web service
source files, runtime requirements for a container, and annotations used for WSDL,
binding, and configuration.

### New features, enhancements or additions
<!-- List here -->
* Moved to the `jakarta.*` namespace

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 8 or higher**

# Details

* [Jakarta Web Services Metadata 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jaxws/releases/3.0-jakarta-web-services-metadata)
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Web Services Metadata 3.0 Specification Document](./ws-metadata-spec-3.0.pdf) (PDF)
* [Jakarta Web Services Metadata 3.0 Specification Document](./ws-metadata-spec-3.0.html) (HTML)
* [Jakarta Web Services Metadata 3.0 Javadoc](./apidocs)
* [Jakarta Web Services Metadata 3.0 XML Schema](https://jakarta.ee/xml/ns/jakartaee/jakartaee_web_services_metadata_handler_3_0.xsd)
* [Jakarta Web Services Metadata 3.0 TCK](https://download.eclipse.org/jakartaee/xml-web-services/3.0/jakarta-xml-ws-tck-3.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/xml-web-services/3.0/jakarta-xml-ws-tck-3.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/xml-web-services/3.0/jakarta-xml-ws-tck-3.0.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.jws:jakarta.jws-api:jar:3.0.0](https://search.maven.org/artifact/jakarta.jws/jakarta.jws-api/3.0.0/jar)


# Compatible Implementations

* [Eclipse Implementation of XML Web Services 3.0.0](https://eclipse-ee4j.github.io/metro-jax-ws)
* [Eclipse Metro 3.0.0](https://eclipse-ee4j.github.io/metro-wsit/)

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-10-15 with the following results.

| Representative                     | Representative for: |  Vote  |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |   +1   |
| Dan Bandera, Kevin Sutter          | IBM                 |   +1   |
| Ed Bratt, Dmitry Kornilov          | Oracle              |   +1   |
| Andrew Pielage, Matt Gill          | Payara              |   +1   |
| Scott Stark, Mark Little           | Red Hat             |   +1   |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |   +1   |
| Ivar Grimstad                      | EE4J PMC            |   +1   |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |   +1   |
| Werner Keil                        | Committer Members   |   +1   |
| Scott (Congquan) Wang              | Enterprise Members  |   +1   |
|                                    | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00956.html)
