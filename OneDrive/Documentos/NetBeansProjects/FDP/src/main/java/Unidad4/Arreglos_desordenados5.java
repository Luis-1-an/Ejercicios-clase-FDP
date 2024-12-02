package Unidad4;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Luis Angel
 */
public class Arreglos_desordenados5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el tamaño de los arreglos del usuario
        System.out.print("Ingrese el tamaño del primer arreglo: ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el tamaño del segundo arreglo: ");
        int M = scanner.nextInt();

        // Crear los arreglos
        int[] arreglo1 = new int[N];
        int[] arreglo2 = new int[M];
        int[] arregloMezclado = new int[N + M];

        // Llenar los arreglos con valores ingresados por el usuario
        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < N; i++) {
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < M; i++) {
            arreglo2[i] = scanner.nextInt();
        }

        // Copiar los arreglos al arreglo mezclado
        System.arraycopy(arreglo1, 0, arregloMezclado, 0, N);
        System.arraycopy(arreglo2, 0, arregloMezclado, N, M);

        // Ordenar el arreglo mezclado en orden descendente
        Arrays.sort(arregloMezclado);
        // Invertir el arreglo para obtener orden descendente
        for (int i = 0; i < arregloMezclado.length / 2; i++) {
            int temp = arregloMezclado[i];
            arregloMezclado[i] = arregloMezclado[arregloMezclado.length - i - 1];
            arregloMezclado[arregloMezclado.length - i - 1] = temp;
        }

        // Imprimir el arreglo mezclado ordenado
        System.out.print("Arreglo mezclado ordenado de forma descendente: ");
        for (int numero : arregloMezclado) {
            System.out.print(numero + " ");
        }
    }
    
}
