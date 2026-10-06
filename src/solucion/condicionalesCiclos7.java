package solucion;

import java.util.Scanner;

public class condicionalesCiclos7 {
    public static void main(String[] args) {

        //Variables
        byte opcion = 0;
        byte opcionServicio = 0;

        int acumuladorTotalServicios = 0;
        int acumuladorClientes = 0;
        int valorServicios = 0;

        String nombreCliente = "";
        boolean panelOpcional = false;

        //Scanner
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("-------------------------------\n");
            System.out.println("Bienvenido al gestor de barberia Mandala");
            System.out.println("""
                        -----------------------
                        1) Registrar un Cliente
                        2) Seleccionar Servicio
                        3) Salir
                    
                        -----------------------
                    """);


            opcion = in.nextByte();
            in.nextLine();

            switch (opcion) {
                case 1:


                    if (acumuladorClientes == 5) {
                        System.out.println("Alcanzaste maximo permitido de clientes!");
                    }

                    if (acumuladorClientes != 5) {
                        do {
                            System.out.println("-----------------------------");
                            System.out.println("Ingrese el nombre del cliente");
                            nombreCliente = in.nextLine();
                            if (nombreCliente == "") {
                                System.out.println("Debes ingresar un nombre para continuar!!");
                            }
                        } while (nombreCliente == "");

                        acumuladorClientes += 1;

                    }

                    break;

                case 2:

                    if (acumuladorClientes == 0) {
                        System.out.println("No puedes continuar debe haber almenos un cliente registrado!!");
                    } else {
                        if (acumuladorTotalServicios < 5) {
                            do {

                                System.out.println("""
                                        Selecciona un servicio
                                        ------------------------
                                        1. Corte de cabello ($100)
                                        2. Afeitado ($50)
                                        3. Corte y barba ($130)
                                        -------------------------
                                        """);

                                opcionServicio = in.nextByte();

                                if (opcionServicio != 1 && opcionServicio != 2 && opcionServicio != 3) {
                                    System.out.println("Valor invalido - valores permitido 1, 2 o 3!!");
                                    System.out.println("---------------\n");
                                } else {
                                    acumuladorTotalServicios += 1;
                                }
                            } while (opcionServicio != 1 && opcionServicio != 2 && opcionServicio != 3);


                            switch (opcionServicio) {

                                case 1:
                                    valorServicios = 100;
                                    break;

                                case 2:
                                    valorServicios = 50;
                                    break;

                                case 3:
                                    valorServicios = 130;
                                    break;
                            }

                            System.out.println("-------------------------------");
                            System.out.println("Valor servicio $" + valorServicios);
                            System.out.println("--------------------------------\n");

                        } else {
                            System.out.println("-----------------------------------------------");
                            System.out.println("Ya no se pueden agregar mas... Max 5 servicios!!");
                            System.out.println("-----------------------------------------------");
                        }
                    }

                    break;

                case 3:
                    panelOpcional = true;
                    break;
            }
        } while (panelOpcional == false);


        System.out.println("Total servicios: " + acumuladorTotalServicios);
        System.out.println("Total clientes " + acumuladorClientes);
    }
}