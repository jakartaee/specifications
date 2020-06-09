---
title: "Jakarta Batch 2.0 (milestone)"
date: 2020-06-09
summary: "Release for Jakarta EE 9"
---
Jakarta Batch specifies a Java API plus an XML-based job specification language (JSL), which lets you compose batch jobs in XML from reusable Java application artifacts and conveniently parameterize different executions of a single job.

* [Jakarta Batch 2.0 Release Record]()
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Batch 2.0 Specification Document](./batch-spec-2.0-draft.pdf) (PDF)
* [Jakarta Batch 2.0 Specification Document](./batch-spec-2.0-draft.html) (HTML)
* [Jakarta Batch 2.0 Javadoc](./apidocs)
* [Jakarta Batch 2.0 TCK]()([sig](),[sha](),[pub]()):

https://download.eclipse.org/jakartabatch/tck/eftl/jakarta.batch.official.tck-2.0.0-M1.zip
* Maven coordinates
  * [jakarta.batch:jakarta.batch-api:jar:2.0.0-M2](https://search.maven.org/artifact/jakarta.batch/jakarta.batch-api/2.0.0-M2/jar)


# Compatible Implementations

* [**"jbatch"** v2.0.0-M3](https://github.com/WASdev/standards.jsr352.jbatch/releases/tag/2.0.0-M3) =>  The former Reference Implementation using _com.ibm.jbatch.*_ packages.

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-mm-dd with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura, Michael DeNicola               | Fujitsu             |      |
| Dan Bandera, Kevin Sutter                      | IBM                 |      |
| Bill Shannon, Ed Bratt                         | Oracle              |      |
| Mark Wareham, Steve Millidge                   | Payara              |      |
| Scott Stark, Mark Little                       | Red Hat             |      |
| David Blevins, Cesar Hernandez                 | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Alex Theedom                                   | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
|                                                | Total               |      |

The ballot was run in the [jakarta.ee-spec mailing list]()
