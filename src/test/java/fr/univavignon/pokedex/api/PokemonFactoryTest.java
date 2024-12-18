package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PokemonFactoryTest {

    private IPokemonFactory pokemonFactory;

    @BeforeEach
    public void setUp() {
        pokemonFactory = new RocketPokemonFactory();
    }

    @Test
    public void testCreatePokemonKnownIndex() {
        Pokemon pokemon = pokemonFactory.createPokemon(1, 500, 50, 3000, 3);
        assertNotNull(pokemon);
        assertEquals("Bulbasaur", pokemon.getName());
        assertEquals(500, pokemon.getCp());
        assertEquals(50, pokemon.getHp());
        assertEquals(3000, pokemon.getDust());
        assertEquals(3, pokemon.getCandy());
        assertEquals(1.0, pokemon.getIv());
    }

    @Test
    public void testCreatePokemonUnknownIndex() {
        Pokemon pokemon = pokemonFactory.createPokemon(999, 400, 40, 1000, 2);
        assertNotNull(pokemon);
        assertEquals("MISSINGNO", pokemon.getName());
        assertEquals(1.0, pokemon.getIv());
    }

    @Test
    public void testCreatePokemonNegativeIndexNotInMap() {
        Pokemon pokemon = pokemonFactory.createPokemon(-2, 200, 20, 500, 1);
        assertNotNull(pokemon);
        assertEquals("MISSINGNO", pokemon.getName());
        assertEquals(1000, pokemon.getAttack());
        assertEquals(1000, pokemon.getDefense());
        assertEquals(1000, pokemon.getStamina());
        assertEquals(0.0, pokemon.getIv());
    }

    @Test
    public void testCreatePokemonNegativeIndexInMap() {
        Pokemon pokemon = pokemonFactory.createPokemon(-1, 300, 30, 2000, 4);
        assertNotNull(pokemon);
        assertEquals("Ash's Pikachu", pokemon.getName());
        assertEquals(1000, pokemon.getAttack());
        assertEquals(1000, pokemon.getDefense());
        assertEquals(1000, pokemon.getStamina());
        assertEquals(0.0, pokemon.getIv());
    }



}
