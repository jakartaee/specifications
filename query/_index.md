---
title: "Jakarta Query"
summary: "Jakarta Query defines an object-oriented query language designed for use with persistence solutions written in Java(R)."
summary_sixty_char: "An object-oriented query language"
project_id: "ee4j.query"
---

A data structure in an object-oriented language is a graph of objects interconnected by unidirectional object references, which may be polymorphic. Some non-relational databases support similar representations. On the other hand, relational databases represent relationships between entities using foreign keys, and therefore SQL has no syntactic construct representing navigation of an association. Similarly, inheritance and polymorphism can be easily represented within the relational model, but are not present as first-class constructs in the SQL language. An object-oriented query language is a dialect of SQL with support for associations and subtype polymorphism.

Jakarta Query defines an object-oriented query language designed for use with Jakarta Persistence, Jakarta Data, and with other persistence solutions written in Java(R) or in similar object-oriented languages, consisting of:

- a core language that can be implemented by Jakarta Data providers using non-relational datastores, and 
- an extended language tailored for Jakarta Persistence providers or other persistence technologies backed by relational databases.