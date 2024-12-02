package Unidad4;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Calif_alumnos14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de alumnos
        System.out.print("Ingrese el número de alumnos 1  (1-50): ");
        int numAlumnos = scanner.nextInt();

        // Validar el número de alumnos
        while (numAlumnos < 1 || numAlumnos > 50) {
            System.out.println("Número de alumnos inválido. Ingrese un número entre 1 y 50.");
            numAlumnos = scanner.nextInt();
        }

        // Crear el arreglo bidimensional para almacenar las calificaciones
        double[][] calificaciones = new double[numAlumnos][4];

        // Llenar el arreglo con las calificaciones ingresadas por el usuario
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        // Calcular y mostrar el promedio de cada alumno
        System.out.println("\nPromedio de cada alumno:");
        for (int i = 0; i < numAlumnos; i++) {
            double promedioAlumno = calcularPromedioAlumno(calificaciones[i]);
            System.out.println("Alumno " + (i + 1) + ": " + promedioAlumno);
        }

        // Calcular y mostrar el promedio del grupo en cada examen
        System.out.println("\nPromedio del grupo en cada examen:");
        for (int j = 0; j < 4; j++) {
            double promedioExamen = calcularPromedioExamen(calificaciones, j);
            System.out.println("Examen " + (j + 1) + ": " + promedioExamen);
        }

        // Encontrar el examen con el mayor promedio
        int examenMayorPromedio = encontrarExamenMayorPromedio(calificaciones);
        System.out.println("\nEl examen con el mayor promedio fue el examen " + (examenMayorPromedio + 1));

        // Contar los alumnos aprobados en cada examen
        System.out.println("\nNúmero de alumnos aprobados en cada examen:");
        for (int j = 0; j < 4; j++) {
            int aprobados = contarAprobados(calificaciones, j);
            System.out.println("Examen " + (j + 1) + ": " + aprobados);
        }
    }

    // Función para calcular el promedio de un alumno
    private static double calcularPromedioAlumno(double[] calificacionesAlumno) {
        double suma = 0;
        for (double calificacion : calificacionesAlumno) {
            suma += calificacion;
        }
        return suma / calificacionesAlumno.length;
    }

    // Función para calcular el promedio de un examen
    private static double calcularPromedioExamen(double[][] calificaciones, int examen) {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i][examen];
        }
        return suma / calificaciones.length;
    }

    // Función para encontrar el examen con el mayor promedio
    private static int encontrarExamenMayorPromedio(double[][] calificaciones) {
        double maxPromedio = calcularPromedioExamen(calificaciones, 0);
        int examenMayor = 0;
        for (int j = 1; j < 4; j++) {
            double promedioActual = calcularPromedioExamen(calificaciones, j);
            if (promedioActual > maxPromedio) {
                maxPromedio = promedioActual;
                examenMayor = j;
            }
        }
        return examenMayor;
    }

    // Función para contar los alumnos aprobados en un examen
    private static int contarAprobados(double[][] calificaciones, int examen) {
        int aprobados = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i][examen] >= 70 && calificaciones[i][examen] <= 100) {
                aprobados++;
            }
        }
        return aprobados;
    }
}
