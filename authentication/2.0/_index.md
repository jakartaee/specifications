---
title: "Jakarta Authentication 2.0"
date: 2020-09-03
summary: "Release for Jakarta EE 9"
---
Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container.

Jakarta Authentication consists of several profiles, with each profile telling how a specific container
(such as Jakarta Servlet) can integrate with- and adapt to this SPI.

* [Jakarta Authentication 2.0 Release Record](https://projects.eclipse.org/projects/ee4j.jaspic/releases/2.0.0)
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Authentication 2.0 Specification Document](./jakarta-authentication-spec-2.0.pdf) (PDF)
* [Jakarta Authentication 2.0 Specification Document](./jakarta-authentication-spec-2.0.html) (HTML)
* [Jakarta Authentication 2.0 Javadoc](./apidocs)
* [Jakarta Authentication 2.0 TCK](https://download.eclipse.org/jakartaee/authentication/2.0/jakarta-authentication-tck-2.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/authentication/2.0/jakarta-authentication-tck-2.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/authentication/2.0/jakarta-authentication-tck-2.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Adds JDK 11 support [Jakarta Authentication 2.0.1 TCK](https://download.eclipse.org/jakartaee/authentication/2.0/jakarta-authentication-tck-2.0.1.zip)  ([sig](https://download.eclipse.org/jakartaee/authentication/2.0/jakarta-authentication-tck-2.0.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/authentication/2.0/jakarta-authentication-tck-2.0.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.authentication:jakarta.authentication-api:jar:2.0.0](https://search.maven.org/artifact/jakarta.authentication/jakarta.authentication-api/2.0.0/jar)


# Compatible Implementations

* [Eclipse Glassfish 6.0.0-M3-2020-10-04](https://github.com/eclipse-ee4j/glassfish/releases/download/6.0.0-M3-2020-10-04/glassfish-6.0.0-M3-2020-10-04.zip)

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-10-26 with the following results.

| Representative                                      | Representative for: | Vote |
|-----------------------------------------------------|---------------------|------|
| Kenji Kazumura                                      | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                           | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                           | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                           | Payara              |  +1  |
| Scott Stark, Mark Little                            | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro                  | Tomitribe           |  +1  |
| Ivar Grimstad                                       | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg                    | Participant Members |  +1  |
| Werner Keil                                         | Committer Members   |  +1  |
| Scott (Congquan) Wang                               | Enterprise Members  |  +1  |
|                                                     | **Total**           |**10**|

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01026.html)
