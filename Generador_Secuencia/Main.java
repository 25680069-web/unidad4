package Generador_Secuencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int NumUsuario;

        System.out.println("--- GENERADOR DE SECUENCIA PAR O IMPAR ---");
        System.out.println("Ingresa el número final de la secuencia:");
        NumUsuario = input.nextInt();

        String Resultado = generarSecuencia(NumUsuario);

        System.out.println(Resultado);

    }

    public static String generarSecuencia (int n) {

        int Inicio = 1;
        String Num = "";

        for (int i = Inicio; i <= n; i++) {

            String tipo;

            if (i % 2 == 0) {
                tipo = "PAR";
            } else {
                tipo = "IMPAR";
            }

            Num += "El número " + i + " es " + tipo + "\n";

        }
        return Num;
    }
}
