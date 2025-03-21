package org.example.diccionario;

import java.util.Scanner;

public class AppDiccionario {

    static Scanner entrada = new Scanner(System.in);

    static Diccionario diccionario = new Diccionario();
    private static int aciertos=0;
    private static int fallos=0;
    private static boolean comp=true;

    public static void main(String[] args) {
        cargarDiccionario();
        while (comp){
            juego();
        }
        estadisticas();
    }
    public static void cargarDiccionario(){
        diccionario.nuevoPar("Perro","Dog");
        diccionario.nuevoPar("Mesa","Table");
        diccionario.nuevoPar("Coche","Car");
        diccionario.nuevoPar("Hombre","Man");
        diccionario.nuevoPar("Mujer","Woman");
        diccionario.nuevoPar("Estudiante","Student");
        diccionario.nuevoPar("Aluminio","Aluminum");
        diccionario.nuevoPar("Cartón","Cardboard");
        diccionario.nuevoPar("Algodón","Cotton");
        diccionario.nuevoPar("Cristal","Glass");
        diccionario.nuevoPar("Piel","Leather");
        diccionario.nuevoPar("Metal","Metal");
        diccionario.nuevoPar("Plástico","Plastic");
        diccionario.nuevoPar("Goma","Rubber");
        diccionario.nuevoPar("Madera","Wood");
        diccionario.nuevoPar("Hierro","Steel");
    }
    public static void juego(){
        String palabra = diccionario.palabraAleatoria();
        System.out.println(palabra +": "+diccionario.primeraLetraTraduccion(palabra)+"...");
        System.out.print("Indique la respuesta: ");
        String ingles = entrada.next();

        if (!ingles.equalsIgnoreCase("fin")){
            if (diccionario.traduce(palabra).equalsIgnoreCase(ingles)){
                System.out.println("¡CORRECTO!");
                aciertos++;
            } else {
                System.out.println("¡NO! La respuesta correcta es "+diccionario.traduce(palabra));
                fallos++;
            }
        }else {
            comp=false;
        }
        diccionario.eliminarPalabra(palabra);
        System.out.println();
    }
    public static void estadisticas(){
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: "+(aciertos+fallos));
        System.out.println("Total aciertos: "+aciertos);
        System.out.println("Total errores: "+fallos);
        System.out.println("Aciertos: "+(aciertos*100/(aciertos+fallos))+"%");
    }
}
