package Unidad4;

/**
 *
 * @author Luis Angel
 */
public class Numeros_separados_por_espacio3 {

    public static void main(String[] args) {
        int[] primos = new int[100];
        int contador = 0;
        int numero = 2;

        while (contador < 100) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        // Mostrar los números primos
        System.out.print("Los primeros 100 números primos son: ");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    
