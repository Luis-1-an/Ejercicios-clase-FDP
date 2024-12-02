package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class entero_positivo_prog22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        
        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }
        
        
        for (int i = 1; i <= numero; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); 
        }
        
        
        for (int i = numero - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
