---
title: "Jakarta Security 4.0 (under development)"
date: 2023-05-30
summary: "Release for Jakarta EE 11"
---
Jakarta Security defines a standard for creating secure Jakarta EE applications in modern application paradigms.

The release splits focuses on evolving the API in various ways, and specifically providing APIs for the authorization theme (including interceptors and an abstraction for the permission store)

### New features, enhancements or additions
* Client-cert and Digest SECURITY #120 
* Authentication mechanism per URL SECURIY #86 
* User choice of authentication mechanism (login with provider X, login with provider Y, etc) 
* Multiple authentication mechanisms (try JWT, fallback to BASIC, etc) 
* @RolesAllowed alternative 
* Easily adding an interceptor to a build-in CDI bean
* Authorization modules

### Removals, deprecations or backwards incompatible changes
* Remove references to the SecurityManager (as listed here: https://github.com/search?q=repo%3Ajakartaee%2Fsecurity%20SecurityManager&type=code)

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* [Jakarta Security 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.security/releases/4.0)

<!--
The following can be uncommented and version information updated as they become available.

* [Jakarta Security 4.0 Specification Document](./jakarta-security-spec-4.0.pdf) (PDF)
* [Jakarta Security 4.0 Specification Document](./jakarta-security-spec-4.0.html) (HTML)
* [Jakarta Security 4.0 Javadoc](./apidocs)
* [Jakarta Security 4.0 TCK](https://download.eclipse.org/jakartaee/security/4.0/jakarta-security-tck-4.0.0.zip) ([sig](https://download.eclipse.org/jakartaee/security/4.0/jakarta-security-tck-4.0.0.zip.sig), [sha](https://download.eclipse.org/jakartaee/security/4.0/jakarta-security-tck-4.0.0.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
-->

# Compatible Implementations

* Soteria (TBC)

# Ballots

## Plan Review

TBD

## Release Review

TBD
