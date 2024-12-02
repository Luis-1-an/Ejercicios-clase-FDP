package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Funcionexpremate_18 {
    
    

    // Función 
    public static double calcularExpresion(double a, double b, double c, double d, double r) {
        return 4 / (3 * (r + 34)) - 9 * (a + b * c) + (3 + d * (2 + a)) / (a + b * d);
    
    }
   
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        System.out.print("Ingrese el valor de d: ");
        double d = scanner.nextDouble();
        System.out.print("Ingrese el valor de r: ");
        double r = scanner.nextDouble();

        // Calcular el resultado utilizando una función
        double resultado = calcularExpresion(a, b, c, d, r);

        // Salida
        System.out.println("El resultado es: " + resultado);
    }
}

