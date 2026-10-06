package solucion;

import java.util.Scanner;

public class condicionalesCiclos6 {
    public static void main(String[] args) {

        // Variables
        String nombreCliente = "";
        int acumuladorPedidos = 0;
        int acumuladorVentas = 0;

        byte opcionPizza = 0;
        byte opcion = 0;

        boolean salirPrograma = false;

        //Scanner
        Scanner in = new Scanner(System.in);


        do {

            System.out.println("Bienvenido al sistema de pedidos de la pizzeria lola");
            System.out.println("------------------------------");
            System.out.println("""
                        ¿Que quieres hacer?
                        ---------------------
                        1) Registrar un pedido.
                        2) Salir del programa.
                        ----------------------
                    """);

            opcion = in.nextByte();

            switch (opcion) {
                case 1:
                    in.nextLine();

                    do {
                        System.out.println("Favor introducir su nombre");
                        nombreCliente = in.nextLine();
                    } while (nombreCliente == "");


                    do {
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
                    } while (opcionPizza < 1 || opcionPizza > 3);


                    if (opcionPizza >= 1 && opcionPizza <= 3) {
                        acumuladorPedidos += 1;
                    }

                    if (acumuladorPedidos == 5) {
                        System.out.println("Ya no se pueden agregar mas pedidos!");
                        System.out.println("--------------------------------------");
                    }
                    break;

                case 2:
                    salirPrograma = true;
                    break;

            }


        } while (salirPrograma == false && acumuladorPedidos < 5);


        System.out.println("RESUMEN: ");
        System.out.println("---------------------------------");
        System.out.println("Total ventas: $" + acumuladorVentas);
        System.out.println("Numero de pedidos: " + acumuladorPedidos);
        System.out.println("----------------------------------");
        System.out.println("Gracias por utilizar el programa esperamos verte pronto...");


    }
}