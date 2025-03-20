package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejericio2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce una palabra...");
        String palabra = teclado.next();
        HashMap<Character,Integer> mapaLetras = new HashMap<>();

        for (int i = 0; i < palabra.length(); i++) {
           mapaLetras.put(palabra.charAt(i),mapaLetras.getOrDefault(palabra.charAt(i),0)+1);
        }

        for (Map.Entry<Character,Integer> letra : mapaLetras.entrySet()){
            System.out.println(letra.getKey()+": "+letra.getValue());
        }
    }
}
