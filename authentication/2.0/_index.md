---
title: "Jakarta Authentication 2.0 (milestone)"
date: 2020-06-11
summary: "Release for Jakarta EE 9"
---
Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container.

Jakarta Authentication consists of several profiles, with each profile telling how a specific container
(such as Jakarta Servlet) can integrate with- and adapt to this SPI.

* [Jakarta Authentication 2.0 Release Record]()
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Authentication 2.0 Specification Document](./authentication-spec-2.0-SNAPSHOT.pdf) (PDF)
* [Jakarta Authentication 2.0 Specification Document](./authentication-spec-2.0-SNAPSHOT.pdf) (HTML)
* [Jakarta Authentication 2.0 Javadoc](./apidocs)
* [Jakarta Authentication 2.0 TCK]()([sig](),[sha](),[pub]())
* Maven coordinates
  * [jakarta.security.auth.message:jakarta.security.auth.message-api:jar:2.0.0-RC1](https://search.maven.org/artifact/jakarta.security.auth.message/jakarta.security.auth.message-api/2.0.0-RC1/jar)


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
