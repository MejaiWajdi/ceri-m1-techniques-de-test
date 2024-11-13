package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.univavignon.pokedex.api.*;

public class PokedexFactoryTest {

    private IPokedexFactory pokedexFactory;

    @BeforeEach
    public void setUp() {
        pokedexFactory = new PokedexFactory();
    }

    @Test
    public void testCreatePokedex() {
        IPokemonMetadataProvider metadataProvider = new PokemonMetadataProvider();
        IPokemonFactory pokemonFactory = new PokemonFactory();

        IPokedex pokedex = pokedexFactory.createPokedex(metadataProvider, pokemonFactory);

        assertNotNull(pokedex);
        assertEquals(0, pokedex.size());
    }
}

