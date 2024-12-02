package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class posi_nega_prog6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System. in);
       int numero;
        System.out.println("Ingresa un numero entero cualquiera:");
        numero = sc.nextInt();
        
    if  (numero>=0){
        System.out.println("Tu numero es positivo");
}
   else
            System.out.println("Tu numero es negativo");

    }
    
}
