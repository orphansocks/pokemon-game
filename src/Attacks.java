import org.w3c.dom.ls.LSOutput;

public class Attacks {


//    De aanval methodes moeten de volgende eigenschappen hebben:
//
//    een system.out.println die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
//    een beslissingsstructuur die kijkt welk type de vijand heeft;
//    aan de hand van de beslissingsstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
//    een system.out.println die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
//    vergeet de hp van de vijand niet te verlagen;
//    sluit de methode af met een system.out.println die de resteren hp waarde weergeeft van de vijand;
//    De volgende methodes hebben nog een extra functie:
//
//    rainDance heeft geen effect op electric Pokemons maar geeft een system.out.println met de boodschap: "has no effect on (vijand)";
//    rainDance levert een hp boost aan vijanden grass-types;
//    thunder levert een hp boost aan electric Pokemons;
//    leechSeed trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug;

    void surf(Pokemon name, Pokemon enemy);

    void fireLash(Pokemon name, Pokemon enemy);

    public void leafStorm(Pokemon name, Pokemon enemy);

    void hydroPump(Pokemon name, Pokemon enemy);

    void thunderPunch(Pokemon name, Pokemon enemy);

    void electroBall(Pokemon name, Pokemon enemy);

    public void solarBeam(Pokemon name, Pokemon enemy);

    void flameThrower(Pokemon name, Pokemon enemy);

    void hydroCanon(Pokemon name, Pokemon enemy);

    void pyroBall(Pokemon name, Pokemon enemy);

    void thunder(Pokemon name, Pokemon enemy);

    void rainDance(Pokemon name, Pokemon enemy);

    public void leechSeed(Pokemon name, Pokemon enemy);

    public void leaveBlade(Pokemon name, Pokemon enemy);

    void inferno(Pokemon name, Pokemon enemy);

    void voltTackle(Pokemon name, Pokemon enemy);

}
