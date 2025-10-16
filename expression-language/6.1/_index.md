---
title: "Jakarta Expression Language 6.1 (under development)"
date: 2025-05-26
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
    * [Jakarta Expression Language 6.1 Release Plan](https://projects.eclipse.org/projects/ee4j.el/releases/6.1.0/plan)
    * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE12ReleasePlan)

* [Jakarta Expression Language 6.1-M1 Specification Document](./jakarta-expression-language-spec-6.1-M1.pdf) (PDF)
* [Jakarta Expression Language 6.1-M1 Specification Document](./jakarta-expression-language-spec-6.1-M1.html) (HTML)
* [Jakarta Expression Language 6.1-M1 Javadoc](./apidocs)
* [Jakarta Expression Language 6.1-M1 TCK](https://download.eclipse.org/ee4j/expression-language/jakartaee12/staged/eftl/jakarta-expression-language-tck-6.1.0-M1.zip) ([info](https://download.eclipse.org/ee4j/expression-language/jakartaee12/staged/eftl/jakarta-expression-language-tck-6.1.0-M1.info)) 
* Maven coordinates
  * [jakarta.el:jakarta.el-api:jar:6.1.0-M1](https://central.sonatype.com/artifact/jakarta.el/jakarta.el-api/6.1.0-M1/jar)


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

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03778.html)

## Release Review

TBD
