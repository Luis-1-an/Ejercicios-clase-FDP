package unidad5;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Calif_alumnos_funcion14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de alumnos
        System.out.print("Ingrese el número de alumnos (1-50): ");
        int numAlumnos = scanner.nextInt();

        // Crear el arreglo bidimensional para almacenar las calificaciones
        double[][] calificaciones = new double[numAlumnos][4];

        // Llenar el arreglo con las calificaciones ingresadas por el usuario
        llenarArreglo(calificaciones, scanner);

        // Calcular y mostrar el promedio de cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            double promedioAlumno = calcularPromedioAlumno(calificaciones[i]);
            System.out.println("El promedio del alumno " + (i + 1) + " es: " + promedioAlumno);
        }

        // Calcular y mostrar el promedio del grupo en cada examen
        for (int j = 0; j < 4; j++) {
            double promedioExamen = calcularPromedioExamen(calificaciones, j);
            System.out.println("El promedio del examen " + (j + 1) + " es: " + promedioExamen);
        }

        // Encontrar el examen con el mayor promedio
        int examenMayorPromedio = encontrarExamenMayorPromedio(calificaciones);
        System.out.println("El examen con el mayor promedio fue el examen " + (examenMayorPromedio + 1));

        // Contar y mostrar el número de alumnos aprobados en cada examen
        for (int j = 0; j < 4; j++) {
            int numAprobados = contarAprobados(calificaciones, j);
            System.out.println("Número de alumnos aprobados en el examen " + (j + 1) + ": " + numAprobados);
        }
    }

    // Función para llenar el arreglo con las calificaciones
    public static void llenarArreglo(double[][] calificaciones, Scanner scanner) {
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.print("Ingrese la calificación del alumno " + (i + 1) + " en el examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
    }

    // Función para calcular el promedio de un alumno
    public static double calcularPromedioAlumno(double[] calificacionesAlumno) {
        double suma = 0;
        for (double calificacion : calificacionesAlumno) {
            suma += calificacion;
        }
        return suma / calificacionesAlumno.length;
    }

    // Función para calcular el promedio de un examen
    public static double calcularPromedioExamen(double[][] calificaciones, int examen) {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i][examen];
        }
        return suma / calificaciones.length;
    }

    // Función para encontrar el examen con el mayor promedio
    public static int encontrarExamenMayorPromedio(double[][] calificaciones) {
        double maxPromedio = 0;
        int examen = 0;
        for (int j = 0; j < calificaciones[0].length; j++) {
            double promedioExamen = calcularPromedioExamen(calificaciones, j);
            if (promedioExamen > maxPromedio) {
                maxPromedio = promedioExamen;
                examen = j;
            }
        }
        return examen;
    }

    // Función para contar el número de alumnos aprobados en un examen
    public static int contarAprobados(double[][] calificaciones, int examen) {
        int aprobados = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i][examen] >= 70 && calificaciones[i][examen] <= 100) {
                aprobados++;
            }
        }
        return aprobados;
    }
}
