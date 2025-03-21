package org.example.diccionario;

import java.util.HashMap;
import java.util.Random;

public class Diccionario {
    static Random random = new Random();
    private HashMap<String,String> diccionario;

    public Diccionario(){
        diccionario=new HashMap<>();
    }
    public void nuevoPar(String espanol, String ingles){
        diccionario.put(espanol,ingles);
    }
    public String traduce(String espanol){
        return diccionario.get(espanol);
    }
    public String palabraAleatoria(){
        int letra = random.nextInt(0, diccionario.size());
        int num = 0;
        for (String palabraDicc : diccionario.keySet()){
            if (num==letra){
                return palabraDicc;
            }
            num++;
        }
        return "";
    }
    public char primeraLetraTraduccion(String espanol){
        return diccionario.get(espanol).charAt(0);
    }
    public void eliminarPalabra(String palabra){
        diccionario.remove(palabra);
    }
}
