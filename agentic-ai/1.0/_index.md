---
title: "Jakarta Agentic Artificial Intelligence 1.0 (under development)"
date: 2025-12-31
summary: "Jakarta Config is a Jakarta EE specification project. It defines a core framework for the Jakarta EE platform allowing applications and other Jakarta EE components to read configuration data from different environment-aware sources in a portable way."
---

Jakarta Config defines a core framework for the Jakarta EE platform allowing applications and other Jakarta EE components to read configuration data from different environment-aware sources in a portable way.

Jakarta Config is planning to release the first MVP (Minimum Viable Product) version. The main goal is to demonstrate progress and collect feedback from the community.

## API Concepts

Configuration is provided by configuration objects only

```java
@Agent
public class FraudDetectionAgent {
	Integer getConfigProperty1();
	String getConfigProperty2();
	MyConfigObject getMyConfigObject();
}
```
Samples don't represent the real APIs to create and provided only for idea demonstration.

## Compatibility
- CDI 4
- Java SE 17
