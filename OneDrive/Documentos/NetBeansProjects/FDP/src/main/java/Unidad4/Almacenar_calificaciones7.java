package Unidad4;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis Angel
 */
public class Almacenar_calificaciones7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int N   = scanner.nextInt();

        int[] calificaciones = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la calificación del alumno " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        double[] resultados = calcularEstadisticas(calificaciones);
        System.out.println("Resultados:");
        System.out.printf("Media: %.2f\n", resultados[0]);
        System.out.printf("Varianza: %.2f\n", resultados[1]);
        System.out.printf("Desviación estándar: %.2f\n", resultados[2]);
        System.out.println("Moda(s): " + resultados[3]);
    }

    public static double[] calcularEstadisticas(int[] calificaciones) {
        int n = calificaciones.length;

        // Calcular la media
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        double media = suma / n;

        // Calcular la varianza
        double varianza = 0;
        for (int calificacion : calificaciones) {
            varianza += Math.pow(calificacion - media, 2);
        }
        varianza /= n;

        // Calcular la desviación estándar
        double desviacionEstandar = Math.sqrt(varianza);

        // Calcular la moda(s)
        Map<Integer, Integer> conteoCalificaciones = new HashMap<>();
        for (int calificacion : calificaciones) {
            conteoCalificaciones.put(calificacion, conteoCalificaciones.getOrDefault(calificacion, 0) + 1);
        }

        int maxFrecuencia = 0;
        for (int frecuencia : conteoCalificaciones.values()) {
            maxFrecuencia = Math.max(maxFrecuencia, frecuencia);
        }

        StringBuilder modas = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : conteoCalificaciones.entrySet()) {
            if (entry.getValue() == maxFrecuencia) {
                modas.append(entry.getKey()).append(", ");
            }
        }
        modas.deleteCharAt(modas.length() - 2); // Eliminar la última coma

        return new double[]{media, varianza, desviacionEstandar, Double.parseDouble(modas.toString())};
    }
}
