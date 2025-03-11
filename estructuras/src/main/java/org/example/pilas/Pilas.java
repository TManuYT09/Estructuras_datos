package org.example.pilas;

import java.util.Scanner;
import java.util.Stack;

public class Pilas {
    public static void ejercicioUno(){
        Stack<Character> pila = new Stack<>();

        pila.push('A');
        pila.push('B');
        pila.push('C');
        pila.push('D');
        pila.push('E');

        if (pila.isEmpty()){
            System.out.println("La lista esta vacia");
        }else {
            System.out.println("La lista no esta vacia");
        }

        System.out.println(pila.size());

        System.out.println(pila.peek());

        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
    public static void ejercicioDos(){
        Stack<Integer> pila = new Stack<>();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        pila.push(entrada.nextInt());

        System.out.print("Introduce el segundo número: ");
        pila.push(entrada.nextInt());

        System.out.print("Introduce el tercer número: ");
        pila.push(entrada.nextInt());

        System.out.println("Números en orden inverso:");
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
    public static void ejercicioTres(){
        String expresion = "(2+3))+(5-1)(";

        if (esBalanceado(expresion)){
            System.out.println("La expresion es correcta");
        }else {
            System.out.println("La expresion es incorrecta");
        }
    }
    public static boolean esBalanceado(String expresion){
        Stack<String> pila = new Stack<>();
        String[] expresion_vector = expresion.split("");

        for (int i = 0; i < expresion_vector.length; i++) {
            if (expresion_vector[i].equals("(")){
                pila.push(expresion_vector[i]);
            } else if (expresion_vector[i].equals(")") && pila.contains("(")) {
                pila.pop();
            }
        }

        if (pila.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
