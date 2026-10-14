---
title: "Jakarta CRaC 1.0 (Under Development)"
date: 2026-10-05
summary: "The first release of Jakarta CRaC"
---

Jakarta CRaC defines how Jakarta EE runtimes take part in JVM checkpoint and restore, so that an application can be restored from a snapshot instead of starting from scratch. The goal is to cut startup time substantially while keeping applications correct and portable across compliant application servers.

The specification covers two ways of creating a checkpoint and restoring from it:

* **Automatic checkpoint**. The checkpoint is taken without user involvement, directly after the application server has been loaded and right before the application is loaded. Subsequent starts restore from this snapshot, so the server initialization cost is paid only once.
* **Manual checkpoint**. The user triggers the checkpoint from outside the JVM, for example with `jcmd`. The application server implements the CRaC Resource interface and acts as the single entry point for the JVM.

The notification procedure works in two steps. When a checkpoint is triggered, the JVM calls `beforeCheckpoint()` on the application server's Resource implementation. The server then informs all of its own critical resources, such as file handles and socket connections, so they can move into a safe state, for example by closing sockets and files. This is done through CDI events and annotations. After a restore, the JVM calls `afterRestore()` on the server, which in turn notifies the same resources through the same mechanism so they are available again when the application resumes.

The specification does not mandate a particular checkpoint/restore implementation. It defines the responsibilities of the application server and the behavior applications can rely on.

### New features, enhancements, or additions

* Define the automatic checkpoint: when it occurs in the server lifecycle and what state it may contain
* Define the manual checkpoint and restore flow triggered from outside the JVM
* Define the application server's obligation to implement the CRaC Resource interface and delegate to its own resources
* Define the CDI events and annotations used to notify resources before a checkpoint and after a restore, including ordering
* Define the expected behavior when a checkpoint or restore fails or is unavailable
* Provide a TCK and compatibility requirements

### Removals, deprecations, or backwards incompatible changes
<!-- List here -->
* **N/A**

### Minimum Java SE Version
<!-- Specify the minimum required Java SE version for this specification -->
**Java SE 21 or higher**

# Details

* Jakarta CRaC 1.0 Release Record <!--- * [Jakarta CRaC 1.0 Release Record]() -->


# Compatible Implementations
* TBD

<!--
# Ballots
## Creation and Plan Review

The Specification Committee Ballot concluded successfully on yyyy-MM-dd with the following results.

| Representative                       | Representative for:   | Vote    |
|--------------------------------------|-----------------------|---------|
| Kenji Kazumura                       | Fujitsu               |       |
| Tom Watson, Emily Jiang              | IBM                   |       |
| Dmitry Kornilov, Robert Patrick      | Oracle                |       |
| Andrew Pielage.                      | Payara                |       |
| David Blevins, Jean-Louis Monteiro   | Tomitribe             |       |
| Ivar Grimstad                        | EE4J PMC              |       |
| Arjan Tijms                          | Participant Members   |       |
| Werner Keil                          | Committer Members     |       |
| Jun Qian                             | Enterprise Members    |       |
| Zhai Luchao                          | Enterprise Members    |       |
|                                      | **Total**             | ** **   |
| Non-binding votes                    |                       |         |
| ------------------------------------ | --------------------- | ------- |
|                                      |                       |       |
|                                      | **Total**             | ** **   |

The ballot was run in the [jakarta.ee-spec mailing list]()
-->
