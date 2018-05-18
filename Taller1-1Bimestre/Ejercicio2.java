/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String nombre;
        int cantidad;
        int padre;
        double pasajes;
        double bar;
        double salidas;
        double suma = 0;
        double suma1 = 0;
        double suma2 = 0;
        double total = 0;
        double sueldo;
        double falta;
        double sobra;

        String cadena_final;
        String cadena = String.format("%s\n", "REPORTE DE GASTOS DE PADRES DE FAMILIA");
        cadena_final = String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\n", "Persona", "Pasajes", "Bar", "Salidas", "Total");
        System.out.printf("Gastos Familia\n");

        System.out.printf("Ingrese  el numero de padres a evaluar\n");
        padre = entrada.nextInt();

        for (int j = 1; j <= padre; j++) {
            entrada.nextLine();

            System.out.printf("Ingrese el nombre y apellido del padre de familia\n");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el sueldo semanal\n");
            sueldo = entrada.nextDouble();
            System.out.println("Ingrese el numero de hijos\n");
            cantidad = entrada.nextInt();

            cadena_final = String.format("%s\n\nReporte Gastos de Padre de Familia\n\nNombre del Padre de Familia: %s\nSueldo semanal:%.2f\nNumero Hijos:%d\n\n%s\t\t%s\t\t%s\t\t%s\n", cadena_final, nombre, sueldo, cantidad, "Persona", "Pasajes", "Bar", "Salidas");
            for (int contador = 1; contador <= cantidad; contador++) {

                System.out.println("Ingrese lo que gasta en Pasajes");
                pasajes = entrada.nextDouble();
                System.out.println("Ingrese lo que gasta en Bar");
                bar = entrada.nextDouble();
                System.out.println("Ingrese lo que gasta en Salidas");
                salidas = entrada.nextDouble();

                suma = suma + pasajes;
                suma1 = suma1 + bar;
                suma2 = suma2 + salidas;
                total = suma + suma1 + suma2;
                falta = total - sueldo;
                sobra = sueldo - total;

                cadena_final = String.format("%s%-10s\t%s\t\t%.1f\t\t%s\t\t%.1f\n", cadena_final, contador, pasajes, bar, salidas, total);

            }
            cadena_final = String.format("%s%s\t\t%s\t\t%s\t\t%s\t\t\n", cadena_final, "total", suma, suma1, suma2);

            System.out.println(); //Imprime una nueva linea
            if (total == sueldo) {
                cadena_final = String.format("%s\n\nEl padre de familia %s le alcanza el dinero\n", cadena_final, nombre);
            }
            if (total > sueldo) {
                cadena_final = String.format("%s\n\nEl padre de familia %s le falta el dinero\n", cadena_final, nombre);
            } else {
                cadena_final = String.format("%s\n\nEl padre de familia %s le sobra el dinero\n", cadena_final, nombre);
            }
        }
        System.out.println(cadena_final);
    }
}
