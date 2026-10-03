package solucion;

import java.util.Scanner;

public class condicionalesCiclos7 {
    public static void main(String[] args) {


        byte opcion = 0;
        String nombreCliente = "";
        Scanner in = new Scanner(System.in);
        boolean panelOpcional = false;

        do {
            System.out.println("Bienvenido al gestor de barberia");
            System.out.println("""
                    1) Registrar un cliente
                    2) Salir programa
                """);

            opcion = in.nextByte();


            switch (opcion){
                case 1:

                    do {
                        System.out.println("Ingrese el nombre del cliente");
                        nombreCliente = in.nextLine();
                        if (nombreCliente == ""){
                            System.out.println("Debes ingresar un nombre para continuar!!");
                        }
                    }while (nombreCliente == "");

                    break;

                case 2:
                    panelOpcional = true;
                    break;
            }

        }while (panelOpcional == false);
    }
}

/*Gestión de Barbería

Se requiere un programa en Java que funcione como un sistema básico de gestión para una barbería.
El programa debe mostrar un menú con las siguientes opciones:

Opciones:

Registrar un cliente.
Pedir el nombre del cliente.
No permitir que el nombre esté vacío.
El programa podrá registrar hasta 5 clientes.
Si ya se registraron 5 clientes, mostrar un mensaje indicando que ya no se pueden agregar más.


Seleccionar un servicio.
Verificar que haya al menos un cliente registrado.

Mostrar los servicios disponibles:

1. Corte de cabello ($100)
2. Afeitado ($50)
3. Corte y barba ($130)

Permitir al usuario elegir un servicio y mostrar el costo.
Llevar un conteo de cuántos servicios se han realizado en total.
El programa podrá registrar hasta 5 servicios.
Si ya se registraron 5 servicios, mostrar un mensaje indicando que ya no se pueden agregar más.

Mostrar total de servicios realizados.

Salir del programa.

Notas:

Usar Scanner para entradas.
Validar los datos de entrada (nombres no vacíos y opción de servicio válida).
Puedes utilizar variables para llevar el conteo de clientes y servicios. */