---
title: "Jakarta Enterprise Beans 4.0"
date: 2020-08-26
summary: "Release for Jakarta EE 9"
---

Jakarta Enterprise Beans defines an architecture for the development and deployment of component-based business applications.

* [Jakarta Enterprise Beans 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.ejb/releases/4.0/plan)
  * [Jakarta Enterprise Beans 4.0 Release Plan](https://github.com/eclipse-ee4j/ejb-api/blob/master/4.0-PLAN.adoc)
* [Jakarta Enterprise Beans, Core Features 4.0 Specification Document](./jakarta-enterprise-beans-spec-core-4.0.pdf) (PDF)
* [Jakarta Enterprise Beans, Core Features 4.0 Specification Document](./jakarta-enterprise-beans-spec-core-4.0.html) (HTML)
* [Jakarta Enterprise Beans, Optional Features 4.0 Specification Document](./jakarta-enterprise-beans-spec-opt-4.0.pdf) (PDF)
* [Jakarta Enterprise Beans, Optional Features 4.0 Specification Document](./jakarta-enterprise-beans-spec-opt-4.0.html) (HTML)
* [Jakarta Enterprise Beans 4.0 Javadoc](./apidocs)
* [Jakarta Enterprise Beans 4.0 TCK]()([sig](),[sha](),[pub]())
* Maven coordinates
  * [jakarta.ejb:jakarta.ejb-api:jar:4.0.0]()

The Jakarta Enterprise Beans 4.0 intended scope includes all plans detailed in the [Jakarta EE 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan), 
which in essence involves a backwards incompatible namespace change from `javax.ejb` to `jakarta.ejb`.  
In addition the Jakarta Enterprise Beans 4.0 Release Plan will involve:

 - Removal of methods relying on `java.security.Identity`
 - Removal of methods relying on JAX-RPC
 - Removal of deprecated `EJBContext.getEnvironment()` method
 - Removal of Support for Distributed Interoperability
 - Mark optional EJB 2.x API Group

See the [Jakarta Enterprise Beans 4.0 Release Plan](https://github.com/eclipse-ee4j/ejb-api/blob/master/4.0-PLAN.adoc) for full details.

# Compatible Implementations

* Pending

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

[//]: # (This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review].)
[//]: # (Please reference that ballot for the official results.)

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

[Jakarta Enterprise Bean 4.0 Release Record and Plan](https://projects.eclipse.org/projects/ee4j.ejb/releases/4.0/plan)

The Specification Committee Ballot concluded successfully on 2020-03-04 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura, Michael DeNicola               | Fujitsu             |   1  |
| Dan Bandera, Kevin Sutter                      | IBM                 |   1  |
| Bill Shannon, Ed Bratt                         | Oracle              |   1  |
| Mark Wareham, Steve Millidge                   | Payara              |   1  |
| Scott Stark, Mark Little                       | Red Hat             |   1  |
| David Blevins, Cesar Hernandez                 | Tomitribe           |   1  |
| Ivar Grimstad                                  | EE4J PMC            |   1  |
| Alex Theedom                                   | Participant Members |      |
| Werner Keil                                    | Committer Members   |   1  |
|                                                | Total               |   8  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/mhonarc/lists/jakarta.ee-spec/msg00628.html)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-mm-dd with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura, Michael DeNicola               | Fujitsu             |      |
| Dan Bandera, Kevin Sutter                      | IBM                 |      |
| Bill Shannon, Ed Bratt                         | Oracle              |      |
| Mark Wareham, Steve Millidge                   | Payara              |      |
| Scott Stark, Mark Little                       | Red Hat             |      |
| David Blevins, Cesar Hernandez                 | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Alex Theedom                                   | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
|                                                | Total               |      |

The ballot was run in the [jakarta.ee-spec mailing list]()
