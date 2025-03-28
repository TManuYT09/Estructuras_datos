package org.example.inmutabilidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {
    private String nombre;
    private int nivel;
    private List<String> lista_personajes;

    public Juego (String nombre, int nivel){
        this.nombre=nombre;
        this.nivel=nivel;
        lista_personajes = new ArrayList<>();
    }

    public List<String> getLista_personajes() {
        return Collections.unmodifiableList(lista_personajes);
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", lista_personajes=" + lista_personajes +
                '}';
    }
}
