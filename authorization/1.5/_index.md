---
title: "Jakarta Authorization 1.5"
date: 2019-08-19
summary: "First release for Jakarta EE 8"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions 
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into 
these permissions.

* [Jakarta Authorization 1.5 Specification Document](./authorization-spec-1.5.pdf) (PDF)
* [Jakarta Authorization 1.5 Specification Document](./authorization-spec-1.5.html) (HTML)
* [Jakarta Authorization 1.5 Javadoc](./apidocs)
* [Jakarta Authorization 1.5 TCK](https://download.eclipse.org/jakartaee/authorization/1.5/jakarta-authorization-tck-1.5.0.zip)
* Maven coordinates
  * [jakarta.authorization:jakarta.authorization-api:jar:1.5.0](https://search.maven.org/artifact/jakarta.authorization/jakarta.authorization-api/1.5.0/jar)

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

* [Eclipse GlassFish 5.1](https://eclipse-ee4j.github.io/glassfish)