---
title: "Jakarta Interceptors 2.2"
date: 2024-04-05
summary: "Release for Jakarta EE 11"
---
Jakarta Interceptors defines a means of interposing on business method invocations and specific
events—such as lifecycle events and timeout events—that occur on instances of Jakarta EE components
and other managed classes.

### New features, enhancements or additions
<!-- List here -->
* Updated dependencies for Jakarta EE 11
  * Jakarta Annotations to 3.0.0
* [Add standard accessor to interceptor bindings](https://github.com/jakartaee/interceptors/issues/100)
* [Provide access to interceptor bindings from InvocationContext](#https://github.com/jakartaee/interceptors/pull/99)
* Improve InvocationContext.getInterceptorBindings() language
  * [More precise language for InvocationContext.getInterceptorBindings()](https://github.com/jakartaee/interceptors/pull/103)
  * [Clarify behavior of InvocationContext.getInterceptorBindings() in case of inherited/transitive bindings](https://github.com/jakartaee/interceptors/pull/106)

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* None

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 11 or higher**
The binary target level is 11.

# Details

* [Jakarta Interceptors 2.2 Release Record](https://projects.eclipse.org/projects/ee4j.interceptors/releases/2.2)
* [Jakarta Interceptors 2.2 Specification Document](./jakarta-interceptors-spec-2.2.pdf) (PDF)
* [Jakarta Interceptors 2.2 Specification Document](./jakarta-interceptors-spec-2.2.html) (HTML)
* [Jakarta Interceptors 2.2 Javadoc](./apidocs)
* [Jakarta Contexts Dependency Injection 4.1.0 TCK](https://www.eclipse.org/downloads/download.php?file=/ee4j/cdi/4.1/cdi-tck-4.1.0-dist.zip),
   [sha](7671d6895eb57b74b52e46b63adfeb57adf965dd91efc673db21a781fedc452f),
   [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.interceptor:jakarta.interceptor-api:jar:2.2.0](https://central.sonatype.com/artifact/jakarta.interceptor/jakarta.interceptor-api/2.2.0/jar)


# Compatible Implementations

* [Weld 6.0.0.Beta1](https://weld.cdi-spec.org/download/)

# Ballots
## Release Review

The Specification Committee Ballot completed on 10th April 2024.

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
| Scott Stark                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03230.html)

## Plan Review

The Specification Committee Ballot completed on 11th July 2023.

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
| Scott Stark                                    | Enterprise Members  |   +1    |
|                                                | **Total**           | **10**  |

Non-binding votes

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Jun Qian                                       | Primeton            |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02951.html)

