package org.example.lambdas.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Ejecutor pruebator = new Ejecutor() {
            @Override
            public boolean ejecutar(int num) {
                System.out.println("Comparando para "+num+":");
                return num>10;
            }
        };

        Ejecutor lambda = (num) -> {
            System.out.println("Comparando para "+num+":");
            return num>10;
        };
        System.out.println(pruebator.ejecutar(15));
        System.out.println(lambda.ejecutar(5));
    }
}
