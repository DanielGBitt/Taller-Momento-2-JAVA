package solucion;

public class condicionalesCiclos {
    public static void main() {
        /*Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó
        10 €,el segundo 20 €, el tercero 40 € y así sucesivamente.
        Realizar un programa para determinar cuánto debe pagar mensualmente y
        el total de lo que pagará después de los 20 meses.

        Este programa puede servir para calcular otras compras y con diferentes
        plazos  */

        // La persona adquirio un producto - debe pagarlo en 20 meses
        // El primer mes pago 10, el segundo 20 y el tercero 40
        // Cada pago se duplica ejemplo 10 * 2 = 20 * 2 = 40
        // Debo capturar el plazo ejemplo: 20 meses osea 20
        // Debo capturar cuanto costo la compra
        // Debo devolver total de los meses con el valor que queda restando

        /* Debo realizar que digamos ingresa el precio de la compra 20000 y
        el numero de cuotas, entonces empezara un ciclo en 10 y ira aumentando
        pero debe haber un if que muestre en pantalla si el numero que itera
        es i * 2


        * */

        int numero = 0;
        int valorCompra = 80;

        for(int i = 10; i <= valorCompra; i += 10){
            numero = i;
            System.out.println(numero * 2);
        }



    }
}
