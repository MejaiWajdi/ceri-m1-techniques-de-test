package fr.univavignon.pokedex.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.univavignon.pokedex.api.*;

public class PokemonTrainerFactoryTest {

    private IPokemonTrainerFactory trainerFactory;

    @BeforeEach
    public void setUp() {
        trainerFactory = new PokemonTrainerFactory();
    }

    @Test
    public void testCreateTrainer() {
        IPokedexFactory pokedexFactory = new PokedexFactory();
        PokemonTrainer trainer = trainerFactory.createTrainer("Ash", Team.MYSTIC, pokedexFactory);

        assertNotNull(trainer);
        assertEquals("Ash", trainer.getName());
        assertEquals(Team.MYSTIC, trainer.getTeam());
        assertNotNull(trainer.getPokedex());
    }
}
