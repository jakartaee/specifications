---
title: "Jakarta Servlet 6.1 (under development)"
date: 2023-05-23
summary: "Release for Jakarta EE 11"
---
Jakarta Servlet defines a server-side API for handling HTTP requests and responses.

The release removes references to the SecurityManager and provides various small enhancements and clarifications.

### New features, enhancements or additions
* Allow control of status code and response body when sending a redirect
* Add a query string attribute to error dispatches
* Add constants for new HTTP status codes
* Add overloaded methods that use `CharSet` rather than `String`
* Add `ByteBuffer` support to `ServletInputStream` and `ServletOutputStream`
* Various clarifications

### Removals, deprecations or backwards incompatible changes
* All references to the SecurityManager and associated APIs have been removed

### Minimum Java SE Version
**Java SE 11 or higher**

# Details

* [Jakarta Servlet 6.1 Release Record](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.1)

<!--
The following can be uncommented and version information updated as they become available.

  * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Servlet 6.0 Specification Document](./jakarta-servlet-spec-6.0.pdf) (PDF)
* [Jakarta Servlet 6.0 Specification Document](./jakarta-servlet-spec-6.0.html) (HTML)
* [Jakarta Servlet 6.0 Javadoc](./apidocs)
* [Jakarta Servlet 6.0.0 TCK](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* XML Schema
  * web-app_6_0.xsd
  * web-common_6_0.xsd
  * web-fragment_6_0.xsd
* Maven coordinates
  * [jakarta.servlet:jakarta.servlet-api:jar:6.0.0](https://search.maven.org/artifact/jakarta.servlet/jakarta.servlet-api/6.0.0/jar)
-->

# Compatible Implementations

* Glassfish (TBC)

# Ballots

## Plan Review

TBD

## Release Review

TBD