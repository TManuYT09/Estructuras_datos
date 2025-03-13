package org.example.colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicios {
    static Scanner teclado = new Scanner(System.in);
    static Queue<String> colaImpresion = new LinkedList<>();
    static Deque<String> colaCompra = new LinkedList<>();
    public static void main(String[] args) {
//        ejercicioUno();
//        ejercicioDos();
//        ejercicioTres();
        ejercicioCuatro();
//        ejercicioCinco();
    }
    public static void ejercicioUno(){
        Queue<Character> cola = new LinkedList<>();

        cola.offer('a');
        cola.offer('b');
        cola.offer('c');
        cola.offer('d');
        cola.offer('e');

        if (cola.isEmpty()){
            System.out.println("La cola esta vacia");
        }else {
            System.out.println("La cola no esta vacia");
        }

        System.out.println(cola.size());

        System.out.println(cola.peek());

        for (int i = cola.size(); i != 0; i--) {
            System.out.println(cola.poll());
        }
    }
    public static void ejercicioDos(){
        int cont=0;
        do {
            anadirImpresion();
            cont++;
        }while (cont<5);

        do {
            estadoImrpesion();
            procesarImpresion();
        }while (!colaImpresion.isEmpty());
        estadoImrpesion();
        procesarImpresion();
    }
        public static void anadirImpresion(){
            int num=colaImpresion.size()+1;
            colaImpresion.offer("Imprimir documento "+num);
        }
        public static void estadoImrpesion(){
            System.out.println("Estado inicial de la cola de impresión: "+colaImpresion);
        }
        public static void procesarImpresion(){
            if (colaImpresion.isEmpty()){
                System.out.println("No hay más trabajos en la cola de impresión");
            }else {
                System.out.println("Procesando: "+colaImpresion.poll());
            }

        }
    public static void ejercicioTres(){
        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Mirrors - Justin Timberlake");
        playlist.offer("Toxic - Britney Spears");
        playlist.offer("Clavaito - Chanel feat. Abraham Mateo");
        playlist.offer("La reina - Lola Índigo");

        System.out.println("Estado inicial de la playlist: "+playlist);

        while (!playlist.isEmpty()){
            System.out.println("Reproduciendo: "+playlist.poll());
            System.out.println("Estado de la playlist después de reproducir la canción: "+playlist);
        }

        System.out.println("La playlist ha terminado");
    }
    public static void ejercicioCuatro(){
        menu();
    }
        public static void menu(){
            System.out.println("--- LISTA DE LA COMPRA ---");
            System.out.println("1. Añadir producto al final");
            System.out.println("2. Eliminar primer producto");
            System.out.println("3. Eliminar producto por nombre");
            System.out.println("4. Ver primer producto");
            System.out.println("5. Buscar producto");
            System.out.println("6. Mostrar lista actual");
            System.out.println("X. Salir");
            String opcion=elejir();
            ejecutar(opcion);
        }
        public static String elejir(){
            System.out.println();
            System.out.print("Seleccione una opción: ");
            return teclado.next();
        }
        public static void ejecutar(String opcion){
            String producto;
            System.out.println();
            System.out.println("--------------------------");
            System.out.println();
            switch (opcion){
                case "1":
                    System.out.print("Producto a añadir: ");
                    producto=teclado.next();
                    colaCompra.offerLast(producto);
                    break;
                case "2":
                    System.out.print("");
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "X":
                    break;
                default:
                    break;
            }
        }
    public static void ejercicioCinco(){
        System.out.println("Introduce la palabra");
        String palabra = teclado.next();
        Deque<Character> lista = new LinkedList<>();

        for (int i = 0; i < palabra.length(); i++) {
            lista.offer(palabra.charAt(i));
        }

        if (lista.size()>1){
            esPalindromo(lista);
        }else {
            System.out.println("Introduce una palabra, no una letra");
        }

    }
        public static boolean esPalindromo(Deque<Character> lista){
            while (lista.size()>1){
                if (lista.peekFirst()==lista.peekLast()){
                    lista.pollFirst();
                    lista.pollLast();
                }else {
                    System.out.println("No es palindromo");
                    return false;
                }
            }
            System.out.println("Es palindromo");
            return true;
        }
}
