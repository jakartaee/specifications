#!/bin/bash
# ===========================================================================
# Copyright (c) 2019 Eclipse Foundation and others.
# 
# This program and the accompanying materials are made
# available under the terms of the Eclipse Public License 2.0
# which is available at https://www.eclipse.org/legal/epl-2.0/
# 
# Contributors:
# Christopher Guindon (Eclipse Foundation)
# 
# SPDX-License-Identifier: EPL-2.0
# ===========================================================================

echo -e "Prepare Jakarta EE Specifications Preview...\n"

echo -e "Step 1: Fetch a current copy of jakarta.ee\n"
rm -rf website
git clone https://github.com/jakartaee/jakarta.ee.git website
cd website && npm install && npm run production && cd ../

echo -e "Step 2: Reset specifications content\n"
mkdir -p website/static/specifications && mkdir -p website/content/specifications

echo "Step 3: Copy PR content to Hugo content"
find .  -mindepth 1 -maxdepth 1 -not -path "./.github" -not -path "./website" -type d  -exec cp -R {} website/content/specifications/ \;
cd website/content
echo -e "Current working directory: $PWD\n"

echo -e "Step 4: Preparing to move html files to static folder..."
for f in specifications/*/*/*.html; do
  if [ -f "$f" ]; then
    echo -e  "Moving $f to `dirname ../static/$f`"
    mkdir -p `dirname ../static/$f`
    mv -f "$f" "../static/$f"
  fi
done

echo -e "Step 5: Preparing to move folders to static folder..."
for f in specifications/*/*/*/; do
  if [ -d "$f" ]; then
    echo -e "Moving $f folder to `dirname ../static/$f`"
    mkdir -p `dirname ../static/$f`
    mv -f "$f" "../static/$f"
  fi
done

echo "Done!"

echo -e "Step 6: Create missing language copies..."
LANGS=(zh)
FILES=`find ./specifications -type f -name "*.md"`
for F in $FILES; do
  if [ -f "$F" ]; then
    FILE_NAME=`basename $F`
    EXTENSION=${FILE_NAME#**.}
    for LANG in ${LANGS[@]}; do
      ## Skip non base-lang copies
      if [[ "$EXTENSION" =~ .*"$LANG".* ]];then
        continue 2
      fi
    done
    REL_DIR=`dirname $F`
    for LANG in ${LANGS[@]}; do
      LANG_FILE="$REL_DIR/`basename $F .md`.$LANG.md"
      if [ ! -f $LANG_FILE ]; then
        echo "Creating langauge copy of $F in $LANG_FILE"
        cp $F $LANG_FILE
      fi
    done
  fi
done
echo "Done!"

echo -e "Step 7: Remove jakarta.ee _redirect file."
rm ../static/_redirects 