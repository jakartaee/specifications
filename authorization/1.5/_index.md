---
title: "Jakarta Authorization 1.5"
date: 2019-09-10
summary: "First release for Jakarta EE 8"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions 
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into 
these permissions.

* [Jakarta Authorization 1.5 Specification Document](./authorization-spec-1.5.pdf) (PDF)
* [Jakarta Authorization 1.5 Specification Document](./authorization-spec-1.5.html) (HTML)
* [Jakarta Authorization 1.5 Javadoc](./apidocs)
* [Jakarta Authorization 1.5 TCK](https://download.eclipse.org/jakartaee/authorization/1.5/jakarta-authorization-tck-1.5.1.zip) ([sig](https://download.eclipse.org/jakartaee/authorization/1.5/jakarta-authorization-tck-1.5.1.zip.sig),[sha](https://download.eclipse.org/jakartaee/authorization/1.5/jakarta-authorization-tck-1.5.1.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.authorization:jakarta.authorization-api:jar:1.5.0](https://search.maven.org/artifact/jakarta.authorization/jakarta.authorization-api/1.5.0/jar)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2019-09-06 with the following results.

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

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00522.html)

# Compatible Implementations

* [Eclipse GlassFish 5.1](https://eclipse-ee4j.github.io/glassfish)
