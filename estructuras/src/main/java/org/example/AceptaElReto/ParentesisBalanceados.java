package org.example.AceptaElReto;

import java.util.Scanner;
import java.util.Stack;

//Pilas
public class ParentesisBalanceados {
        static Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                String expresion = in.nextLine();
                int par = 0;
                int cor = 0;
                int lla = 0;

                Stack<String> pila = new Stack<>();

                for (int i = 0; i < expresion.length(); i++) {
                    pila.add(expresion.substring(i,i+1));
                }

                for (String cal : pila) {
                    if (cal.equals("(") || cal.equals(")")){
                        par++;
                    } else if (cal.equals("[") || cal.equals("]")) {
                        cor++;
                    } else if (cal.equals("{") || cal.equals("}")) {
                        lla++;
                    }
                }

                if (par%2==0 && cor%2==0 && lla%2==0){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

                return true;
            }
        }

        public static void main(String[] args) {
            in = new Scanner(System.in);
            while (casoDePrueba()) {
            }
        }
}

