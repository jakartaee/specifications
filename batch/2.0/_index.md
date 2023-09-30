---
title: "Jakarta Batch 2.0"
date: 2020-07-25
summary: "Release for Jakarta EE 9"
---
Jakarta Batch specifies a Java API plus an XML-based job specification language (JSL), which lets you compose batch jobs in XML from reusable Java application artifacts and conveniently parameterize different executions of a single job.

* [Jakarta Batch 2.0 Release Record](https://projects.eclipse.org/projects/ee4j.batch/releases/2.0)
  * [Jakarta EE Platform 9 Release Plan](https://jakartaee.github.io/platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Batch 2.0 Specification Document](./jakarta-batch-spec-2.0.pdf) (PDF)
* [Jakarta Batch 2.0 Specification Document](./jakarta-batch-spec-2.0.html) (HTML)
* [Jakarta Batch 2.0 Javadoc](./apidocs)
* [Jakarta Batch 2.0 TCK](https://download.eclipse.org/jakartaee/batch/2.0/jakarta.batch.official.tck-2.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/batch/2.0/jakarta.batch.official.tck-2.0.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/batch/2.0/jakarta.batch.official.tck-2.0.0.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))

* Maven coordinates
  * [jakarta.batch:jakarta.batch-api:jar:2.0.0](https://search.maven.org/artifact/jakarta.batch/jakarta.batch-api/2.0.0/jar)

* Schemas
  * [XML Schema for the Jakarta Batch artifacts XML file (batch.xml)](https://jakarta.ee/xml/ns/jakartaee/batchXML_2_0.xsd)
  * [XML Schema for the Jakarta Batch Job Specification Language](https://jakarta.ee/xml/ns/jakartaee/jobXML_2_0.xsd)

# Compatible Implementations

* [**"jbatch"** v2.0.0-M7](https://github.com/WASdev/standards.jsr352.jbatch/releases/tag/2.0.0-M7) =>  The former Reference Implementation using _com.ibm.jbatch.*_ packages.  Maven links: [implementation](https://repo1.maven.org/maven2/com/ibm/jbatch/com.ibm.jbatch.container/2.0.0-M7/com.ibm.jbatch.container-2.0.0-M7.jar) and [SPI](https://repo1.maven.org/maven2/com/ibm/jbatch/com.ibm.jbatch.spi/2.0.0-M7/com.ibm.jbatch.spi-2.0.0-M7.jar).

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-08-27 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             | +1   |
| Dan Bandera, Kevin Sutter                      | IBM                 | +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              | +1   |
| Andrew Pielage, Matt Gill                      | Payara              | +1   |
| Scott Stark, Mark Little                       | Red Hat             | +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | +1   |
| Ivar Grimstad                                  | EE4J PMC            | +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members | +1   |
| Werner Keil                                    | Committer Members   | +1   |
| Scott (Congquan) Wang                          | Enterprise Members  | +1   |
|                                                | Total               | 10   |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00789.html)
