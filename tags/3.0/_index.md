---
title: "Jakarta Standard Tag Library 3.0"
date: 2022-04-11
summary: "Release for Jakarta EE 10"
---
Jakarta Standard Tag Library encapsulates as simple tags the core functionality common to many Web applications.
Jakarta Standard Tag Library has support for common, structural tasks such as iteration and conditionals, tags
for manipulating XML documents, internationalization tags, and SQL tags. It also provides a framework for integrating
existing custom tags with Jakarta Standard Tag Library tags.

### New features, enhancements or additions
<!-- List here -->
* [Issue #144](https://github.com/eclipse-ee4j/jstl-api/issues/144) Rename Tag URIs to 'jakarta.tags.*'
* [Issue #156](https://github.com/eclipse-ee4j/jstl-api/issues/156) Update Jakarta Tags to Java 11
* [Issue #157](https://github.com/eclipse-ee4j/jstl-api/issues/157) Add JPMS Module Info Class
* [Issue #149](https://github.com/eclipse-ee4j/jstl-api/issues/149) Remove dependency on XML Binding from the API pom
* Update tagdocs to include EFSL
* Update tlddoc generation to support jakarta.
* General specification document cleanup.

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* Removal of deprecated methods if any exist and are removed.
* Rename java.sun.com taglib URIs to new jakarta.tags.\* URNs.
* Still allow java.sun.com taglib URIs to be used

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Standard Tag Library 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.jstl/releases/3.0.0)
* [Jakarta Standard Tag Library 3.0 Specification Document](./jakarta-tags-spec-3.0.pdf) (PDF)
* [Jakarta Standard Tag Library 3.0 Specification Document](./jakarta-tags-spec-3.0.html) (HTML)
* [Jakarta Standard Tag Library 3.0 Javadoc](./apidocs)
* [Jakarta Standard Tag Library 3.0 Tagdoc](./tagdocs)
* [Jakarta Standard Tag Library 3.0 TCK](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip)([sig](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Tags 3.0 TCK Challenge against tests that include space character before AM/PM (Issue [#255](https://github.com/jakartaee/tags/issues/255)), Tags 3.0 TCK Challenge for test ExceptionCheckTag.java depending on removed Pages 4.0 JspException.getRootCause() method (Issue [#256](https://github.com/jakartaee/tags/issues/256)), Old DTDs/Schema in deployment descriptors of Tags/Pages/Servlet/Assembly Platform TCK tests ( Issue [#1313](https://github.com/jakartaee/platform-tck/issues/1313))   [Jakarta Tags 3.0.1 TCK](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.1.zip)  ([sig](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:jar:3.0.2](https://search.maven.org/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/3.0.2/jar)

# Compatible Implementations
* [EE4J implementation of Jakarta Standard Tag Library 3.0.0](https://github.com/eclipse-ee4j/jstl-api/releases/tag/3.0.0-IMPL-RELEASE)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-05-17 with the following results.

| Representative                                 | Representative for: | Vote    |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |    +1   |
| Tom Watson, Emily Jiang                        | IBM                 |    +1   |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1   |
| Andrew Pielage, Petr Aubrecht                  | Payara              |    +1   |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1   |
| Ivar Grimstad                                  | EE4J PMC            |    +1   |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1   |
| Werner Keil                                    | Committer Members   |    +1   |
| Jun Qian                                       | Enterprise Members  |    +1   |
| Zhai Luchao                                    | Enterprise Members  |    +1   |
|                                                | **Total**           |  **10**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02422.html).

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
