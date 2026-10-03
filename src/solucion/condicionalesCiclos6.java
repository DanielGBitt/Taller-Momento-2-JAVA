package solucion;

import java.util.Scanner;

public class condicionalesCiclos6 {
    public static void main(String[] args) {

        // Variables
        String nombreCliente = "";
        int acumuladorPedidos = 0;
        int acumuladorPrecioPizza = 0;
        int acumuladorVentas = 0;

        byte opcionPizza = 0;
        byte opcion = 0;

        Scanner in = new Scanner(System.in);


        do {


            System.out.println("Bienvenido al sistema de pedidos de la pizzeria lola");
            System.out.println("------------------------------");
            System.out.println("""
                        1) Registrar un pedido.
                        2) Mostrar total de pedidos realizados.
                        3) Mostrar total de ventas acumuladas.
                        4) Salir del programa.
                    """);

            opcion = in.nextByte();

            switch (opcion) {
                case 1:
                    System.out.println("Favor introducir su nombre");
                    nombreCliente = in.nextLine();
                    System.out.println();

                    if (nombreCliente.equals("")) {
                        System.out.println("Ingrese un nombre para poder continuar, reinicia el programa!");
                        return;
                    }

                    System.out.println("""
                                Pizzas disponibles
                                -----------------------
                                1. Napolitana ($80)
                                2. Pepperoni ($90)
                                3. Hawaiana ($85)
                                ----------------------
                            """);

                    System.out.println("Seleccione la pizza");

                    opcionPizza = in.nextByte();

                    switch (opcionPizza) {
                        case 1:
                            acumuladorVentas += 80;
                            break;

                        case 2:
                            acumuladorVentas += 90;
                            break;

                        case 3:
                            acumuladorVentas += 85;
                            break;

                        default:
                            System.out.println("Numero invalido, valores permitidos 1),2) o 3)");
                            break;

                    }

                    if (opcionPizza >= 1 && opcionPizza <= 3) {
                        acumuladorPedidos += 1;
                    }

                    if (acumuladorPedidos == 5) {
                        System.out.println("Ya no se pueden agregar mas pedidos!");
                        System.out.println("--------------------------------------");
                    }
            }


        } while (acumuladorPedidos < 5);


        System.out.println("RESUMEN: ");
        System.out.println("---------------------------------");
        System.out.println("Total de ventas: " + acumuladorVentas);
        System.out.println("Numero de pedidos: " + acumuladorPedidos);
        System.out.println("----------------------------------");
        System.out.println("Gracias por utilizar el programa esperamos verte pronto...");


    }
}

/*
* Sistema de Pedidos en una Pizzería
Se requiere un programa en Java que funcione como un sistema básico de pedidos para una pizzería.
El programa debe mostrar un menú con las siguientes opciones:

*
Opciones:
Registrar un pedido.
Solicitar el nombre del cliente (no debe estar vacío).

Mostrar las pizzas disponibles:

1. Napolitana ($80)
2. Pepperoni ($90)
3. Hawaiana ($85)

Permitir al usuario seleccionar una pizza y luego debe sumar el costo de la pizza al total de
* ventas del día.
El programa podrá registrar hasta 5 pedidos y si ya se registraron 5 pedidos, mostrar un
* mensaje indicando que ya no se pueden agregar más.

Mostrar total de pedidos realizados.
Mostrar total de ventas acumuladas.
Salir del programa.

Notas:
       Usar Scanner para entradas.
Validar que el nombre del cliente no esté vacío.
Validar que la opción de pizza sea correcta.
Llevar el conteo de la cantidad de pedidos y el total de ventas. */