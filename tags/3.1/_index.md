---
title: "Jakarta Standard Tag Library 3.1 (under development)"
date: 2025-05-26
summary: "Release for Jakarta EE 12"
---

Jakarta Standard Tag Library encapsulates as simple tags the core functionality common to many Web applications.
Jakarta Standard Tag Library has support for common, structural tasks such as iteration and conditionals, tags
for manipulating XML documents, internationalization tags, and SQL tags. It also provides a framework for integrating
existing custom tags with Jakarta Standard Tag Library tags.

### New features, enhancements or additions
<!-- List here -->
* [Issue #247](https://github.com/jakartaee/tags/issues/247) Support java.time API in <fmt:parseDate> and <fmt:formatDate>
* Review any other enhancement requests and determine if they can be completed within Jakarta EE 12.
* [Issue #270](https://github.com/jakartaee/tags/issues/270) tck is using org.eclipse.ee4j as groupId and any other work necessary to complete the move of the TCK from the platform.
* Review issues and resolve existing bugs / provide spec clarification if any are necessary, as time permits for Jakarta EE 12.
* Use the following query to track issues targeted for Jakarta EE 12: https://github.com/jakartaee/tags/issues?q=is%3Aissue%20state%3Aopen%20label%3AJakartaEE12

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 21**

# Details
* [Jakarta Standard Tag Library 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.jstl/releases/3.1.0)
* [Jakarta Standard Tag Library 3.1.0-M1 Specification Document](./jakarta-tags-spec-3.1.0-M1.pdf) (PDF)
* [Jakarta Standard Tag Library 3.1.0-M1 Specification Document](./jakarta-tags-spec-3.1.0-M1.html) (HTML)
* [Jakarta Standard Tag Library 3.1.0-M1 Javadoc](./apidocs)
* Maven coordinates
  * [jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:jar:3.1.0-M1](https://central.sonatype.com/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/3.1.0-M1/jar)
<!-- The following can be uncommented and version information updated as they become available.
* [Jakarta Standard Tag Library 3.0 Tagdoc](./tagdocs)
* [Jakarta Standard Tag Library 3.0 TCK](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip)([sig](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/tags/3.1/)
* Maven coordinates
  * [jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:jar:3.0.2](https://central.sonatype.com/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/3.0.2/jar)
  
-->
  
# Compatible Implementations

[Eclipse WaSP] (TBD)

# Ballots

## Release Review

TBD

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-05-16 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members | no vote |
| Werner Keil                                    | Committer Members   |   +1    |
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |   9      |

Non-binding Votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
| Michaal Redlich                                | Community           |   +1    |
|                                                | **Total**           |   2     |
The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg04136.html)


