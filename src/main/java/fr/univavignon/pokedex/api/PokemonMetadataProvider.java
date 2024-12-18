package fr.univavignon.pokedex.api;

import java.util.ArrayList;
import java.util.List;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {

    static List<PokemonMetadata> metadataList;

    public PokemonMetadataProvider() {
        this.metadataList = new ArrayList<>();
        metadataList.add(new PokemonMetadata(0, "Bulbasaur", 126, 126, 90));
        metadataList.add(new PokemonMetadata(1, "Ivysaur", 156, 158, 120));
        metadataList.add(new PokemonMetadata(2, "Venusaur", 198, 200, 160));
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (index < 0 || index >= metadataList.size()) {
            throw new PokedexException("Invalid Pokemon index.");
        }
        return metadataList.get(index);
    }
}

