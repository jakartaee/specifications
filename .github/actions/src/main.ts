// ===========================================================================
// Copyright (c) 2021 Eclipse Foundation and others.
//
// This program and the accompanying materials are made
// available under the terms of the Eclipse Public License 2.0
// which is available at https://www.eclipse.org/legal/epl-2.0/
//
// Contributors:
// Lukas Jungmann (Oracle)
// Scott Stark (Red Hat)
//
// SPDX-License-Identifier: EPL-2.0
// ===========================================================================


const core = require("@actions/core");
const github = require("@actions/github");
const { request } = require("@octokit/request");

const fs = require("fs");

const ok = ":heavy_check_mark:";
const error = ":exclamation:";

async function run() {

    if (github.context.eventName !== "pull_request") {
        // The core module on the other hand let's you get
        // inputs or create outputs or control the action flow
        // e.g. by producing a fatal error
        core.setFailed("Can only run on pull requests!");
        return;
    }
    github.getO

    try {
        // `content` input defined in action metadata file
        const changedFiles = core.getInput('content');
        const files = JSON.parse(JSON.stringify(
            changedFiles.split(" ").filter(value => !value.startsWith("."))));
        files.forEach(f => console.log(f));
        console.log("");

 
    } catch (error: any) {
        core.setFailed(error.message);
    }
}

function mark(description: string, check: boolean, comment?: string, force?: boolean) : string {
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
function checkFile(description: string, file, template) {
    return fs.readFile(file)
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

function getInputFromEntry(entry: string) {
    let res = entry.split(/\n/g);
    return 1 < res.length ? res[1].trim() : "";
}

function isChecked(entry) {
    return entry.charAt(3).toLowerCase() === 'x';
}

// Our main method: call the run() function and report any errors
run().catch(error => core.setFailed("Workflow failed! " + error.message));
