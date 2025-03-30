package org.example.AceptaElReto;

import java.util.HashSet;
import java.util.Set;

public class MichaelJFoxYElPatoDonald {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int cantidad = in.nextInt();
        boolean comp=false;
        in.nextLine();
        if (cantidad==0){
            return false;
        }
        else {
            Set<String> anyos = new HashSet<>();
            for (int i = 0; i < cantidad; i++) {
                String anyo = in.nextLine();
                String[] any = anyo.split("/");
                anyos.add(any[0]+"/"+any[1]);
            }
            for (String fecha : anyos){
                int repetido=0;
                for (String fecha2 : anyos){
                    if (fecha2.equals(fecha)){
                        repetido++;
                    }
                }
                if (repetido>1){
                    comp=true;
                    break;
                }
            }
            if (comp){
                System.out.println("SI");
            }else {
                System.out.println("NO");
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
