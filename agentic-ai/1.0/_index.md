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
    @Inject private EntityManager entityManager;

    // Initiates the agent workflow. For this initial release, the workflow can only be triggered by CDI events.
    // In the future, there could be many other types of triggers such as Jakarta Messaging or direct invocation from a programmatic
    // life cycle API.
    @Trigger
    // Return type can be void or a domain object stored in the workflow and accessible in the context.
    // Parameters are automatically added to the workflow context.
    private void processTransaction(@Valid BankTransaction transaction) {
        // Simple check to see if this is a type of transaction that makes sense to check for fraud detection.
        // Could add a bit more data, likely looked up from a database, and return an enhanced version of
        // the transaction or return another domain object entirely. 
    }

    // In this initial release, outcomes are essentially the same as actions but specifically mark the end of the workflow.
    // In subsequent releases, outcomes can do more powerful things such as pass a domain object to a subsequent workflow or agent.
    // This is probably also where it best makes sense to dynamically alter a workflow using a programmatic API.
    @Outcome
    private void processTransaction(BankTransaction transaction) {
        // Mark a transaction suspect, probably in the database.
    }
}
```

## Compatibility
- CDI 4/Jakarta EE 10
- Java SE 17
