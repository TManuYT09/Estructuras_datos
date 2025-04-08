package org.example.lambdas.pokemon;

import lombok.Getter;

@Getter
public class Pokedex {
    private String pokemon;
    private Integer entrenadores;

    public Pokedex(String pokemon, int entrenadores){
        this.pokemon=pokemon;
        this.entrenadores=entrenadores;
    }
}
