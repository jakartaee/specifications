---
title: "Jakarta Server Pages 3.0"
date: 2020-10-21
summary: "Release for Jakarta EE 9"
---
Jakarta Server Pages defines a template engine for web applications that supports mixing of textual content
(including HTML and XML) with custom tags, expression language, and embedded Java code, that gets compiled
into a Jakarta Servlet.

* [Jakarta Server Pages 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jsp/releases/3.0.0)
  * [Jakarta EE Platform 9 Release Plan](https://jakartaee.github.io/platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Server Pages 3.0 Specification Document](./jakarta-server-pages-spec-3.0.pdf) (PDF)
* [Jakarta Server Pages 3.0 Specification Document](./jakarta-server-pages-spec-3.0.html) (HTML)
* [Jakarta Server Pages 3.0 Javadoc](./apidocs)
* [Jakarta Server Pages 3.0 TCK](https://download.eclipse.org/jakartaee/pages/3.0/jakarta-pages-tck-3.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/pages/3.0/jakarta-pages-tck-3.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/pages/3.0/jakarta-pages-tck-3.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/pages/3.0/)
* Maven coordinates
  * [jakarta.pages:jakarta.pages-api:jar:3.0.0](https://central.sonatype.com/artifact/jakarta.servlet.jsp/jakarta.servlet.jsp-api/3.0.0/jar)


# Compatible Implementations

* [Eclipse Glassfish 6.0.0-RC1](https://download.eclipse.org/ee4j/glassfish/glassfish-6.0.0-RC1.zip)
* [EE4J implementation of Jakarta Server Pages 3.0.0](https://github.com/eclipse-ee4j/jsp-api/releases/download/3.0.0-RELEASE-impl/jakarta.servlet.jsp-3.0.0.jar) using vehicle [Eclipse GlassFish 6.0.0-RC1](https://download.eclipse.org/ee4j/glassfish/glassfish-6.0.0-RC1.zip)


# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-11-06 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             | +1   |
| Dan Bandera, Kevin Sutter                      | IBM                 | +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              | +1   |
| Andrew Pielage, Matt Gill                      | Payara              | +1   |
| Scott Stark, Mark Little                       | Red Hat             | +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | +1   |
| Ivar Grimstad                                  | EE4J PMC            | +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members | +1   |
| Werner Keil                                    | Committer Members   | +1   |
| Scott (Congquan) Wang                          | Enterprise Members  | +1   |
|                                                | Total               | 10   |

Additonal Votes:
- Paul Nicolucci: +1

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01163.html)
