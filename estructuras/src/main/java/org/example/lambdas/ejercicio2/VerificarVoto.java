package org.example.lambdas.ejercicio2;

@FunctionalInterface
public interface VerificarVoto {
    boolean puedeVotar(String nombre, int edad);
}
