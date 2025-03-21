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
            Integer max=0;
            String clave="0";
            HashMap<String,Integer> moda = new HashMap<>();
            for (String num : numero){
                if (moda.containsKey(num)){
                    moda.put(num,moda.get(num)+1);
                }else {
                    moda.put(num,1);
                }
                if (max < moda.get(num)){
                    max=moda.get(num);
                    clave=num;
                }
            }
            System.out.println(clave);
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
