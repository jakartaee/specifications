---
title: "Jakarta MVC 3.1 (Under Development)"
date: 2025-05-15
summary: "Release aligned with Jakarta EE 12"
---

Jakarta MVC defines a standard for creating web applications following the action-based model-view-controller pattern.

This release ensures alignment with Jakarta RESTful Web Services 5.0. 
The [3.1 Milestone](https://github.com/jakartaee/mvc/milestone/5) in the issue tracker identifies issues targeting this release.
Follow the [mvc-dev mailing list](https://accounts.eclipse.org/mailing-list/mvc-dev) to participate in the release.
The TCK is developed in parallel and kept in sync at all times in the [mvc-tck repository](https://github.com/jakartaee/mvc-tck).

### New features, enhancements, or additions
<!-- List here -->
* Update dependencies
* Update Java version
* Specify support for Jakarta REST [#89](https://github.com/jakartaee/mvc/issues/89)
* Static Asset Support [#63](https://github.com/jakartaee/mvc/issues/63)
* Consider using Jakarta Config if available

### Removals, deprecations, or backwards incompatible changes
<!-- List here -->
* none

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 21 or higher**

# Details

* [Jakarta MVC 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.mvc/releases/3.1)


# Compatible Implementations
* [Eclipse Krazo](https://github.com/eclipse-ee4j/krazo)

# Ballots
## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-04 with the following results.

| Representative                       | Representative for:   | Vote    |
|--------------------------------------|-----------------------|---------|
| Kenji Kazumura                       | Fujitsu               | +1      |
| Tom Watson, Emily Jiang              | IBM                   | +1      |
| Ed Bratt, Dmitry Kornilov            | Oracle                | +1      |
| Andrew Pielage, Petr Aubrecht        | Payara                | +1      |
| David Blevins, Jean-Louis Monteiro   | Tomitribe             | +1      |
| Ivar Grimstad                        | EE4J PMC              | +1      |
| Marcelo Ancelmo, Abraham Marin-Perez | Participant Members   | no vote |
| Werner Keil                          | Committer Members     | +1      |
| Jun Qian                             | Enterprise Members    | no vote |
| Zhai Luchao                          | Enterprise Members    | +1      |
|                                      | **Total**             | **8**   |
| Non-binding votes                    |                       |         |
| ------------------------------------ | --------------------- | ------- |
| Michael Redlich                      | Garden State JUG      | +1      |
|                                      | **Total**             | **1**   |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03901.html)
