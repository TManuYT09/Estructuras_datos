package org.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Pruebas_listiterator {
    public static void main(String[] args) {
        ArrayList<Character> letritas = new ArrayList<>(Arrays.asList('a','b','c','x','z'));

        ListIterator<Character> iterator = letritas.listIterator();

        while (iterator.hasNext()){
            Character letrita = iterator.next();
            if (letritas.get(3)=='x'){
                iterator.set('r');
            }
            iterator.add('z');
        }

        System.out.print(letritas);

        System.out.println();
        ListIterator<Character> iterator_patras = letritas.listIterator(letritas.size());

        while (iterator_patras.hasPrevious()){
            System.out.print(iterator_patras.previous()+" ");
        }
        System.out.println();
        ListIterator<Character> iterator3 = letritas.listIterator();
        while (iterator3.hasNext()){
            int indice_actual = iterator3.previousIndex();
            System.out.println("Posición: "+indice_actual);

            Character letrita = iterator3.next();

            System.out.println("letra: "+letrita+", indice siguiente: "+iterator3.previousIndex());
        }
    }
}
