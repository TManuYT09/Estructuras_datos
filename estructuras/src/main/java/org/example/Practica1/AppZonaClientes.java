package org.example.Practica1;

import java.util.*;

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
        String nombreUsu;
        String contraUsu;

        do {
            System.out.print("Usuario: ");
            nombreUsu = entrada.nextLine();
            System.out.print("Contraseña: ");
            contraUsu = entrada.nextLine();

            for (Cliente cli : clientes){
                if (nombreUsu.equals(cli.getUsuario()) && contraUsu.equals(cli.getContraseña())) {
                    verificado = true;
                    break;
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
            } else {
                System.out.println("Has añadido "+producto+" con un precio de "+cliente.importePedido(producto)+". Importe total del carrito: "+cliente.pedido.importe_total+". ¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");
                String eleccion = entrada.nextLine();

                switch (eleccion.toUpperCase()){
                    case "N":
                        comp=true;
                        break;
                    case "S":
                        comp=false;
                        break;
                    default:
                        System.out.println("ERROR. Eleccion no contemplada, se saldra de la zona de compras");
                        break;
                }
            }
            System.out.println("==========================================");
        }while (!comp);
        menuHacer();
    }

    public static void imprimirProductos(){
        for (Producto produ : Producto.values()){
            System.out.println("\t"+produ+" precio ("+produ.getPrecio()+"€)");
        }
    }

    public static void imprimirCarrito(int modo){
        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        if (modo==1){
            System.out.println("Productos:");
            for (Map.Entry<Producto,Integer> produ : cliente.pedido.pedido.entrySet()){
                System.out.println(produ.getValue()+" "+produ.getKey()+" "+produ.getKey().getPrecio());
            }
        }else if (modo==0){
            System.out.println("Productos ordenados por uds:");

            List<Map.Entry<Producto,Integer>> productos_ordenados = new ArrayList<>(cliente.pedido.pedido.entrySet());
            productos_ordenados.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            for (Map.Entry<Producto,Integer> produ : productos_ordenados){
                System.out.println(produ.getValue()+" "+produ.getKey()+" "+produ.getKey().getPrecio());
            }
        }
        System.out.println("IMPORTE TOTAL: "+cliente.pedido.getImporte_total());
        System.out.println("==========================================");
    }

    public static void menuHacer(){
        imprimirCarrito(1);
        System.out.println("¿QUÉ DESEA HACER?");
        System.out.println("\t[1]. Aplicar promo.");
        System.out.println("\t[2]. Mostrar resumen ordenado por uds.");
        System.out.println("\t[3]. Eliminar productos.");
        System.out.println("\t[X]. Terminar pedido.");
        System.out.println("==========================================");
        System.out.print("\tElige una opción: ");
        String opc=entrada.nextLine();
        System.out.println("==========================================");
        switch (opc.toUpperCase()){
            case "1":
                if (cliente.getPromociones()){
                    System.out.println("YA HAS APLICADO TUS PROMOS");
                }else {
                    cliente.pedido.aplicarPromo3x2();
                    cliente.pedido.aplicarPromo10();
                    cliente.cambiarPromociones();
                    System.out.println("PROMO 3X2 y 10% APLICADAS.");
                }
                menuHacer();
                break;
            case "2":
                imprimirCarrito(0);
                menuHacer();
                break;
            case "3":
                String producto = entrada.nextLine();
                cliente.pedido.eliminarProducto(producto);
                menuHacer();
                break;
            case "X":
                imprimirDespedida();
                break;
            default:
                System.out.println("ERROR. Opcion no contemplada, volver a pedir");
                menuHacer();
                break;
        }
    }

    public static void imprimirDespedida(){
        System.out.println("GRACIAS POR SU PEDIDO. Se lo mandaremos a la dirección "+cliente.getDireccion()+".");
    }
}
