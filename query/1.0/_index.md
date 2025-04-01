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
