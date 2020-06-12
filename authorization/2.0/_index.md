---
title: "Jakarta Authorization 2.0 (milestone)"
date: 2020-06-11
summary: "Release for Jakarta EE 9"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into
these permissions.

* [Jakarta Authorization 2.0 Release Record](https://projects.eclipse.org/projects/ee4j.jacc/releases/2.0.0)
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Authorization 2.0 Specification Document](./authorization-spec-2.0-SNAPSHOT.pdf) (PDF)
* [Jakarta Authorization 2.0 Specification Document](./authorization-spec-2.0-SNAPSHOT.html) (HTML)
* [Jakarta Authorization 2.0 Javadoc](./apidocs)
* [Jakarta Authorization 2.0 TCK]()([sig](),[sha](),[pub]())
* Maven coordinates
  * [jakarta.authorization:jakarta.authorization-api:jar:2.0.0-RC1](https://search.maven.org/artifact/jakarta.authorization/jakarta.authorization-api/2.0.0-RC1/jar)


# Compatible Implementations

* [Eclipse Glassfish 6.0.0-M1](https://projects.eclipse.org/projects/ee4j.glassfish/downloads)

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-mm-dd with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura, Michael DeNicola               | Fujitsu             |      |
| Dan Bandera, Kevin Sutter                      | IBM                 |      |
| Bill Shannon, Ed Bratt                         | Oracle              |      |
| Mark Wareham, Steve Millidge                   | Payara              |      |
| Scott Stark, Mark Little                       | Red Hat             |      |
| David Blevins, Cesar Hernandez                 | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Alex Theedom                                   | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
|                                                | Total               |      |

The ballot was run in the [jakarta.ee-spec mailing list]()
