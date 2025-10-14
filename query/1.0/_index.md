---
title: "Jakarta Query 1.0 (under development)"
date: 2025-03-24
summary: "First release of Jakarta Query"
---

Jakarta Query serves as a unifying specification that provides a common object-oriented query language for the Jakarta ecosystem. It establishes a shared foundation that can be used consistently across [Jakarta Persistence](https://jakarta.ee/specifications/persistence/), [Jakarta Data](https://jakarta.ee/specifications/data/), and [Jakarta NoSQL](https://jakarta.ee/specifications/nosql/), ensuring that developers rely on a single query model rather than separate, independently evolving languages.

To accommodate the diversity of datastores in the Jakarta ecosystem, Jakarta Query distinguishes between two levels of the language: a core subset, designed for use by [Jakarta Data](https://jakarta.ee/specifications/data/) and [Jakarta NoSQL](https://jakarta.ee/specifications/nosql/) providers targeting non-relational databases, and an extended form, tailored for [Jakarta Persistence](https://jakarta.ee/specifications/persistence/) and other providers working with relational technologies.

- a core language that can be implemented by Jakarta Data and Jakarta NoSQL 
  providers using non-relational datastores, and 
- an extended language tailored for Jakarta Persistence providers or other 
  persistence technologies backed by relational databases.


> ⚠️ **Note**  
> While Jakarta Data primarily targets the Core language, it may also support  
> the Extended language if its implementation is based on Jakarta Persistence.

The language is closely based on the existing query languages defined by
Jakarta Persistence and Jakarta Data, and is backward compatible with both.


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

**Java SE 21 or higher**

# Details

* [Jakarta Query 1.0-M1 Specification Document](./jakarta-query-1.0-M1.pdf) (PDF)
* [Jakarta Query 1.0-M1 Specification Document](./jakarta-query-1.0-M1.html) (HTML)

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
