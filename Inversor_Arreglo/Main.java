package Inversor_Arreglo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] numeros = new int [5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa un número: ");
            int Usuario = input.nextInt();

            numeros[i] = Usuario;
        }


        int Inversor = numeros.length - 1;

        System.out.println("Números invertidos:");
        for (int i = Inversor; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
