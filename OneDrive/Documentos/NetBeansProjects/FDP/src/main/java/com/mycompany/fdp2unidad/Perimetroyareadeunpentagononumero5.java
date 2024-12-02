package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Perimetroyareadeunpentagononumero5 {
    public static void main(String[] args) {
        //Declaracion de variables
        // Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double perimetro, area, lado, apotema;
        //Entrada 
        System.out.println("Ingresa el lado del pentagono: ");
        lado = sc.nextDouble();
        System.out.println("Ingresa el apotema del pentagono: ");
        apotema = sc.nextDouble();
        //Proceso
        perimetro = 5 * lado;
        area = (perimetro * apotema) / 2;
        //Salida
        System.out.println("El perimetro del pentagono es: " + perimetro);
        System.out.println("El area del pentagono es: " + area);
    
}
}