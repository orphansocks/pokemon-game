import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon implements Attacks {
    String name;
    String attacks;
    String type = "Fire";

    public FirePokemon(String name, int hp, int level, String food, String sound) {
        super(hp, level, food, sound);
        this.name = name;

    }

    // GETTERS AND SETTERS

    public String getAttacks() {
        return attacks;
    }

    public void setAttacks(String attacks) {
        this.attacks = attacks;
    }


    //METHODES








}
