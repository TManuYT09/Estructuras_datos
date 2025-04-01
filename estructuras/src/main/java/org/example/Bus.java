package org.example;

import java.util.Random;

public class Bus {

    public static final int TAM = 97;

    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS MUTXAMEL
        int b = 0; // POSICIÓN INICIAL DEL AUTOBÚS SAN VICENTE

        System.out.println("\n<<<<<<<<<< CARRERA DE AUTOBUSES >>>>>>>>>>");
        System.out.println("       IES SAN VICENTE vs IES MUTXAMEL");
        System.out.println("                  FIGHT!");
        Thread.sleep(3000);

        while (a < TAM || b < TAM ) {

            a=a+random.nextInt(0,3); // avanzamos
            b=b+random.nextInt(0,3);

            limpiarPantalla();

            if (a<TAM && b<TAM) {
                System.out.println(dibujarCarrera(a, b));
                Thread.sleep(70);
            }

        }

        if (a>b){
            System.out.println("\033[32m"+ "¡¡GANADOR: IES MUTXAMEL!!" + "\033[0m");
        }
        if (b>a){
            System.out.println("\033[32m"+ "¡¡GANADOR: IES SAN VICENTE!!" + "\033[0m");
        }
        if (b==a){
            System.out.println("\033[32m"+ "¡¡EMPATE!!" + "\033[0m");
        }


    }

    public static String dibujarCarrera(int n1, int n2) {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("_______________  ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   IES MUTXAMEL  |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117)).append("\n");;
        sb.append(" ".repeat(n2)).append("_______________  ").append(" ".repeat(100 - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("| IES SAN VICENTE |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

}