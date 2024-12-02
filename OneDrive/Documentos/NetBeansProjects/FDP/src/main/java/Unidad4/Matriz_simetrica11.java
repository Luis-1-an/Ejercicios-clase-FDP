package Unidad4;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Matriz_simetrica11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño de la matriz
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
        boolean esSimetrica = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) { // Solo comparamos la mitad inferior
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
            if (!esSimetrica) {
                break;
            }
        }

        // Imprimir el resultado
        if (esSimetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }
}   
    
 
