package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Tabla_de_multiplicar_entero_positivo_prog17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        
        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        
    }
}
    
