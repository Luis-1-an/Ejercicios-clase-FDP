package unidad5;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Luis Angel
 */
public class Arreglos_desordenados_funcion5 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Obtener los tamaños de los arreglos del usuario
        int N = obtenerTamano("Ingrese el tamaño del primer arreglo: ");
        int M = obtenerTamano("Ingrese el tamaño del segundo arreglo: ");

        // Crear los arreglos
        int[] arreglo1 = new int[N];
        int[] arreglo2 = new int[M];

        // Llenar los arreglos con datos
        llenarArreglo(arreglo1);
        llenarArreglo(arreglo2);

        // Mezclar y ordenar los arreglos
        int[] arregloMezclado = mezclarYOrdenar(arreglo1, arreglo2);

        // Imprimir el arreglo mezclado y ordenado
        System.out.println("Arreglo mezclado y ordenado de forma descendente:");
        imprimirArreglo(arregloMezclado);
    }

    // Función para obtener el tamaño de un arreglo del usuario
    public static int obtenerTamano(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    // Función para llenar un arreglo con datos aleatorios
    public static void llenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 99
        }
    }

    // Función para mezclar y ordenar dos arreglos de forma descendente
    public static int[] mezclarYOrdenar(int[] arreglo1, int[] arreglo2) {
        int[] resultado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, resultado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, resultado, arreglo1.length, arreglo2.length);
        Arrays.sort(resultado);
        // Invertir el arreglo para obtener el orden descendente
        for (int i = 0; i < resultado.length / 2; i++) {
            int temp = resultado[i];
            resultado[i] = resultado[resultado.length - i - 1];
            resultado[resultado.length - i - 1] = temp;
        }
        return resultado;
    }

    // Función para imprimir un arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println(); 
    }
    
}
