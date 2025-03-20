package org.example.mapas.ejercicio3;

public class AppTemperatura {
    public static void main(String[] args) {
        RegistroTemperaturas registro = new RegistroTemperaturas();
        registro.insertarTemperatura("Alicante",32);
        System.out.println(registro);
        registro.actualizarTemperatura("Alicante");
        registro.mostrar();
    }
}
