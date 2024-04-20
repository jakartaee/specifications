---
title: "Change Log"
date: 2024-04-12
summary: "Batch 2.1 Change Log"
---

# CHANGES IN THE 2.1.5 TCK

## Enabled TCK execution using Java 21

## Addressed TCK challenges:
* https://github.com/jakartaee/batch-tck/issues/71
   * Fixed by excluding test.  Opened follow-up issues to update specification doc to match excluded test, and to better define the functions in both specifications and TCKs.

# CHANGES IN THE 2.1.1 API 

This change did not impact the "specification" aspect of the API, e.g. the Javadoc.  Rather, it only related to the JAR manifest (OSGi bundle manifest) of the API JAR maintained by the Jakarta Batch specification & API project within the https://github.com/eclipse-ee4j/batch-api repository and released to Maven Central.  Still, we note the change here for the record.

## Bug Fix:
* https://github.com/eclipse-ee4j/batch-api/issues/201
  * Fixed incorrect version in OSGi bundle manifest

# CHANGES IN THE 2.1.1 TCK

## Addressed TCK challenges:
* https://github.com/eclipse-ee4j/batch-tck/issues/51
  * Fixed by documenting the workaround in TCK Reference Guide. Opened new enhancement issue to hopefully improve this area in a future release.
* https://github.com/eclipse-ee4j/batch-tck/issues/49 
  * Fixed by adjusting the test application to allow for multiple ways of implementations setting the correct step exit status.   This assumes that any implementation passing the earlier 2.1.0 TCK will also pass with this modifications (and this fact was confirmed via testing).

## Other fixes:
* Improved TCK runner parent POM to allow easier use of the reporting module:  https://github.com/eclipse-ee4j/batch-tck/issues/48


# CHANGES IN THE 2.1.0 RELEASE

* initial release of Jakarta Batch 2.1.0: Specification, API, TCK
