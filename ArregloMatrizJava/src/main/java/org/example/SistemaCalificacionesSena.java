package org.example;

import java.util.Scanner;

public class SistemaCalificacionesSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos el número de estudiantes y materias
        int numEstudiantes = 3;
        int numMaterias = 4;

        // Creamos una matriz de dos dimensiones para las calificaciones
        double[][] calificaciones = new double[numEstudiantes][numMaterias];

        // Ingresamos las calificaciones de cada estudiante
        System.out.println("Ingrese las calificaciones de cada estudiante en cada materia:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < numMaterias; j++) {
                System.out.print("  Calificación para la materia " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        // Calculamos el promedio de cada estudiante
        System.out.println("\nPromedio de calificaciones por estudiante:");
        for (int i = 0; i < numEstudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < numMaterias; j++) {
                suma += calificaciones[i][j];
            }
            double promedioEstudiante = suma / numMaterias;
            System.out.println("  Estudiante " + (i + 1) + ": " + promedioEstudiante);
        }

        // Calculamos el promedio de cada materia
        System.out.println("\nPromedio de calificaciones por materia:");
        for (int j = 0; j < numMaterias; j++) {
            double suma = 0;
            for (int i = 0; i < numEstudiantes; i++) {
                suma += calificaciones[i][j];
            }
            double promedioMateria = suma / numEstudiantes;
            System.out.println("  Materia " + (j + 1) + ": " + promedioMateria);
        }

        scanner.close();
    }
}

///Sergio_Urrieta