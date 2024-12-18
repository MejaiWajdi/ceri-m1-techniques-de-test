#!/bin/bash

# Variables
BADGE_PATH="checkstyle-badge.svg"
BADGE_URL="https://raw.githubusercontent.com/MejaiWajdi/ceri-m1-techniques-de-test/main/images/checkstyle-badge.svg"
GITHUB_REPO="MejaiWajdi/ceri-m1-techniques-de-test"  # Votre dépôt GitHub
BRANCH="master"  # Branche vers laquelle vous souhaitez pousser l'image

# Créer un dossier images s'il n'existe pas
mkdir -p images

# Déplacer le badge généré dans le dossier images
mv $BADGE_PATH images/

# Ajouter, committer et pousser l'image dans le dépôt GitHub
git config --global user.email "wajdimejai78@gmail.com"  # Remplacez par votre email GitHub
git config --global user.name "MejaiWajdi"  # Remplacez par votre nom d'utilisateur GitHub

# Initialiser le dépôt si ce n'est pas déjà fait
git init
git remote add origin https://github.com/$GITHUB_REPO.git

# Créer une branche et pousser l'image
git checkout -b $BRANCH
git add images/checkstyle-badge.svg
git commit -m "Add Checkstyle badge"
git push https://$GITHUB_TOKEN@github.com/$GITHUB_REPO.git $BRANCH

echo "Badge uploaded successfully to GitHub!"
