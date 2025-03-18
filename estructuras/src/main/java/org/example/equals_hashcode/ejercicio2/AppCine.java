package org.example.equals_hashcode.ejercicio2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class AppCine {
    static Random random = new Random();
    static Queue<Persona> cola_cine = new LinkedList<>();
    static double recaudado;

    public static void main(String[] args) {
        System.out.println("*** CINE AL POBLE ***");
        generarCola();
        genteCine();
        cuantoRecaudado();
    }
    public static void generarCola(){
        int numCasos= random.nextInt(0,250);
        for (int i = 0; i <= numCasos; i++) {
            int edad=random.nextInt(3,100);
            cola_cine.offer(new Persona(edad));
            cantidadRecaudadoCalc(edad);
        }
    }
    public static void cantidadRecaudadoCalc(int edad){
        if (edad>=3 && edad<=10){
            recaudado+=1;
        } else if (edad>=11 && edad<=17) {
            recaudado+=2.5;
        } else if (edad>=18) {
            recaudado+=3.5;
        }
    }
    public static void genteCine(){
        System.out.println("Hay "+cola_cine.size()+" personas a la cola. "+cola_cine);
    }
    public static void cuantoRecaudado(){
        while (!cola_cine.isEmpty()){
            cola_cine.poll();
        }
        System.out.println("La recaudación ha sido de "+recaudado+"€");
    }
}
