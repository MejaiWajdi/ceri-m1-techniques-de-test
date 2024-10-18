package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IPokemonFactoryTest {

    private IPokemonFactory pokemonFactory;

    @BeforeEach
    public void setUp() {
        // Créer un mock de IPokemonFactory
        pokemonFactory = Mockito.mock(IPokemonFactory.class);
    }

    @Test
    public void testCreatePokemon() {
        // Définir les paramètres pour la création du Pokémon
        int index = 1;
        int cp = 613;
        int hp = 64;
        int dust = 4000;
        int candy = 4;

        // Créer un objet Pokemon attendu avec ces paramètres
        Pokemon expectedPokemon = new Pokemon(index, "Bulbasaur",126,126,90,613,64,4000,4,56);

        // Simuler la méthode createPokemon pour retourner cet objet
        Mockito.when(pokemonFactory.createPokemon(index, cp, hp, dust, candy)).thenReturn(expectedPokemon);

        // Appel de la méthode createPokemon
        Pokemon createdPokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        // Vérifier que le Pokémon créé n'est pas null
        assertNotNull(createdPokemon);

        // Vérifier que les valeurs du Pokémon créé sont correctes
        assertEquals(index, createdPokemon.getIndex());
        assertEquals(cp, createdPokemon.getCp());
        assertEquals(hp, createdPokemon.getHp());
        assertEquals(dust, createdPokemon.getDust());
        assertEquals(candy, createdPokemon.getCandy());
        assertEquals("Bulbasaur", createdPokemon.getName());
    }
}
