package Unidad4;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Busqueda_binaria6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Crear el arreglo y llenarlo con valores ordenados
        int[] arreglo = new int[tamano];
        System.out.println("Ingrese los elementos del arreglo en orden ascendente:");
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = scanner.nextInt();
        }

        // Pedir al usuario el valor a buscar
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscar = scanner.nextInt();

        // Realizar la búsqueda binaria
        int indice = busquedaBinaria(arreglo, valorBuscar);

        // Mostrar el resultado
        if (indice != -1) {
            System.out.println("El valor " + valorBuscar + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El valor " + valorBuscar + " no se encuentra en el arreglo");
        }
    }

    // Método para realizar la búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int valorBuscar) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == valorBuscar) {
                return medio; // Valor encontrado
            } else if (arreglo[medio] < valorBuscar) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            } else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // Valor no encontrado
    }
}
