package org.example.AceptaElReto;

import java.util.HashMap;

public class VaModas {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int cantidad=in.nextInt();
        in.nextLine();
        if (cantidad==0){
            return false;
        }
        else {
            String numeros = in.nextLine();
            String[] numero = numeros.split(" ");
            HashMap<Integer,Integer> moda = new HashMap<>();
            for (String num : numero){
                moda.put(Integer.valueOf(num),moda.getOrDefault(Integer.valueOf(num),0)+1);
            }
            Integer numMax=1;
            for (Integer numb : moda.keySet()){
                if (moda.get(numb)>moda.get(numMax)){
                    numMax= moda.get(numb);
                }
            }
            System.out.println(numMax);
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
