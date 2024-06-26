---
title: "Jakarta Concurrency 3.1"
date: 2024-06-21
summary: "Release for Jakarta EE 11"
---

Jakarta Concurrency provides a specification for using concurrency from application components without compromising container integrity while still preserving the Jakarta EE platform's fundamental benefits.

### New features, enhancements or additions
* [Integration with Java 21 Virtual Threads](https://github.com/jakartaee/concurrency/issues/268)
* [Java Flow/ReactiveStreams and context propagation](https://github.com/jakartaee/concurrency/issues/257)
* [Replace more features from EJB](https://github.com/jakartaee/concurrency/issues/252), such as [Schedule](https://github.com/jakartaee/concurrency/issues/98) and  annotations
* [Become more CDI-centric](https://github.com/jakartaee/concurrency/issues/229)
* Specification bug fixes and clarifications
* TCK fixes and [enhancements](https://github.com/jakartaee/concurrency/issues/269)

Community input is encouraged. Add your comments to issues in our [issue tracker](https://github.com/jakartaee/concurrency/issues) or join the Concurrency Developer mailing list by following the instructions to subscribe on [this page](https://accounts.eclipse.org/mailing-list/cu-dev).

###  Removals, deprecations or backwards incompatible changes

### Minimum Java SE Version
* **Java SE 17 or higher**

# Details

* [Jakarta Concurrency 3.1 Release Record](https://projects.eclipse.org/projects/ee4j.cu/releases/3.1)
  * [Jakarta Concurrency 3.1 Release Plan](https://projects.eclipse.org/projects/ee4j.cu/releases/3.1/plan)
  * [Jakarta EE Platform 11 Release Plan](https://projects.eclipse.org/projects/ee4j.jakartaee-platform/releases/11/plan)
* [Jakarta Concurrency 3.1 Specification Document](./jakarta-concurrency-spec-3.1.pdf) (PDF)
* [Jakarta Concurrency 3.1 Specification Document](./jakarta-concurrency-spec-3.1.html) (HTML)
* [Jakarta Concurrency 3.1 Javadoc](./apidocs)
* [Jakarta Concurrency 3.1 TCK](https://download.eclipse.org/jakartaee/concurrency/3.1/concurrency-tck-3.1.1.zip), ([sig](https://download.eclipse.org/jakartaee/concurrency/3.1/concurrency-tck-3.1.1.zip.sig), [sha](https://download.eclipse.org/jakartaee/concurrency/3.1/concurrency-tck-3.1.1.zip.sha256), [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
  * Signature tests are included with the TCK and run automatically as part of it
* Maven coordinates
  * [jakarta.enterprise.concurrent:jakarta.enterprise.concurrent-api:3.1.1](https://search.maven.org/artifact/jakarta.enterprise.concurrent/jakarta.enterprise.concurrent-api/3.1.1/jar)
* Compatible Implementation used for [ratification](https://www.eclipse.org/projects/efsp/?version=1.2#efsp-ratification)
  * [Open Liberty 24.0.0.6-beta](https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/tck/2024-04-23_2000/openliberty-24.0.0.6-beta-cl240520240423-2000.zip)

# Compatible Implementations

* [Open Liberty 24.0.0.6-beta](https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/tck/2024-04-23_2000/openliberty-24.0.0.6-beta-cl240520240423-2000.zip)

# Ballots

## Release Review

The Specification Committee Release Review ballot completed successfully on 2024-06-05 with unanimous results:

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Jun Qian                                       | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

Nonbinding votes were also received:
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Angelo Rubini                                  | Community           |   +1    |
|                                                | **Total**           |  **1**  |

This ballot was conducted between May 23 and June 5, 2024 and concluded upon all eligible members voting. The ballot was held on the public e-mail list [jakarta.ee-spec@eclipse.org](mailto:jakarta.ee-spec@eclipse.org). The results are archived under [this thread](https://www.eclipse.org/lists/jakarta.ee-spec/msg03390.html).

## Plan Review

The Specification Committee Ballot concluded successfully on 2023-07-31 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |   +1    |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |   +1    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members |   +1    |
| Werner Keil                                    | Committer Members   |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
| Scott Stark, Scott Marlow                      | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |
This ballot was conducted between July 23 and July 31, 2023. Using [jakarta.ee-spec@eclipse.org](mailto:jakarta.ee-spec@eclipse.org). Results are archived under [this thread](https://www.eclipse.org/lists/jakarta.ee-spec/msg03033.html), and [this](https://www.eclipse.org/lists/jakarta.ee-spec/msg03036.html).


