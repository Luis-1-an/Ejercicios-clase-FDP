package Unidad4;
 import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Uno_en_diagonal12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario el tamaño de la matriz
        System.out.print("Ingrese el 1  tamaño de la matriz cuadrada: ");
        int N = scanner.nextInt();

        // Crear la matriz y llenarla con ceros
        int[][] matriz = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = 0;
            }
        }

        // Colocar unos en las diagonales principales
        for (int i = 0; i < N; i++) {
            matriz[i][i] = 1; // Diagonal principal
            if (i != N - 1 - i) {
                matriz[i][N - 1 - i] = 1; // Diagonal secundaria
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
