---
title: "Jakarta CRaC"
summary: "Jakarta CRaC defines a standard behaviour for Jakarta EE applications and runtime for checkpoint and restore events."
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "Standardizes the behaviour for checkpoint and restore events"
project_id: "ee4j.crac"
---

The CRaC (Coordinated Restore at Checkpoint) Project researches coordination of Java programs with mechanisms to checkpoint (make an image of, snapshot) a Java instance while it is executing. Restoring from the image could be a solution to some of the problems with the start-up and warm-up times.

Jakarta CRaC defines how to make the runtime aware of a checkpoint being taken and when it is being restored. It also defines a way for application developers to give instructions to the runtime how to handle external resources used by the application.