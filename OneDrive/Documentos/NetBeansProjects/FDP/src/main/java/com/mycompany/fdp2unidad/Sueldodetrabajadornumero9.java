package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Sueldodetrabajadornumero9 {
     public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double sueldod, sueldoq, imss, isr;
        //Entrada 
        System.out.println("Ingresa tu salario diario: ");
        sueldod = sc.nextDouble();
        
        //Proceso
        sueldoq = sueldod * 15;
        isr = sueldoq * 0.135;
        imss = sueldoq * 0.025;
        //Salida
        System.out.println("Tu salario quincenal es de: " + (sueldoq - isr - imss));
    
}
}
