---
title: "Jakarta Batch Specification 1.0"
date: 2019-08-11
summary: "First release for Jakarta EE 8"
---
Jakarta Batch specifies a Java API plus an XML-based job specification language (JSL), which lets you compose batch jobs in XML from reusable Java application artifacts and conveniently parameterize different executions of a single job.

* [Jakarta Batch 1.0 Specification Document](./batch-spec-1.0.pdf) (PDF)
* [Jakarta Batch 1.0 Specification Document](./batch-spec-1.0.html) (HTML)
* [Jakarta Batch 1.0 Javadoc](./apidocs)
* [Jakarta Batch 1.0 TCK](https://download.eclipse.org/jakartaee/batch/1.0/jakarta.batch.official.tck-1.0.2.zip)
* Maven coordinates
  * [jakarta.batch:jakarta.batch-api:jar:1.0.2](https://search.maven.org/artifact/jakarta.batch/jakarta.batch-api/1.0.2/jar)

# Ballots

## Release Review

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

# Compatible Implementations

* **"jbatch"** v1.0.3 =>  The former Reference Implementation using _com.ibm.jbatch.*_ packages.  See the [compatibility request issue](https://github.com/eclipse-ee4j/batch-api/issues/5) for more details.
