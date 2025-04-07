---
title: "Jakarta Expression Language 6.1 (under development)"
date: 2026-06-30
summary: "Release for Jakarta EE 12"
---

Jakarta Expression Language defines an expression language for Java applications.

This release adds a small number of language enhancements and addresses a performance issue.

### New features, enhancements or additions
* Add, in cooperation with the Jakarta Pages 4.1 specification, a performance optimisation for scoped attributes.
* Make caching mechanisms pluggable
* Language enhancements requested by users including:
    * Elvis operator
    * Use of '+' to merge collections
* Move TCK from Platform TCK project to Expression Language Project

### Removals, deprecations or backwards incompatible changes
* None planned

### Minimum Java SE Version
**Java SE 17 or higher**

# Details

* [Jakarta Expression Language 6.1 Release Record](https://projects.eclipse.org/projects/ee4j.el/releases/6.1.0)

<!--
The following can be uncommented and version information updated as they become available.

    * [Jakarta Expression Language 6.0 Release Plan](https://projects.eclipse.org/projects/ee4j.el/releases/6.0.0/plan)
    * [Jakarta EE Platform 11 Release Plan](https://jakartaee.github.io/platform/jakartaee11/JakartaEE11ReleasePlan)
* [Jakarta Expression Language 6.0 Specification Document](./jakarta-expression-language-spec-6.0.pdf) (PDF)
* [Jakarta Expression Language 6.0 Specification Document](./jakarta-expression-language-spec-6.0.html) (HTML)
* [Jakarta Expression Language 6.0 Javadoc](./apidocs)
* [Jakarta Expression Language 6.0 TCK](https://download.eclipse.org/jakartaee/expression-language/6.0/jakarta-expression-language-tck-6.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/expression-language/6.0/jakarta-expression-language-tck-6.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/expression-language/6.0/jakarta-expression-language-tck-6.0.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * First service release [Jakarta Expression Language 6.0.1 TCK](https://download.eclipse.org/jakartaee/expression-language/6.0/jakarta-expression-language-tck-6.0.1.zip)  ([sig](https://download.eclipse.org/jakartaee/expression-language/6.0/jakarta-expression-language-tck-6.0.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/expression-language/6.0/jakarta-expression-language-tck-6.0.1.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.el:jakarta.el-api:jar:6.0.1](https://central.sonatype.com/artifact/jakarta.el/jakarta.el-api/6.0.1/jar)

-->

# Compatible Implementations

* Apache Tomcat 12 (TBC)
  
# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-04 with the following results.

| Representative                       | Representative for | Vote   |
|--------------------------------------|--------------------|--------|
| Kenji Kazumura                       | Fujitsu            | +1     |
| Emily Jiang, Tom Watson              | IBM                | +1     |
| Ed Bratt, Dmitry Kornilov            | Oracle             | +1     |
| Andrew Pielage, Petr Aubrecht        | Payara             | +1     |
| David Blevins, Jean-Louis Monteiro   | Tomitribe          | +1     |
| Ivar Grimstad                        | EE4J PMC           | +1     |
| Marcelo Ancelmo, Abraham Marin-Perez | Participant Members | +1     |
| Werner Keil                          | Committer Members  | +1     |
| Zhai Luchao                          | Enterprise Members | +1     |
| Jun Qian                             | Enterprise Members | +1     |
|                                      | **Total**          | **10** |

## Release Review

TBD