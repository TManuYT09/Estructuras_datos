package org.example.conjuntos_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicios {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
//        ejercicioUno();
        ejercicioTres();
    }

    public static void ejercicioUno(){
        System.out.print("Escribe una frase: ");
        String frase=entrada.nextLine();
        Set<String> lista = new HashSet<>();
        String[] array = frase.split(" ");
        for (String palabra : array){
            lista.add(palabra);
        }
        System.out.println("Palabras únicas: "+lista);
    }
    
    public static void ejercicioTres(){
        String sitioweb="";
        Set<String> lista = new LinkedHashSet<>();
        while(!sitioweb.equals("salir")){
            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
            sitioweb=entrada.nextLine();
            if (!sitioweb.equals("salir")){
                lista.add(sitioweb);
            }
        }
        int cont=1;
        System.out.println("Historial de navegación:");
        for (String palabra : lista){
            System.out.println(cont+". "+palabra);
            cont++;
        }
    }
}
