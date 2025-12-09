package Suma_Rango;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int NumI;
        int NumF;
        int Sumatotal = 0;

        System.out.println("Ingresa el número inicial:");
        NumI = input.nextInt();
        System.out.println("Ingresa el número final:");
        NumF = input.nextInt();

        if (NumI >= NumF) {

            int temp = NumI;
            NumI = NumF;
            NumF = temp;

            System.out.println("Los números han sido invertidos, el número inicial debe ser menor que el número final.");

        }
        
        for (int i = NumI; i <= NumF; i++) {
            Sumatotal += i;

        }

        System.out.println("La suma total, desde " + NumI +", hasta " + NumF +", es de: " + Sumatotal);
    }
}
