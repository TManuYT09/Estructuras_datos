package org.example.equals_hashcode.ejercicio3;

import java.util.HashSet;
import java.util.Stack;

public class AppTarea {
    static Stack<Informe> pila = new Stack<>();
    static HashSet<Informe> lista = new HashSet<>();

    public static void main(String[] args) {
        pila.push(new Informe(1,"Grapar documentos",Tipo.ADMINISTRATIVO));
        pila.push(new Informe(1,"Atender llamadas",Tipo.ADMINISTRATIVO));
        pila.push(new Informe(2,"Ir a por folios",Tipo.ADMINISTRATIVO));
        pila.push(new Informe(1,"LLamar a cassa",Tipo.PERSONAL));
        pila.push(new Informe(1,"Comprar pan",Tipo.PERSONAL));
        while (!pila.isEmpty()){
            System.out.println("Despachando..."+pila.pop());
        }
        System.out.println("---------------------");
        pila.push(new Informe(1,"Grapar documentos",Tipo.ADMINISTRATIVO));
        pila.push(new Informe(1,"Atender llamadas",Tipo.ADMINISTRATIVO));
        pila.push(new Informe(2,"Ir a por folios",Tipo.ADMINISTRATIVO));
        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.get(pila.size()-(i+1)));
        }
        System.out.println("---------------------");
        lista.add(new Informe(1,"Grapar documentos",Tipo.ADMINISTRATIVO));
        lista.add(new Informe(1,"Atender llamadas",Tipo.ADMINISTRATIVO));
        lista.add(new Informe(2,"Ir a por folios",Tipo.ADMINISTRATIVO));
        System.out.println("Tienes "+lista.size()+" tipos de tareas distintas");
    }
}
