---
title: "Change Log"
date: 2022-06-06
summary: "Release for Jakarta EE 10"
---

### CHANGES IN THE 2.1.1 RELEASE

* Addressed TCK challenges:
  * https://github.com/eclipse-ee4j/batch-tck/issues/51 - Fixed by documenting the workaround in TCK Reference Guide. Opened new enhancement issue to hopefully improve this area in a future release.
  * https://github.com/eclipse-ee4j/batch-tck/issues/49 - Fixed by adjusting the test application to allow for multiple ways of implementations setting the correct step exit status.   This assumes that any implementation passing the earlier 2.1.0 TCK will also pass with this modifications (and this fact was confirmed via testing).

* Improved TCK runner parent POM to allow easier use of the reporting module:  https://github.com/eclipse-ee4j/batch-tck/issues/48

### CHANGES IN THE 2.1.0 RELEASE

* initial release of Jakarta Batch 2.1.0
