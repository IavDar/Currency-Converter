package OOPPok;

public class OOPTest {
    public static void main(String[] args) {


        Pokemon charmander = new Pokemon ("Charmander", 39, 52, 43  );
        Pokemon pikachu = new Pokemon ("Pikachu", 35, 55, 40 );

        charmander.fight(pikachu.pokemonName);

        pikachu.fight(charmander.pokemonName);

        charmander.sleep();

        pikachu.sleep();

    }

}

class Pokemon {
    String pokemonName;
    int currentHp;
    int maxHp;
    int attack;
    int defense;


    Pokemon (String pokemonName, int maxHp, int attack, int defense) {
        this.pokemonName = pokemonName;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
        this.defense = defense;
    }

    public void fight (String enemyName) {

        System.out.println(this.pokemonName + " атакует с силой атаки " + this.attack +" "+ enemyName);
    }

    public void sleep () {
        if (currentHp < maxHp/10) {
        System.out.println(this.pokemonName + " идет спать");
        currentHp += maxHp/10;
        }
        else {
            System.out.println(this.pokemonName + " не хочет спать");
        }


    }


}
