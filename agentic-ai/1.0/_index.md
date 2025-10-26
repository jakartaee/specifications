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
    // In the future, there could be many other types of triggers such as Jakarta Messaging or direct invocation
    // from a programmatic life cycle API.
    @Trigger
    // Return type can be void or a domain object stored in the workflow and accessible in the context.
    // Parameters are automatically added to the workflow context.
    private void processTransaction(@Valid BankTransaction transaction) {
        // Simple check to see if this is a type of transaction that makes sense to check for fraud detection.
        // Could add a bit more data, likely looked up from a database, and return an enhanced version of
        // the transaction or return another domain object entirely. 
    }

    // Can return boolean or a built-in result Record type. In this initial release, workflows will
    // automatically end with a negative result.
    // In subsequent releases, more rubust decision flows should be possible, either with
    // annotations/EL and/or the programmatic workflow API.
    @Decision
    private Result checkFraud (BankTransaction transaction) {
        // One of the value propositions of the LLM facade is automatic type conversion in Java, both
        // for parameters and return types.
        // If nothing is specified, it's all strings.
        // Probably only JSON and String is supported initially for conversion.
        // Queries can be parameterized similar to Jakarta Persistence.
        String output = model.query(
            "Is this a fraudulent transaction? If so, how serious is it?", transaction);

        boolean fraud = isFraud(output); // Does some simple custom text parsing.
        Fraud details = null;

        if (fraud) {
            details = getFraudDetails(output); // Does some simple custom text parsing, possibly
                                               // involving database queries.
        }
 
        return new Result (fraud, details); 
    }

    // Only one action here, but there could be multiple actions and/or decisions in sequence.
    // In the initial version, it's just one linear flow.
    // In subsequent releases, the workflow API can define complex flows, including
    // pre-conditions for actions defined via annotation/EL.
    @Action
    // Notice that we are automatically injecting domain objects from the workflow context.
    private void handleFraud (Fraud fraud, BankTransaction transaction) {
        // This is an example of hard-coded logic, which would still be possible if desired.
        // <i>The power of a programmatic/structured workflow is that this could change entirely
        // at runtime, driven by further LLM queries.
        // Even for simple, static workflows, the API helps developers think through how agents
        // operate fundamentally - introducing a common vocabulary/patterns.</i>
        // Dynamically altered workflows could possibly be serialized into persistent storage.
        if (fraud.isSerious()) {
            alertBankSecurity(fraud);
        }

        Customer customer = getCustomer(transaction);
        alertCustomer(fraud, transaction, customer);
    }

    // In this initial release, outcomes are essentially the same as actions but specifically
    // mark the end of the workflow.
    // In subsequent releases, outcomes can do more powerful things such as pass a domain
    // object to a subsequent workflow or agent.
    // This is probably also where it best makes sense to dynamically alter a workflow using
    // a programmatic API.
    @Outcome
    private void processTransaction(BankTransaction transaction) {
        // Mark a transaction suspect, probably in the database.
    }
}
```

## Compatibility
- CDI 4/Jakarta EE 10
- Java SE 17
