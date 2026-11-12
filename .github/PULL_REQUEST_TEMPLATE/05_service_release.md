## Service Release

**Use this template when:** a specification project is publishing a service release (`x.y.z`) of a previously approved major or minor release. A Release Review is not required.

**Specification project:** <!-- add link here -->

### Include the following in the PR

- [ ] The URL of the OSSRH staging repository for the API and Javadoc:
      <add URL here>
- [ ] The URL of the staging directory on downloads.eclipse.org for the proposed EFTL TCK binary:
      <add URL here>
- [ ] The URL of the compatibility certification request issue:
      <add URL here>
- [ ] Specification Javadoc in the `wombat/x.y/apidocs` directory.
      If desired, an optional second PR can be created to contain just the Javadoc in the `apidocs` directory.
- [ ] A change log page `wombat/x.y/changelog.md` following the [change log page template](https://github.com/jakartaee/specification-committee/blob/master/changelog_page_template.md)
- [ ] A bullet point in `wombat/x.y/_index.md` under `Details` linking to the change log, if not already present: `[Change Log](./changelog)`

> Replace `wombat` with your specification's short name. If an item does not apply, check it and mark it **N/A** below it.
