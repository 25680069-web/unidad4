package Validador_Contrasena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Contrasena = "AMLO";
        int Intentos = 3;
        String Usuario = "";

        System.out.println("--- BIENVENIDO AL SISTEMA ---");
        System.out.println("Ingresa la contraseña para acceder al sistema:");
        Usuario = input.next();

        while (Intentos >= 1) {

        if (Usuario.equals(Contrasena)) {

            System.out.println("Acceso concedido");
            Intentos = -1;

        } else {

            System.out.println("Error, vuelve a ingresar la contraseña:");
            Usuario = input.next();
            if (Intentos == 1) {

                System.out.println("Acceso denegado. Contacte a soporte.");
            }

            Intentos = Intentos - 1;

        }
        }


    }
}
