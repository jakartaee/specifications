---
title: "Jakarta Portlet 4.0 (under development)"
date: 2025-04-23
summary: "First release of Jakarta Portlet"
---

Jakarta Portlet enables the development of modular, reusable web components called portlets. These components are managed by a well-defined lifecycle (implemented by a portlet container) that includes action, render, event, and resource phases. A portal uses a portlet container implementation to host and coordinate portlets, assembling their output fragments into a unified, composite application interface. Portlets render markup fragments that are aggregated by the portal, typically as a complete HTML document.

### New features, enhancements or additions

Jakarta Portlet 4.0 is focused on migrating the JSR 362 Specification and API (Portlet 3.0) from Java EE to Jakarta EE. This includes updating package namespaces from `javax.portlet` to `jakarta.portlet`, migrating XML namespaces from "http://xmlns.jcp.org/xml/ns/portlet" to "http://jakarta.ee/xml/ns/portlet", and aligning Java EE dependencies such as `javax.servlet` with their Jakarta EE 10 equivalents.

Future iterations of the project may introduce new features and enhancements, but the initial scope is strictly limited to completing the namespace and dependency migration to ensure compatibility with Jakarta EE 10 and to ease the migration path for developers and organizations.

### Removals, deprecations or backwards incompatible changes

As a major release, from the perspective of semantic versioning, Jakarta Portlet 4.0 introduces breaking changes that affect both portlet applications and container implementations. The renaming of packages from `javax.portlet` to `jakarta.portlet` will require source code changes and recompilation. These changes are not binary compatible with earlier versions and reflect the transition from Java EE to Jakarta EE.

### Minimum Java SE Version

**Java SE 11 or higher**
