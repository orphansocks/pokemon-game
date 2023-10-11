
    public class WaterPokemon extends Pokemon implements Attacks {
        String name;
        String attacks;

        public WaterPokemon(String name, int hp, int level, String food, String sound) {
            super(hp, level, food, sound);
            this.name = name;

        }

        //GETTERS AND SETTERS
        public String getAttacks() {
            return attacks;
        }

        public void setAttacks(String attacks) {
            this.attacks = attacks;
        }

    }
