package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory {

    private final IPokemonMetadataProvider metadataProvider =new PokemonMetadataProvider();



    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        try {
            PokemonMetadata metadata = metadataProvider.getPokemonMetadata(index);
            double iv = Math.random() * 100;
            return new Pokemon(index, metadata.getName(), metadata.getAttack(), metadata.getDefense(), metadata.getStamina(), cp, hp, dust, candy, iv
            );
        } catch (PokedexException e) {
            System.err.println("Erreur lors de la récupération des métadonnées : " + e.getMessage());
            return null;
        }
    }
}

