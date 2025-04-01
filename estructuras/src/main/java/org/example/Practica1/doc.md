# Práctica: Servicio de compra online en MERCADAM

## ÍNDICE

1. [Resumen](#resumen)
2. [Estructura de clases](#estructura-de-clases)
    - [Diagrama de clases UML](#diagrama-de-clases-uml)
    - [Código PlantUML](#código-plantuml)
    - [Contenido de clases](#contenido-de-clases)
3. [Programa principal](#programa-principal)
4. [Pruebas](#pruebas)
5. [Entrega](#entrega)


## Resumen
> Este proyecto consiste en una app de compra online para un supermercado ficticio llamado **MERCADAM**.

El programa se divide en dos partes:
- **App de gestión**: crear clientes y productos.
- **App de zona de clientes**: autenticación, selección de productos y realización de pedidos.

## Estructura de clases

El programa sigue el paradigma de **Programación Orientada a Objeto (POO)** y se basa en la siguiente estructura:

### Diagrama de Clases UML

### Código PlantUML

````PlantUML
````

### Contenido de clases

#### AppZonaCliente
- autenticacion: En este método se encarga de que el usuario introduzca correctamente las credenciales, si se sobrepasa de 3 intentos, se cerrara la aplicación.
- iniciarCompra: En este método es donde añadiremos productos a la lista de la compra infinitamente hasta que le digamos que ya no queremos añadir más productos o que introduzcamos mal la opción que pasara a la siguiente parte.
- imprimirProducto: Este método se encarga de mostrar todos los productos y sus precios de la clase enum **Producto** para el método de iniciarCompra.
- imprimirCarrito: Este método se encarga de mostrar los productos que tienes en el mapa mostrando las cantidades, cuál producto es, su precio por unidad y el importe total de los productos de la lista para el metodo **metodoHacer**
- menuHacer: En este método mostrará al usuario el carrito,(**imprimirCarrito**), y las opciones que puede hacer el usuario en ese punto, son 4, la primera es para aplicar las 2 promociones que hay en la app, la segunda ejecuta **imprimirCarrito** pero mostrando la lista en orden descendente, la tercera elimina un producto de la lista a eleccion del usuario y el ultimo ya cierra la aplicación.
- imprimirDespedida: Este método solo es un mensaje de despedida, mostrando la calle del cliente cerrando asi la aplicación.

#### Cliente
- Cliente: Es el constructor de Cliente, con la particularidad de que en la variable pedido es null, promociones es falso y la dirección por defecto es "Calle Falsa, 123".
- crearPedido: En este método crea el objeto pedido.
- insertarProducto: En este método añadirá a la lista el producto introducido en la clase AppZonaCliente llamando a **anyadirAlMap**.
- importePedido: En este método solo muestra el contenido de pedido.
- getUsuario: Este método nos devuelve el nombre del usuario.
- getContraseña: Este método nos devuelve la contraseña del usuario.
- getDireccion: Este método nos devuelve la dirección del usuario.
- getPromocion: Este método nos devuelve y si la promoción está activa o no.
- cambiarPromociones: En este método cambia el está de la variable promoción si es falso a verdadero.
- @Override equals: Este método es solo para comprobar que el usuario metido y la contraseña metida con iguales a los guardados.
- @Override hashCode: Este método solo devuelve el hashCode del objeto.

#### Mercadam
- Mercadam: Es el constructor de Mercadam.
- generarClientes: En este método se encarga de generar aleatoriamente tanto el nombre de usuario como su contraseña.
- getClientes: Este método se encarga de devolver el contenido de la lista clientes.

#### Pedido
- Pedido: Es el constructor de Pedido, con la particularidad de que solo genera el pedido.
- aplicarPromo3x2: 
- aplicarPromo10:
- anyadirAlMap:
- eliminarProducto:
- getImporteTotal:

## Programa principal

## Pruebas

## Entrega
- [ ] **Código fuente**: [Enlace a GitHub](https://github.com/TManuYT09/Estructuras_datos/tree/main/estructuras/src/main/java/org/example/Practica1)
- [ ] **Vídeo demostrativo**: [Enlace al Vídeo]()