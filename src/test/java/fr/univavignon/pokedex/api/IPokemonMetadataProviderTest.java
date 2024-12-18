package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class IPokemonMetadataProviderTest {

    private IPokemonMetadataProvider pokemonMetadataProvider;

    @BeforeEach
    public void setUp() throws PokedexException {
        pokemonMetadataProvider = Mockito.mock(IPokemonMetadataProvider.class);

        when(pokemonMetadataProvider.getPokemonMetadata(0)).thenReturn(new PokemonMetadata(0, "Pikachu", 229, 174, 90));

    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        PokemonMetadata data = pokemonMetadataProvider.getPokemonMetadata(0);
        System.out.println("Name: " + data.getName());
        System.out.println("Attack: " + data.getAttack());
        System.out.println("Index: " + data.getIndex());
        System.out.println("Stamina: " + data.getStamina());

        assertEquals("Pikachu", data.getName());
        assertEquals(229, data.getAttack());
        assertEquals(174, data.getDefense());
        assertEquals(90, data.getStamina());
        verify(pokemonMetadataProvider).getPokemonMetadata(0);
    }

    @Test
    public void testGetPokemonMetadataWithInvalidIndex() throws PokedexException {
        int invalidIndex = -1;

        when(pokemonMetadataProvider.getPokemonMetadata(invalidIndex))
                .thenThrow(new PokedexException("Invalid index"));

        assertThrows(PokedexException.class, () -> {
            pokemonMetadataProvider.getPokemonMetadata(invalidIndex);
        });
    }
}
