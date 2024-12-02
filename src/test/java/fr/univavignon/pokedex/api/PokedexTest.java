package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.univavignon.pokedex.api.*;

import java.util.Comparator;

public class PokedexTest {

    private IPokedex pokedex;
    private IPokemonFactory pokemonFactory;
    private IPokemonMetadataProvider metadataProvider;

    @BeforeEach
    public void setUp() {
        metadataProvider = new PokemonMetadataProvider();
        pokemonFactory = new PokemonFactory();
        pokedex = new Pokedex(metadataProvider);
    }


    @Test
    public void testAddPokemon() {
        Pokemon pokemon = pokemonFactory.createPokemon(0, 500, 50, 3000, 3);
        int index = pokedex.addPokemon(pokemon);
        assertEquals(0, index);
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        Pokemon pokemon = pokemonFactory.createPokemon(0, 500, 50, 3000, 3);
        pokedex.addPokemon(pokemon);
        assertEquals(pokemon, pokedex.getPokemon(0));
    }

    @Test
    public void testGetPokemonsSorted() {
        Pokemon pokemon1 = pokemonFactory.createPokemon(0, 500, 50, 3000, 3);
        Pokemon pokemon2 = pokemonFactory.createPokemon(1, 600, 60, 3500, 4);
        pokedex.addPokemon(pokemon1);
        pokedex.addPokemon(pokemon2);

        assertEquals("Bulbasaur", pokedex.getPokemons(PokemonComparators.NAME).get(0).getName());
    }
}
