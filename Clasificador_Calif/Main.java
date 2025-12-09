package Clasificador_Calif;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Calif;

        System.out.println("--- CLASIFACDOR DE CALIFICACIONES ---");
        System.out.println("Ingresa la calificación (0 a 100):");
        Calif = input.nextInt();
        System.out.println("La calificación ingresada es de: " + Calif);
        System.out.println(clasificarCalificacion(Calif));

    }

    public static String clasificarCalificacion(int Cf) {

        String Clasificacion = "";

        if (Cf >= 90 && Cf <= 100) {
            Clasificacion = "Calificación, SOBRESALIENTE";
        } else if (Cf >= 80 && Cf < 90) {
            Clasificacion = "Calificación, NOTABLE";
        } else if (Cf >= 70 && Cf < 80) {
            Clasificacion = "Calificación, APROBATORIA";
        } else if (Cf >= 0 && Cf < 70) {
            Clasificacion = "Calificación, REPROBATORIA";
        }

        return Clasificacion;
    }
}
