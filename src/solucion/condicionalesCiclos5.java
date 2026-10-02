package solucion;

import java.util.Scanner;

public class condicionalesCiclos5 {
    public static void main(String[] args) {
        //Elecciones regionales

        //Variables
        byte pedro = 0, pablo = 0, martha = 0, juan = 0, votoEnBlanco = 0;

        byte candidatos = 4;
        byte voto = 0;
        byte inicializador = 1;
        byte opcion;
        byte salida = 0;
        Scanner in = new Scanner(System.in);


        do {

            salida += 1;

            if (salida >= 2) {
                System.out.println("""
                            Seleccione la opcion indicada
                            ------------------------------
                            1) Nuevo voto
                            0) Salir!
                        """);

                opcion = in.nextByte();

                switch (opcion) {
                    case 1:
                        salida += 1;
                    case 0:
                        salida = 0;

                }
            }


            System.out.println("Elige tu voto");
            System.out.println("""
                        1. Pedro
                        2. Pablo
                        3. Martha
                        4. Juan
                        5. Voto en Blanco.
                    """);

            voto = in.nextByte();

            switch (voto) {
                case 1:
                    pedro += 1;
                case 2:
                    pablo += 1;
                case 3:
                    martha += 1;
                case 4:
                    juan += 1;
                case 5:
                    votoEnBlanco += 1;
            }


        } while (inicializador <= salida);

        System.out.println("Gracias por utilizar el programa de votación");
        System.out.println("Cuantas personas votaron");
        System.out.println("Votos de Pedro: " + pedro);
        System.out.println("Votos de Pablo: " + pablo);
        System.out.println("Votos de Martha: " + martha);
        System.out.println("Votos de Juan: " + juan);
        System.out.println("Votos en blanco: " + votoEnBlanco);


    }
}

/*
    En las elecciones regionales se tienen 4 candidatos. Una persona elige su voto de acuerdo al
    número que indique al candidato:
    1. Pedro
    2. Pablo
    3. Martha
    4. Juan y
    5. Voto en Blanco.

    Decir cuál candidato fue el ganador,
    el número de votos de cada uno y además
    el total de personas que votaron, el programa se debe ejecutar siempre y cuando el usuario no ingrese un cero.
*/