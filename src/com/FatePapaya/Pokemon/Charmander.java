package com.FatePapaya.Pokemon;

public class Charmander extends Pokemon {
    public Charmander(){
        this.setName("Charmander");
        this.setType(Type.Fire);
    }
    @Override
    public void Attack(Pokemon pokemon) {
        if (pokemon.getType() == Type.Grass)
            pokemon.Attacked(10*2);
        else
            super.Attack(pokemon);
    }
}
