package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class FuncionAreadeuncirculonumero16 {  
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double radio;

        //Entrada
        System.out.print("Ingresa el radio del círculo: ");
        radio = sc.nextDouble();

        // Salida
        System.out.printf("El área del círculo con radio es de:"+ calcularArea(radio));

      
    }
}