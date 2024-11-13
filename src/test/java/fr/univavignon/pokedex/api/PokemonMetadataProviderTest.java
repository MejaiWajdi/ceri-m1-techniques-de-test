package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.univavignon.pokedex.api.*;

public class PokemonMetadataProviderTest {

    private IPokemonMetadataProvider metadataProvider;

    @BeforeEach
    public void setUp() {
        metadataProvider = new PokemonMetadataProvider();
    }

    @Test
    public void testGetPokemonMetadataValid() throws PokedexException {
        PokemonMetadata metadata = metadataProvider.getPokemonMetadata(0);
        assertEquals("Bulbasaur", metadata.getName());
        assertEquals(126, metadata.getAttack());
    }

    @Test
    public void testGetPokemonMetadataInvalid() {
        assertThrows(PokedexException.class, () -> metadataProvider.getPokemonMetadata(151));
    }
}
