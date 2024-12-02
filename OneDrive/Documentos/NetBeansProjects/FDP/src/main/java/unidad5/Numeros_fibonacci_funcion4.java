package unidad5;

/**
 *
 * @author Luis Angel
 */
public class Numeros_fibonacci_funcion4 {

    public static void main(String[] args) {
        int[] fibonacci = new int[100];
        calcularFibonacci(fibonacci);
        imprimirFibonacci(fibonacci);
    }

    // Función para calcular los números de Fibonacci y almacenarlos en el arreglo
    public static void calcularFibonacci(int[] arreglo) {
        arreglo[0] = 0;
        arreglo[1] = 1;
        for (int i = 2; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i - 1] + arreglo[i - 2];
        }
    }

    // Función para imprimir el arreglo de Fibonacci
    public static void imprimirFibonacci(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
}
