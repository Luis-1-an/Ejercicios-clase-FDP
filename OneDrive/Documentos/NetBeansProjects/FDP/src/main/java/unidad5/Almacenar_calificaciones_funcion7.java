package unidad5;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis Angel
 */
public class Almacenar_calificaciones_funcion7 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Obtener el número de alumnos
        System.out.print("Ingrese el número de alumnos: ");
        int N = scanner.nextInt();

        // Crear el arreglo para almacenar las calificaciones
        int[] calificaciones = new int[N];

        // Llenar el arreglo con las calificaciones
        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < N; i++) {
            calificaciones[i] = scanner.nextInt();
        }

        // Calcular la media
        double media = calcularMedia(calificaciones);
        System.out.println("La media es: " + media);

        // Calcular la varianza
        double varianza = calcularVarianza(calificaciones, media);
        System.out.println("La varianza es: " + varianza);

        // Calcular la desviación estándar
        double desviacionEstandar = Math.sqrt(varianza);
        System.out.println("La desviación estándar es: " + desviacionEstandar);

        // Calcular la moda
        int moda = calcularModa(calificaciones);
        System.out.println("La moda es: " + moda);
    }

    // Función para calcular la media
    public static double calcularMedia(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length; 

    }

    // Función para calcular la varianza
    public static double calcularVarianza(int[] calificaciones, double media) {
        double sumaCuadradosDesviaciones = 0;
        for (int calificacion : calificaciones) {
            sumaCuadradosDesviaciones += Math.pow(calificacion - media, 2);
        }
        return sumaCuadradosDesviaciones / calificaciones.length;
    }

    // Función para calcular la moda
    public static int calcularModa(int[] calificaciones) {
        Map<Integer, Integer> frecuencias = new HashMap<>();
        int moda = calificaciones[0], maxFrecuencia = 1;

        for (int calificacion : calificaciones) {
            frecuencias.put(calificacion, frecuencias.getOrDefault(calificacion, 0) + 1);
            if (frecuencias.get(calificacion) > maxFrecuencia) {
                moda = calificacion;
                maxFrecuencia = frecuencias.get(calificacion);
            }
        }

        return moda; 
    }
    
}
