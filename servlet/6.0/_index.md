---
title: "Jakarta Servlet 6.0"
date: 2022-05-31
summary: "Release for Jakarta EE 10"
---
Jakarta Servlet defines a server-side API for handling HTTP requests and responses.

### New features, enhancements or additions
<!-- List here -->
* [Issue 18](https://github.com/eclipse-ee4j/servlet-api/issues/18) Clarify the decoding and normalization of URI paths 
* [Issue 37](https://github.com/eclipse-ee4j/servlet-api/issues/37) Update Cookie class, related classes and the specification to remove references to FC 2109 and to replace them with RFC 6265
* [Issue 105](https://github.com/eclipse-ee4j/servlet-api/issues/105) Clarify the behaviour of getRealPath(String)
* [Issue 175](https://github.com/eclipse-ee4j/servlet-api/issues/175) Provide generic attribute support to cookies, including session cookies, to provide support for additional attributes such as the SameSite attribute
* [Issue 201](https://github.com/eclipse-ee4j/servlet-api/issues/201) Add a module-info.java to support using the Servlet API in a modular environment as per the Java module system and the Jakarta EE 10 recommendations
* [Issue 272](https://github.com/eclipse-ee4j/servlet-api/issues/272) Remove the recommendation that Servlet containers should include an `X-Powered-By`header
* [Issue 365](https://github.com/eclipse-ee4j/servlet-api/issues/365) Correct the list of valid orderings for example 2 in Section 8.2.2, “Ordering of web.xml and webfragment.xml”
* [Issue 368](https://github.com/eclipse-ee4j/servlet-api/issues/368) Clarify the behaviour of getRemoteAddress()
* [Issue 377](https://github.com/eclipse-ee4j/servlet-api/issues/377) Clarify the behaviour of setCharacterEncoding(null) and similar calls
* [Issue 407](https://github.com/eclipse-ee4j/servlet-api/issues/407) Add new methods to obtain unique identifiers for the current request and/or associated connection
* [Issue 411](https://github.com/eclipse-ee4j/servlet-api/issues/411) Relax the requirements set out in Section 6.2.2, “Wrapping Requests and Responses” and allow the container to wrap Requests and Responses to meet the requirements of implementing the RequestDispatcher functionality.
* [Issue 416](https://github.com/eclipse-ee4j/servlet-api/issues/416) Remove the restriction on programatically added listeners calling some ServletContext getter methods
* [Issue 418](https://github.com/eclipse-ee4j/servlet-api/issues/418)
* Add a new method getErrorOnELNotFound() to JspPropertyGroupDescriptor to align with changes in the Jakarta Pages 3.1 specification.
* Clarify the Javadoc for ServletRequest.isAsyncStarted() to align it with the specification text
* Update the Javadoc to clarify the scheduling implications when ServletInputStream.isReady() or ServletOutputStream.isReady() return false

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* [Issue 225](https://github.com/eclipse-ee4j/servlet-api/issues/225) Deprecated wrapped response handling in the doHead method in favour of container implementation of HEAD method behavior
* Remove API classes and methods that were deprecated in Servlet 5.0 and earlier. This includes removing the SingleThreadModel and HttpSessionContext interfaces and the HttpUtils class as well as various deprecated methods

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**

# Details

* [Jakarta Servlet 6.0 Release Record](https://projects.eclipse.org/projects/ee4j.servlet/releases/6.0)
  * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Servlet 6.0 Specification Document](./jakarta-servlet-spec-6.0.pdf) (PDF)
* [Jakarta Servlet 6.0 Specification Document](./jakarta-servlet-spec-6.0.html) (HTML)
* [Jakarta Servlet 6.0 Javadoc](./apidocs)
* [Jakarta Servlet 6.0.0 TCK](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
   * Addresses Servlet Challenge (Issue [#472](https://github.com/eclipse-ee4j/servlet-api/issues/472))  [Jakarta Servlet 6.0.1 TCK](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.1.zip)  ([sig](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
   * Addresses Platform TCK Challenge to update from optional web-app_2_3.dtd to (required) web-app_5_0.xsd (Issue [#1313](https://github.com/jakartaee/platform-tck/issues/1313))  [Jakarta Servlet 6.0.2 TCK](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.2.zip)  ([sig](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.2.zip.sig),  [sha](https://download.eclipse.org/jakartaee/servlet/6.0/jakarta-servlet-tck-6.0.2.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* XML Schema
  * web-app_6_0.xsd
  * web-common_6_0.xsd
  * web-fragment_6_0.xsd
* Maven coordinates
  * [jakarta.servlet:jakarta.servlet-api:jar:6.0.0](https://search.maven.org/artifact/jakarta.servlet/jakarta.servlet-api/6.0.0/jar)

# Compatible Implementations

* [Glassfish 7.0.0-M4](https://repo1.maven.org/maven2/org/glassfish/main/distributions/glassfish/7.0.0-M4/glassfish-7.0.0-M4.zip)

# Ballots

## Release Review

The Release Review Specification Committee Ballot concluded successfully on TBD with the following results.

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

The Plan Review Specification Committee Ballot concluded successfully on TBD with the following results.

|                       |  Yes    | No  | Abstain  |
|-----------------------|---------|-----|----------|
|Fujitsu                |         |     |          |
|IBM                    |         |     |          |
|Oracle                 |         |     |          |
|Payara                 |         |     |          |
|Red Hat                |         |     |          |
|Tomitribe              |         |     |          |
|EE4J PMC               |         |     |          |
|Participant Members    |         |     |          |
|Committer Members      |         |     |          |
