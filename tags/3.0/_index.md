---
title: "Jakarta Standard Tag Library 3.0"
date: 2022-04-11
summary: "Release for Jakarta EE 10"
---
Jakarta Standard Tag Library encapsulates as simple tags the core functionality common to many Web applications.
Jakarta Standard Tag Library has support for common, structural tasks such as iteration and conditionals, tags
for manipulating XML documents, internationalization tags, and SQL tags. It also provides a framework for integrating
existing custom tags with Jakarta Standard Tag Library tags.

* [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Standard Tag Library 3.0 Specification Document](./jakarta-tags-spec-3.0.pdf) (PDF)
* [Jakarta Standard Tag Library 3.0 Specification Document](./jakarta-tags-spec-3.0.html) (HTML)
* [Jakarta Standard Tag Library 3.0 Javadoc](./apidocs)
* [Jakarta Standard Tag Library 3.0 Tagdoc](./tagdocs)
* [Jakarta Standard Tag Library 3.0 TCK](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip)([sig](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sha256),[pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:jar:3.0.0](https://search.maven.org/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/3.0.0/jar)

# Summary of Changes:

This release includes the following changes:
* Renamed Tag URIs to 'jakarta.tags.*'
* Updated Jakarta Tags to Java 11
* Added JPMS Module Info Class
* Removed dependency on XML Binding from the API pom
* Updated tagdocs to include EFSL
* Updated tlddoc generation to support jakarta.
* General specification document cleanup.


# Backwards compatibility
Backward compatibility issue include:
* Removal of deprecated methods if any exist and are removed.
* Rename java.sun.com taglib URIs to new jakarta.tags.\* URNs.
* Still allow java.sun.com taglib URIs to be used

# Optional features
None

# Minimum Java SE version
This release requires Java SE 11 or newer (aligned with Jakarta EE 10).

# TCK Updates
The following TCK updates will be required:
* Updated tests for new jakarta.tags.* URNs
* New tests for any new features

# Release record
* [Jakarta Standard Tag Library 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jstl/releases/3.0.0)

# Compatible Implementations
* [EE4J implementation of Jakarta Standard Tag Library 3.0.0](https://github.com/eclipse-ee4j/jstl-api/releases/tag/3.0.0-IMPL-RELEASE)

# Ballots

## Release Review

The Release Review Specification Committee Ballot concluded successfully on 2021-xx-xx with the following results.

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

 The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01868.html)
