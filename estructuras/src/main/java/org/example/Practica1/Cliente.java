package org.example.Practica1;

import java.util.Objects;

public class Cliente {
    String usuario;
    String contraseña;
    Pedido pedido;
    boolean promociones;
    String direccion;

    public Cliente(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.pedido = null;
        this.promociones = false;
        this.direccion = "Calle Falsa, 123";
    }

    public void crearPedido(){
        pedido = new Pedido();
    }

    public void insertarProducto(Producto producto){
        pedido.anyadirAlMap(producto);
    }

    public double importePedido(String producto){
        return Producto.valueOf(producto).getPrecio();
    }

    public String getUsuario() {
        return usuario;
    }


    public String getContraseña() {
        return contraseña;
    }


    public String getDireccion() {
        return direccion;
    }

    public boolean getPromociones() {
        return promociones;
    }

    public void cambiarPromociones() {
        if (!promociones){
            this.promociones = true;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario) && Objects.equals(contraseña, cliente.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contraseña);
    }
}
