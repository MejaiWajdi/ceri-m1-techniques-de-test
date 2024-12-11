# Pokedex API


**Nom :** Mejai  
**Prénom :** Wajdi  
**Groupe :** M1 ILSEN groupe classiques

![Statut CircleCI](https://circleci.com/gh/MejaiWajdi/ceri-m1-techniques-de-test/tree/master.svg?style=svg)

![!Couverture de Test](https://codecov.io/gh/MejaiWajdi/ceri-m1-techniques-de-test/graph/badge.svg?)
![Checkstyle Badge]([checkstyle-badge.svg](https://circleci-tasks-prod.s3.us-east-1.amazonaws.com/storage/artifacts/4af26f7c-62dc-4eb9-8e4d-a5c7107785a6/57384a94-486a-402c-a2b9-2d91b2391b24/0/checkstyle-badge?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=ASIAQVFQINEOJ3Y2ESTD%2F20241211%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241211T093418Z&X-Amz-Expires=60&X-Amz-Security-Token=IQoJb3JpZ2luX2VjEOr%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJIMEYCIQCU73n0zscawldVuEAose1Z1IHf0Fc4AkKeJakiA7tH7AIhAL3%2FgwGLIoyiqbUGMUtH4pgd%2BYJ1xhpJ3fCeHpxtwqOQKrQCCKP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEQAxoMMDQ1NDY2ODA2NTU2Igwjg8JOglbTl9k0u1AqiAL1%2BwT7r2wjAFjgGQ3Bzu5SXJR%2BLRPk5KMQZWRRpieGnb1DkB5oWCY3qvmQbnAvelD%2FIYDTBT5owN0BT9%2B4xwdSSRMlpAQt0w%2FoLvhsmgqBI%2FcuyU0azmuWPo6LCNDpIAEsxHq6GnCMHisfRJzfQ3lo2XJV6sKcwkJrogxRgHVDcaXrSqbAs%2FCYtk9EMI%2FXGidkS6m6u%2F3upA%2FYsgosMf9r5lFCPIMhIQaJubTKVGBbnUC20aSCxbNqVMzOZZcWxHkBARyuUZ0%2FbgQrjIf3e%2FL70wLZZqGMomWEPuVgraj1iCKHNos2g49whDnfEiASweqNJScUQ4rReL8jfr3iWqm2ysjRncMEIFsw4bblugY6nAFszJ8HmArFUDVH1RFw74p7AChjOogvQwtS8%2Bj1OmIWZ09TycVpGOixMb1xmwoQyMPn%2FXecsTrFVMlqyjmBfJFCx32%2BKFdPw6XPfu4JrZaH4EXC%2BTiWWJ2d%2BdNHhk7x%2FJGu1FZEO5akVMVF%2Fia8IXpQphP5LCgKOEJZViqAO%2BzPFTfV6rRm9ygDS1AfecoZnwKQDmX1H6RU57oiV6E%3D&X-Amz-SignedHeaders=host&x-id=GetObject&X-Amz-Signature=4d309a211548bfec56df9d130a449c22d68a0d3175142451426eb1442490f9a9))




## Description
Ce projet est une API pour un Pokedex, inspiré de l'univers Pokémon. L'API permet de récupérer des informations sur les Pokémon, de créer des objets Pokémon, et de gérer des dresseurs et leurs équipes.

## Structure du projet

- **`PokemonMetadataProvider`** : Fournit les métadonnées pour chaque Pokémon, telles que le nom, l'attaque, la défense, et l'endurance.
- **`PokemonFactory`** : Permet de créer des instances de Pokémon avec des caractéristiques spécifiques.
- **`Pokedex`** : Une liste de Pokémon avec des fonctionnalités pour ajouter, récupérer et trier les Pokémon.
- **`PokedexFactory`** : Crée des instances de Pokédex en utilisant un `PokemonMetadataProvider` et un `PokemonFactory`.
- **`PokemonTrainer`** : Représente un dresseur avec un nom, une équipe et un Pokédex associé.
- **`PokemonTrainerFactory`** : Permet de créer des objets `PokemonTrainer` avec des équipes spécifiques.
