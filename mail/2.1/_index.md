---
title: "Jakarta Mail 2.1"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---

The goal of this release is to provide standalone API jar fully independent
on the particular implementation.

### New Features, Enhancements, or Additions
The API is now standalone from what was previously the reference implementation.

### Removals, Deprecations or Backwards Incompatible Changes
None

### Minimum Java SE Version
**11**

# Details

* [Jakarta Mail 2.1 Release Record](https://projects.eclipse.org/projects/ee4j.mail/releases/2.1)
    * [Jakarta EE Platform 10 Release Plan](https://jakartaee.github.io/jakartaee-platform/jakartaee10/JakartaEE10ReleasePlan)
* [Jakarta Mail 2.1 Specification Document](./jakarta-mail-spec-2.1.pdf) (PDF)
* [Jakarta Mail 2.1 Specification Document](./jakarta-mail-spec-2.1.html) (HTML)
* [Jakarta Mail 2.1 Javadoc](./apidocs)
* [Jakarta Mail 2.1 TCK](https://download.eclipse.org/jakartaee/mail/2.1/jakarta-mail-tck-2.1.0.zip)  ([sig](https://download.eclipse.org/jakartaee/mail/2.1/jakarta-mail-tck-2.1.0.zip.sig),  [sha](https://download.eclipse.org/jakartaee/mail/2.1/jakarta-mail-tck-2.1.0.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
    * Addresses Mail Challenge (Issue [#625](https://github.com/jakartaee/mail-api/issues/625))  [Jakarta Mail 2.1.1 TCK](https://download.eclipse.org/jakartaee/mail/2.1/jakarta-mail-tck-2.1.1.zip)  ([sig](https://download.eclipse.org/jakartaee/mail/2.1/jakarta-mail-tck-2.1.1.zip.sig),  [sha](https://download.eclipse.org/jakartaee/mail/2.1/jakarta-mail-tck-2.1.1.zip.sha256),  [pub](https://jakarta.ee/specifications/jakartaee-spec-committee.pub))
* Maven coordinates
    * [jakarta.mail:jakarta.mail-api:jar:2.1.2](https://search.maven.org/artifact/jakarta.mail/jakarta.mail-api/2.1.2/jar)
* [Change Log](./changelog)


# Compatible Implementations

* [Angus Mail 2.0.2](https://eclipse-ee4j.github.io/angus-mail)

# Ballots

## Release Review

The Specification Committee Ballot concluded successfully on 2022-02-10 with the following results.


| Representative                     | Representative for: | Vote   |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             | +1     |
| Tom Watson, Emily Jiang            | IBM                 | +1     |
| Ed Bratt, Dmitry Kornilov          | Oracle              | +1     |
| Andrew Pielage                     | Payara              | +1     |
| David Blevins, Jean-Louis Monteiro | Tomitribe           | +1     |
| Ivar Grimstad                      | EE4J PMC            | +1     |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members | +1     |
| Werner Keil                        | Committer Members   | +1     |
| Jun Qian                           | Enterprise Members  | +1     |
| Zhai Luchao                        | Enterprise Members  | +1     |  
|                                    | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02184.html)

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-03 with the following results.

| Representative                     | Representative for: |  Vote  |
|------------------------------------|---------------------|--------|
| Kenji Kazumura                     | Fujitsu             | +1     |
| Dan Bandera, Kevin Sutter          | IBM                 | +1     |
| Ed Bratt, Dmitry Kornilov          | Oracle              | +1     |
| Andrew Pielage, Matt Gill          | Payara              | +1     |
| Scott Stark, Mark Little           | Red Hat             | +1     |
| David Blevins, Jean-Louis Monteiro | Tomitribe           | +1     |
| Ivar Grimstad                      | EE4J PMC            | +1     |
| Marcelo Ancelmo, Martijn Verburg   | Participant Members | +1     |
| Werner Keil                        | Committer Members   | +1     |
| Dr. Jun Qian                       | Enterprise Members  | +1     |
|                                    | **Total**           | 10     |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01555.html)
