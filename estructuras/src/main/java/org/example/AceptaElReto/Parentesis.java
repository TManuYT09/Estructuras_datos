package org.example.AceptaElReto;

import java.util.Stack;

public class Parentesis {
        static java.util.Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                String expresion = in.nextLine();
                boolean comp;

                Stack<String> pila = new Stack<>();
                String[] expresion_vector = expresion.split("");

                for (int i = 0; i < expresion_vector.length; i++) {
                    if (expresion_vector[i].equals("(") || expresion_vector[i].equals("{") || expresion_vector[i].equals("[")){
                        pila.push(expresion_vector[i]);
                    } else if (expresion_vector[i].equals(")") && pila.contains("(") || expresion_vector[i].equals("}") && pila.contains("{") || expresion_vector[i].equals("]") && pila.contains("[")) {
                        pila.pop();
                    }
                }

                if (pila.isEmpty()){
                    comp=true;
                }else {
                    comp=false;
                }

                if (comp){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
                return true;
            }
        }

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        }
}

