package com.FatePapaya.Pokemon;

public class Bulbasaur extends Pokemon {
    public Bulbasaur(){
        this.setName("Bulbasaur");
        this.setHp(120);
        this.setType(Type.Grass);
    }
    @Override
    public void Attack(Pokemon pokemon) {
        if (pokemon.getType() == Type.Water)
            pokemon.Attacked(10*2);
        else
            super.Attack(pokemon);
    }
}
