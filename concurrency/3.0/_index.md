---
title: "Jakarta Concurrency 3.0"
date: 2022-04-27
summary: "Jakarta EE 10 Release"
---
<!-- Please provide a short description of the specification. -->
<!-- Typically this will not change cfrom version to version. -->

Jakarta Concurrency provides a specification for using concurrency from application components without compromising container integrity while still preserving the Jakarta EE platform's fundamental benefits. 

<!-- Please describe the high-level changes made to Jakarta Wombat 1.0. --> 
<!-- The intent is for the first two sections to be an executive summary in the range of 300 to 800 characters. -->
<!-- Links can accompany the executive summary, but cannot substitute for an executive summary. -->

### New Features
This release adds the following
* Asynchronous methods (See Chapter 5, *Asynchronous Methods*)
* Context-aware completion stages and completable futures
* Context propagation to parallel streams operations
* Modernization of the Trigger mechanism with time zone support
* Propagation of third party context types (See Chapter 4, *Thread Context Providers*)
* Resource definition annotations and corresponding deployment descriptor elements
###  Removals, deprecations or backwards incompatible changes

### Minimum Java SE Version
* **Java SE 11 or higher**

# Details

* [Jakarta Concurrency 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.cu/releases/3.0.0)
  * [Jakarta Concurrency 3.0 Release Plan](https://projects.eclipse.org/projects/ee4j.cu/releases/3.0/plan)
  * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Concurrency 3.0 Specification Document](./jakarta-concurrency-spec-3.0.pdf) (PDF)
* [Jakarta Concurrency 3.0 Specification Document](./jakarta-concurrency-spec-3.0.html) (HTML)
* [Jakarta Concurrency 3.0 Javadoc](./apidocs)
* [Jakarta Concurrency 3.0 TCK](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.0.zip), ([sig](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.0.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
   * First service release [Jakarta Concurrency 3.0.1 TCK](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.1.zip), ([sig](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.1.zip.sig), [sha](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.1.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
   * Second service release [Jakarta Concurrency 3.0.2 TCK](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.2.zip), ([sig](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.2.zip.sig), [sha](https://download.eclipse.org/jakartaee/concurrency/3.0/concurrency-tck-3.0.2.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * Signature tests are included with the TCK and run automatically as part of it
* Maven coordinates
  * [jakarta.enterprise.concurrent:jakarta.enterprise.concurrent-api:3.0.0](https://search.maven.org/artifact/jakarta.enterprise.concurrent/jakarta.enterprise.concurrent-api/3.0.0/jar)
* Compatible Implementation used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification)
    * [Open Liberty 22.0.0.5-beta](https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/beta/22.0.0.5-beta/openliberty-22.0.0.5-beta.zip)

# Compatible Implementations

* [Open Liberty 22.0.0.5-beta](https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/beta/22.0.0.5-beta/openliberty-22.0.0.5-beta.zip)

# Ballots

## Release Review

The Specification Committee Ballot for Concurrency 3.0 successfully concluded on May 11, 2022. The results were as follows:

|Organization                       |  Yes    | No      | Abstain  |
|-----------------------------------|---------|---------|----------|
|Fujitsu                            | &check; |         |          |
|IBM                                | &check; |         |          |
|Oracle                             | &check; |         |          |
|Payara                             | &check; |         |          |
|Tomitribe                          | &check; |         |          |
|EE4J PMC                           | &check; |         |          |
|Participant Members                | &check; |         |          |
|Committer Members                  | &check; |         |          |
|Enterprise Members (Jun Qian)      | &check; |         |          |
|Committer Members (Zhai Luchao)    | &check; |         |          |
|**Total**                          | **10**  |         |          |

The ballot was conducted over the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02441.html)

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
