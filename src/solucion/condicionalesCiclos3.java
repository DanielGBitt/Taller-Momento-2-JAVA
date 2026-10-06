package solucion;

import java.util.Scanner;

public class condicionalesCiclos3 {
    public static void main(String[] args) {
        //EMPRESA DE DESINFECTANTES

        //Variables
        byte numeroProducto = 0;
        int cantidadLitros = 0;
        int cantidadLitros1 = 0;
        int cantidadLitros2 = 0;
        int cantidadLitros3 = 0;

        int acumuladorTotalFacturas = 0;
        int cantidadMayor100 = 0;

        int precioLitro = 0;
        String codigoProducto = "";
        byte contadorFacturas = 1;

        //Entrada
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido a la empresa de desinfectantes Rio Sucio");
        System.out.println("--------------------------------------\n");

        do {
            do {
                System.out.println("Ingresa numero de producto");
                numeroProducto = in.nextByte();
                if (numeroProducto < 1 || numeroProducto > 3) {
                    System.out.println("Producto invalido. Debe ser 1, 2 o 3.");
                }
            } while (numeroProducto < 1 || numeroProducto > 3);

            System.out.println("Ingresa la cantidad de litros");
            cantidadLitros = in.nextInt();

            System.out.println("Ingresa el precio por litro");
            precioLitro = in.nextInt();

            System.out.println("Ingresa el codigo de producto");
            in.nextLine();
            codigoProducto = in.nextLine();


            contadorFacturas += 1;
            acumuladorTotalFacturas += cantidadLitros * precioLitro;

            if (cantidadLitros * precioLitro > 100000) {
                cantidadMayor100 += 1;
            }


            switch (numeroProducto) {
                case 1:
                    cantidadLitros1 += cantidadLitros;
                    break;
                case 2:
                    cantidadLitros2 += cantidadLitros;

                    break;
                case 3:
                    cantidadLitros3 += cantidadLitros;
                    break;
            }

        } while (contadorFacturas <= 5);


        System.out.println("------------RESUMEN FACTURAS----------");
        System.out.println("Cantidad de litros del articulo 1: " + cantidadLitros1);
        System.out.println("Cantidad de litros del articulo 2: " + cantidadLitros2);
        System.out.println("Cantidad de litros del articulo 3: " + cantidadLitros3);
        System.out.println("Total facturación: $" + acumuladorTotalFacturas);
        System.out.println("Facturas mayores a $100.000: " + cantidadMayor100);
        System.out.println("-----------------------------");

    }
}