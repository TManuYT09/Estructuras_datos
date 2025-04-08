package org.example.lambdas.pokemon;

@FunctionalInterface
public interface Pokemon {
    void atacar(int nivel, Pokedex pokedex);
}
