package com.FatePapaya.Pokemon;

public class Squirtle extends Pokemon {
    public Squirtle(){
        this.setName("Squirtle");
        this.setType(Type.Water);
    }
    @Override
    public void Attack(Pokemon pokemon) {
        if (pokemon.getType() == Type.Fire)
            pokemon.Attacked(10*2);
        else
            super.Attack(pokemon);
    }
}
