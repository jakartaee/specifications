---
title: "Jakarta Validation 4.0"
date: 2024-03-27
summary: "Release for Jakarta EE 11"
---
Jakarta Validation defines a metadata model and API for JavaBean and method validation.

This release is targeting Jakarta EE 12 and will look to introduce the new features, possibly deprecate some of the existing features, .

### New features, enhancements or additions
<!-- List here -->
* - Actually deprecate the methods in `ConstraintViolationBuilder`,
    i.e. add `@Deprecated(since = "1.1", forRemoval = true)`, where there's currently just a Javadoc comment (`@deprecated`).
* Introduce the `ConstraintValidator#initialize(ConstraintDescriptor<A>, ConstraintValidatorInitializationContext)` to provide access to more information at constraint initialization step (e.g. `ClockProvider`, implementation specific context, etc.).
* Introduce `ConstraintDescriptor#getAttribute(String attributeName, Class<V> type)` to simplify working with constraint attributes.
* Clarify what happens when mixing inheritance and default group redefinition (https://hibernate.atlassian.net/browse/BVAL-711)
* Fix incorrect example in table 5.1 (https://hibernate.atlassian.net/browse/BVAL-698)
* In the XSD, relax the order of elements where the order does not matter (https://hibernate.atlassian.net/browse/BVAL-694)
* Clarify that behavior is undefined if legacy @Valid and type argument @Valid are given for same element, while at the same time encourage implementations to issue a warning to the users, as in the future spec version we are planning to enforce more strict rules and not support the "legacy" format anymore. (https://hibernate.atlassian.net/browse/BVAL-709)
* Support ConstraintValidator declaration via service loader (https://hibernate.atlassian.net/browse/BVAL-645)

* Drop use of `SecurityManager` (already done, but not a part of 3.1)
* Set the minimum JDK version (21 for Jakarta EE 12)
* Update dependencies for Jakarta EE 12

### Removals, deprecations or backwards incompatible changes
<!-- List here -->
* "4.3. Built-in value extractors", remove requirement:
  java.util.Optional; value() must be invoked, passing null as node name and passing the contained object as value or null if none is present
* Array element annotations. This will most likely require some breaking changes, similar to removing legacy `@Valid` support.
* warn users about the misuse of the constraint annotation, so that we can then break the "legacy approach" in the following major
* SecurityManager usage

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 21 or higher**

# Details

* [Jakarta Validation 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.validation/releases/4.0)
* [Jakarta Validation 4.0 Specification Document](jakarta-validation-spec-4.0.pdf) (PDF)
* [Jakarta Validation 4.0 Specification Document](jakarta-validation-spec-4.0.html) (HTML)
* [Jakarta Validation 4.0 Javadoc](./apidocs)
* [Jakarta Validation 4.0 TCK](https://download.eclipse.org/jakartaee/bean-validation/4.0/validation-tck-dist-4.0.0.zip)
([sig](https://download.eclipse.org/jakartaee/bean-validation/4.0/validation-tck-dist-4.0.0.zip.sig), 
[sha](https://download.eclipse.org/jakartaee/bean-validation/4.0/validation-tck-dist-4.0.0.zip.sha256), 
[pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
  * [jakarta.validation:jakarta.validation-api:jar:4.0.0](https://central.sonatype.com/artifact/jakarta.validation/jakarta.validation-api/4.0.0/jar)

# Compatible Implementations
* [Hibernate Validator TBD](https://hibernate.org/validator/releases/8.x/)

# Ballots

## Release Review

TBD

The ballot will run in the [jakarta.ee-spec mailing list]()

## Plan Review

The Specification Committee Ballot is TBD.

The ballot was run on the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg03048.html)

<!--
## Release Review

The Specification Committee Ballot concluded successfully on TBD with the following results.
-->
