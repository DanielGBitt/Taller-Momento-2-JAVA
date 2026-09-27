package solucion;

import java.util.Scanner;

public class condicionalesCiclos2 {
    public static void main(String[] args) {

        int edadesAlumno = 0;
        double estaturasAlumnos = 0.0;
        Scanner in = new Scanner(System.in);
        int cantidadAlumnosMayores18 = 0;
        int contadorEdadAlumnos = 0;
        double contadorEstaturaAlumnos = 0;
        int cantidadAlumnosEstaturaMayor = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa la edad del alumno numero: " + i);
            edadesAlumno = in.nextInt();

            if (!(edadesAlumno != 0)){
                System.out.println("Valor invalido, la edad debe ser mayor a 0");
                return;
            }


            System.out.println("Ahora ingresa la estatura del alumno numero " + i + " Ingresa valores decimales!!" +
                    " Ejemplo: 1,17");
            estaturasAlumnos = in.nextDouble();



            if (estaturasAlumnos > 1.75) {
                cantidadAlumnosEstaturaMayor = cantidadAlumnosEstaturaMayor / 5;
                cantidadAlumnosEstaturaMayor += 1;
                contadorEstaturaAlumnos = contadorEstaturaAlumnos + estaturasAlumnos;
            }

            if (edadesAlumno > 18) {
                cantidadAlumnosMayores18 += 1;
                contadorEdadAlumnos = contadorEdadAlumnos + edadesAlumno;
            }
        }

        System.out.println("---------RESULTADO--------");
        System.out.println("La cantidad de alumnos mayores a 18 años es: " + cantidadAlumnosMayores18);
        System.out.println("La cantidad de alumnos mayores a 1.17 es: " + cantidadAlumnosEstaturaMayor);
        System.out.println("La estatura media es: " + contadorEstaturaAlumnos);
        System.out.println("La edad promedio es: " + contadorEdadAlumnos / 5);
        System.out.println("---------------------------");

    }
}

/*
    Se requiere realizar un programa que solicite las edades y alturas de 5 alumnos, mostrar la edad y
    la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que
    miden más de 1.75 cm.
*/