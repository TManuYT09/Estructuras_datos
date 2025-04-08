package org.example.lambdas.pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppPokemon {
    public static void main(String[] args) {
        Pokedex poke1 = new Pokedex("Squirtle",5);
        Pokedex poke2 = new Pokedex("Charmander",2);

        Pokemon magikarp = new Pokemon() {
            @Override
            public void atacar(int nivel, Pokedex pokedex) {
                System.out.println("Atacando con nivel: "+nivel+" +++++SALPICADURAAAAAAAA");
                System.out.println("Lucha contra "+pokedex.getPokemon());
            }
        };

        magikarp.atacar(12,poke1);

        Pokemon pikachu = (nivel,  pokedex) -> {
            System.out.println("Atacando con nivel: "+nivel+" +++++IMPACTRUENOOOOOOOOOO");
            System.out.println("PIKA PIKA PIKACHU");
            System.out.println("Lucha contra "+pokedex.getPokemon());
        };

        pikachu.atacar(100,poke2);

        List<Pokedex> listaPokes = new ArrayList<>();
        listaPokes.add(poke1);
        listaPokes.add(poke2);
        listaPokes.add(new Pokedex("Bulbasaur",15));
//        Collections.sort(listaPokes,(pokedex,pokedex2) -> pokedex.getEntrenadores().compareTo(pokedex2.getEntrenadores()));
//        Collections.sort(listaPokes,Comparator.comparing(Pokedex::getEntrenadores));
        listaPokes.sort((pokedex,pokedex2) -> pokedex.getEntrenadores().compareTo(pokedex2.getEntrenadores()));

        for (Pokedex poke : listaPokes){
            System.out.println(poke.getPokemon()+" "+poke.getEntrenadores());
        }

        listaPokes.sort((pokedex,pokedex2) -> pokedex.getPokemon().compareTo(pokedex2.getPokemon()));

        for (Pokedex poke : listaPokes){
            System.out.println(poke.getPokemon()+" "+poke.getEntrenadores());
        }

        listaPokes.add(new Pokedex("Digglet",15));

        listaPokes.sort(Comparator.comparing(Pokedex::getEntrenadores).thenComparing(Pokedex::getPokemon).reversed());

        for (Pokedex poke : listaPokes){
            System.out.println(poke.getPokemon()+" "+poke.getEntrenadores());
        }
    }
}
