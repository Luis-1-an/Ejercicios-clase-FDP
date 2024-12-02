package Unidad4;

/**
 *
 * @author Luis Angel
 */
public class Suma_columnas8 {

    public static void main(String[] args) {

        // Inicializamos la matriz con valores de ejemplo
        int[][] matriz = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };

        // Obtenemos el número de filas y columnas
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Array para almacenar las sumas de cada columna
        int[] sumaColumnas = new int[columnas];

        // Calculamos la suma de cada columna
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        // Imprimimos los resultados
        System.out.println("Sumas de cada columna:");
        for (int i = 0; i < columnas; i++) {
            System.out.println("Columna " + (i+1) + ": " + sumaColumnas[i]);
        }
    }
}
