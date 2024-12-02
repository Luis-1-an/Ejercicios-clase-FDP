package Unidad4;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Luis Angel
 */
public class Arreglos_no_repetidos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt(); 
        }

        // Utilizar un HashSet para eliminar duplicados
        Set<Integer> conjuntoSinRepetidos = new HashSet<>();
        for (int numero : numeros) {
            conjuntoSinRepetidos.add(numero);
        }

        // Convertir el HashSet de nuevo a un arreglo
        int[] resultado = new int[conjuntoSinRepetidos.size()];
        int i = 0;
        for (int numero : conjuntoSinRepetidos) {
            resultado[i++] = numero;
        }

        // Imprimir el arreglo sin repetidos
        System.out.print("Arreglo sin repetidos: ");
        for (int numero : resultado) {
            System.out.print(numero + " ");
        }
    }
}
    