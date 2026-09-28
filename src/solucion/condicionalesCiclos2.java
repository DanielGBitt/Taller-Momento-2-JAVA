package solucion;

import java.util.Scanner;

public class condicionalesCiclos2 {
    public static void main(String[] args) {

        // Declaracion de variables
        int edadesAlumno = 0;
        double estaturasAlumnos = 0.0;
        Scanner in = new Scanner(System.in);

        int cantidadAlumnosMayores18 = 0;
        /*
            Uso double como tipo de dato en sumatoria de las edades por que es un promedio y puede
            ser tambien decimal por ser promedio.
        */
        double sumatoriaEdadAlumnos = 0;

        double sumatoriaEstaturaAlumnos = 0;
        int cantidadAlumnosEstaturaMayor = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa la edad del alumno numero: " + i);
            edadesAlumno = in.nextInt();

            //Realizo verificacion de input
            if ((edadesAlumno <= 0)){
                System.out.println("Valor invalido, la edad debe ser mayor a 0");
                return;
            }

            //Sumamos todas las edades de los alumnos
            sumatoriaEdadAlumnos += edadesAlumno;


            System.out.println("Ahora ingresa la estatura del alumno numero " + i + " " +
                    "Ingresa valores decimales!!" +
                    " Ejemplo: 1,17");
            estaturasAlumnos = in.nextDouble();


            if (estaturasAlumnos > 1.75) {
                //Sumamos la cantidad de alumnos con estatura mayor a 1.75
                cantidadAlumnosEstaturaMayor += 1;
            }

            //Se suma la estatura de todos los alumnos
            sumatoriaEstaturaAlumnos += estaturasAlumnos;


            if (edadesAlumno > 18) {
                //Sumo la cantidad de alumnos mayores a 18
                cantidadAlumnosMayores18 += 1;
            }
        }

        //Se calcula la edad media de todos los alumnos
        sumatoriaEdadAlumnos = sumatoriaEdadAlumnos / 5;
        //Se calcula la estatura media de todos los alumnos
        sumatoriaEstaturaAlumnos = sumatoriaEstaturaAlumnos / 5;


        System.out.println("---------RESULTADO--------");
        System.out.println("La cantidad de alumnos mayores a 18 años es: " + cantidadAlumnosMayores18);
        System.out.println("La cantidad de alumnos mayores a 1.75 es: " + cantidadAlumnosEstaturaMayor);
        System.out.println("La estatura media es: " + sumatoriaEstaturaAlumnos);
        System.out.println("La edad promedio es: " + sumatoriaEdadAlumnos);
        System.out.println("---------------------------");

    }
}

/*
    Se requiere realizar un programa que solicite las edades y alturas de 5 alumnos, mostrar la edad y
    la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que
    miden más de 1.75 cm.
*/