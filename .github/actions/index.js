// ===========================================================================
// Copyright (c) 2021 Eclipse Foundation and others.
//
// This program and the accompanying materials are made
// available under the terms of the Eclipse Public License 2.0
// which is available at https://www.eclipse.org/legal/epl-2.0/
//
// Contributors:
// Lukas Jungmann (Oracle)
//
// SPDX-License-Identifier: EPL-2.0
// ===========================================================================

/*
input: the PR following https://github.com/jakartaee/specifications/blob/master/.github/PULL_REQUEST_TEMPLATE/pull_request_template.md
action: perform checks defined in https://github.com/jakartaee/specification-committee/blob/master/spec_review_checklist.md
output: 'review' property with text output (contains MD)

# Spec Review Checklist

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
  - [ ] (Optional) Second PR for just apidocs

2. _index.md
  - [ ] Link to project release plan of the form https://projects.eclipse.org/projects/ee4j.{spec}/releases/x.y/plan
  - [ ] Link to spec pdf
  - [ ] Link to spec html
  - [ ] Link to apidocs
  - [ ] Link to final TCK download zip file of the form https://download.eclipse.org/jakartaee/{spec}/x.y/*{spec}-tck-x.y.z.zip (The folder path is required, the file name pattern is preferred.)
  - [ ] Link to API jar file of the form https://search.maven.org/artifact/jakarta.{spec}/jakarta.{spec}-api/x.y.z/jar
  - [ ] Name of and link to at least one Compatible Implementation

3. javadocs
  - [ ] Footer contains Eclipse copyright and link to license
  - [ ] ESFL license is included, usually as doc-files/speclicense.html
  - [ ] no META-INF directory in PR
  - [ ] javadocs-jar artifact matches apidocs (optional for this release)

4. Spec PDF
  - [ ] Correct spec title
  - [ ] Version number of the form x.y, not x.y.z
  - [ ] Correct Eclipse copyright line
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
 */

"use strict";

const core = require('@actions/core');
const github = require('@actions/github');
const { request } = require("@octokit/request");
const {promises: {readFile}} = require("fs");

const ok = ":heavy_check_mark:";
const error = ":exclamation:";


async function run() {
    try {
        // `content` input defined in action metadata file
        const changedFiles = core.getInput('content');
        const files = JSON.parse(JSON.stringify(
            changedFiles.split(" ").filter(value => !value.startsWith("."))));
        // files.forEach(f => console.log(f));
        // console.log("");

        const specFiles = [];
        const javadocFiles = [];
        for (let i = 0; i < files.length; i++) {
            let f = files[i];
            if (f.includes("apidocs")) {
                javadocFiles.push(files.splice(i, 1)[0]);
                i--;
            } else if (/\d/.test(f)) {
                specFiles.push(files.splice(i, 1)[0]);
                i--;
            }
        }

        const spec = {};
        if (specFiles.length !== 0) {
            let s = specFiles[0].split("/");
            spec.name = s[0];
            spec.version = s[1];
        } else if (javadocFiles.length !== 0) {
            let s = javadocFiles[0].split("/");
            spec.name = s[0];
            spec.version = s[1];
        } else {
            //cannot determine...
            console.warn("No spec changes found");
        }
        console.log("specification name: " + spec.name);
        console.log("specification version: " + spec.version);
        console.log("");

        console.log("SpecFiles:");
        specFiles.forEach(f => console.log(f));
        console.log("");

        console.log("JavadocFiles:");
        javadocFiles.forEach(f => console.log(f));
        console.log("");

        console.log("RemainingFiles:");
        files.forEach(f => console.log(f));
        console.log("");

        const pr_description = github.context.payload.pull_request.body;
        console.log("PR description:");
        console.log(pr_description);
        console.log("");

        let review = "Hello, I'm here to help you checking this pull request for __" + spec.name + "__, version __" + spec.version + "__\n\n";
        review += "# Spec Review Checklist\n\n";

        review += "1. Spec PR\n";
//  - [ ] PR uses [template](https://github.com/jakartaee/specifications/blob/master/pull_request_template.md)
        //check usage of template by counting "- [" in the PR description
        review += mark("PR uses [template](https://github.com/jakartaee/specifications/blob/master/pull_request_template.md)",
            14 === ((pr_description.match(/- \[/g) || []).length), "The description does not contain expected number of checkboxes");
//  - [ ] Directory of form {spec}/x.y
        review += mark("Directory of form {spec}/x.y",
            !isEmpty(spec));
        spec.folder = spec.name + "/" + spec.version;
//  - [ ] PDF of form jakarta-{spec}-spec-x.y.pdf ("-spec" preferred but not required)
        let tmpVar = specFiles.find(f => f.endsWith(".pdf"));
        review += mark("PDF of form jakarta-{spec}-spec-x.y.pdf (\"-spec\" preferred but not required)",
            (spec.folder + "/jakarta-" + spec.name + "-spec-" + spec.version + ".pdf") === tmpVar,
            "Found: " + tmpVar);
//  - [ ] HTML of form jakarta-{spec}-spec-x.y.html ("-spec" preferred but not required)
        tmpVar = specFiles.find(f => f.endsWith(".html"));
        review += mark("PDF of form jakarta-{spec}-spec-x.y.html (\"-spec\" preferred but not required)",
            (spec.folder + "/jakarta-" + spec.name + "-spec-" + spec.version + ".html") === tmpVar,
            "Found: " + tmpVar);
//  - [ ] Index page {spec}/x.y/_index.md following [template](https://github.com/jakartaee/specification-committee/blob/master/spec_page_template.md)
        review += await checkFile("Index page {spec}/x.y/_index.md following [template](https://github.com/jakartaee/specification-committee/blob/master/spec_page_template.md)",
            spec.folder + "/_index.md");
//  - [ ] Index page {spec}/_index.md following [template](https://github.com/jakartaee/specification-committee/blob/master/spec_index_template.md)
        review += await checkFile("Index page {spec}/_index.md following [template](https://github.com/jakartaee/specification-committee/blob/master/spec_index_template.md)",
            spec.name + "/_index.md");
//  - [ ] No other files (e.g., no jakarta_ee_logo_schooner_color_stacked_default.png)
        review += mark("No other files (e.g., no jakarta_ee_logo_schooner_color_stacked_default.png)",
            3 === specFiles.length,
            "Found " + specFiles.length + " files, expected 3");
//  - [ ] Staging repository link of the form https://jakarta.oss.sonatype.org/content/repositories/staging/jakarta/{spec}/jakarta.{spec}-api/x.y.z/
        let entry = getEntry(pr_description, "The URL of the OSSRH staging repository for the api, javadoc:");
        let userInput = getInputFromEntry(entry);
        let result = false;
        let comment = "";
        let baseUrl = "https://jakarta.oss.sonatype.org/content/repositories/staging/jakarta";
        if (userInput.startsWith(baseUrl)) {
            let response = await request({
                baseUrl: baseUrl,
                method: "HEAD",
                url: userInput.substring(baseUrl.length)
            });
            result = response.status === 200;
            let pathComponents = userInput.substring(baseUrl.length + 1).split("/");
            if (!(pathComponents.length === 3
                && spec.name === pathComponents[0]
                && ("jakarta." + spec.name + "-api") === pathComponents[1]
                && pathComponents[2].startsWith(spec.version))) {
                if (result) {
                    comment = "Is '" + userInput.substring(baseUrl.length + 1) + "' correct? It exists but does not follow expected pattern.";
                }
                result = false;
            } else {
                if (!result) {
                    comment = "Provided URL matches the pattern but the target does not exist";
                }
                result = false;
            }
        }
        review += mark("Staging repository link of the form https://jakarta.oss.sonatype.org/content/repositories/staging/jakarta/{spec}/jakarta.{spec}-api/x.y.z/",
            result, comment);
//  - [ ] EFTL TCK link of the form http://download.eclipse.org/.../+.zip
        entry = getEntry(pr_description, "staging directory on downloads.eclipse.org");
        userInput = getInputFromEntry(entry);
        result = false;
        comment = "";
        baseUrl = "https://download.eclipse.org/ee4j/jakartaee-tck";
        if (userInput.startsWith(baseUrl)) {
            let response = await request({
                baseUrl: baseUrl,
                method: "HEAD",
                url: userInput.substring(baseUrl.length)
            });
            result = response.status === 200;
            let pathComponents = userInput.substring(baseUrl.length + 1).split("/");
            if (!(pathComponents.length === 3
                //&& check platform folder
                && "promoted" === pathComponents[1]
                && pathComponents[2].startsWith("jakarta")
                && pathComponents[2].endsWith(".zip"))) {
                if (result) {
                    comment = "Provided URL exists but does not match expected pattern";
                }
                result = false;
            } else {
                if (!result) {
                    comment = "Provided URL matches the pattern but the target does not exist";
                } else {
                    let tckName = pathComponents[2];
                    if (tckName.indexOf(spec.name) > 7) {
                        result = true;
                    } else {
                        comment = "Provided URL exists but " + tckName + " does not match expected pattern";
                        result = false;
                    }
                }
            }
        }
        review += mark("EFTL TCK link of the form http://download.eclipse.org/.../+.zip",
            result, comment);

//  - [ ] Compatibility certification link of the form https://github.com/eclipse-ee4j/{project}/#{issue}
        entry = getEntry(pr_description, "compatibility certification request issue");
        userInput = getInputFromEntry(entry);
        result = false;
        comment = "";
        baseUrl = "https://github.com/eclipse-ee4j";
        if (userInput.startsWith(baseUrl)) {
            let response = await request({
                baseUrl: baseUrl,
                method: "HEAD",
                url: userInput.substring(baseUrl.length)
            });
            result = response.status === 200;
            let pathComponents = userInput.substring(baseUrl.length + 1).split("/");
            if (pathComponents.length === 3
                && "issues" === pathComponents[1]) {
                try {
                    parseInt(pathComponents[2]);
                    if (!result) {
                        comment = "Provided URL matches the pattern but the target does not exist";
                    }
                } catch (error) {
                    result = false;
                    comment = "Invalid issue number";
                }
            } else {
                if (result) {
                    comment = "Provided URL exists but does not match expected pattern";
                    result = false;
                }
            }
        }
        review += mark("Compatibility certification link of the form https://github.com/eclipse-ee4j/{project}/#{issue}",
            result, result ? "I can not say this is correct or not" : comment, true);

//  - [ ] (Optional) Second PR for just apidocs
        if (10 < javadocFiles.length) {
            review += mark("(Optional) Second PR for just apidocs",
                false, "apidocs are included in this PR");
        } else {
            entry = getEntry(pr_description, "Specification JavaDoc");
            if (isChecked(entry)) {
                review += mark("(Optional) Second PR for just apidocs",
                    false, "Look for a PR with apidocs");
            } else {
                review += mark("(Optional) Second PR for just apidocs",
                    false);
            }
        }

        // console.log("entry:");
        // console.log(entry);
        // console.log("");
        //
        // console.log("input:");
        // console.log(getInputFromEntry(entry));
        // console.log("");
        //
        // console.log("checked:");
        // console.log(isChecked(entry));
        // console.log("");

        console.log(review);
        core.setOutput("review", review);
    } catch (error) {
        core.setFailed(error.message);
    }
}

function mark(description, check, comment, force) {
    let result = "";
    if (check) {
        result += ok;
    } else {
        result += error;
    }
    result += " " + description;
    if ((force || !check) && typeof comment !== "undefined" && comment !== "") {
        result += " _(" + comment + ")_";
    }
    return result + "\n";
}

function isEmpty(js) {
    for (let i in js)
        return false;
    return true;
}

//TODO: check the content of the file against template
function checkFile(description, file, template) {
    return readFile(file)
        .then(fb => {
            let content = fb.toString();
            // console.log(content);
            return mark(description, content.length > 0, "The file is there but I did not check its content", true);
        }).catch(error => {
            console.log(error.message);
            return mark(description, false);
        });
}

function getEntry(text, item) {
    let idx = text.indexOf(item);
    let start = text.substring(0, idx).lastIndexOf("- [");
    let end = text.indexOf("- [", start + 1);
    return text.substring(start, end).trim();
}

function getInputFromEntry(entry) {
    let res = entry.split(/\n/g);
    return 1 < res.length ? res[1].trim() : "";
}

function isChecked(entry) {
    return entry.charAt(3).toLowerCase() === 'x';
}

run();