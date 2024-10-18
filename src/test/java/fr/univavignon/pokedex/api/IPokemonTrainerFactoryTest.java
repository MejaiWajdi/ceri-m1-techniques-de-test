package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class IPokemonTrainerFactoryTest {

    private IPokemonTrainerFactory pokemonTrainerFactory;
    private IPokedexFactory pokedexFactory;
    private IPokedex pokedex;

    @BeforeEach
    public void setUp() {
        pokemonTrainerFactory = Mockito.mock(IPokemonTrainerFactory.class);

        pokedexFactory = Mockito.mock(IPokedexFactory.class);

        pokedex = Mockito.mock(IPokedex.class);

        when(pokedexFactory.createPokedex(any(IPokemonMetadataProvider.class), any(IPokemonFactory.class))).thenReturn(pokedex);
    }

    @Test
    public void testCreateTrainer() {
        String trainerName = "Ash";
        Team trainerTeam = Team.VALOR;

        PokemonTrainer expectedTrainer = new PokemonTrainer(trainerName, trainerTeam, pokedex);

        when(pokemonTrainerFactory.createTrainer(trainerName, trainerTeam, pokedexFactory)).thenReturn(expectedTrainer);

        PokemonTrainer createdTrainer = pokemonTrainerFactory.createTrainer(trainerName, trainerTeam, pokedexFactory);

        assertNotNull(createdTrainer);

        assertEquals(trainerName, createdTrainer.getName());
        assertEquals(trainerTeam, createdTrainer.getTeam());
        assertEquals(pokedex, createdTrainer.getPokedex());


    }
}

