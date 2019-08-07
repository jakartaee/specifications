---
title: "Jakarta Authorization 1.6"
date: 2019-08-07
summary: "First release for Jakarta EE 8"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions 
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into 
these permissions.

* [Jakarta Authorization 1.6 Specification Document](./authorization-1.6.pdf) (PDF)
* [Jakarta Authorization 1.6 Specification Document](./authorization-1.6.html) (HTML)
* [Jakarta Authorization 1.6 Javadoc](./apidocs)
* [Jakarta Authorization 1.6 TCK](https://download.eclipse.org/ee4j/jakartaee-tck/jakartaee8-eftl/promoted/eclipse-authorization-tck-1.5.0.zip)
* Maven coordinates
  * [jakarta.security.jacc:jakarta.security.jacc-api:jar:1.6.2](https://search.maven.org/artifact/jakarta.security.jacc/jakarta.security.jacc-api/1.6.2/jar)

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