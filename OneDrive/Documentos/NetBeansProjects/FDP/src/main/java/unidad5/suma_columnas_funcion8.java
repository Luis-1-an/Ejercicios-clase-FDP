package unidad5;

/**
 *
 * @author Luis Angel
 */
public class suma_columnas_funcion8 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };

        // Imprimir la matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Calcular y mostrar la suma de cada columna
        int[] sumasColumnas = calcularSumasColumnas(matriz);
        System.out.println("Suma de cada columna:");
        imprimirArreglo(sumasColumnas);
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función para calcular la suma de cada columna
    public static int[] calcularSumasColumnas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] sumas = new int[columnas];

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                sumas[j] += matriz[i][j];
            }
        }

        return sumas;
    }

    // Función para imprimir un arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
    

