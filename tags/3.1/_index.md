---
title: "Jakarta Standard Tag Library 3.1 (under development)"
date: 2026-06-30
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
<!-- The following can be uncommented and version information updated as they become available.
* [Jakarta Standard Tag Library 3.0 Specification Document](./jakarta-tags-spec-3.0.pdf) (PDF)
* [Jakarta Standard Tag Library 3.0 Specification Document](./jakarta-tags-spec-3.0.html) (HTML)
* [Jakarta Standard Tag Library 3.0 Javadoc](./apidocs)
* [Jakarta Standard Tag Library 3.0 Tagdoc](./tagdocs)
* [Jakarta Standard Tag Library 3.0 TCK](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip)([sig](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sig),[sha](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.0.zip.sha256),[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Tags 3.0 TCK Challenge against tests that include space character before AM/PM (Issue [#255](https://github.com/jakartaee/tags/issues/255)), Tags 3.0 TCK Challenge for test ExceptionCheckTag.java depending on removed Pages 4.0 JspException.getRootCause() method (Issue [#256](https://github.com/jakartaee/tags/issues/256)), Old DTDs/Schema in deployment descriptors of Tags/Pages/Servlet/Assembly Platform TCK tests ( Issue [#1313](https://github.com/jakartaee/platform-tck/issues/1313))   [Jakarta Tags 3.0.1 TCK](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.1.zip)  ([sig](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/tags/3.0/jakarta-tags-tck-3.0.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:jar:3.0.2](https://central.sonatype.com/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api/3.0.2/jar)
  
-->
  
# Compatible Implementations

[Eclipse WaSP] (TBD)

# Ballots

## Release Review

TBD

## Plan Review

TBD
