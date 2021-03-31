## Specification Service Release PR template
When creating a service release, create PRs with the content defined as follows.

Include the following in the PR:
- [ ] The URL of the Eclipse Project release record:
      <add URL here>
- [ ] The URL of the OSSRH staging repository for the api, javadoc:
      <add URL here>
- [ ] The URL of the staging directory on downloads.eclipse.org for the proposed EFTL TCK binary:
      <add URL here>
- [ ] The URL of the compatibility certification request (CCR) issue:
      <add URL here>
- [ ] Specification JavaDoc in the `wombat/x.y/apidocs` directory.
- [ ] Changelog file at this location describing service release updates, `wombat/x.y/changelog`.
- [ ] Update `wombat/x.y/_index.md` accordingly.
- [ ] Start service release review by emailing [Specification Committee](https://accounts.eclipse.org/mailing-list/jakarta.ee-spec) and referencing this PR.

Note: Specifications themselves do not have service releases.  Only the associated JavaDoc and TCK artifacts can have service releases.  Thus, the Specification version does not use the third digit -- only the `x.y` version is used in the Specification directory structure.
 
Note: If any item does not apply, check it and mark N/A below it.
