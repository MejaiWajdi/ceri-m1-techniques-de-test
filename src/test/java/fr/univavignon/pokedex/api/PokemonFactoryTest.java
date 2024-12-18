package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.univavignon.pokedex.api.*;

public class PokemonFactoryTest {

    private IPokemonFactory pokemonFactory;

    @BeforeEach
    public void setUp() {
        pokemonFactory = new RocketPokemonFactory();
    }

    @Test
    public void testCreatePokemon() {
        Pokemon pokemon = pokemonFactory.createPokemon(1, 500, 50, 3000, 3);
        assertNotNull(pokemon);
        assertEquals("Bulbasaur", pokemon.getName());
        assertEquals(500, pokemon.getCp());
    }
}

