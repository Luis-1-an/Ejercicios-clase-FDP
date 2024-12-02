package Unidad3;

import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class mayor_de_edad_prog2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad= lector.nextInt();
        //IF ANIDADOS
        if (edad>=18 && edad<30) {
            System.out.println("Ya puedes votar y entrar a los antros");
        } else if(edad>=30 && edad<65) {
            System.out.println("Ya casate y ten hijos");
        } else if(edad>=65)
            System.out.println("Ya puedes cobrar la pension del bienestar");
    }
    
}
