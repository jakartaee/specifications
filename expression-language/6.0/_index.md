---
title: "Jakarta Expression Language 6.0 (under development)"
date: 2023-05-22
summary: "Release for Jakarta EE 11"
---

Jakarta Expression Language defines an expression language for Java applications.

This release makes the dependency on the java.desktop module optional, removes references to the SecurityManager and provides a small number of usability improvements.

### New features, enhancements or additions
* The java.desktop module is no longer required at runtime.
* A new property, length, is now supported for arrays

### Removals, deprecations or backwards incompatible changes
* All code deprecated as of Expression Language 5.0 has been removed. Specifically:
  * The getFeatureDescriptors() method has been removed from the ELResolver interface.
* All references to the Java SecurityManager and associated APIs have been removed.

### Minimum Java SE Version
**Java SE 11 or higher**

# Details

* [Jakarta Expression Language 6.0 Release Record](https://projects.eclipse.org/projects/ee4j.el/releases/6.0.0)

<!--

The following can be uncommented and version information updated as they become available.

    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Expression Language 5.0 Specification Document](./jakarta-expression-language-spec-5.0.pdf) (PDF)
* [Jakarta Expression Language 5.0 Specification Document](./jakarta-expression-language-spec-5.0.html) (HTML)
* [Jakarta Expression Language 5.0 Javadoc](./apidocs)
* [Jakarta Expression Language 5.0 TCK](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.el:jakarta.el-api:jar:5.0.0](https://search.maven.org/artifact/jakarta.el/jakarta.el-api/5.0.0/jar)
-->


# Compatible Implementations

* Eclipse ExpressLy (TBC)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2023-06-28 with the following results.

| Representative                                 | Representative for: | Vote    |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             | +1      |
| Emily Jiang, Tom Watson                        | IBM                 | +1      |
| Ed Bratt, Dmitry Kornilov                      | Oracle              | +1      |
| Andrew Pielage, Petr Aubrecht                  | Payara              | +1      |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           | No vote |
| Ivar Grimstad                                  | EE4J PMC            | +1      |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members | +1      |
| Werner Keil                                    | Committer Members   | +1      |
| Zhai Luchao                                    | Enterprise Members  | +1      |
| Scott Stark, Scott Marlow                      | Enterprise Members  | +1      |
|                                                | **Total**           | **9**   |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Jun Qian                                       | Primeton            |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02911.html)

## Release Review

TBD