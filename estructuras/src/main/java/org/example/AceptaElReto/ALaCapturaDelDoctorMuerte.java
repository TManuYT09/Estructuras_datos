package org.example.AceptaElReto;

import java.util.ArrayList;
import java.util.List;

public class ALaCapturaDelDoctorMuerte {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int vida = in.nextInt();
        if (vida==0){
            return false;
        }
        else {
            int numArmas = in.nextInt();
            in.nextLine();
            List<Integer> lista_armas = new ArrayList<>();
            for (int i = 0; i < numArmas; i++) {
                String dano = in.nextLine();
            }
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
