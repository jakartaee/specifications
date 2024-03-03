---
title: "Change Log"
date: 2023-04-29
summary: "Release for Jakarta EE 10"
---

### CHANGES IN THE 2.1.3 RELEASE

* API erroneously assumes that classes can be loaded from `Thread#getContextClassLoader`
* API jar allows reproducible build

### CHANGES IN THE 2.1.2 RELEASE

* adds missing javadoc description
* removes wrongly compiled package-info files

### CHANGES IN THE 2.1.1 RELEASE

* removes a need for accessDeclaredMembers permissions when loading the DataHandler
* loads provider implementations under doPrivileged
* provides metadata for integration with OSGi Mediator Specification

### CHANGES IN THE 2.1.0 RELEASE

* initial release for Jakarta EE 10
