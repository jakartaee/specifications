---
title: "Jakarta Concurrency 2.0"
date: 2020-09-12
summary: "Release for Jakarta EE 9"
---
Jakarta Concurrency provides a specification for using concurrency from application components without compromising container integrity while still preserving the Jakarta EE platform's fundamental benefits.

* [Jakarta Concurrency 2.0 Release Record](https://projects.eclipse.org/projects/ee4j.cu/releases/2.0.0)
  * [Jakarta EE Platform 9 Release Plan](https://jakartaee.github.io/platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Concurrency 2.0 Specification Document](./concurrency-spec-2.0.pdf) (PDF)
* [Jakarta Concurrency 2.0 Specification Document](./concurrency-spec-2.0.html) (HTML)
* [Jakarta Concurrency 2.0 Javadoc](./apidocs)
* [Jakarta Concurrency 2.0 TCK](https://download.eclipse.org/jakartaee/concurrency/2.0/jakarta-concurrency-tck-2.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/concurrency/2.0/jakarta-concurrency-tck-2.0.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/concurrency/2.0/jakarta-concurrency-tck-2.0.0.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Adds JDK 11 support [Jakarta Concurrency 2.0.1 TCK](https://download.eclipse.org/jakartaee/concurrency/2.0/jakarta-concurrency-tck-2.0.1.zip) ([sig](https://download.eclipse.org/jakartaee/concurrency/2.0/jakarta-concurrency-tck-2.0.1.zip.sig), [sha](https://download.eclipse.org/jakartaee/concurrency/2.0/jakarta-concurrency-tck-2.0.1.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.enterprise.concurrent:jakarta.enterprise.concurrent-api:2.0.0](https://central.sonatype.com/artifact/jakarta.enterprise.concurrent/jakarta.enterprise.concurrent-api/2.0.0/jar)


# Compatible Implementations

* [Jakarta Concurrency CI 2.0.0](https://jakarta.oss.sonatype.org/service/local/repo_groups/staging/content/org/glassfish/jakarta.enterprise.concurrent/2.0.0/jakarta.enterprise.concurrent-2.0.0.jar)

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-10-23 with the following results.

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
| Scott (Congquan) Wang                          | Enterprise Members  |  no vote  |
|                                                | **Total**           | **9**|

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01015.html)
