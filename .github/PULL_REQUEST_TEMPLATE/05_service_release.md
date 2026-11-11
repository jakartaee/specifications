## Specification PR template
When creating a service release, create PRs with the content defined as follows.

Include the following in the PR:
- [ ] The URL of the OSSRH staging repository for the api, javadoc:
      <add URL here>
- [ ] The URL of the staging directory on downloads.eclipse.org for the proposed EFTL TCK binary:
      <add URL here>
- [ ] The URL of the compatibility certification request issue:
      <add URL here>
- [ ] Specification JavaDoc in the wombat/x.y/apidocs directory. 
If desired, an optional second PR can be created to contain just the JavaDoc in the `apidocs` directory.

- [ ] A change log page wombat/x.y/changelog.md following [template](https://github.com/jakartaee/specification-committee/blob/master/changelog_page_template.md)

- [ ] Add an extra bullet point to the wombat/x.y/_index.md file under `Details` providing a link to the change log file (if not already present): `[Change Log](./changelog)`

Note: If any item does not apply, check it and mark N/A below it.
