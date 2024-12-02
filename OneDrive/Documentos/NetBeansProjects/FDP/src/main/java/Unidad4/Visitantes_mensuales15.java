package Unidad4;
import java.util.Scanner;
/**
 *
 * @author Luis Angel
 */
public class Visitantes_mensuales15 {

    public static void main(String[] args) {
        // Suponiendo una matriz de 10 centros turísticos y 6 meses
        int[][] visitantes = new int[10][6];
        String[] centrosTuristicos = new String[10];

        // ... (Código para leer los datos de un archivo o por consola)

        // Calcular totales por centro turístico
        int[] totales = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totales[i] += visitantes[i][j];
            }
        }

        // Encontrar el centro turístico más y menos visitado
        int maxVisitas = 0, minVisitas = Integer.MAX_VALUE, maxIndex = 0, minIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (totales[i] > maxVisitas) {
                maxVisitas = totales[i];
                maxIndex = i;
            }
            if (totales[i] < minVisitas) {
                minVisitas = totales[i];
                minIndex = i;
            }
        }

        // ... (Código para encontrar los meses con mayor y menor afluencia)

        // Imprimir resultados
        System.out.println("Centro turístico más visitado: " + centrosTuristicos[maxIndex] + " con " + maxVisitas + " visitantes");
        // ... (Imprimir otros resultados)
    }
    
}
