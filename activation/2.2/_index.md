---
title: "Jakarta Activation 2.2 (under development)"
date: 2025-05-05
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

* [Jakarta Activation 2.2 Release Record](https://projects.eclipse.org/projects/ee4j.jaf/releases/2.2)


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
