---
title: "Jakarta Batch 2.1"
date: 2022-02-25
summary: "Release for Jakarta EE 10"
---

Jakarta Batch specifies a Java API plus an XML-based job specification language (JSL), which lets you compose batch jobs in XML from reusable Java application artifacts and conveniently parameterize different executions of a single job.

The goal of this release is to:

* define Jakarta Batch integration with Jakarta Contexts and Dependency Injection (CDI) within and outside of the Jakarta EE Platform
* require Jakarta Batch + CDI integration (which in previous releases was optional from the Jakarta Batch perspective

This release requires Java SE 11 or newer (aligned with Jakarta EE 10).

* [Jakarta Batch 2.1.0 Release Record](https://projects.eclipse.org/projects/ee4j.batch/releases/2.1.0)
    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Batch 2.1 Specification Document](./jakarta-batch-spec-2.1.pdf) (PDF)
* [Jakarta Batch 2.1 Specification Document](./jakarta-batch-spec-2.1.html) (HTML)
* [Jakarta Batch 2.1 Javadoc](./apidocs)
* [Jakarta Batch 2.1 TCK](https://download.eclipse.org/jakartaee/batch/2.1/jakarta.batch.official.tck-2.1.0.zip) ([sig](https://download.eclipse.org/jakartaee/batch/2.1/jakarta.batch.official.tck-2.1.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/batch/2.1/jakarta.batch.official.tck-2.1.0.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))

* Maven coordinates
  * [jakarta.batch:jakarta.batch-api:jar:2.1.0](https://search.maven.org/artifact/jakarta.batch/jakarta.batch-api/2.1.0/jar)

* Schemas
  * [XML Schema for the Jakarta Batch artifacts XML file (batch.xml)](https://jakarta.ee/xml/ns/jakartaee/batchXML_2_0.xsd)
  * [XML Schema for the Jakarta Batch Job Specification Language](https://jakarta.ee/xml/ns/jakartaee/jobXML_2_0.xsd)

* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
* [**"jbatch"** v2.1.0-M2](https://github.com/WASdev/standards.jsr352.jbatch/releases/tag/2.1.0-M2) =>  The former Reference Implementation using _com.ibm.jbatch.*_ packages.  Maven links: [implementation](https://repo1.maven.org/maven2/com/ibm/jbatch/com.ibm.jbatch.container/2.1.0-M2/com.ibm.jbatch.container-2.1.0-M2.jar) and [SPI](https://repo1.maven.org/maven2/com/ibm/jbatch/com.ibm.jbatch.spi/2.1.0-M2/com.ibm.jbatch.spi-2.1.0-M2.jar).

# Ballots

## Plan Review
Vote was conducted and passed June 4 - June 11 on https://www.eclipse.org/lists/jakarta.ee-spec/msg01825.html

| Representative                                 | Representative for: | Vote   |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |   +1   |
| Kevin Sutter                                   | IBM                 |   +1   |
| Ed Bratt                                       | Oracle              |   +1   |
| Andrew Pielage                                 | Payara              |   +1   |
| Scott Stark                                    | Red Hat             |   +1   |
| Jean-Louis Monteiro                            | Tomitribe           |   +1   |
| Ivar Grimstad                                  | EE4J PMC            |   +1   |
| Marcelo Ancelmo                                | Participant Members |   +1   |
| Werner Keil                                    | Committer Members   |   +1   |
| Dr. Jun Qian                                   | Enterprise Members  |   +1   |
|                                                | Total               | **10** |

## Release Review

*TODO*
