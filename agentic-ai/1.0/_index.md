---
title: "Jakarta Agentic Artificial Intelligence 1.0 (under development)"
date: 2025-12-31
summary: "The Jakarta Agentic AI project provides a set of vendor-neutral APIs that make it easy, consistent, and reliable to build, deploy, and run AI agents on Jakarta EE runtimes."
---

The Jakarta Agentic AI project provides a set of vendor-neutral APIs that make it easy, consistent, and reliable to build, deploy, and run AI agents on Jakarta EE runtimes.

This minimal initial release seeks to build early momentum, including broadening awareness, participation, and adoption. Subsequently, we aim to iterate quickly based on evolving industry knowledge on Agentic AI as well as user feedback.

The release focuses on key programming models, patterns, life cycles, as well as a lightweight LLM facade. Subsequent releases will likely focus more on a programmatic life cycle management as well as workflow API.

## API Concepts

The following annotated example demonstrates the key concepts this initial minimal release will aim to build consensus and momentum around.

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
