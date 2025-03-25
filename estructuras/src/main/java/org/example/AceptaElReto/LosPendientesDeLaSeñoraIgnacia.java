package org.example.AceptaElReto;

import java.util.*;

//Sets
public class LosPendientesDeLaSeñoraIgnacia {
    static java.util.Scanner in;
    public static boolean casoDePrueba() {
        int numero=in.nextInt();
        in.nextLine();
        if (numero==0){
            return false;
        }
        else {
            String pendientes = in.nextLine();
            String[] array = pendientes.split(" ");
            Set<Integer> lista = new LinkedHashSet<>();
            int pares=0;
            int cant=0;

            for (String num : array){
                lista.add(Integer.parseInt(num));
            }

            for (Integer list : lista) {
                for (int i = 0; i < array.length; i++) {
                    if (Integer.parseInt(array[i])==list){
                        cant++;
                    }
                }
                if (cant>1){
                    pares=(cant/2);
                    if (cant%2!=0){
                        pares--;
                    }
                }
            }

            System.out.println(pares);

            return true;
        }
    }
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
