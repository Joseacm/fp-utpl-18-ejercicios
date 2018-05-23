/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class CICLOFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String estudiante;
        String asigmat;
        int sumEst = 0;
        int edad;
        int asig;
        int bim1;
        int bim2;
        int limite;
        double suma;
        double prome = 0;
        double promedio = 0;
        double sumaprom = 0;
        double promedioest = 0;
        double EdadP = 0;
        String cadenaF = String.format("%s\n", "REPORTE DE CALIFICACIONES DE LOS ESTUDIANTES");
        System.out.println("Ingrese el Numero de Estudiantes que va a Registrar: ");
        limite = entrada.nextInt();
        for (int contador = 1; contador <= limite; contador++) {

            prome = 0;
            suma = 0;
            System.out.printf("INGRESO DE DATOS DEL ESTUDIANTE \n", contador);
            entrada.nextLine();
            System.out.printf("Ingrese el Nombre del Estudiante en (Mayusculas) : ", contador);
            estudiante = entrada.nextLine();
            System.out.printf("Ingrese la Edad del Estudiante : ", contador);
            edad = entrada.nextInt();
            System.out.printf("Ingrese el Numero de Asignaturas : ", contador);
            asig = entrada.nextInt();
            System.out.println("\n-----------------------------------------------------\n");
            cadenaF = String.format("%sNombre del Estudiante en Mayusculas: %s\nEdad: %d\nNumero de Asignaturas:"
                    + " %d\n\n%s\n%s\t\t%s\t\t%s\t\t%s\n", cadenaF, estudiante, edad, asig, "REPORTE DE CALIFICACIONES", "Materia", "Bim-1", "Bim-2", "Promedio");
            for (int i = 1; i <= asig; i++) {

                System.out.printf("***\tREGISTRO DE MATERIAS DEL ESTUDIANTE \t***\n", i);
                entrada.nextLine();
                System.out.printf("Ingrese el Nombre de la Asignatura: ");
                asigmat = entrada.nextLine();
                System.out.printf("Ingrese la Nota del 1° Bimestre del estudiante: ");
                bim1 = entrada.nextInt();
                System.out.printf("Ingrese la Nota del 2° Bimestre del estudante: ");
                bim2 = entrada.nextInt();
                System.out.println("\n-----------------------------------------------------\n");
                prome = (bim1 + bim2) / 2;
                cadenaF = String.format("%s%6.6s.\t\t%d\t\t%d\t\t%.2f\n", cadenaF, asigmat, bim1, bim2, prome);
                suma = suma + prome;

            }
            promedio = suma / asig;
            cadenaF = String.format("%s\t\t\t\t%s\t%.2f\n", cadenaF, "PromedioT:", promedio);
            System.out.println(); //Imprime una nueva linea
            if (promedio >= 19) {
                cadenaF = String.format("%s%s%s", cadenaF, estudiante, "  Tiene como promedio de SOBRESALIENTE en sus calificaciones\n\n");
            } else {
                if (promedio >= 16 && promedio < 19) {
                    cadenaF = String.format("%s%s%s", cadenaF, estudiante, "  Tiene como promedio de MUY BUENO en sus calificiones\n\n");
                } else {
                    if (promedio >= 13 && promedio < 16) {
                        cadenaF = String.format("%s%s%s", cadenaF, estudiante, " Tiene como promedio de BUENO en sus calificaciones\n\n");
                    } else {
                        cadenaF = String.format("%s%s%s", cadenaF, estudiante, "  Tiene como promedio de REGULAR en sus calificaciones\n\n");
                    }
                }
            }
            sumaprom = sumaprom + promedio;
            sumEst = sumEst + edad;
            EdadP = sumEst / limite;
        }
        promedioest = sumaprom / limite;
        System.out.printf("%s", cadenaF);
        System.out.println("INFORMACION GLOBAL DE LOS ESTUDIANTES INGRESADOS: ");
        System.out.printf("El Promedio de Edad es: %.2f \n", EdadP);
        System.out.printf("El Promedio de Notas de los Estudiante: %.2f\n", promedioest);

    }

}
