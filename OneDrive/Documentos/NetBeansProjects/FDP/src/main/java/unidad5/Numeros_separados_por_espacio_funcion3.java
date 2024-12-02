package unidad5;

/**
 *
 * @author Luis Angel
 */
public class Numeros_separados_por_espacio_funcion3 {

    public static void main(String[] args) {
       int[] primos = new int[100];
        llenarArregloPrimos(primos);
        imprimirArreglo(primos);
    }

    // Función para llenar el arreglo con los primeros 100 números primos
    public static void llenarArregloPrimos(int[] arreglo) {
        int contador = 0, numero = 2;
        while (contador < arreglo.length) {
            if (esPrimo(numero)) {
                arreglo[contador++] = numero;
            }
            numero++;
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num);i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
}
