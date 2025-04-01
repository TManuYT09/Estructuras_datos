package org.example;

public class Estrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hola ");
        sb.append("qué tal"); //Hola qué tal
        sb.insert(5,"soy Manuel "); //Hola soy Manuel qué tal
        sb.replace(5, 8,"somos");//Hola somos Manuel qué tal
        sb.delete(0,5);//somos Manuel qué tal

        System.out.println(sb.toString());
        System.out.println(sb);
        sb.reverse(); //lat éuq leunaM somos
        System.out.println(sb);
    }
}
