package Contador_Vocales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] arreglo = new String[10];
        int Contador = 0;

        System.out.println("--- CONTADOR DE VOCALES ---");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa un carácter (en MINUSCULA): ");
            String Usuario = input.next();
            arreglo[i] = Usuario;

            if (Usuario.equals("a") || Usuario.equals("e") || Usuario.equals("i") || Usuario.equals("o") || Usuario.equals("u") ) {

                Contador++;
            }
        }

        System.out.println("Hay un total de: " + Contador + " vocales.");
    }
}
