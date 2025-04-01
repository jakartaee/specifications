---
title: "Jakarta Query 1.0 (under development)"
date: 2025-03-24
summary: "First release of Jakarta Query"
---

Jakarta Query defines an object-oriented query language designed for use with Jakarta Persistence, Jakarta Data, and with other persistence solutions written in Java(R) or in similar object-oriented languages.

This is the initial release of Jakarta Query.

### New features, enhancements or additions

* Extract the definition of JPQL from the Jakarta Persistence specification to a new document
* Work toward a much more rigorous definition of the semantics of the query language, clarifying ambiguities 
* Redefine JDQL as a subset of the full query language
* Consider enhancements to the query language arising out of work on Jakarta Persistence 4 and Jakarta Data 1.1. 

Enhancements _might_ include:

- streamlined syntax for `select new`,
- cleaner syntax for literal dates and times, and/or
- subqueries in `select`, `from`, and `join`.

### Removals, deprecations or backwards incompatible changes

N/A

### Minimum Java SE Version

**Java SE 17 or higher**

# Ballots

## Creation/Plan Review

The Specification Committee Ballot concluded successfully on 2025-04-01 with the following results.

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
|                                                | **Total**           |  **1**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03732.html)
