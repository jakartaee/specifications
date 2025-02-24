---
title: "Jakarta Contexts and Dependency Injection 2.0"
date: 2019-09-10
summary: "Final for Jakarta EE 8"
---

Jakarta Contexts Dependency Injection specifies a means for obtaining objects in such a way as to maximize reusability, testability and maintainability compared to traditional approaches such as constructors, factories, and service locators (e.g., JNDI).

This specification is a re-release of [JSR 365](http://jcp.org/en/jsr/detail?id=365) under the [EFSL](https://www.eclipse.org/legal/efsl/).

* [Jakarta Contexts Dependency Injection 2.0 Specification Document](./cdi-spec-2.0.pdf) (PDF)
* [Jakarta Contexts Dependency Injection 2.0 Specification Document](./cdi-spec-2.0.html) (HTML)
* [Jakarta Contexts Dependency Injection 2.0 Javadoc](./apidocs)
* [Jakarta Contexts Dependency Injection 2.0 TCK](https://download.eclipse.org/jakartaee/cdi/2.0/cdi-tck-2.0.6-dist.zip) ([sig](https://download.eclipse.org/jakartaee/cdi/2.0/cdi-tck-2.0.6-dist.zip.sig),[sha](https://download.eclipse.org/jakartaee/cdi/2.0/cdi-tck-2.0.6-dist.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.enterprise:jakarta.enterprise.cdi-api:jar:2.0.2](https://central.sonatype.com/artifact/jakarta.enterprise/jakarta.enterprise.cdi-api/2.0.2/jar)

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

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00506.html)


# Compatible Implementations

* [Weld 3.1.1.Final](https://weld.cdi-spec.org/download/)
