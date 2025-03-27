package org.example.AceptaElReto;

import java.util.HashMap;
import java.util.Map;

//Map
public class EligiendoLaSedeDelMundial {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int cantidad=in.nextInt();
        in.nextLine();
        if (cantidad==0){
            return false;
        }
        else {
            String ciudades = in.nextLine();
            String[] ciudarrays = ciudades.split(" ");
            int max = 0;
            String maxi = "";
            HashMap<String, Integer> populariadad = new HashMap<>();
            for (String cui : ciudarrays){
                if (populariadad.containsKey(cui)){
                    populariadad.put(cui,populariadad.get(cui)+1);
                }else {
                    populariadad.put(cui,1);
                }
            }
            for (Map.Entry<String,Integer> mapita : populariadad.entrySet()){
                if (max < mapita.getValue()){
                    max=mapita.getValue();
                    maxi=mapita.getKey();
                }else if (max == mapita.getValue()){
                    maxi="EMPATE";
                }
            }
            System.out.println(maxi);
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}
