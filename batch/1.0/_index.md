---
title: "Jakarta Batch 1.0"
date: 2019-09-10
summary: "First release for Jakarta EE 8"
---
Jakarta Batch specifies a Java API plus an XML-based job specification language (JSL), which lets you compose batch jobs in XML from reusable Java application artifacts and conveniently parameterize different executions of a single job.

* [Jakarta Batch 1.0 Specification Document](./batch-spec-1.0.pdf) (PDF)
* [Jakarta Batch 1.0 Specification Document](./batch-spec-1.0.html) (HTML)
* [Jakarta Batch 1.0 Javadoc](./apidocs)
* [Jakarta Batch 1.0 TCK](https://download.eclipse.org/jakartaee/batch/1.0/jakarta.batch.official.tck-1.0.2.zip) ([sig](https://download.eclipse.org/jakartaee/batch/1.0/jakarta.batch.official.tck-1.0.2.zip.sig),[sha](https://download.eclipse.org/jakartaee/batch/1.0/jakarta.batch.official.tck-1.0.2.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.batch:jakarta.batch-api:jar:1.0.2](https://search.maven.org/artifact/jakarta.batch/jakarta.batch-api/1.0.2/jar)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2019-09-02 with the following results.

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
|Committer Members      |   +1    |         |          |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00503.html)


# Compatible Implementations

* **"jbatch"** v1.0.3 =>  The former Reference Implementation using _com.ibm.jbatch.*_ packages.  See the [compatibility request issue](https://github.com/eclipse-ee4j/batch-api/issues/5) for more details.
