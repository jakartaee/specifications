---
title: "Jakarta Security 3.0 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta Security defines a standard for creating secure Jakarta EE applications in modern application paradigms.

The goal of this release is to continue adding features and evolving the API. A number of those had been discussed and even had prototype implementations during the development of the previous version, but didn't make it in.

More specifically:

Additional authentication mechanisms:
* Client-cert and Digest [SECURITY #120](https://github.com/eclipse-ee4j/security-api/issues/120)
* OpenID Connect [SECURITY #183](https://github.com/eclipse-ee4j/security-api/issues/183)
* OAuth2 

Extended authentication mechanisms:
* Authentication mechanism per URL [SECURIY #86](https://github.com/eclipse-ee4j/security-api/issues/86)
* User choice of authentication mechanism (login with provider X, login with provider Y, etc)
* Multiple authentication mechanisms (try JWT, fallback to BASIC, etc)


CDI:
* @RolesAllowed alternative
* Easily adding an interceptor to a build-in CDI bean [blog](https://arjan-tijms.omnifaces.org/2017/08/dynamically-adding-interceptor-to-build.html) 


Features
* Authorization modules [blog](https://arjan-tijms.omnifaces.org/2016/07/simplified-custom-authorization-rules.html)

The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta Security 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.es/releases/3.0)

# Ballots

## Plan Review

The Specification Committee Ballot concluded successfully on 2021-05-27 with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |  +1  |
| Dan Bandera, Kevin Sutter                      | IBM                 | no vote |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |  +1  |
| Andrew Pielage, Matt Gill                      | Payara              |  +1  |
| Scott Stark, Mark Little                       | Red Hat             |  +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |  +1  |
| Ivar Grimstad                                  | EE4J PMC            |  +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |  +1  |
| Werner Keil                                    | Committer Members   |  +1  |
| Scott (Congquan) Wang                          | Enterprise Members  |  +1  |
|                                                | **Total**           |  9   |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg01743.html)
