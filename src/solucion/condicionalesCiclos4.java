package solucion;

import java.util.Scanner;

public class condicionalesCiclos4 {
    public static void main(String[] args) {
        System.out.println("---------Bienvenido a la '''General Motors'''-------");
        //Variables
        int kilometros = 000000;
        int copiaKm = 0;
        int digito = 0;
        Scanner in = new Scanner(System.in);

        while (kilometros <= 999999) {
            copiaKm = kilometros;
            String pantalla = "";

            if (copiaKm == 0) {
                pantalla = "000000";
            }

            while (copiaKm > 0) {
                digito = copiaKm % 10;

                if (digito == 8) {
                    pantalla = "&" + pantalla;
                } else {
                    pantalla = digito + pantalla;
                }

                copiaKm = copiaKm / 10;
            }

            System.out.println(pantalla);
            kilometros += 1;
        }
    }
}

/*La General Motors requiere hacer un programa que le muestre los kilómetros recorridos por un carro en el
tacómetro digital
para su nueva línea de vehículos automatizados, este debe iniciar en 000000 Km hasta 999999 Km. Teniendo en
cuenta que cada
vez que aparezca un 8 lo sustituya por una &. */