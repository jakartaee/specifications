---
title: "Jakarta Batch 2.1 (Under Development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---

Jakarta Batch specifies a Java API plus an XML-based job specification language (JSL), which lets you compose batch jobs in XML from reusable Java application artifacts and conveniently parameterize different executions of a single job.

# Plan
Jakarta Batch 2.1 will target the Jakarta EE 10 platform release.

Jakarta Batch 2.1 will be a minor update with fixes and enhancements, and will introduce a new requirement, explained below, to support integration with CDI.

## It will contain:

### CDI integration defined

The Jakarta Batch legacy, building from JSR 352, was to allow the use of CDI but not require it, and leave open the ability for an implementation to possibly use another dependency injection technology.

In order to simplify the spec, promote portability and better integration with the rest of the Jakarta Platform, we have decided to take an additional step and introduce a new requirement a Jakarta Batch implementation to integrate CDI.  
For example, an implementation will be required to be able to load a batch artifact as a CDI managed bean, so that injections of object instances can be managed using normal CDI lifecyle constructs, e.g. managed by CDI scopes, etc.

We plan to now enforce this requirement through tests in the Batch TCK.  We don't have an opinion currently if this will require additional TCK tests at the Jakarta EE Platform level.

We don't believe this will require any special deprecation statement at the specification level, since roughly speaking, there was not a well-defined, standard behavior that is no longer guaranteed.   It is possible that individual implementations may want or need to give specific guidance for users of earlier JSR 352 and Jakarta Batch releases related to this topic.

### Other enhancements.  

This set is being discussed and prioritized via the Jakarta Batch dev mailing list, and no firm commitments to any individual items have been made.

The working milestone is being tracked at: https://github.com/eclipse-ee4j/batch-api/milestone/1.  At the current pace, it is expected that the 2.1 delivery will include less than the full list of issues grouped here.
We are open to other minor fixes/enhancements to the Jakarta Batch API from our backlog at: https://github.com/eclipse-ee4j/batch-api/issues.

A good deal of the prioritization among these will likely come from the choice of individual committers deciding what to work on.

## It will also contain:

* Bug fixes as they arise during the release cycle
* Any updates required to meet the Java version requirements of Jakarta EE 10
* Any requirements identified by other specifications or the Jakarta EE 10 platform projects during the release cycle

## It may contain: 

### Standalone TCK refactor to include EE tests

Refactoring of the Batch standalone TCK, so the full suite, including the EE platform portion (which is currently only offered by the platform TCK ), can be run against a Batch implementation to ceritfy Batch compliance.  This would allow the Jakarta Batch project to avoid having to maintain a duplicate "fork" of these tests in the platform TCK.

This is the main TCK-related item, tracked via https://github.com/eclipse-ee4j/batch-tck/milestone/1


## Optional Features:

N/A


# Release Record

[Jakarta Batch 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.batch/releases/2.1.0)


# Ballots


## Plan Review

|                       |  Yes    | No  | Abstain  |
|-----------------------|---------|-----|----------|
|Fujitsu                |         |     |          |
|IBM                    |         |     |          |
|Oracle                 |         |     |          |
|Payara                 |         |     |          |
|Red Hat                |         |     |          |
|Tomitribe              |         |     |          |
|EE4J PMC               |         |     |          |
|Participant Members    |         |     |          |
|Committer Members      |         |     |          |
