---
title: "Jakarta Expression Language 5.0 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta Expression Language defines an expression language for Java applications.

* [Jakarta Expression Language 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.el/releases/5.0.0)
    * [Jakarta EE Platform 10 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)

# Plan

The plan for the release is to tackle the open issues for the API component including:
* Potential extensions to the API to support Jakarta Faces
* Support for default methods
* Potentially removing the dependency on the java.desktop JPMS module
* Remove deprecated methods from API

# Backwards compatibility
Backward compatibility issue include:
* Removal of deprecated methods
* Removing the java.desktop dependency may create compatibility issues. The extent of those issues will be a factor in deciding whether to proceed with this or not.

# Optional features
None

# Minimum Java SE version
The JDK version required will be aligned with Jakarta EE 10.

# TCK Updates
The following TCK updates will be required:
* Updated signatures
* New tests for any new features
* Changes to support the removal of the java.desktop dependency (if implemented)

# Release Record
[Release Record](https://projects.eclipse.org/projects/ee4j.el/releases/5.0.0)

# Compatible Implementations

* Eclipse Tyrus 2.1.0-M3

# Ballots

## Plan Review

The Plan Review Specification Committee Ballot concluded successfully on 12/05/2021 (May 12th 2021) with the following results.

| Representative                     | Representative for: |  Vote   |
|------------------------------------|---------------------|---------|
| Kenji Kazumura                     | Fujitsu             | +1      |
| Dan Bandera, Kevin Sutter          | IBM                 | +1      |
| Ed Bratt, Dmitry Kornilov          | Oracle              | +1      |
| Andrew Pielage, Matt Gill          | Payara              | +1      |
| Scott Stark, Mark Little           | Red Hat             | No vote |
| David Blevins, Jean-Louis Monteiro | Tomitribe           | +1      |
| Ivar Grimstad                      | EE4J PMC            | +1      |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members | +1      |
| Werner Keil                        | Committer Members   | +1      |
| Dr. Jun Qian                       | Enterprise Members  | +1      |
|                                    | **Total**           | 9       |

 This ballot was conducted on the public e-mail list [jakarta.ee-spec@eclipse.org](https://www.eclipse.org/lists/jakarta.ee-spec/). This ballot thread begins [here](https://www.eclipse.org/lists/jakarta.ee-spec/msg01622.html).
 
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

 This ballot was conducted on the public e-mail list [jakarta.ee-spec@eclipse.org](https://www.eclipse.org/lists/jakarta.ee-spec/). This ballot thread begins [here](TBD).
