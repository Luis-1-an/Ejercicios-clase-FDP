package unidad5;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Uno_en_diagonal_funcion12 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int N = scanner.nextInt();

        int[][] matriz = crearMatrizDiagonal(N);

        // Imprimir la matriz
        imprimirMatriz(matriz);
    }

    // Función para crear una matriz diagonal
    public static int[][] crearMatrizDiagonal(int N) {
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Diagonal principal
                } else {
                    matriz[i][j]= 0;
                }
            }
        }

        return matriz;
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
    
}
