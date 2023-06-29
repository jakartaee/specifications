---
title: "Jakarta Authentication 3.1 (under development)"
date: 2023-05-30
summary: "Release for Jakarta EE 11"
---
Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container.

Jakarta Authentication consists of several profiles, with each profile telling how a specific container
(such as Jakarta Servlet) can integrate with- and adapt to this SPI.

The release aims to evolve the API in several smaller ways to support the overall goals of Jakarta Security.

### New features, enhancements or additions
* Clarify state and concurrency expectations of Jakarta Authentication APIs

### Removals, deprecations or backwards incompatible changes
* Remove references to the SecurityManager

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* * [Jakarta Authentication 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.authentication/releases/3.1)

<!--
The following can be uncommented and version information updated as they become available.

* [Jakarta Authentication 3.1 Specification Document](./jakarta-authentication-spec-3.1.pdf) (PDF)
* [Jakarta Authentication 3.1 Specification Document](./jakarta-authentication-spec-3.1.html) (HTML)
* [Jakarta Authentication 3.1 Javadoc](./apidocs)
* [Jakarta Authentication 3.1 TCK](https://download.eclipse.org/jakartaee/authentication/3.1/jakarta-authentication-tck-3.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/authentication/3.1/jakarta-authentication-tck-3.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/authentication/3.1/jakarta-authentication-tck-3.1.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
-->

# Compatible Implementations

* GlassFish

# Ballots

## Plan Review

TBD

## Release Review

TBD
