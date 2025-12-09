package Conversor_Unidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int NumU;
        int Usuario;
        double Conversion;

        System.out.println("---- CALCULADORA CONVERSORA ----");
        System.out.println("Ingresa un valor numérico: ");
        NumU = input.nextInt();

        System.out.println("Elige algunas de las siguientes opciones:");
        System.out.println(" 1. Conversor Kilometros a Millas \n 2. Conversor Centrigrados a Fahrenheit \n 3. Conversor Metros a Pies");
        Usuario = input.nextInt();

        switch (Usuario) {
            case 1:
                Conversion = NumU * 0.621371;
                System.out.println(NumU + " kilometros, equivale a: " + Conversion + " millas");
            break;

            case 2:
                Conversion = (NumU * 9/5) + 32;
                System.out.println(NumU + " centigrados, equivale a: " + Conversion + " F");
            break;

            case 3:
                Conversion = NumU * 3.28084;
                System.out.println(NumU + " metros, equivale a: " + Conversion + " ft");
            break;
        }
    }
}
