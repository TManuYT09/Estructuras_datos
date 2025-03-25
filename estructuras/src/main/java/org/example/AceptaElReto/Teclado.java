package org.example.AceptaElReto;

import java.util.ArrayList;
import java.util.ListIterator;

public class Teclado {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext()){
            return false;
        }
        else {
            String entrada = in.next();
            ArrayList<Character> salida = new ArrayList<>();
            ListIterator<Character> iterator = salida.listIterator();
            for (int i = 0; i < entrada.length(); i++) {
                switch (entrada.charAt(i)){
                    case '-':
                        while (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        break;
                    case '+':
                        while (iterator.hasNext()){
                            iterator.next();
                        }
                        break;
                    case '*':
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        break;
                    case '3':
                        if (iterator.hasNext()){
                            iterator.next();
                            iterator.remove();
                        }
                        break;
                    default:
                        iterator.add(entrada.charAt(i));
                        break;
                }
            }
            for (Character c : salida){
                System.out.print(c);
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
