package solucion;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class condicionalesCiclos3 {
    public static void main(String[] args) {
        //EMPRESA DE DESINFECTANTES

        //Entrada
        Scanner in = new Scanner(System.in);

        byte numeroProducto = 0;
        int cantidadLitros = 0;
        int cantidadLitros1 = 0;
        int cantidadLitros2 = 0;
        int cantidadLitros3 = 0;

        int acumuladorTotalFacturas = 0;
        int cantidadMayor100 = 0;

        int precioLitro = 0;
        String codigoProducto = "";
        byte incrementador = 1;

        System.out.println("Bienvenido a la empresa de desinfectantes\n");
        System.out.println("..........................................");

        do {
            System.out.println("-----------------------\n");
            System.out.println("Ingresa numero de producto");
            numeroProducto = in.nextByte();

            System.out.println("Ingresa la cantidad de litros");
            cantidadLitros = in.nextInt();

            System.out.println("Ingresa el precio por litro");
            precioLitro = in.nextInt();

            System.out.println("Ingresa el codigo de producto");
            in.nextLine();
            codigoProducto = in.nextLine();


            incrementador += 1;
            acumuladorTotalFacturas += cantidadLitros * precioLitro;

            if (cantidadLitros * precioLitro > 100000){
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

        } while (incrementador <= 5);


        System.out.println("------------RESUMEN FACTURAS----------");
        System.out.println("Producto #" + numeroProducto);
        System.out.println("Cantidad de litros del articulo 1" + cantidadLitros1);
        System.out.println("Cantidad de litros del articulo 2" + cantidadLitros2);
        System.out.println("Cantidad de litros del articulo 3" + cantidadLitros3);
        System.out.println("Precio por litro $" + precioLitro);
        System.out.println("Codigo" + codigoProducto);
        System.out.println("Total facturación: $" + acumuladorTotalFacturas);
        System.out.println("Facturas mayores a $100.000: " + cantidadMayor100);
        System.out.println("-----------------------------");

    }
}
        /*
            Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
            facturas.

            En cada factura debe figurar: el código del artículo ( 3 productos en total),
            la cantidad vendida en litros y el precio por litro. El programa debe procesar de a 5
            facturas a la vez, el administrador las debe introducir ingresando los datos anteriormente
            descritos y el programa debe mostrar: Facturación total, cantidad en litros vendidos del
            artículo 1, 2 y 3, cuantas facturas se emitieron de más de 100.000$.
        */

/*Debo realizar en 5 facturas 3 productos nada mas, osea en la primer factura puede tener el
 * mismo producto de la segunda factura y ahi se suma*/