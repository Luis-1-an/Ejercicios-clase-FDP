package unidad5;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Visitantes_mensuales_funcion15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Suponiendo 10 centros turísticos y 6 meses
        int numCentros = 10, numMeses = 6;
        int[][] visitantes = new int[numCentros][numMeses];

        // Llenar la matriz con datos (simulando entrada de usuario)
        System.out.println("Ingrese el número de visitantes para cada centro turístico y mes:");
        for (int i = 0; i < numCentros; i++) {
            for (int j = 0; j < numMeses; j++) {
                System.out.print("Centro " + (i + 1) + ", Mes " + (j + 1) + ": ");
                visitantes[i][j] = scanner.nextInt();
            }
        }

        // Llamar a las funciones para realizar los cálculos
        calcularTotales(visitantes);
        encontrarExtremos(visitantes);
    }

    // Función para calcular el total de visitantes por centro turístico
    public static void calcularTotales(int[][] visitantes) {
        int[] totales = new int[visitantes.length];
        for (int i = 0; i < visitantes.length; i++) {
            for (int j = 0; j < visitantes[i].length; j++) {
                totales[i] += visitantes[i][j];
            }
            System.out.println("Total de visitantes en el centro " + (i + 1) + ": " + totales[i]);
        }
    }

    // Función para encontrar los centros turísticos y meses con mayor y menor afluencia
    public static void encontrarExtremos(int[][] visitantes) {
        // ... (implementar la lógica para encontrar los extremos)
    }
}