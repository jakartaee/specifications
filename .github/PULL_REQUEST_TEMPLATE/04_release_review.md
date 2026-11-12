## Release Review

**Use this template when:** a specification project is publishing a final Major or Minor release (`x.y`) and requires a [Release Review](https://www.eclipse.org/projects/handbook/#release-review).
For a service release, use the Service Release template instead.

**Specification project:** <!-- add link here -->

### Include the following in the PR

- [ ] A directory in the form `wombat/x.y`, where `x.y` is the release major.minor version, containing the following:
  - [ ] Specification PDF named `jakarta-wombat-spec-x.y.pdf`
  - [ ] Specification HTML named `jakarta-wombat-spec-x.y.html`
  - [ ] A specification page named `_index.md` following the [specification page template](https://github.com/jakartaee/specification-committee/blob/master/spec_page_template.md)
  - [ ] Specification Javadoc in the `apidocs` directory.
        If desired, an optional second PR can be created to contain just the Javadoc in the `apidocs` directory.
- [ ] A summary that a Compatible Implementation is complete, passes the TCK, and that the TCK includes sufficient coverage of the specification.
      The TCK User's Guide MUST include the instructions to run the Compatible Implementations used to validate the release. Instructions MAY be by reference.
- [ ] The URL of the OSSRH staging repository for the API and Javadoc:
      <add URL here>
- [ ] The URL of the staging directory on downloads.eclipse.org for the proposed EFTL TCK binary:
      <add URL here>
- [ ] The URL of the compatibility certification request issue:
      <add URL here>
- [ ] A link to the updated release record
- [ ] An email to the EMO (with cc to the PMC) containing a link to **this** PR and a request to the PMC for approval.
      *The EMO will append a checklist to the PR to track the review.*

> Replace `wombat` with your specification's short name. If an item does not apply, check it and mark it **N/A** below it.

---

## For the Jakarta EE Specification Committee

### Mentor Spec Review Checklist

1. Spec PR
   - [ ] PR uses the [template](https://github.com/jakartaee/specifications/blob/master/.github/PULL_REQUEST_TEMPLATE/04_release_review.md)
   - [ ] Directory of the form `{spec}/x.y`
   - [ ] PDF of the form `jakarta-{spec}-spec-x.y.pdf` ("-spec" preferred but not required)
   - [ ] HTML of the form `jakarta-{spec}-spec-x.y.html` ("-spec" preferred but not required)
   - [ ] Index page `{spec}/x.y/_index.md` following the [template](https://github.com/jakartaee/specification-committee/blob/master/spec_page_template.md)
   - [ ] Index page `{spec}/_index.md` following the [template](https://github.com/jakartaee/specification-committee/blob/master/spec_index_template.md)
   - [ ] No other files (for example, no `jakarta_ee_logo_schooner_color_stacked_default.png`)
   - [ ] Staging repository link of the form `https://repo.eclipse.org/repository/ee4j-staging/jakarta/{spec}/jakarta.{spec}-api/x.y.z/`
   - [ ] EFTL TCK link of the form `http://download.eclipse.org/.../+.zip`
   - [ ] Compatibility certification link of the form `https://github.com/eclipse-ee4j/{project}/#{issue}`
   - [ ] N/A (Optional) Second PR for just apidocs

2. `_index.md`
   - [ ] Link to project release plan of the form `https://projects.eclipse.org/projects/ee4j.{spec}/releases/x.y/plan`
   - [ ] Link to spec PDF
   - [ ] Link to spec HTML
   - [ ] Link to apidocs
   - [ ] Link to final TCK download zip file of the form `https://download.eclipse.org/jakartaee/{spec}/x.y/*{spec}-tck-x.y.z.zip` (The folder path is required, the file name pattern is preferred.)
   - [ ] Link to API jar file of the form `https://central.sonatype.com/artifact/jakarta.{spec}/jakarta.{spec}-api/x.y.z/jar`
   - [ ] Name of and link to at least one Compatible Implementation
   - [ ] Review summary statement has been updated to reflect the work accomplished and does not contain proposal statements, as might be found in a Plan Review statement

3. Javadoc
   - [ ] Footer contains the Eclipse copyright and a link to the license
   - [ ] ESFL license is included, usually as `doc-files/speclicense.html`
   - [ ] No `META-INF` directory in the PR
   - [ ] `javadocs-jar` artifact matches apidocs (optional for this release)

4. Spec PDF
   - [ ] Correct spec title
   - [ ] Version number of the form `x.y`, not `x.y.z`
   - [ ] Correct Eclipse copyright line
   - [ ] Uses version 1.1 of the EFSL
   - [ ] No DRAFT or SNAPSHOT
   - [ ] Correct logo

5. Spec HTML
   - [ ] Same as PDF

6. TCK zip file
   - [ ] README file (optional for this release)
   - [ ] EFTL license file, preferably named `LICENSE.md`
   - [ ] User's Guide (or equivalent documentation)
   - [ ] How to test the Compatible Implementation(s) listed in `_index.md` above with the TCK (may be in the User's Guide)

7. TCK User's Guide (or equivalent documentation)
   - [ ] Software requirements listed
   - [ ] Installation and configuration described
   - [ ] How to run tests
   - [ ] Where to file challenges

8. Compatibility certification request
   - [ ] Request follows the [template](https://github.com/jakartaee/specification-committee/blob/master/compatibility-certification-request.md)
   - [ ] SHA-256 fingerprint matches the staged TCK zip file
   - [ ] Request issue has the `certification` label

9. TCK results summary
   - [ ] Page is hosted by the Compatible Implementation project
   - [ ] Includes all information from the certification request
   - [ ] Summary includes the number of tests passed, failed, and in error
   - [ ] SHA-256 fingerprint matches the staged TCK zip file on the certification request

10. Release Review initiation
    The specification project team contacts the EMO to initiate the review by sending an email to emo@eclipse.org.
    (A Release Review is not required if the current release is a Service Release based on a previously successful Major or Minor
    release, as indicated by a release record on the project's Releases page, for example, the [Jakarta Servlet releases page](https://projects.eclipse.org/projects/ee4j.servlet/reviews).)
    - [ ] An issue is created by the EMO to track the Release Review
    - [ ] The specification project team requests approval for the release from the PMC by sending an email to ee4j-pmc@eclipse.org

11. Update the Jakarta EE API jar
    - [ ] Submit a PR to the jakartaee-api project that updates the version number of your API jar file

12. Document the Jenkins release job
    - [ ] All of the Jenkins jobs are documented in the specification's GitHub wiki so that each spec committer can perform the specification release

### Mentor Final Tasks after a Successful Release Review

The mentor:

- [ ] Adds this final checklist to the main PR.
- [ ] Adds the `approved` label to the PRs, and sends out the Ballot Summary per the Ballot Summary email template to the [public Jakarta EE Specification Committee email list](mailto:jakarta.ee-spec@eclipse.org).
- [ ] Calculates the staged EFTL TCK signature and promotes it to the committee download area
      using the https://ci.eclipse.org/jakartaee-spec-committee/job/promote-release/ job. Manually editing the Jenkins Build Information helps identify the build (for example, Mail 2.0 or CDI 3.0).
- [ ] Merges the specification (and apidocs) PRs, ensuring the `date:` field in the `_index.md` file has an appropriate value to allow publishing.
- [ ] Updates the specification page with the ballot results. This is normally done via a separate PR that should be reviewed, approved, and merged.
- [ ] Notifies the EMO of the ballot results by email to [emo@eclipse-foundation.org](mailto:emo@eclipse-foundation.org). Just forward the ballot summary note sent earlier to the public Spec Committee email list.
- [ ] Creates an issue in the specification project that includes the following checklist for the specification project team
      (an example can be found [here](https://github.com/jakartaee/authorization/issues/166)):

```
- [ ] Promote the API staging release, which promotes the specification API jars to Maven Central. An example release job script can be found at https://wiki.eclipse.org/MavenReleaseScript
- [ ] Go through the merged jakarta.ee specification website page to verify all the links are valid
- [ ] If XML Schemas are published on https://jakarta.ee/schemas, send a PR to update the status from `Draft` to `Final`
- [ ] Approve the compatibility request
- [ ] Merge any final release branch as appropriate for the branch management for the project
```
