package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class IPokedexTest {

    private IPokedex pokedex;
    private Pokemon pokemon;

    @BeforeEach
    public void setUp() {
        // Créer un mock pour IPokedex
        pokedex = Mockito.mock(IPokedex.class);

        // Créer un objet Pokemon fictif
        pokemon = new Pokemon(1, "Bulbasaur", 126, 126, 90, 613, 64, 4000, 4, 56);
    }

    @Test
    public void testSize() {
        // Simuler la taille du pokedex
        when(pokedex.size()).thenReturn(1);

        // Vérifier que la méthode retourne bien la taille attendue
        assertEquals(1, pokedex.size());
    }

    @Test
    public void testAddPokemon() {
        // Simuler l'ajout d'un Pokémon et son index
        when(pokedex.addPokemon(pokemon)).thenReturn(0);

        // Vérifier que le pokémon est bien ajouté et que l'index est correct
        int index = pokedex.addPokemon(pokemon);
        assertEquals(0, index);
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        // Simuler la récupération d'un Pokémon par son identifiant
        when(pokedex.getPokemon(0)).thenReturn(pokemon);

        // Vérifier que le pokémon retourné est bien celui attendu
        Pokemon retrievedPokemon = pokedex.getPokemon(0);
        assertEquals(pokemon, retrievedPokemon);
    }

    @Test
    public void testGetPokemonWithInvalidIdThrowsException() throws PokedexException {
        // Simuler une exception pour un identifiant invalide
        when(pokedex.getPokemon(-1)).thenThrow(new PokedexException("Invalid ID"));

        // Vérifier que l'exception est bien levée pour un ID invalide
        assertThrows(PokedexException.class, () -> {
            pokedex.getPokemon(-1);
        });
    }

    @Test
    public void testGetPokemons() {
        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(pokemon);

        when(pokedex.getPokemons()).thenReturn(pokemonList);

        List<Pokemon> retrievedPokemons = pokedex.getPokemons();
        assertEquals(1, retrievedPokemons.size());
        assertEquals(pokemon, retrievedPokemons.get(0));
    }

    @Test
    public void testGetPokemonsWithOrder() {
        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(pokemon);
        Pokemon aquali = new Pokemon(4, "Aquali", 186, 168, 260, 2729, 202, 5000, 4, 100);
        pokemonList.add(aquali);

        when(pokedex.getPokemons(any(Comparator.class))).thenReturn(pokemonList);

        Comparator<Pokemon> nameComparator = Comparator.comparing(Pokemon::getName);


        List<Pokemon> sortedPokemons = pokedex.getPokemons(nameComparator);
        assertEquals(2, sortedPokemons.size());
        assertEquals(pokemon, sortedPokemons.get(0));
    }
}
