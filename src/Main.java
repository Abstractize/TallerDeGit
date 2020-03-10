import com.FatePapaya.Pokemon.*;
import com.FatePapaya.PokemonBattle.Battle;

public class Main {
    public static void main (String [ ] args) {
        Pokemon pok1 = new Charmander();
        Pokemon pok2 = new Bulbasaur();
        //Hola
        Battle battle = new Battle(pok1,pok2);
    }
}
