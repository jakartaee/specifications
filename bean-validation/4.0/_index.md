---
title: "Jakarta Validation 4.0 (Under development)"
date: 2025-10-30
summary: "Release for Jakarta EE 12"
---
Jakarta Validation defines a metadata model and API for JavaBean and method validation.

This release is targeting Jakarta EE 12 and will look to introduce the new features, possibly deprecate some of the existing features, .

### New features, enhancements or additions
<!-- List here -->
* Actually deprecate the methods in `ConstraintViolationBuilder`,
    i.e. add `@Deprecated(since = "1.1", forRemoval = true)`, where there's currently just a Javadoc comment (`@deprecated`).
* Introduce the `ConstraintValidator#initialize(ConstraintDescriptor<A>, ConstraintValidatorInitializationContext)` to provide access to more information at constraint initialization step (e.g. `ClockProvider`, implementation specific context, etc.).
* Introduce `ConstraintDescriptor#getAttribute(String attributeName, Class<V> type)` to simplify working with constraint attributes.
* Clarify what happens when mixing inheritance and default group redefinition (https://github.com/jakartaee/validation/issues/261)
* Fix incorrect example in table 5.1 (https://github.com/jakartaee/validation/issues/259)
* In the XSD, relax the order of elements where the order does not matter (https://github.com/jakartaee/validation/issues/258)
* Clarify that behavior is undefined if legacy @Valid and type argument @Valid are given for same element, while at the same time encourage implementations to issue a warning to the users, as in the future spec version we are planning to enforce more strict rules and not support the "legacy" format anymore. (https://github.com/jakartaee/validation/issues/260)
* Support ConstraintValidator declaration via service loader (https://github.com/jakartaee/validation/issues/257)
  
* Drop use of `SecurityManager` (already done, but not a part of 3.1)
* Set the minimum JDK version (21 for Jakarta EE 12)
* Update dependencies for Jakarta EE 12

* Review the list of issues from the previous issue tracker and migrate the valid ones (https://github.com/jakartaee/validation/issues/227)

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* "4.3. Built-in value extractors", remove requirement:
  java.util.Optional; value() must be invoked, passing null as node name and passing the contained object as value or null if none is present
* Array element annotations. This will most likely require some breaking changes, similar to removing legacy `@Valid` support.
* Warn users about the misuse of the constraint annotation, so that we can then break the "legacy approach" in the following major
* SecurityManager usage

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 17 or higher**

# Details

* [Jakarta Validation 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.validation/releases/4.0)
* [Jakarta Validation 4.0 Specification Document](jakarta-validation-spec-4.0.0-M1.pdf) (PDF)
* [Jakarta Validation 4.0 Specification Document](jakarta-validation-spec-4.0.0-M1.html) (HTML)
* [Jakarta Validation 4.0 Javadoc](./apidocs)
* [Jakarta Validation 4.0 TCK](https://download.eclipse.org/jakartaee/bean-validation/4.0/validation-tck-distribution-4.0.0-M1.zip)
([sig](https://download.eclipse.org/jakartaee/bean-validation/4.0/validation-tck-distribution-4.0.0-M1.zip.asc), 
[sha](https://download.eclipse.org/jakartaee/bean-validation/4.0/validation-tck-distribution-4.0.0-M1.zip.sha256), 
[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
  * For all TCK releases, see [download directory](https://download.eclipse.org/jakartaee/bean-validation/4.0)
* Maven coordinates
  * [jakarta.validation:jakarta.validation-api:jar:4.0.0-M1](https://central.sonatype.com/artifact/jakarta.validation/jakarta.validation-api/4.0.0-M1/jar)

# Compatible Implementations
* [Hibernate Validator TBD(10.x)](https://hibernate.org/validator/releases/10.x/)

# Ballots
<!--
## Release Review
-->

## Plan Review

The Specification Committee Ballot concluded successfully on 2025-05-06 with the following results.

| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Kenji Kazumura                                 | Fujitsu             |   +1    |
| Emily Jiang, Tom Watson                        | IBM                 |   +1    |
| Ed Bratt, Dmitry Kornilov                      | Oracle              | no vote |
| Andrew Pielage, Petr Aubrecht                  | Payara              |   +1    |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    0    |
| Ivar Grimstad                                  | EE4J PMC            |   +1    |
| Marcelo Ancelmo, Abraham Marin-Perez           | Participant Members | no vote |
| Werner Keil                                    | Committer Members   |   +1    |
| Jun Qian                                       | Enterprise Members  |   +1    |
| Zhai Luchao                                    | Enterprise Members  |   +1    |
|                                                | **Total**           |  **7**  |

Non-binding Votes
| Representative                                 | Representative for: |  Vote   |
|------------------------------------------------|---------------------|---------|
| Michael Redlish                                | Community           |   +1    |
|                                                | **Total**           |  **1**  |

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03940.html)
