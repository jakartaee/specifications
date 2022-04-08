---
title: "Jakarta SOAP with Attachments 3.0"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta SOAP with Attachments defines an API enabling developers to produce
and consume messages conforming to the SOAP 1.1, SOAP 1.2, and SOAP Attachments Feature.

This release contains following changes:

* adds SOAPEnvelope.createName(String, String): Name method
* does not allow null arguments in SOAPFault.createFault(String, String)
* extends SOAPConnection to implement java.io.Autocloseable
* adds API to allow setting timeouts for set timeout for SOAPConnection.call
* drops all references to JAXM
* drops the search through Java SE instalation in the implementation lookup
* removes deprecated SOAPElementFactory
* editorial updates and clarifications in the specification

This release requires Java SE 11 or newer (aligned with Jakarta EE 10).

* [Jakarta SOAP Attachments 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jaxws/releases/3.0-jakarta-soap-attachments)
    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta SOAP Attachments 3.0 Specification Document](./jakarta-soap-spec-3.0.pdf) (PDF)
* [Jakarta SOAP Attachments 3.0 Specification Document](./jakarta-soap-spec-3.0.html) (HTML)
* [Jakarta SOAP Attachments 3.0 Javadoc](./apidocs)
* [Jakarta SOAP Attachments 3.0 TCK](https://download.eclipse.org/jakartaee/soap-attachments/3.0/jakarta-soap-tck-3.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/soap-attachments/3.0/jakarta-soap-tck-3.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/soap-attachments/3.0/jakarta-soap-tck-3.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.xml.soap:jakarta.xml.soap-api:jar:3.0.0](https://search.maven.org/artifact/jakarta.xml.soap/jakarta.xml.soap-api/3.0.0/jar)

# Compatible Implementations

* [Eclipse Implementation of Jakarta SOAP with Attachments 3.0.0-M2](https://github.com/eclipse-ee4j/metro-saaj/releases/tag/3.0.0-M2)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-03-11 with the following results.

| Representative                     | Representative for: | Vote   |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             | +1     |
| Tom Watson, Emily Jiang            | IBM                 | +1     |
| Ed Bratt, Dmitry Kornilov          | Oracle              | +1     |
| Andrew Pielage                     | Payara              | +1     |
| David Blevins, Jean-Louis Monteiro | Tomitribe           | +1     |
| Ivar Grimstad                      | EE4J PMC            | +1     |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members | +1     |
| Werner Keil                        | Committer Members   | +1     |
| Jun Qian                           | Enterprise Members  | +1     |
| Zhai Luchao                        | Enterprise Members  | +1     |  
|                                    | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02245.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-10 with the following results.
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

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01597.html)
