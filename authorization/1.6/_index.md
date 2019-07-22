---
title: "Jakarta Authorization 1.6"
date: 2019-07-22T23:17:09+0200
summary: "First release for Jakarta EE 8"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions 
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta- Servlet or Enterprise Beans) into 
these permissions.

* [Jakarta Authorization 1.6 Specification Document](./authorization-1.6.pdf) (PDF)
* [Jakarta Authorization 1.6 Specification Document](./authorization-1.6.html) (HTML)
* [Jakarta Authorization 1.6 Javadoc](./apidocs)
* Maven coordinates
  * [jakarta.security.jacc:jakarta.security.jacc-api:jar:1.6.2](https://search.maven.org/artifact/jakarta.security.jacc/jakarta.security.jacc/1.6.1/jar)

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

* GlassFish 5.1