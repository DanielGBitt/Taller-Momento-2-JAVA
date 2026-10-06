package solucion;

public class condicionalesCiclos4 {

    public static void main(String[] args) {

        // Variables
        int kilometros = 0;
        int copiaKm;
        int digito;
        int contador;

        System.out.println("---------Bienvenido a la '''General Motors'''-------");

        while (kilometros <= 999999) {

            copiaKm = kilometros;
            String pantalla = "";
            contador = 0;

            while (contador < 6) {

                digito = copiaKm % 10;

                if (digito == 8) {
                    pantalla = "&" + pantalla;
                } else {
                    pantalla = digito + pantalla;
                }

                copiaKm = copiaKm / 10;

                contador += 1;
            }

            System.out.println(pantalla);

            kilometros += 1;
        }
    }
}
