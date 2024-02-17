---
title: "Change Log"
date: 2023-05-05
summary: "Release for Jakarta EE 10"
---

### CHANGES IN THE 2.1.3 RELEASE

* fixes the classloader used by `Session.getService` in OSGI environment
  API erroneously assumes that classes can be loaded from `Thread#getContextClassLoader`
* API jar allows reproducible build
* fixes `SharedFileInputStream` compliance with the spec
* fixes parsing messages without a session
 
### CHANGES IN THE 2.1.2 RELEASE

* adds missing javadoc description
* fixes typo in javadoc description
* removes wrongly compiled package-info files
* fixes integration with hk2servicelocator

### CHANGES IN THE 2.1.1 RELEASE

* implements equals() and hashcode() on jakarta.mail.Header
* fixes problem with finding /META-INF/javamail.default.address.map
* removes a need for accessDeclaredMembers permissions when loading the DataHandler
* loads provider implementations under doPrivileged
* provides metadata for integration with OSGi Mediator Specification

### CHANGES IN THE 2.1.0 RELEASE

* initial release for Jakarta EE 10