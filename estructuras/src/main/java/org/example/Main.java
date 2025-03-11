package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(34);
        pila.push(2);

        System.out.println(pila.peek());
        System.out.println();

        for (Integer nums : pila){
            System.out.println(nums);
        }

        pila.pop();
        System.out.println(pila.peek());


        System.out.println();
        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
}