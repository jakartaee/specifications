---
title: "Jakarta Standard Tag Library 2.0"
date: 2020-09-22
summary: "Release for Jakarta EE 9"
---
Jakarta Standard Tag Library encapsulates as simple tags the core functionality common to many Web applications.
Jakarta Standard Tag Library has support for common, structural tasks such as iteration and conditionals, tags
for manipulating XML documents, internationalization tags, and SQL tags. It also provides a framework for integrating
existing custom tags with Jakarta Standard Tag Library tags.

* [Jakarta Standard Tag Library 2.0 Release Record](https://projects.eclipse.org/projects/ee4j.jstl/releases/2.0.0)
  * [Jakarta EE Platform 9 Release Plan](https://jakartaee.github.io/platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Standard Tag Library 2.0 Specification Document](./jakarta-tags-spec-2.0.pdf) (PDF)
* [Jakarta Standard Tag Library 2.0 Specification Document](./jakarta-tags-spec-2.0.html) (HTML)
* [Jakarta Standard Tag Library 2.0 Javadoc](./apidocs)
* [Jakarta Standard Tag Library 2.0 Tagdoc](./tagdocs)
* [Jakarta Standard Tag Library 2.0 TCK](https://download.eclipse.org/jakartaee/tags/2.0/jakarta-tags-tck-2.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/tags/2.0/jakarta-tags-tck-2.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/tags/2.0/jakarta-tags-tck-2.0.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Adds JDK 11 support [Jakarta Standard Tag Library 2.0.1 TCK](https://download.eclipse.org/jakartaee/tags/2.0/jakarta-tags-tck-2.0.1.zip)  ([sig](https://download.eclipse.org/jakartaee/tags/2.0/jakarta-tags-tck-2.0.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/tags/2.0/jakarta-tags-tck-2.0.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:jar:2.0.0](https://central.sonatype.com/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/2.0.0/jar)


# Compatible Implementations
* [EE4J implementation of Jakarta Standard Tag Library 2.0.0](https://github.com/eclipse-ee4j/jstl-api/releases/download/2.0.0-IMPL-RELEASE/jakarta.servlet.jsp.jstl-2.0.0.jar) using vehicle [Eclipse Glassfish 6.0.0-M3-2020-10-04](https://github.com/eclipse-ee4j/glassfish/releases/download/6.0.0-M3-2020-10-04/glassfish-6.0.0-M3-2020-10-04.zip)

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-11-04 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                      | IBM                 |  +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                      | Payara              |  +1  |
| Scott Stark, Mark Little                       | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Scott (Congquan) Wang                          | Enterprise Members  |  +1  |
|                                                | Total               |  10  |

| Community                                      | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Paul Nicolucci                                 | Individual          |  +1  |
|                                                | Total               |   1  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01276.html)
