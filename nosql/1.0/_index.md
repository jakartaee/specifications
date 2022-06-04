---
title: "Jakarta NoSQL 1.0 (under development)"
date: 2021-06-04
summary: "Under Development"
---

Jakarta NoSQL is a Java API standard that streamlines the integration of Java applications with NoSQL databases. It defines a set of APIs and provides a standard implementation for most NoSQL databases. 
The goal is to create the specification in Jakarta EE to help Jakarta EE developers create enterprise-grade applications using Java® and NoSQL technologies. It helps them create scalable applications while maintaining low coupling with the underlying NoSQL technology.

In general, we made some progress, especially with the creation of TCKs:
https://github.com/eclipse-ee4j/nosql/tree/master/tck
All APIs proved to be quite stable, except for the Graph API, and that is why there is no API for graphs. We are waiting for the definition of a standard graphical communication API, either [Apache TinkerPop](http://tinkerpop.apache.org/) or [Open Cypher](https://www.opencypher.org/), led by [Neo4J](https://neo4j.com/). Therefore, we only have a Graph implementation side, but not in the API, at least for a while.
Regarding the migration to Jakarta EE facilities, we already have a Draft PR ready as soon as the new version of Jakarta EE is released: 

https://github.com/eclipse-ee4j/nosql/pull/55

A point that we are also studying is the [Quarkus](https://quarkus.io/) and [Micronaut](https://micronaut.io/) effect that uses the Annotation Processor instead of reflection and seeing how to make an API that is possible in both directions.

We've removed the Duke references in the spec docs and also in all GitHub repositories.
We replaced the "artemis" and "diana" package names and put "mapping" and communication respectively instead.

We are still waiting to discuss the integration between Eclipse MicroProfile and Jakarta EE to check how the MicroProfile dependency will work.


* [Jakarta NoSQL Release Plan](https://projects.eclipse.org/projects/ee4j.nosql/governance)
* [Jakarta NoSQL 1.0 Specification Document](./nosql-1.0.0-b4.pdf) (PDF)
* [Jakarta NoSQL 1.0 Specification Document](./nosql-1.0.0-b4.html) (HTML)
* [Jakarta NoSQL 1.0 Specification Javadoc](./apidocs)
* [Jakarta NoSQL 1.0 Specification Document TCK](https://github.com/eclipse/jnosql/archive/1.0.0-b4.zip)([sig](),[sha](),[pub]())
* Maven coordinates
  * [jakarta.nosql.communication:communication-core:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/communication/communication-core/1.0.0-b4/)
  * [jakarta.nosql.communication:communication-column:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/communication/communication-column/1.0.0-b4/)
  * [jakarta.nosql.communication:communication-document:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/communication/communication-document/1.0.0-b4/)
  * [jakarta.nosql.communication:communication-key-value:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/communication/communication-key-value/1.0.0-b4/)
  * [jakarta.nosql.mapping:mapping-core:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/mapping/mapping-core/1.0.0-b4/)
  * [jakarta.nosql.mapping:mapping-key-value:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/mapping/mapping-key-value/1.0.0-b4/)
  * [jakarta.nosql.mapping:mapping-column:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/mapping/mapping-column/1.0.0-b4/)
  * [jakarta.nosql.mapping:mapping-document:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/mapping/mapping-document/1.0.0-b4/)
  * [jakarta.nosql.mapping:mapping-api:jar:1.0.0-b4](https://repo1.maven.org/maven2/jakarta/nosql/mapping/mapping-api/1.0.0-b4/)

# Compatible Implementations

* [Eclipse JNoSQL](http://www.jnosql.org/)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2020-10-12 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                      | IBM                 |   0  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                      | Payara              |  +1  |
| Scott Stark, Mark Little                       | Red Hat             |   0  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Scott (Congquan) Wang                          | Enterprise Members  |  +1  |
|                                                | **Total**           | **8**|

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg00984.html)