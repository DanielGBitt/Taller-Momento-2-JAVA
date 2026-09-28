package solucion;

import java.util.Scanner;

public class condicionalesCiclos3 {
    public static void main(String[] args) {
        //EMPRESA DE DESINFECTANTES

        int cantidadLitros = 0;
        int totalLitros = 0;
        int precioLitro = 0;
        String codigoArticulo = "";
        Scanner in = new Scanner(System.in);


        System.out.println("Bienvenido a la empresa de desinfectantes");

        for (int i = 1; i <= 5; i++){

            //Inicializo en cero el total para que no se junte con el siguiente
            cantidadLitros = 0;

            //Pido cantidad de litros al usuario

            System.out.println("*----------------------*-----------------*---------------------------");
            System.out.println("Administrador. Favor ingresa cantidad de litros que vas a llevar");
            cantidadLitros = in.nextInt();

            //Pido el precio por litro
            System.out.println("Ahora ingrese el precio por litro");
            precioLitro = in.nextInt();

            //Pido codigo de articulo
            codigoArticulo = in.nextLine();

            //Guardo total de litros de cada usuario
            totalLitros += cantidadLitros;


            System.out.println("**--------FACTURA-----------*");
            System.out.println("Precio por litro: $" + precioLitro);
            System.out.println("Facturacion total: $" + cantidadLitros * precioLitro);
            System.out.println("Productos en total: " + cantidadLitros);
            System.out.println("Codigo de articulo: " + codigoArticulo);

        }

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