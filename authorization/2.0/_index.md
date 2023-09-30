---
title: "Jakarta Authorization 2.0"
date: 2020-07-28
summary: "Release for Jakarta EE 9"
---
Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into
these permissions.

* [Jakarta Authorization 2.0 Release Record](https://projects.eclipse.org/projects/ee4j.jacc/releases/2.0.0)
  * [Jakarta EE Platform 9 Release Plan](https://jakartaee.github.io/platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Authorization 2.0 Specification Document](./authorization-spec-2.0.pdf) (PDF)
* [Jakarta Authorization 2.0 Specification Document](./authorization-spec-2.0.html) (HTML)
* [Jakarta Authorization 2.0 Javadoc](./apidocs)
* [Jakarta Authorization 2.0 TCK](https://download.eclipse.org/jakartaee/authorization/2.0/jakarta-authorization-tck-2.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/authorization/2.0/jakarta-authorization-tck-2.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/authorization/2.0/jakarta-authorization-tck-2.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Adds JDK 11 support [Jakarta Authorization 2.0.1 TCK](https://download.eclipse.org/jakartaee/authorization/2.0/jakarta-authorization-tck-2.0.1.zip)  ([sig](https://download.eclipse.org/jakartaee/authorization/2.0/jakarta-authorization-tck-2.0.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/authorization/2.0/jakarta-authorization-tck-2.0.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))

* Maven coordinates
  * [jakarta.authorization:jakarta.authorization-api:jar:2.0.0](https://search.maven.org/artifact/jakarta.authorization/jakarta.authorization-api/2.0.0/jar)


# Compatible Implementations

* [Eclipse Glassfish 6.0.0-M2-servlet5](https://github.com/eclipse-ee4j/glassfish/releases/tag/6.0.0-M2-servlet5)

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-09-09 with the following results.

| Representative                                      | Representative for: | Vote |
|-----------------------------------------------------|---------------------|------|
| Kenji Kazumura                                      | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                           | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                           | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                           | Payara              |  +1  |
| Scott Stark, Mark Little                            | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro, Cesar Hernandez | Tomitribe           |  +1  |
| Ivar Grimstad                                       | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg                    | Participant Members |  +1  |
| Werner Keil                                         | Committer Members   |  +1  |
| Scott (Congquan) Wang                               | Enterprise Members  |  +1  |
|                                                     | Total               |  10  |

The ballot was run in the [jakarta.ee-spec mailing list]()
