package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Funcionareadeltrianguloyperimetrodelrectangulonumero12 {
    public static double areat(double b, double h) {
        return (b * h) / 2;
    }

    public static double perimetror(double b, double h) {
        return (b + h) * 2;
    }

    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double baset, alturat, baser, alturar;

        //Entrada 
        System.out.println("Ingresa la base del triangulo: ");
        baset = sc.nextDouble();
        System.out.println("Ingresa la altura del triangulo: ");
        alturat = sc.nextDouble();

        //Salida
        System.out.println("El area del triangulo es: " + areat(baset, alturat));

        //Entrada
        System.out.println("Ingresa la base del rectangulo: ");
        baser = sc.nextDouble();
        System.out.println("Ingresa la altura del rectangulo: ");
        alturar = sc.nextDouble();

        //Salida 
        System.out.println("El perimetro del rectangulo es: " + perimetror(baser, alturar));
    }
    
}
