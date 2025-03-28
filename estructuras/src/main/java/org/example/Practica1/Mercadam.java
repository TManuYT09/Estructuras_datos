package org.example.Practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mercadam {
    static Random random = new Random();

    private List<Cliente> clientes;
    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    Mercadam(){
        clientes = new ArrayList<>();
    }

    public void generarClientes() {
        String nombre="";
        String contraseña="";
        for (int i = 0; i < 8; i++) {
            int posicion= random.nextInt(0,caracteres.length()-1);
            nombre=nombre+caracteres.charAt(posicion);
        }

        for (int i = 0; i < 8; i++) {
            int posicion= random.nextInt(0,caracteres.length()-1);
            contraseña=contraseña+caracteres.charAt(posicion);
        }

        Cliente cliente = new Cliente(nombre,contraseña);
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }
}
