package Calculadora_Area_Condicional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Usuario;
        double ACirculo;
        double ARectangulo;

        System.out.println("---- CALCULADORA DE AREAS: CIRCULO Y RECTANGULO ----");
        System.out.println("1. Area de un Circulo \n 2. Area de un Rectangulo");
        System.out.println("Elige una de las opciones:");
        Usuario = input.nextInt();

        switch (Usuario) {
            case 1:
                System.out.println("Ingresa el radio del circulo:");
                int Radio = input.nextInt();

                ACirculo = Radio * 3.1416;
                System.out.println("El area del circulo es de: " + ACirculo);

                if (ACirculo > 100) {
                    System.out.println("El area supera las 100 unidades cuadradas");
                } else if (ACirculo < 100) {
                    System.out.println("El area es inferior a las 100 unidades cuadradas");
                }

            break;

            case 2:
                System.out.println("Ingresa la base del rectangulo:");
                int Base = input.nextInt();
                System.out.println("Ingresa la altura del rectangulo:");
                int Altura = input.nextInt();

                ARectangulo = Base * Altura;
                System.out.println("El area del rectangulo es de: " + ARectangulo);

                if (ARectangulo > 100) {
                    System.out.println("El area supera las 100 unidades cuadradas");
                } else if (ARectangulo < 100) {
                    System.out.println("El area es inferior a las 100 unidades cuadradas");
                }

            break;
        }
    }
}
