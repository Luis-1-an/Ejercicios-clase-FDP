package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Calificacionfinalnumero10 {
    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double cal_ex, cal_inv, cal_rep, calfinal;
        //Entrada
        System.out.println("Ingresa los valores en una escala de 0 - 100");
        System.out.println("Ingresa tu calificacion del examen: ");
        cal_ex = sc.nextDouble();
        System.out.println("Ingresa tu calificacion de la investigacion: ");
        cal_inv = sc.nextDouble();
        System.out.println("Ingresa tu calificacion del reporte: ");
        cal_rep = sc.nextDouble();
        //Proceso
        calfinal = (cal_ex * 0.40) + (cal_inv * 0.30) + (cal_rep * 0.30);
        //Salida
        System.out.println("Tu calificacion final es de: " + calfinal);
    
}
}