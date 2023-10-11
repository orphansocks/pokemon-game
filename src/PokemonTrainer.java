import java.util.List;

public class PokemonTrainer {

    List<Pokemon> pokemons;
    String userA;
    String name;

    //CONSTRUCTOR

    public PokemonTrainer(String userA, List<Pokemon> pokemons) {
        this.pokemons = pokemons;
        this.userA = userA;
    }


    //GETTERS AND SETTERS

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
