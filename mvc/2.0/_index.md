---
title: "Jakarta MVC 2.0"
date: 2020-12-17
summary: "Release of Jakarta MVC under the jakarta.* namespace"
---

Jakarta MVC defines a standard for creating web applications following the action-based model-view-controller pattern.
The key goal of this release is to switch the namespace for the API from `javax.mvc.*` to `jakarta.mvc.*`. No additional features are included in order to make the transition from Jakarta MVC 1.1 easier.

* [Jakarta MVC 2.0 Release Record](https://projects.eclipse.org/projects/ee4j.mvc/releases/2.0)
* [Jakarta MVC 2.0 Specification Document](./jakarta-mvc-spec-2.0.pdf) (PDF)
* [Jakarta MVC 2.0 Specification Document](./jakarta-mvc-spec-2.0.html) (HTML)
* [Jakarta MVC 2.0 Javadoc](./apidocs)
* [Jakarta MVC 2.0 TCK](http://download.eclipse.org/jakartaee/mvc/2.0/jakarta-mvc-tck-2.0.0.zip) ([sig](http://download.eclipse.org/jakartaee/mvc/2.0/jakarta-mvc-tck-2.0.0.zip.sig), [sha](http://download.eclipse.org/jakartaee/mvc/2.0/jakarta-mvc-tck-2.0.0.zip.sha256), [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.mvc:jakarta.mvc-api:jar:2.0.0](https://search.maven.org/artifact/jakarta.mvc/jakarta.mvc-api/2.0.0/jar)
* Compatible Implementations used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification).
  * [Eclipse Krazo 2.0.0](https://eclipse-ee4j.github.io/krazo/downloads/2.0.0.html)

# Compatible Implementations

* [Eclipse Krazo 2.0.0](https://eclipse-ee4j.github.io/krazo/downloads/2.0.0.html)
* [Eclipse GlassFish 6.2.0](https://download.eclipse.org/ee4j/glassfish/glassfish-6.2.0.zip)

# Ballots

## Plan Review
The Specification Committee Ballot concluded successfully on 2020-11-20 with the following results.

| Representative                     | Representative for: |  Vote  |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |   +1   |
| Dan Bandera, Kevin Sutter          | IBM                 |   +1   |
| Ed Bratt, Dmitry Kornilov          | Oracle              |   +1   |
| Andrew Pielage, Matt Gill          | Payara              |   +1   |
| Scott Stark, Mark Little           | Red Hat             |   +1   |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |   +1   |
| Ivar Grimstad                      | EE4J PMC            |   +1   |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |   +1   |
| Werner Keil                        | Committer Members   |   +1   |
| Scott (Congquan) Wang              | Enterprise Members  |   +1   |
|                                    | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01337.html)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-12-17 with the following results.

| Representative                                        | Representative for: | Vote |
|-------------------------------------------------------|---------------------|------|
| Kenji Kazumura	                                    | Fujitsu	          | +1
| Dan Bandera, Kevin Sutter	                            | IBM	              | +1
| Ed Bratt, Dmitry Kornilov	                            | Oracle	          | +1
| Andrew Pielage, Matt Gill	                            | Payara	          | +1
| Scott Stark, Mark Little	                            | Red Hat	          | +1
| David Blevins, Jean-Louis Monteiro	                | Tomitribe	          | +1
| Ivar Grimstad	                                        | EE4J PMC	          | +1
| Marcelo Ancelmo, Martijn Verburg	                    | Participant Members | +1
| Werner Keil	                                        | Committer Members	  | +1
| Scott (Congquan) Wang	                                | Enterprise Members  |	+1
|                                                       | Total               |  10    |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01401.html)