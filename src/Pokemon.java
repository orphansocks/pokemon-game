import java.util.Arrays;
import java.util.List;

public abstract class Pokemon  {
    int level;git
    int hp;
    String food;
    String sound;
    String name;
    String type;
    List<Pokemon> pokemons;




    // CONSTRUCTORS
    public Pokemon(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Pokemon(List<Attacks> attacks) {
        this.attacks = attacks;
    }

    public Pokemon(int level, int hp, String food, String sound) {
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }


    // GETTERS AND SETTERS


    public int getLevel() { return level; }

    public void setLevel(int level) { this.level = level; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //METHODES
    public Pokemon selectPokemon();
    public Pokemon chooseGymPokemon();
    public Pokemon choosePokemon();



}
