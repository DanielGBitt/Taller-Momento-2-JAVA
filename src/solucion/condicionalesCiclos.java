package solucion;

import java.util.Scanner;

public class condicionalesCiclos {
    public static void main(String[] args) {

        //Variables
        byte numeroCuotas = 0;
        int primerPago = 0;
        int acumulador = 0;

        //Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("----Bienvenido al sistema de calculo de compras por plazos!------\n");
        System.out.println("--------------------------------------------------------------------");

        do {

            System.out.println("Por favor digite el numero de cuotas");
            numeroCuotas = in.nextByte();
            if (numeroCuotas <= 0) {
                System.out.println("Valor invalido - Ingrese un numero de cuotas mayor a 0");
            }

        } while (numeroCuotas <= 0);


        do {
            System.out.println("Ahora digite por favor el valor del primer pago");
            primerPago = in.nextInt();

            if (primerPago <= 0) {
                System.out.println("Valor invalido - Ingrese un numero de pago mayor a 0");
            }
        } while (primerPago <= 0);

        //Calculo pagos y total
        for (int i = 1; i <= numeroCuotas; i++) {
            System.out.println("mes " + i + ": " + primerPago);
            acumulador = acumulador + primerPago;
            primerPago = primerPago * 2;
        }
        System.out.println("Total : $" + acumulador);

    }
}


/*Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €,el
segundo 20 €, el tercero 40 € y así sucesivamente.
Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo
que pagará después de los 20 meses. Este programa puede servir para calcular otras
compras y con diferentes plazos */