package org.example.mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce una frase...");
        String frase = teclado.nextLine();
        String[] palabras = frase.split(" ");
        HashMap<String,Integer> mapaPalabras = new HashMap<>();

        for (String palabra : palabras){
            mapaPalabras.put(palabra,mapaPalabras.getOrDefault(palabra,0)+1);
        }

        for (String palabra : mapaPalabras.keySet()){
            System.out.println(palabra+": "+mapaPalabras.get(palabra));
        }
    }
}
