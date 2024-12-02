package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class mayor_prog4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("\t\tPrograma que determina si ud es mayor de edad");
        System.out.println("Ingrese su edad:");
        edad=lector.nextInt();
        // edad ==18)           (edad<=18)           (edad<17)
        // "Ud es MAYOR de edad"
        // "Ud es menor de edad"
        //IF
        
        System.out.println("\nPrimer paso");
        if (edad>=18)
            //Si es verdadero
            System.out.println("Eres mayor de edad. te voy a llevar a un VIP");
        else 
            //Si es falso
            System.out.println("Eres menor de edad");
        
        System.out.println("\nSegundo paso");
        if (edad<18)
            //Si es verdadero
            System.out.println("Eres menor de edad");
        else 
            //si es falso
            System.out.println("Eres mayor de edad");
        
        System.out.println("\nTercer paso");
        if (edad>17)
            //Si es verdadero
            System.out.println("Eres mayor de edad");
        else 
            //Si es falso
            System.out.println("Ve anda,mira,te habla tu mami. No quiero ir a la carcel");
        
    }
    
}
