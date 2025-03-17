package org.example.equals_hashcode.ejercicio1;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Peticion {
    private String id;
    private String nombre_fichero;

    public Peticion(String id, String nombre_fichero) {
        this.id = id;
        this.nombre_fichero = nombre_fichero;
    }

    @Override
    public String toString() {
        return "Peticion{" +
                "id='" + id + '\'' +
                ", nombre_fichero='" + nombre_fichero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Peticion peticion = (Peticion) o;
        return Objects.equals(id, peticion.id) && Objects.equals(nombre_fichero, peticion.nombre_fichero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre_fichero);
    }
}
