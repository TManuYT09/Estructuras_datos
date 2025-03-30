package org.example.Practica1;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    HashMap<Producto,Integer> pedido;
    double importe_total;

    public Pedido() {
        pedido = new HashMap<>();
    }

    public void aplicarPromo3x2(){
        for (Map.Entry<Producto,Integer> produc : pedido.entrySet()){
            Integer cant=produc.getValue();
            while (cant>=3){
                importe_total=importe_total-produc.getValue();
                cant--;
            }
        }
    }

    public void aplicarPromo10(){
        double descuento = importe_total*10/100;
        importe_total=importe_total-descuento;
    }

    public void anyadirAlMap(Producto producto){
        pedido.put(producto,pedido.getOrDefault(producto,0)+1);
        importe_total=importe_total+ producto.getPrecio();
    }

    public void eliminarProducto(String producto){
        for (Producto produ : Producto.values()){
            if (produ.toString().equals(producto)){
                if (pedido.get(produ)>1){
                    pedido.put(produ,pedido.get(produ)-1);
                    importe_total=importe_total-produ.getPrecio();
                }else {
                    pedido.remove(produ);
                    importe_total=importe_total-produ.getPrecio();
                }
            }
        }
    }

    public double getImporte_total() {
        return importe_total;
    }

}
