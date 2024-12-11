#!/bin/bash

# Variables
README="README.md"
BADGE_URL="https://github.com/yourusername/yourrepo/raw/main/images/checkstyle-badge.svg"  # Remplacez par le lien réel

# Mettre à jour le fichier README.md
sed -i "s|<badge-checkstyle-url>|$BADGE_URL|" $README
git add $README
git commit -m "Update README with new Checkstyle badge"
git push
