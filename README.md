# Pokedex API


**Nom :** Mejai  
**Prénom :** Wajdi  
**Groupe :** M1 ILSEN groupe classiques

![Statut CircleCI](https://circleci.com/gh/MejaiWajdi/ceri-m1-techniques-de-test/tree/master.svg?style=svg)

![!Couverture de Test](https://codecov.io/gh/MejaiWajdi/ceri-m1-techniques-de-test/graph/badge.svg?)
![Checkstyle Badge](https://raw.githubusercontent.com/MejaiWajdi/ceri-m1-techniques-de-test/main/images/checkstyle-badge.svg)
[![Javadoc](https://img.shields.io/badge/javadoc-online-blue)](https://mejaiwajdi.github.io/ceri-m1-techniques-de-test/fr/univavignon/pokedex/api/package-summary.html)





## Description
Ce projet est une API pour un Pokedex, inspiré de l'univers Pokémon. L'API permet de récupérer des informations sur les Pokémon, de créer des objets Pokémon, et de gérer des dresseurs et leurs équipes.

## Structure du projet

- **`PokemonMetadataProvider`** : Fournit les métadonnées pour chaque Pokémon, telles que le nom, l'attaque, la défense, et l'endurance.
- **`PokemonFactory`** : Permet de créer des instances de Pokémon avec des caractéristiques spécifiques.
- **`Pokedex`** : Une liste de Pokémon avec des fonctionnalités pour ajouter, récupérer et trier les Pokémon.
- **`PokedexFactory`** : Crée des instances de Pokédex en utilisant un `PokemonMetadataProvider` et un `PokemonFactory`.
- **`PokemonTrainer`** : Représente un dresseur avec un nom, une équipe et un Pokédex associé.
- **`PokemonTrainerFactory`** : Permet de créer des objets `PokemonTrainer` avec des équipes spécifiques.
