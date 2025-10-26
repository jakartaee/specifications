---
title: "Jakarta Agentic Artificial Intelligence 1.0 (under development)"
date: 2025-12-31
summary: "The Jakarta Agentic AI project provides a set of vendor-neutral APIs that make it easy and reliable to build, deploy, and run AI agents on Jakarta EE runtimes."
---

The Jakarta Agentic AI project provides a set of vendor-neutral APIs that make it easy and reliable to build, deploy, and run AI agents on Jakarta EE runtimes.

Jakarta Config is planning to release the first MVP (Minimum Viable Product) version. The main goal is to demonstrate progress and collect feedback from the community.

## API Concepts

Configuration is provided by configuration objects only

```java
/*
 * Simple agent for bank fraud detection. Doesn't actually block a transaction but marks it suspect and sends notifications.
 */
// Infers agent type and name by default.
// Default scope is agent workflow, but agents can have application scope.
// Just a CDI bean and ideally @Agent is a CDI stereotype.
@Agent
public class FraudDetectionAgent {

    // Injects default LLM in the implementation, but can be configured to inject specific ones.
    @Inject private LargeLanguageModel model;
	String getConfigProperty2();
	MyConfigObject getMyConfigObject();
}
```

## Compatibility
- CDI 4
- Java SE 17
