package org.example.inmutabilidad;

import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        Juego pokemon = new Juego("Pokemon Plata", 100);

        List<String> listaPokemons = pokemon.getLista_personajes();
        listaPokemons.add("Pikachu");

        pokemon.getLista_personajes().add("Squirtle");
        pokemon.getLista_personajes().add("Charmander");

        System.out.println(pokemon.getLista_personajes());
    }
}
