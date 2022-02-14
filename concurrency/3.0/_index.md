---
title: "Jakarta Concurrency 3.0"
date: 2022-02-28
summary: "Jakarta EE 10 Release"
---
Jakarta Concurrency provides a specification for using concurrency from application components without compromising container integrity while still preserving the Jakarta EE platform's fundamental benefits.


# Plan

Jakarta Concurrency 3.0 contains the following features:

* Asynchronous methods
* Context-aware completion stages and completable futures
* Context propagation to parallel streams operations
* Modernization of the Trigger mechanism and Cron support
* Propagation of third party context types
* Resource definition annotations


# Release Information

* [Jakarta Concurrency 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.cu/releases/3.0.0)
  * [Jakarta Concurrency 3.0 Release Plan](https://projects.eclipse.org/projects/ee4j.cu/releases/3.0/plan)
  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Concurrency 3.0 Specification Document](./jakarta-concurrency-spec-3.0.pdf) (PDF)
* [Jakarta Concurrency 3.0 Specification Document](./jakarta-concurrency-spec-3.0.html) (HTML)
* [Jakarta Concurrency 3.0 Javadoc](./apidocs)
* Jakarta Concurrency 3.0 TCK (includes signature tests) [staging](https://jakarta.oss.sonatype.org/content/groups/staging/jakarta/enterprise/concurrent/jakarta.enterprise.concurrent-tck/3.0.0/)
  * [mirrored](https://public.dhe.ibm.com/ibmdl/export/pub/software/olrepo/io/openliberty/jakarta/enterprise/concurrent/jakarta.enterprise.concurrent-tck/3.0.0.20220126/jakarta.enterprise.concurrent-tck-3.0.0.20220126.jar)
  * [SHA](https://jakarta.oss.sonatype.org/content/groups/staging/jakarta/enterprise/concurrent/jakarta.enterprise.concurrent-tck/3.0.0/jakarta.enterprise.concurrent-tck-3.0.0.pom.sha1)
* Maven coordinates
  * [jakarta.enterprise.concurrent:jakarta.enterprise.concurrent-api:3.0.0](https://search.maven.org/artifact/jakarta.enterprise.concurrent/jakarta.enterprise.concurrent-api/3.0.0/jar) Currently located on [staging](https://jakarta.oss.sonatype.org/content/groups/staging/jakarta/enterprise/concurrent/jakarta.enterprise.concurrent-api/3.0.0/) until release is approved, and then we will push it to Maven.
  * [TCK User's Guide](https://github.com/eclipse-ee4j/concurrency-api/tree/master/tck)


# Compatible Implementations

* [Open Liberty 22.0.0.3-beta](https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/beta/2022-02-01_1901/openliberty-22.0.0.3-beta.zip)

# Ballots

## Release Review

The Release Review Specification Committee Ballot needs to be started after the above is completely filled in. Results need to be reported below.

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

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-21 with the following results:

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

The ballot was held over the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01701.html)
