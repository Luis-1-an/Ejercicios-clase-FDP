package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Areadeltrapecionumero3 {
     public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double basema, baseme, altura, area;
        //Entrada
        System.out.println("Ingresa la base mayor del trapecio: ");
        basema = sc.nextDouble();
        System.out.println("Ingresa la base menor del trapecio: ");
        baseme = sc.nextDouble();
        System.out.println("Ingresa la altura del Trapecio: ");
        altura = sc.nextDouble();
        //Proceso
        area = ((basema + baseme) * altura) / 2;
        //Salida 
        System.out.println("El area del Trapecio es: " + area);
    
     }
}