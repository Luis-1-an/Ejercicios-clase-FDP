package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Perimetrodelrectangulonumero4 {
    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Entero"
        int base, altura, perimetro;
        //Entrada
        System.out.println("Ingresa la base del rectangulo: ");
        base = sc.nextInt();
        System.out.println("Ingresa la altura del rectangulo");
        altura = sc.nextInt();
        //Proceso
        perimetro = (base + altura) * 2;
        //Salida
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    
 }
}
