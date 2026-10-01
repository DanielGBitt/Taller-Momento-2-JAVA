package solucion;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class condicionalesCiclos3 {
    public static void main(String[] args) {
        //EMPRESA DE DESINFECTANTES

        int facturacionTotal = 0;
        int cantidadLitros = 0;
        int facturacionTotalLitros = 0;
        int precioLitro = 0;
        int cantidadFacturas = 0;
        byte numeroArticulo = 0;

        //Contabilizo cantidad de productos
        int cantidadProductos = 0;

        //Opcion
        byte opcion = 2;

        //COD Articulo
        String codigoArticulo = "";

        //variable condicional
        byte i = 1;

        //Entrada input
        Scanner in = new Scanner(System.in);


        System.out.println("Bienvenido a la empresa de desinfectantes");


        do {

            //Pido cantidad de litros al usuario
            System.out.println("---------------------------\n");


            if (i >= 2) {
                System.out.println("""
                            ¿Que quieres hacer?
                            1) FACTURAR MISMO PRODUCTO ---
                            2) FACTURAR OTRO PRODUCTO ----
                        """);
                opcion = in.nextByte();
            }

            cantidadProductos += 1;
            i += 1;


            switch (opcion){
                case 1:


                    System.out.println("Administrador. Favor ingresa cantidad de litros que se va a facturar");
                    cantidadLitros = in.nextInt();

                    System.out.println("Ahora ingrese el precio por litro");
                    precioLitro = in.nextInt();

                    //Calculo la cantidad de litros por el precio por litro = TOTAL A FACTURAR
                    facturacionTotal += cantidadLitros * precioLitro;

                    if (cantidadLitros * precioLitro > 100000) {
                        cantidadFacturas += 1;
                    }

                    facturacionTotalLitros += cantidadLitros;

                    System.out.println("---------------------------\n");

                    break;

                case 2:

                        cantidadProductos = 1;
                        facturacionTotal = 0;
                        codigoArticulo = "";


                    System.out.println("Ingrese numero de articulo EJEMPLO: solo se permiten 1,2,3");
                    numeroArticulo = in.nextByte();

                    if (numeroArticulo > 3 || numeroArticulo <= 0) {
                        System.out.println("Valor invalido! Debes ingresar un valor del rango numerico de 1 a 3");
                        return;
                    }

                    System.out.println("Administrador. Favor ingresa cantidad de litros que se va a facturar");
                    cantidadLitros = in.nextInt();

                    //Pido el precio por litro
                    System.out.println("Ahora ingrese el precio por litro");
                    precioLitro = in.nextInt();

                    //Pido codigo de articulo
                    System.out.println("Ingresa ahora el codigo de articulo, EJEMPLO: Letras y numeros: NEJ34");
                    in.nextLine();
                    codigoArticulo = in.nextLine();

                    //Calculo la cantidad de litros por el precio por litro = TOTAL A FACTURAR
                    facturacionTotal += cantidadLitros * precioLitro;

                    if (cantidadLitros * precioLitro > 100000) {
                        cantidadFacturas += 1;
                    }

                    facturacionTotalLitros += cantidadLitros;

                    break;
            }


            System.out.println("**--------FACTURA-----------*");
            System.out.println("Articulo: #" + numeroArticulo);
            System.out.println("..............................");
            System.out.println("Precio por litro: $" + precioLitro);
            System.out.println("Facturacion total: $" + facturacionTotal);
            System.out.println("Productos en total: " + cantidadProductos);
            System.out.println("Codigo de articulo: " + codigoArticulo);
            System.out.println("Total de litros vendidos del articulo: " + cantidadLitros);
            if (i == 5) {
                if (cantidadFacturas <= 0) {
                    System.out.println("Cantidad de facturas de mas de $100.000: " + 0);
                } else {
                    System.out.println("Cantidad de facturas de mas de $" +
                            "100.000: " + cantidadFacturas);
                }
            }
        }while (i <= 5);
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