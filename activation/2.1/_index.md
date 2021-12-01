---
title: "Jakarta Activation 2.1 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---

Jakarta Activation defines a set of standard services to: determine the
MIME type of an arbitrary piece of data; encapsulate access to it;
discover the operations available on it; and instantiate the
appropriate bean to perform the operation(s).

The goal of this release is to provide standalone API jar fully independent
on the particular implementation.

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta Activation 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.jaf/releases/2.1)
* [Jakarta Activation 2.1 Specification Document](./jakarta-activation-spec-2.1.pdf) (PDF)
* [Jakarta Activation 2.1 Specification Document](./jakarta-activation-spec-2.1.html) (HTML)
* [Jakarta Activation 2.1 Javadoc](./apidocs)
* [Jakarta Activation 2.1 TCK](https://download.eclipse.org/jakartaee/activation/2.1/jakarta-activation-tck-2.1.0.zip)
  ([sig](https://download.eclipse.org/jakartaee/activation/2.1/jakarta-activation-tck-2.1.0.zip.sig),
  [sha](https://download.eclipse.org/jakartaee/activation/2.1/jakarta-activation-tck-2.1.0.zip.sha256),
  [pub](https://raw.githubusercontent.com/jakartaee/specification-committee/master/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.activation:jakarta.activation-api:jar:2.1.0](https://search.maven.org/artifact/jakarta.activation/jakarta.activation-api/2.1.0/jar)

# Compatible Implementations

* [Eclipse Angus/Activation 1.0.0](https://github.com/eclipse-ee4j/angus-activation/releases)


# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-27 with the following results.

| Representative                     | Representative for: |  Vote  |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter          | IBM                 | no vote |
| Ed Bratt, Dmitry Kornilov          | Oracle              |  +1  |
| Andrew Pielage, Matt Gill          | Payara              |  +1  |
| Scott Stark, Mark Little           | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro | Tomitribe           |  +1  |
| Ivar Grimstad                      | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members |  +1  |
| Werner Keil                        | Committer Members   |  +1  |
| Scott (Congquan) Wang              | Enterprise Members  |  +1  |
|                                    | **Total**           | 9 |
The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01747.html)

