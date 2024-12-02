package unidad5;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Luis Angel
 */
public class Arreglos_no_repetidos_funcion2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();
        
        int[] numeros = new int[N];
        
        System.out.println("Ingrese los números:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt(); 
        }
        
        int[] sinRepetidos = eliminarRepetidos(numeros);
        
        System.out.println("Arreglo sin repetidos:");
        for (int numero : sinRepetidos) {
            System.out.print(numero + " ");
        }
    }
    
    public static int[] eliminarRepetidos(int[] arreglo) {
        Set<Integer> conjunto = new HashSet<>();
        
        for (int numero : arreglo) {
            conjunto.add(numero);
        }
        
        int[] resultado = new int[conjunto.size()];
        int i = 0;
        for (int numero : conjunto) {
            resultado[i++] = numero;
        }
        
        return resultado;
    }
}
