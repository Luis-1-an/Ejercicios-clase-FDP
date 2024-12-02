package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class num_posi_primosmenores_prog20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Los números primos menores a " + numero + " son:");

        for (int i = 2; i < numero; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return
                false;
            }
        }
        return true; 

    }
}
