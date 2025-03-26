package org.example.AceptaElReto;

import java.util.LinkedList;
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
            List<Integer> inocentes_armas = new LinkedList<>();
            List<Integer> villano_armas = new LinkedList<>();
            for (int i = 0; i < numArmas; i++) {
                String dano = in.nextLine();
                String[] array = dano.split(" ");
                inocentes_armas.add(Integer.parseInt(array[0]));
                villano_armas.add(Integer.parseInt(array[1]));
            }
            int dano_max_in=0;
            for (Integer dano : inocentes_armas){
                if (dano>dano_max_in){
                    dano_max_in=dano;
                }
            }
            String indices="";
            for (int i = 0; i < villano_armas.size(); i++) {
                if (villano_armas.get(i)>=vida && inocentes_armas.get(i)<=dano_max_in){
                    indices=indices+i+" ";
                }
            }
            if (indices.isEmpty()){
                System.out.println("MUERTE ESCAPA");
            }else {
                System.out.println(indices);
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
