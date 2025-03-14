package org.example.conjuntos_sets;

import java.util.*;

public class Pruebas {
    public static void main(String[] args) {
        Set<Character> letras = new HashSet<>();

        letras.add('d');
        letras.add('t');
        letras.add('a');
        letras.add('n');
        letras.add('t');

        System.out.println(letras);
        System.out.println("---------");

        Set<Character> letras_enlazadas = new LinkedHashSet<>();
        letras_enlazadas.add('z');
        letras_enlazadas.add('b');
        letras_enlazadas.add('g');

        System.out.println(letras_enlazadas.add('z'));

        System.out.println(letras_enlazadas);
        System.out.println("---------");

        Set<Character> letras_ordenadas = new TreeSet<>();

        letras_ordenadas.add('v');
        letras_ordenadas.add('n');
        letras_ordenadas.add('d');
        letras_ordenadas.add('p');
        letras_ordenadas.add('p');

        System.out.println(letras_ordenadas);

        letras_ordenadas.remove('n');

        System.out.println(letras_ordenadas);

    }
}
