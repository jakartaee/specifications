---
title: "Jakarta Activation 2.2 (under development)"
date: 2026-04-20
summary: "Release for Jakarta EE 12"
---

Jakarta Activation defines a set of standard services to: determine the
MIME type of an arbitrary piece of data; encapsulate access to it;
discover the operations available on it; and instantiate the
appropriate bean to perform the operation(s).

This release aims to remove Security Manager-related code from the API, along with implementing other changes required by
the Jakarta EE 12 platform.

### New features, enhancements or additions
none

###  Removals, deprecations or backwards incompatible changes
* Remove references to Security Manager

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**


# Details

* [Jakarta Activation 2.2 Release Record](https://projects.eclipse.org/projects/ee4j.jaf/releases/2.2)
    * [Jakarta EE Platform 12 Release Plan](https://jakartaee.github.io/platform/jakartaee12/JakartaEE12ReleasePlan)
* [Jakarta Activation 2.2-M2 Specification Document](./jakarta-activation-spec-2.2-M2.pdf) (PDF)
* [Jakarta Activation 2.2-M2 Specification Document](./jakarta-activation-spec-2.2-M2.html) (HTML)
* [Jakarta Activation 2.2-M2 Javadoc](./apidocs)
<!-- TBD
* [Jakarta Activation 2.2-M2 TCK](https://download.eclipse.org/jakartaee/activation/2.2-M2/jakarta-activation-tck-2.2-M2.0.zip)
  ([sig](https://download.eclipse.org/jakartaee/activation/2.2-M2/jakarta-activation-tck-2.2-M2.0.zip.sig),
  [sha](https://download.eclipse.org/jakartaee/activation/2.2-M2/jakarta-activation-tck-2.2-M2.0.zip.sha256),
  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
    * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/activation/2.2)
-->
* Maven coordinates
    * [jakarta.activation:jakarta.activation-api:jar:2.2.0-M2](https://central.sonatype.com/artifact/jakarta.activation/jakarta.activation-api/2.2.0-M2/jar)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-05-26 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members | no vote |
| Werner Keil                                    | Committer Members   |   +1    |
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **9**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
| Michael Redlish                                | Community           |   +1    |
|                                                | **Total**           |  **2**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg04137.html)
