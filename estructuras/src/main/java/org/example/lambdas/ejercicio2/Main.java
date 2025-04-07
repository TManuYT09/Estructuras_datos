package org.example.lambdas.ejercicio2;

public class Main {
    public static void main(String[] args) {
        VerificarVoto pruebator = new VerificarVoto() {
            @Override
            public boolean puedeVotar(String texto, int numerom) {
                System.out.print("Probando "+texto+" con "+numerom+" años... ");
                return numerom>18;

            }
        };

        VerificarVoto lambda = (texto, numerom) -> {
            System.out.print("Probando "+texto+" con "+numerom+" años...");
            return numerom>18;
        };
        System.out.println(pruebator.puedeVotar("Maria",14));
        System.out.println(lambda.puedeVotar("Manu",21));
    }
}
