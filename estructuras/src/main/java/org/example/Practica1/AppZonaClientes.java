package org.example.Practica1;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AppZonaClientes {
    static Scanner entrada = new Scanner(System.in);

    private static Cliente cliente;

    public static void main(String[] args) {
        System.out.println("*** COMPRA ONLINE DE MERCADAM ***");
        Mercadam mercadam = new Mercadam();
        mercadam.generarClientes();
        autenticacion(mercadam.getClientes());
    }

    public static void autenticacion(List<Cliente> clientes){
        for (Cliente cli : clientes){
            System.out.println(cli.getUsuario());
            System.out.println(cli.getContraseña());
        }

        int intentos = 0;
        boolean verificado = false;
        String nombreUsu="";
        String contraUsu="";

        do {
            System.out.print("Usuario: ");
            nombreUsu = entrada.nextLine();
            System.out.print("Contraseña: ");
            contraUsu = entrada.nextLine();

            for (Cliente cli : clientes){
                if (nombreUsu.equals(cli.getUsuario()) && contraUsu.equals(cli.getContraseña())){
                    verificado=true;
                }
            }

            if (!verificado){
                intentos++;
                if (intentos!=3){
                    System.out.println("Algo no coincide o no existe! Vuele a intentarlo...");
                }else {
                    System.out.println("ERROR DE AUTENTICACIÓN");
                    System.exit(0);
                }
            }
        }while (!verificado);

        cliente = new Cliente(nombreUsu,contraUsu);
        System.out.println("BIENVENIDO@ "+cliente.getUsuario()+"!");
        inciarCompra();
    }

    private static void inciarCompra() {
        cliente.crearPedido();
        boolean comp;
        do {
            System.out.println("Añade productos a tu lista de la compra...");
            imprimirProductos();
            System.out.println("==========================================");
            System.out.print("\tElige un producto: ");
            String producto = entrada.nextLine();
            System.out.println("==========================================");
            comp=false;
            for (Producto produ : Producto.values()){
                if (produ.toString().equals(producto)){
                    comp=true;
                    cliente.insertarProducto(produ);
                    break;
                }
            }
            if (!comp){
                System.out.println("El producto no existe! Elige otro.");
            }
        }while (!comp);
    }

    public static void imprimirProductos(){
        for (Producto produ : Producto.values()){
            System.out.println("\t"+produ+" precio ("+produ.getPrecio()+"€)");
        }
    }

    public void imprimirDespedida(){

    }
}
