package unidad5;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Luis Angel
 */
public class Busqueda_binaria_funcion6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el tamaño del arreglo del usuario
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Crear un arreglo ordenado
        int[] arreglo = new int[tamano];
        llenarArregloOrdenado(arreglo);

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));

        // Obtener el elemento a buscar
        System.out.print("Ingrese el elemento a buscar: ");
        int elementoBuscar = scanner.nextInt();

        // Realizar la búsqueda binaria
        int indice = busquedaBinaria(arreglo, elementoBuscar);

        // Imprimir el resultado
        if (indice != -1) {
            System.out.println("El elemento " + elementoBuscar + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento " + elementoBuscar + " no se encuentra en el arreglo");
        }
    }

    // Función para llenar un arreglo con números ordenados
    public static void llenarArregloOrdenado(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1; // Llenamos con números consecutivos para garantizar el orden
        }
    }

    // Función para realizar la búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (arreglo[medio] == elemento) {
                return medio;  

 // Elemento encontrado
            } else if (arreglo[medio] < elemento) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            } else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // Elemento no encontrado
    }
    
}
