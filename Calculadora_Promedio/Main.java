package Calculadora_Promedio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double [] calif = new double [5];
        int Longitud = calif.length;

        System.out.println("--- CALCULADORA DE PROMEDIO --- \n");
        for (int i=0; i < calif.length; i++ ){
            System.out.println("Ingresa una calificación:");
            int Usuario = input.nextInt();
            calif[i] = Usuario;
        }
        System.out.println("El promedio de las 5 calificaciones es de :" + calcularPromedio(calif, Longitud));

    }

    public static double calcularPromedio (double[] c, int L) {
        double promedio;
        double suma = 0;


        for (int i=0; i < L; i++) {
            suma += c[i];
        }

        promedio = suma / L;

        return promedio;
    }
}
