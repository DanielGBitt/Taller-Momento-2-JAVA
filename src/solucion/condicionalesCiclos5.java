package solucion;

import java.util.Scanner;

public class condicionalesCiclos5 {
    public static void main(String[] args) {
        //Elecciones regionales

        //Variables
        byte votosPedro = 0, votosPablo = 0, votosMartha = 0, votosJuan = 0, votoEnBlanco = 0;

        String nombreGanador = "";
        int numeroMayor = 0;
        int personas = 0;
        byte voto = 0;
        Scanner in = new Scanner(System.in);


        do {

            System.out.println("Elige tu voto");
            System.out.println("""
                        ------------------
                        1. Pedro
                        2. Pablo
                        3. Martha
                        4. Juan
                        5. Voto en Blanco.
                        -------------------
                        0. Salir
                    """);

            voto = in.nextByte();

            switch (voto) {
                case 1:
                    votosPedro += 1;
                    break;
                case 2:
                    votosPablo += 1;
                    break;
                case 3:
                    votosMartha += 1;
                    break;
                case 4:
                    votosJuan += 1;
                    break;
                case 5:
                    votoEnBlanco += 1;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor invalido, valores " +
                            "permitidos: 1,2,3,4 o 5, intente de nuevo!!");
                    break;
            }

            if (voto <= 5 && voto >= 1) {
                personas += 1;
            }

        } while (voto != 0);

        if (votosPedro > numeroMayor) {
            numeroMayor = votosPedro;
            nombreGanador = "Pedro";
        }
        if (votosPablo > numeroMayor) {
            numeroMayor = votosPablo;
            nombreGanador = "Pablo";
        }
        if (votosMartha > numeroMayor) {
            numeroMayor = votosMartha;
            nombreGanador = "Martha";
        }
        if (votosJuan > numeroMayor) {
            numeroMayor = votosJuan;
            nombreGanador = "Juan";
        }


        System.out.println("Gracias por utilizar el programa de votación");
        System.out.println("------------------------------------");
        System.out.println("RESUMEN VOTACIÓN");
        System.out.println("Votos de Pedro: " + votosPedro);
        System.out.println("Votos de Pablo: " + votosPablo);
        System.out.println("Votos de Martha: " + votosMartha);
        System.out.println("Votos de Juan: " + votosJuan);
        System.out.println("Votos en blanco: " + votoEnBlanco);
        System.out.println("Total de personas que votaron: " + personas);
        System.out.println("El ganador es: " + "---" + nombreGanador + "---");
        System.out.println("------------------------------------");

    }
}
