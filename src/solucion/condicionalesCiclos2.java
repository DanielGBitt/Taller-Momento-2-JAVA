package solucion;

import java.util.Scanner;

public class condicionalesCiclos2 {
    public static void main(String[] args) {
        //1) Solicitar edades y alturas de 5 alumnos
        //2) Mostras la edad de cada uno y la estatura media
        //3) Mostrar la cantidad de alumnos mayores a 18 años
        //4) Mostrar la cantidad de alumnos que miden mas de 1.75

        // Creacion de variables
        byte edadAlumno1 = 0;
        byte edadAlumno2 = 0;
        byte edadAlumno3 = 0;
        byte edadAlumno4 = 0;
        byte edadAlumno5 = 0;
        double alturaAlumno1 = 0;
        double alturaAlumno2 = 0;
        double alturaAlumno3 = 0;
        double alturaAlumno4 = 0;
        double alturaAlumno5 = 0;

        Scanner in = new Scanner(System.in);
        int contadorAlumno = 0;
        double estaturaMedia1 = 1.58;
        double estaturaMedia2 = 1.72;

        //LOGICA

        System.out.println("Ingresa la edad del primer alumno");
        edadAlumno1 = in.nextByte();
        System.out.println("Ingresa la edad del segundo alumno");
        edadAlumno2 = in.nextByte();
        System.out.println("Ingresa la edad del tercer alumno");
        edadAlumno3 = in.nextByte();
        System.out.println("Ingresa la edad del cuarto alumno");
        edadAlumno4 = in.nextByte();
        System.out.println("Ingresa la edad del quinto alumno");
        edadAlumno5 = in.nextByte();



    }
}

/*
    Se requiere realizar un programa que solicite las edades y alturas de 5 alumnos, mostrar la edad y
    la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que
    miden más de 1.75 cm.
*/