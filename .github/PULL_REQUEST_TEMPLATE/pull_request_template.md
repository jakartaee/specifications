## Specification PR template
When creating a specification project release review, create PRs with the content defined as follows.

Include the following in the PR:
- [ ] A directory in the form wombat/x.y where x.y is the release major.minor version, and the directory contains the following.
- [ ] Specification PDF in the form of jakarta-wombat-spec-x.y.pdf
- [ ] Specification HTML in the form of jakarta-wombat-spec-x.y.html
- [ ] A specification page named _index.md following the template at:
      https://github.com/jakartaee/specification-committee/blob/master/spec_page_template.md
- [ ] For a Progress Review, that sufficient progress has been made on a Compatible Implementation and TCK, to ensure that the spec is implementable and testable.
- [ ] For a [Release Review](https://www.eclipse.org/projects/handbook/#release-review), a summary that a Compatible Implementation is complete, passes the TCK, and that the TCK includes sufficient coverage of the specification. The TCK users guide MUST include the instructions to run the compatible implementations used to validate the release.
Instructions MAY be by reference.
   - [ ] Updated release record
   - [ ] Send an email to the EMO (with cc to the PMC) that contains a link to **this** PR and a request to the PMC for approval. *The EMO will append a checklist to the PR to track the review*
- [ ] The URL of the OSSRH staging repository for the api, javadoc:
      <add URL here>
- [ ] The URL of the staging directory on downloads.eclipse.org for the proposed EFTL TCK binary:
      <add URL here>
- [ ] The URL of the compatibility certification request issue:
      <add URL here>
- [ ] Specification JavaDoc in the wombat/x.y/apidocs directory. 
If desired, an optional second PR can be created to contain just the JavaDoc in the `apidocs` directory.

Note: If any item does not apply, check it and mark N/A below it.

## Below are for Jakarta EE Specification Committee
### Mentor Spec Review Checklist

1. Spec PR
  - [ ] PR uses [template](https://github.com/jakartaee/specifications/blob/master/pull_request_template.md)
  - [ ] Directory of form {spec}/x.y
  - [ ] PDF of form jakarta-{spec}-spec-x.y.pdf ("-spec" preferred but not required)
  - [ ] HTML of form jakarta-{spec}-spec-x.y.html ("-spec" preferred but not required)
  - [ ] Index page {spec}/x.y/_index.md following [template](https://github.com/jakartaee/specification-committee/blob/master/spec_page_template.md)
  - [ ] Index page {spec}/_index.md following [template](https://github.com/jakartaee/specification-committee/blob/master/spec_index_template.md)
  - [ ] No other files (e.g., no jakarta_ee_logo_schooner_color_stacked_default.png)
  - [ ] Staging repository link of the form https://jakarta.oss.sonatype.org/content/repositories/staging/jakarta/{spec}/jakarta.{spec}-api/x.y.z/
  - [ ] EFTL TCK link of the form http://download.eclipse.org/.../+.zip
  - [ ] Compatibility certification link of the form https://github.com/eclipse-ee4j/{project}/#{issue}
  - [ ] N/A (Optional) Second PR for just apidocs

2. _index.md
  - [ ] Link to project release plan of the form https://projects.eclipse.org/projects/ee4j.{spec}/releases/x.y/plan
  - [ ] Link to spec pdf
  - [ ] Link to spec html
  - [ ] Link to apidocs
  - [ ] Link to final TCK download zip file of the form https://download.eclipse.org/jakartaee/{spec}/x.y/*{spec}-tck-x.y.z.zip (The folder path is required, the file name pattern is preferred.)
  - [ ] Link to API jar file of the form https://central.sonatype.com/artifact/jakarta.{spec}/jakarta.{spec}-api/x.y.z/jar
  - [ ] Name of and link to at least one Compatible Implementation
  - [ ] Review summary statement to ensure it has been updated to reflect the work accomplished and does not contain proposal statements as might be found in Plan Review statement.

3. javadocs
  - [ ] Footer contains Eclipse copyright and link to license
  - [ ] ESFL license is included, usually as doc-files/speclicense.html
  - [ ] no META-INF directory in PR
  - [ ] javadocs-jar artifact matches apidocs (optional for this release)

4. Spec PDF
  - [ ] Correct spec title
  - [ ] Version number of the form x.y, not x.y.z
  - [ ] Correct Eclipse copyright line
  - [ ] Use version 1.1 of the EFSL
  - [ ] No DRAFT or SNAPSHOT
  - [ ] Correct Logo

5. Spec HTML
  - [ ] Same as PDF

6. TCK zip file
  - [ ] README file (optional for this release)
  - [ ] EFTL license file, preferably named LICENSE.md
  - [ ] User's Guide (or equivalent documentation)
  - [ ] How to test the Compatible Implementation(s) listed in _index.md above with the TCK (may be in UG)

7. TCK User's Guide (or equivalent documentation)
  - [ ] Software requirements listed
  - [ ] Installation and configuration described
  - [ ] How to run tests
  - [ ] Where to file challenges

8. Compatibility certification request
  - [ ] Request follows [template](https://github.com/jakartaee/specification-committee/blob/master/compatibility-certification-request.md)
  - [ ] SHA-256 fingerprint matches staged TCK zip file
  - [ ] Request issue has `certification` label.

9. TCK results summary
  - [ ] Page is hosted by Compatible Implementation project
  - [ ] Includes all information from certification request
  - [ ] Summary includes number of tests passed, failed, errors
  - [ ] SHA-256 fingerprint matches staged TCK zip file on cert request

10. If a Release Review is required, the specification project team contacts the EMO to initiate the review by sending an email to emo@eclipse.org.
    (A Release Review is not required if the current release is a Service Release based on a previously successful Major or Minor
    release as indicated by a release record on the project's Releases page, e.g., the [Jakarta Servlet releases page](https://projects.eclipse.org/projects/ee4j.servlet/reviews).)
    - [ ] An issue will be created by the EMO to track the release review.
    - [ ] The specification project team requests approval for the release from the PMC by sending an email to ee4j-pmc@eclipse.org.
    - [ ] The specification project team then delivers an IP Log to the IP Team for their review as described in https://www.eclipse.org/projects/handbook/#pmi-commands-iplog.

11. Update Jakarta EE API jar
  - [ ] Update the Jakarta EE API jar by submitting a PR to the jakartaee-api project that updates the version number of your API jar file.

### Mentor Final Tasks after a Successful Release Review

 - [ ] adds this final checklist to the main PR.
 - [ ] adds the `approved` label to the PRs, and sends out the Ballot Summary per this [template](#ballot-summary-email-template) to the [public Jakarta EE Specification Committee email list](jakarta.ee-spec@eclipse.org)
 - [ ] calculates the staged EFTL TCK signature and promotes it to the committee download area
  using the https://ci.eclipse.org/jakartaee-spec-committee/job/promote-release/ job. Manually editing the jenkins Build Information will help identify the build (ie. Mail 2.0 or CDI 3.0).
 - [ ] merges the specification (and apidocs) PRs, ensuring the "date:" field in the _index.md file has an appropriate value to allow publishing.
 - [ ] updates the specification page with the ballot results. This is normally done via a separate PR that should be reviewed, approved, and merged.
 - [ ] notifies the EMO of the ballot results by email to [emo@eclipse-foundation.org](emo@eclipse-foundation.org). Just forward the ballot summary note sent earlier to the public Spec Committee email list.
 - [ ] creates an issue in the specification project that includes the following checklist for the specification project team:
(an example can be found [here](https://github.com/jakartaee/authorization/issues/166).)

```
- [ ] promote api staging release promotes the specification api jars to maven central. An example release job script can be found here https://wiki.eclipse.org/MavenReleaseScript
- [ ] go through the merged jakarta.ee specification website page to verify all the links are valid
- [ ] if XML Schemas are published on https://jakarta.ee/schemas, send a PR to update the status from `Draft` to `Final`
- [ ] approve the compatibility request
- [ ] merge any final release branch as appropriate for the branch management for the project
```
