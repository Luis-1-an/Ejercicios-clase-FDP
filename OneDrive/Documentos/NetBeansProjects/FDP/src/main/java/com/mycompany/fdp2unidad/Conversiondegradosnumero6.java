package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Conversiondegradosnumero6 {
     public static void main(String[] args) {
        //Declaracion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double c, f, k, r;
        //Entrada
        System.out.println("Ingresa el valor en grados Celsius: ");
        c = sc.nextDouble();
        //Proceso
        f = (c * 1.8) + 32;
        k = c + 273.15;
        r = (c + 273.15)*1.8;
        
        //Salida
        System.out.println("El valor " + c + " en grados Celsius equivale a:");
        System.out.println( f + " grados fahrenheit");
        System.out.println( k + " grados kelvin");
        System.out.println( r + " grados rankine");
    
}
}
