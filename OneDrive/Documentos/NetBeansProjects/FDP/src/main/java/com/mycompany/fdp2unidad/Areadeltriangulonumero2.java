package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Areadeltriangulonumero2 {
   public static void main(String[] args) {
       //Declaracion de variables
        //tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //tipo de dato "Double"
        double base,altura,area;
        //Entrada
        System.out.println("Ingrese la base:");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura:");
        altura = sc.nextDouble();
        //proceso
        area = base*altura/2;
        //Salida
        System.out.println("El area del triangulo es:"+ area);
   }
}
