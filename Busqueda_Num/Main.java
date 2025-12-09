package Busqueda_Num;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arreglo = {5,8,9,2,6,10,3};
        int contador = 0;

        System.out.println("--- BUSQUEDA DE NÚMERO ---");
        System.out.println("Ingresa un número para buscarlo:");
        int Usuario = input.nextInt();

        while (contador < arreglo.length) {

            if (arreglo[contador] == Usuario) {
                break;
            }
            contador++;
        }

        if (contador < arreglo.length) {

            System.out.println("El número " + Usuario + ", fue encontrado en la posición: " + contador);
        } else {
        System.out.println("El número " + Usuario + " no fue encontrado.");
        }

    }
}
