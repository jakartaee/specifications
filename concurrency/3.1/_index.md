---
title: "Jakarta Concurrency 3.1 (under development)"
date: 2023-07-22
summary: "Release for Jakarta EE 11"
---

Jakarta Concurrency provides a specification for using concurrency from application components without compromising container integrity while still preserving the Jakarta EE platform's fundamental benefits.

### New features, enhancements or additions
* [Integration with Java 21 Virtual Threads](https://github.com/jakartaee/concurrency/issues/268)
* [Java Flow/ReactiveStreams and context propagation](https://github.com/jakartaee/concurrency/issues/257)
* [Replace more features from EJB](https://github.com/jakartaee/concurrency/issues/252), such as [Schedule](https://github.com/jakartaee/concurrency/issues/98) and [Lock](https://github.com/jakartaee/concurrency/issues/135) annotations
* [Become more CDI-centric](https://github.com/jakartaee/concurrency/issues/229)
* Specification bug fixes and clarifications
* TCK fixes and [enhancements](https://github.com/jakartaee/concurrency/issues/269)

Community input is encouraged. Add your comments to issues in our [issue tracker](https://github.com/jakartaee/concurrency/issues) or join the Concurrency Developer mailing list by following the instructions to subscribe on [this page](https://accounts.eclipse.org/mailing-list/cu-dev).

###  Removals, deprecations or backwards incompatible changes

### Minimum Java SE Version
* **Java SE 21 or higher**

# Details

* [Jakarta Concurrency 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.cu/releases/3.1)
  * [Jakarta Concurrency 3.1 Release Plan](https://projects.eclipse.org/projects/ee4j.cu/releases/3.1/plan)
  * [Jakarta EE Platform 11 Release Plan](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/11/plan)
<!-- add once available:
* [Jakarta Concurrency 3.1 Specification Document](./jakarta-concurrency-spec-3.1.pdf) (PDF)
* [Jakarta Concurrency 3.1 Specification Document](./jakarta-concurrency-spec-3.1.html) (HTML)
* [Jakarta Concurrency 3.1 Javadoc](./apidocs)
* [Jakarta Concurrency 3.1 TCK](https://download.eclipse.org/jakartaee/concurrency/3.1/concurrency-tck-3.1.0.zip), ([sig](https://download.eclipse.org/jakartaee/concurrency/3.1/concurrency-tck-3.1.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/concurrency/3.1/concurrency-tck-3.1.0.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * Signature tests are included with the TCK and run automatically as part of it
* Maven coordinates
  * [jakarta.enterprise.concurrent:jakarta.enterprise.concurrent-api:3.1.0](https://search.maven.org/artifact/jakarta.enterprise.concurrent/jakarta.enterprise.concurrent-api/3.1.0/jar)
* Compatible Implementation used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification)
  * TBD
-->

# Compatible Implementations

* Open Liberty or Concurrō (TBD)

# Ballots

## Plan Review

TBD

## Release Review

TBD