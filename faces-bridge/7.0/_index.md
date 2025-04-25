---
title: "Jakarta Faces Bridge 7.0 (under development)"
date: 2025-04-23
summary: "First release of Jakarta Faces Bridge"
---

Jakarta Faces Bridge defines the behavior and APIs necessary for Jakarta Faces applications to operate within a portlet environment. It provides a bridge that aligns the Jakarta Faces lifecycle with the Jakarta Portlet lifecycle. This enables developers to use features such as declarative Facelet views, navigation-rules, and component suites while maintaining compatibility with the multi-phase request and response model defined by portlet containers.

### New features, enhancements or additions

Jakarta Faces Bridge 7.0 is focused on migrating the JSR 378 Specification and API from Java EE to Jakarta EE. This includes updating package namespaces from `javax.portlet.faces` to `jakarta.portlet.faces` and aligning Java EE dependencies such as `javax.servlet` and `javax.faces` with their Jakarta EE 10 equivalents.

Future iterations of the project may introduce new features and enhancements, but the initial scope is strictly limited to completing the namespace and dependency migration to ensure compatibility with Jakarta EE 10 and to ease the migration path for developers and organizations.

### Removals, deprecations or backwards incompatible changes

As a major release, from the perspective of semantic versioning, Jakarta Faces Bridge 7.0 introduces breaking changes that affect both Faces applications deployed as portlets. The renaming of packages from `javax.portlet.faces` to `jakarta.portlet.faces` will require source code changes and recompilation. These changes are not binary compatible with earlier versions and reflect the transition from Java EE to Jakarta EE.

### Minimum Java SE Version

**Java SE 11 or higher**

# Details

* [Jakarta Portlet 4.0 Release Record](https://projects.eclipse.org/projects/ee4j.faces-bridge/releases/7.0) (to be created when the project is provisioned)

# Compatible Implementations
* TBD
