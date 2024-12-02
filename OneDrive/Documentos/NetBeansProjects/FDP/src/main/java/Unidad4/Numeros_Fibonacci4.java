package Unidad4;

/**
 *
 * @author Luis Angel
 */
public class Numeros_Fibonacci4 {

    public static void main(String[] args) {
        int[] fibonacci = new int[100];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Calcular los siguientes números de Fibonacci
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir los números de Fibonacci
        System.out.println("Los primeros 100 números de Fibonacci son:");
        for (int numero : fibonacci) {
            System.out.print(numero + " ");
        }
    }
}
    
