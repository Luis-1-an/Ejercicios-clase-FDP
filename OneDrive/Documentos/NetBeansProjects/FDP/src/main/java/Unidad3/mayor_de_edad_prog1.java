package Unidad3;

import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class mayor_de_edad_prog1 {

  
    public static void main(String[] args) {
        //if
        //if-else
        //switch
        //while
        //for
        //do-while
        
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = lector.nextInt();
        if (edad>=18){
            System.out.println("Ya eres mayor de edad y puedes ir a un bar");   
        }else{
            System.out.println("Señora se escapo su hijo");
        }
    }
    
}
