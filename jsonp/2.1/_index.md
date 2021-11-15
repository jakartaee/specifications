---
title: "Jakarta JSON Processing 2.1"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta JSON Processing defines a Java(R) based framework for parsing, generating, transforming, and
querying JSON documents.

The goal of this release is to provide standalone API jar fully independent
on the particular implementation, to provide features requested by the community
and implement requirements by other specification included in Jakarta EE 10.

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta JSON Processing 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.jsonp/releases/2.1)
  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta JSON Processing 2.1 Javadoc](./apidocs)
* [Jakarta JSON Processing 2.1 TCK](https://download.eclipse.org/jakartaee/jsonp/2.1/jakarta-jsonp-tck-2.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/jsonp/2.1/jakarta-jsonp-tck-2.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/jsonp/2.1/jakarta-jsonp-tck-2.1.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.json:jakarta.json-api:jar:2.1.0](https://search.maven.org/artifact/jakarta.json/jakarta.json-api/2.1.0/jar)

# Compatible Implementations

* [Eclipse Parsson](https://github.com/eclipse-ee4j/parsson)

# Ballots

## Plan Review
The Specification Committee Ballot concluded successfully on 2021-06-22 with the following results.

| Representative                     | Representative for: |  Vote  |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |  +1    |
| Dan Bandera, Kevin Sutter          | IBM                 |  +1    |
| Ed Bratt, Dmitry Kornilov          | Oracle              |  +1    |
| Andrew Pielage, Matt Gill          | Payara              |  +1    |
| Scott Stark, Mark Little           | Red Hat             |  +1    |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |  +1    |
| Ivar Grimstad                      | EE4J PMC            |  +1    |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |  +1    |
| Werner Keil                        | Committer Members   |  +1    |
| Scott (Congquan) Wang              | Enterprise Members  |  +1    |
|                                    | **Total**           |  10 |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01870.html)
