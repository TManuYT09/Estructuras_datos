package org.example.conjuntos_sets;

import java.util.*;

public class Ejercicios {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
//        ejercicioUno();
//        ejercicioTres();
        ejercicioCuatro();
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
    public static void ejercicioCuatro(){
        Set<Integer> lista1 = new TreeSet<>();
        Set<Integer> lista2 = new TreeSet<>();
        String numeros;

        System.out.print("Escribe lista numeros 1: ");
        numeros=entrada.nextLine();
        String[] rest1=numeros.split(" ");
        for (String numero : rest1){
            lista1.add(Integer.parseInt(numero));
        }

        System.out.print("Escribe lista numeros 2: ");
        numeros=entrada.nextLine();
        String[] rest2=numeros.split(" ");
        for (String numero : rest2){
            lista2.add(Integer.parseInt(numero));
        }

        mezclados(lista1, lista2);
    }
        public static void mezclados(Set<Integer> lista1, Set<Integer> lista2){
            Set<Integer> lista_definitiva = new TreeSet<>();
            for (int numero:lista1){
                lista_definitiva.add(numero);
            }
            for (int numero:lista2){
                lista_definitiva.add(numero);
            }
            System.out.println(lista_definitiva);
        }
}
