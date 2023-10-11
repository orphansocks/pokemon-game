import java.util.List;

public class PokemonGymOwner extends Pokemon {
    String name;
    String town;


    // CONSTRUCTOR
    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(pokemons);
        this.name = name;
        this.town = town;

    }

    // GETTERS AND SETTERS

    public String getTown() {

        return town;
    }

    public void setTown(String town) {

        this.town = town;
    }


    // METHODES

}
