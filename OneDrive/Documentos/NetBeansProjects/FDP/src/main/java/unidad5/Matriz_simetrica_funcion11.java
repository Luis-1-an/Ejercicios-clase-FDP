package unidad5;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Matriz_simetrica_funcion11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Obtener el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int N = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[N][N];

        // Llenar la matriz con valores ingresados por el usuario
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar si la matriz es simétrica
        boolean esSimetrica = verificarSimetria(matriz);

        // Imprimir el resultado
        if (esSimetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }

    // Función para verificar si una matriz es simétrica
    public static boolean verificarSimetria(int[][] matriz) {
        int N = matriz.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false; // Si algún elemento no coincide, la matriz no es simétrica
                }
            }
        }
        return true; // Si se recorrieron todos los elementos sin encontrar una discrepancia, la matriz es simétrica
    }
}
