---
title: "Jakarta Bean Validation 3.0 (Milestone)"
date: 2020-06-09
summary: "Release for Jakarta EE 9"
spec_version: 3.0
tck_version: 3.0.0-M1
enableInlineShortcode: true
---
{{< tckdownload.inline >}}{{ http://download.eclipse.org/ee4j/{{substr .Page.Params.project_id 5}}/{{.Page.Params.spec_version}}/beanvalidation-tck-dist-{{.Page.Params.tck_version}}.zip }}{{< /tckdownload.inline >}}
Jakarta Bean Validation defines a metadata model and API for JavaBean and method validation.

* [Jakarta Bean Validation 3.0 Release Record](https://projects.eclipse.org/projects/ee4j.bean-validation/releases/3.0)
  * [Jakarta EE Platform 9 Release Plan](https://eclipse-ee4j.github.io/jakartaee-platform/jakartaee9/JakartaEE9ReleasePlan)
* [Jakarta Bean Validation 3.0 Specification Document](./bean-validation-specification-3.0.0-M1.pdf) (PDF)
* [Jakarta Bean Validation 3.0 Specification Document](./bean-validation-specification-3.0.0-M1.html) (HTML)
* [Jakarta Bean Validation 3.0 Javadoc](./apidocs)
* [Jakarta Bean Validation 3.0 TCK]({{< tckdownload.inline />}})
([sig]({{< tckdownload.inline />}}.sig),[sha]({{< tckdownload.inline />}}.sha256),[pub](https://github.com/jakartaee/specification-committee/blob/master/jakartaee-spec-committee.pub))
  * TCK Summary Results [Hibernate Validator 7.0.0.Alpha3](./TCK-summary.html)

* Maven coordinates
  * [jakarta.bean-validation:jakarta.bean-validation-api:jar:3.0.0-M1](https://repo1.maven.org/maven2/jakarta/validation/jakarta.validation-api/3.0.0-M1/jakarta.validation-api-3.0.0-M1.jar)


# Compatible Implementations

* [Hibernate Validator 7.0.0.Alpha3](https://hibernate.org/validator/releases/7.0/)

# Ballots

## Plan Review

[//]: # (For Jakarta EE 9, the Platform Plan Review covered 95% of the Specification Projects.  For those Projects, just use the following statement in this Plan Review section:)

This Specification Project's Plan Review was covered by the [Jakarta EE 9 Plan Review](https://jakarta.ee/specifications/platform/9/).  
Please reference that ballot for the official results.

[//]: # (If your Project was required to do a standalone Plan Review...  You'll need to perform an official Plan Review ballot and record the results here.)

## Release Review

The Specification Committee Ballot concluded successfully on 2020-mm-dd with the following results.

| Representative                                 | Representative for: | Vote |
|------------------------------------------------|---------------------|------|
| Kenji Kazumura, Michael DeNicola               | Fujitsu             |      |
| Dan Bandera, Kevin Sutter                      | IBM                 |      |
| Bill Shannon, Ed Bratt                         | Oracle              |      |
| Mark Wareham, Steve Millidge                   | Payara              |      |
| Scott Stark, Mark Little                       | Red Hat             |      |
| David Blevins, Cesar Hernandez                 | Tomitribe           |      |
| Ivar Grimstad                                  | EE4J PMC            |      |
| Alex Theedom                                   | Participant Members |      |
| Werner Keil                                    | Committer Members   |      |
|                                                | Total               |      |

The ballot was run in the [jakarta.ee-spec mailing list]()
