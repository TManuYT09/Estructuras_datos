package org.example.AceptaElReto;

import java.util.LinkedList;
import java.util.ListIterator;

//Iterator
public class TecladoEstropeado {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext()){
            return false;
        }
        else {
            String entrada = in.nextLine();
            LinkedList<Character> salida = new LinkedList<>();
            ListIterator<Character> iterator = salida.listIterator();
            for (char c : entrada.toCharArray()) {
                switch (c){
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
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        break;
                    case '3':
                        if (iterator.hasNext()){
                            iterator.next();
                            iterator.remove();
                        }
                        break;
                    default:
                        iterator.add(c);
                        break;
                }
            }
            String sal="";
            for (char c : salida){
                sal+=c;
            }
            System.out.println(sal);
            return true;
        }
    }
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
