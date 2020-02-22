package com.FatePapaya.PokemonBattle;
import com.FatePapaya.Pokemon.Pokemon;

public class Battle {
    Pokemon pok1;
    Pokemon pok2;
    public Battle(Pokemon pok1, Pokemon pok2){
        this.pok1 = pok1;
        this.pok2 = pok2;
        System.out.println("Battle Is Starts");
        System.out.println(pok1.getName() + " vs " +pok2.getClass());
        while(Battling()){
            Attack();
        }
        System.out.println("Battle Is Over," + Win() + " Wins");
    }
    private void Attack(){
        System.out.println(pok1.getName() + " Attacks");
        pok1.Attack(pok2);
        System.out.println(pok2.getName() + " Attacks");
        pok2.Attack(pok1);
    }
    private Boolean Battling(){
        System.out.println(pok1.getName()+":"+pok1.getHp());
        System.out.println(pok2.getName()+":"+pok2.getHp());
        return (pok1.getHp() >= 0 && pok2.getHp() >= 0);
    }
    private String Win(){
        if (pok1.getHp() > 0)
            return pok1.getName();
        else
            return pok2.getName();
    }
}
