---
title: "Jakarta Expression Language 5.0"
date: 2021-05-31
summary: "Release for Jakarta EE 10"
---
Jakarta Expression Language defines an expression language for Java applications.

While this is a major release due to the removal of a long deprecated method, the focus of the release has been on clarifying areas of the specification where ambiguity had been identified and on making a number of small enhancements to increase the usability of the API.

This release also laid the groundwork for the removal of the dependency on the java.desktop module which is planned for the next release.

### New Features, Enhancements, or Additions
* The BeanELResolver has been updated to consider default method 
implementations when looking for property getters, property setters and 
methods.
* Support has been added for coercing a LambdaExpression instance to a 
functional interface method invocation.
* Support has been added for coercing arrays.
* The MethodReference class has been added to provide access to details of 
the method to which a MethodExpression resolves, including any 
annotations present on the method.
* Generics are now used throughout the API.
* The expected behaviour when matching expressions to methods based on 
parameter types has been clarified.
* The EL specification now explicitly states that specifications that 
depend on the EL specification may define further packages, in 
additional to java.lang.*, that are imported by default into the EL 
environment.

### Removals, Deprecations or Backwards Incompatible Changes
* The deprecated, misspelt method MethodExpression.isParmetersProvided() 
has been removed.
* The ELResolver method getFeatureDescriptors() has been deprecated with 
removal planed for EL 6.0. This is to remove the dependency on the 
java.desktop module from the EL API.
* A default implementation that returns null has been added to the 
ELResolver method getFeatureDescriptors() since it has been deprecated 
so that custom ELResolver implementations do not need to implement the 
method.
* Explicitly document that ELResolver.getType() must return null if either 
the ELResolver or the resolved property is read-only. This changes the 
documented behaviour of the StaticFieldELResolver.

### Minimum Java SE Version
**Java SE 11 or higher**

# Details

* [Jakarta Expression Language 5.0 Release Record](https://projects.eclipse.org/projects/ee4j.el/releases/5.0.0)
    * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Expression Language 5.0 Specification Document](./jakarta-expression-language-spec-5.0.pdf) (PDF)
* [Jakarta Expression Language 5.0 Specification Document](./jakarta-expression-language-spec-5.0.html) (HTML)
* [Jakarta Expression Language 5.0 Javadoc](./apidocs)
* [Jakarta Expression Language 5.0 TCK](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip)  ([sig](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/expression-language/5.0/jakarta-expression-language-tck-5.0.0.zip.sha256),  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.el:jakarta.el-api:jar:5.0.0](https://central.sonatype.com/artifact/jakarta.el/jakarta.el-api/5.0.0/jar)

# Compatible Implementations
* [Eclipse Expressly 5.0.0-M2](https://github.com/eclipse-ee4j/expressly)

# Ballots

## Plan Review

The Plan Review Specification Committee Ballot concluded successfully on 12/05/2021 (May 12th 2021) with the following results.

| Representative                     | Representative for: |  Vote   |
|------------------------------------|---------------------|---------|
| Kenji Kazumura                     | Fujitsu             | +1      |
| Dan Bandera, Kevin Sutter          | IBM                 | +1      |
| Ed Bratt, Dmitry Kornilov          | Oracle              | +1      |
| Andrew Pielage, Matt Gill          | Payara              | +1      |
| Scott Stark, Mark Little           | Red Hat             | No vote |
| David Blevins, Jean-Louis Monteiro | Tomitribe           | +1      |
| Ivar Grimstad                      | EE4J PMC            | +1      |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members | +1      |
| Werner Keil                        | Committer Members   | +1      |
| Dr. Jun Qian                       | Enterprise Members  | +1      |
|                                    | **Total**           | 9       |

 This ballot was conducted on the public e-mail list [jakarta.ee-spec@eclipse.org](https://www.eclipse.org/lists/jakarta.ee-spec/). This ballot thread begins [here](https://www.eclipse.org/lists/jakarta.ee-spec/msg01622.html).
 
## Release Review

The Release Review Specification Committee Ballot concluded successfully on 09/05/2022 (May 9th 2022) with the following results.

| Representative                     | Representative for: | Vote   |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |    +1  |
| Tom Watson, Emily Jiang            | IBM                 |    +1  |
| Ed Bratt, Dmitry Kornilov          | Oracle              |    +1  |
| Andrew Pielage, Petr Aubrecht      | Payara              |    +1  |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |    +1  |
| Ivar Grimstad                      | EE4J PMC            |    +1  |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |    +1  |
| Werner Keil                        | Committer Members   |    +1  |
| Jun Qian                           | Enterprise Members  |    +1  |
| Zhai Luchao                        | Enterprise Members  |    +1  |
|                                    | **Total**           | **10** |

 This ballot was conducted on the public e-mail list [jakarta.ee-spec@eclipse.org](https://www.eclipse.org/lists/jakarta.ee-spec/). This ballot thread begins [here](https://www.eclipse.org/lists/jakarta.ee-spec/msg02419.html).
