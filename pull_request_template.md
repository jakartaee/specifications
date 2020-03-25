## Specification PR template
When creating a specification project release review, create two PRs with the content divided as follows.

Include the following in PR#1:
- [ ] A directory in the form wombat/x.y where x.y is the release major.minor version, and the directory contains the following.
- [ ] Specification PDF in the form of wombat-spec-x.y.pdf
- [ ] Specification HTML in the form of wombat-spec-x.y.html
- [ ] If the specification produces XML Schema(s), link(s) to the [publish schema PR](https://eclipse-ee4j.github.io/jakartaee-platform/publish-xml-schemas)(s)
- [ ] A specification page named _index.md following the template at:
      https://github.com/jakartaee/specification-committee/blob/master/spec_page_template.md
- [ ] For a Progress Review, that sufficient progress has been made on
      a Compatible Implementation and TCK, to ensure that the spec is
      implementable and testable.
- [ ] For a Release Review, a summary that a Compatible Implementation
      is complete, passes the TCK, and that the TCK includes sufficient
      coverage of the specification. The TCK users guide MUST include
      the instructions to run the compatible implementations used to
      validate the release.  Instructions MAY be by reference.
- [ ] The URL of the OSSRH staging repository for the api, javadoc:
      <add URL here>
- [ ] The URL of the staging directory on downloads.eclipse.org for the proposed EFTL TCK binary:
      <add URL here>
- [ ] The URL of the compatibility certification request issue:
      <add URL here>

Include the following in PR#2:
- [ ] Specification JavaDoc in the wombat/x.y/apidocs directory.
