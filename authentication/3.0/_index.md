---
title: "Jakarta Authentication 3.0 (under development)"
date: 2021-04-15
summary: "Release for Jakarta EE 10"
---
Jakarta Authentication defines a general low-level SPI for authentication mechanisms, which are controllers
that interact with a caller and a container's environment to obtain the caller's credentials, validate these,
and pass an authenticated identity (such as name and groups) to the container.

Jakarta Authentication consists of several profiles, with each profile telling how a specific container
(such as Jakarta Servlet) can integrate with- and adapt to this SPI.

The goal of this release is to create a(n additional) Servlet Container Lite profile, and a REST profile. The existing SOAP profile is to be marked as stable. We'd like to update the Java 1.4 API to Java 5 (introduce generics) and clarify some spec text. 


The items are further explained below: 


1. Clarify interactions with other specs 

1.1 Clarify that the application Jakarta EE component namespaces (java:app, 
java:comp, etc) should be available from within a ServerAuthModule. 

Practical use case: obtaining application scoped data sources, EJB beans 
and other resources. 

Example: new InitialContext().lookup("java:app/myds") 

1.2 Clarify that the CDI default scopes for web components (@RequestScoped, 
@SessionScoped, etc) should be available from within a SAM. 

Practical use case: obtaining application scoped identity stores 

Example: CDI.current().select(SomeBean.class); // SomeBean is @RequestScoped 


2. Clarify the register session feature 

The spec text regarding how the "register session" feature should work is unclear. 
The spec lead under the JCP clarified this feature at various occasions and made the
remark that the spec should have said something about the groups. These clarifications
should be added to the spec text.


3. Expand the TCK 

The TCK is not optimally testing the basics yet, and a few simple (but crucial) tests
should be added.


4. Update the Java SE level 


Jakarta Authentication's API is still limited to Java SE 1.4. which feels curiously out of place 
in Jakarta EE 9, let alone Jakarta EE 10.

In practice this mostly boils down to adding generic parameters for the 
various maps Jakarta Authentication passes around. Where it makes sense default methods for 
interfaces could be considered. 


5. Detect invocation via authenticate() 

A ServerAuthModule can be called at the start of a request or following a call to 
request#authenticate(). 

A simple key in the message info map would suffice to distinguish between 
those two cases. Various implementations already have such a key in place, 
or have e.g. a boolean for this in the runtime method just before the ServerAuthModule 
is invoked. 

6. Introduce a factory method to register only a ServerAuthModule

The end user of Jakarta Authentication, as well as integrators such as Jakarta Security implementations almost always just care about registering a ServerAuthModule. Yet the AuthConfigFactory only accepts an AuthConfigProvider, which is essentially a "wrapper-wrapper-wrapper-wrapper" of a ServerAuthModule to the end user. A new method should be added to the AuthConfigFactory to only register a ServerAuthModule.


The JDK version required will be aligned with Jakarta EE 10.

* [Jakarta Authentication 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.authentication/reviews/3.0-release-review)

# Ballots

## Plan Review
<!--
The Specification Committee Ballot concluded successfully on 2021-xx-xx with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura                                 | Fujitsu             |      |
| Dan Bandera, Kevin Sutter                      | IBM                 |      |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |      |
| Andrew Pielage, Matt Gill                      | Payara              |      |
| Scott Stark, Mark Little                       | Red Hat             |      |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
| Scott (Congquan) Wang                          | Enterprise Members  |      |
|                                                | Total               |      |

The ballot was run in the [jakarta.ee-spec mailing list]()
-->
