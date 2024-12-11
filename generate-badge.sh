#!/bin/bash -eo pipefail

# URL du fichier Checkstyle
CHECKSTYLE_FILE="target/checkstyle-result.xml"

# Compter les erreurs directement depuis le fichier local
ERRORS=$(grep -c "<error " "$CHECKSTYLE_FILE")

# Définir les couleurs et messages pour le badge
if [ "$ERRORS" -eq 0 ]; then
  COLOR="green"
  MESSAGE="Passing"
else
  COLOR="red"
  MESSAGE="$ERRORS errors"
fi

# Générer le badge avec shields.io
curl -s "https://img.shields.io/badge/Checkstyle-$MESSAGE-$COLOR.svg" -o checkstyle-badge.svg
