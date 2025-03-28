package org.example.Practica1;

import java.util.HashMap;

public class Pedido {
    HashMap<Producto,Integer> pedido;
    double importe_total;

    public Pedido() {
        pedido = new HashMap<>();
    }

    public void aplicarPromo3x2(){

    }

    public void aplicarPromo10(){

    }

    public void anyadirAlMap(Producto producto){
        pedido.put(producto,pedido.getOrDefault(producto,0)+1);
    }
}
