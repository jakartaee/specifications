---
title: "Jakarta Agentic Artificial Intelligence"
summary: "The Jakarta Agentic AI project provides a set of vendor-neutral APIs that make it easy, consistent, and reliable to build, deploy, and run AI agents on Jakarta EE runtimes."
summary_sixty_char: "Jakarta API for Agentic AI"
project_id: "ee4j.agentic-ai"
---

Artificial Intelligence (AI) agents are one of the most prominent developments in enterprise and cloud native computing in decades. They promise to fundamentally accelerate innovation, automation, and productivity by leveraging AI in virtually every industry – IT, finance, banking, retail, manufacturing, health care, and so many others. Agents operate by leveraging Neural Networks, Machine Learning (ML), Natural Language Processing (NLP), Large Language Models (LLMs), and many other AI technologies to aim to perform specific tasks autonomously with little or no human intervention. They detect events, gather data, generate self-correcting plans, execute actions, process results, and evolve subsequent decisions. Examples include self-driving cars, security monitors, Site Reliability Engineering (SRE) agents, stock monitors, code/application generators, health monitors, customer service agents, manufacturing robots, and many others.

The Jakarta Agentic AI project provides a set of vendor-neutral APIs that make it easy, consistent, and reliable to build, deploy, and run AI agents on Jakarta EE runtimes.

## Scope
* Defines common usage patterns and life cycles for AI agents running on Jakarta EE runtimes.
* Provides very minimal facade to access more foundational AI capabilities, such as LLMs, without attempting to standardize LLMs. Instead, the API provides easy, pluggable, and configurable access to existing LLM APIs such as LangChain4j and Spring AI. This is similar to how Jakarta Persistence provides access to underlying non-standard APIs by unwrapping.
* The API will likely include a mechanism to define agent workflows. This will be done using a fluent Java API (as opposed to XML). The agent workflow will likely be dynamic at runtime rather than strictly defined and static at deployment time. A pluggability mechanism may be provided for YAML and XML.
* Defines integrations with other key Jakarta EE APIs such as Validation, REST, JSON Binding, Persistence, Data, Transactions, NoSQL, Concurrency, Security, Messaging, and so on.
* The project will aim to utilize Jakarta Config if possible. It may allow implementations to utilize MicroProfile Config.
* Implementations may provide integrations with OpenTelemetry.
* The project makes a reasonable effort to keep the API potentially usable in runtimes such as Quarkus, Micronaut, and Spring Boot though Jakarta EE compatible runtimes are the clear primary target.

## Standalone Specification
The project will not initially seek inclusion into the Jakarta EE platform or any profile. Rather, the project will seek to provide a usable standalone API under the Jakarta EE umbrella that vendors may choose to adopt. In the future, it may make sense to define a Jakarta EE profile for AI in general to which this project could be added. Such a profile could conceivably also include separate specifications to attempt to standardize other important AI concepts such as LLMs and model augmentation/context servers.

## Community
The project aims for the broadest industry consensus possible by engaging as many relevant subject matter experts and API consumers as possible, from within the Java/Jakarta EE ecosystem as well as externally.
