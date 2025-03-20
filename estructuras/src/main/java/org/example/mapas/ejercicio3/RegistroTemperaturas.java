package org.example.mapas.ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {

    static Scanner entrada = new Scanner(System.in);

    private HashMap<String,Integer> mapaTemperaturas;

    public RegistroTemperaturas(){
        mapaTemperaturas = new HashMap<>();
    }

    public void insertarTemperatura (String ciudad, Integer temperatura){
        mapaTemperaturas.put(ciudad,temperatura);
    }

    public void actualizarTemperatura (String ciudad){
        System.out.println("Inserta la temperatura de "+ciudad+": ");
        mapaTemperaturas.put(ciudad,entrada.nextInt());
    }

    public void consultarTemperatura(){
        System.out.println("Introduce la ciudad a consultar: ");
        String ciudad = entrada.next();
        if (mapaTemperaturas.containsKey(ciudad)){
            System.out.println("La temperatura en "+ciudad+" es de "+mapaTemperaturas.get(ciudad)+"º");
        }else {
            System.out.println("La ciudad de "+ciudad+" no tiene temperaturas registradas.");
        }
    }

    public void mostrar(){
        System.out.println("Registro de temperaturas:");
        for (Map.Entry<String,Integer> temperatura : mapaTemperaturas.entrySet()){
            System.out.println(temperatura.getKey()+": "+temperatura.getValue()+"º");
        }
    }

    @Override
    public String toString() {
        return "RegistroTemperaturas{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }
}
