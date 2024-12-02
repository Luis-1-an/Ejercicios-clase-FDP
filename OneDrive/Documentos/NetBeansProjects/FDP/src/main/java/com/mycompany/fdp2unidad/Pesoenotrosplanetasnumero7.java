package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Pesoenotrosplanetasnumero7 {
    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double peso, pesoM, pesoL, pesoP;
        //Entrada
        System.out.println("Ingresa tu peso en la tierra: ");
        peso = sc.nextDouble();
        //Proceso 
        pesoL = peso * 0.165;
        pesoM = peso * 0.377;
        pesoP = peso * 0.0672;
        //Salida
        System.out.println("Tu peso en la luna es de: " + pesoL);
        System.out.println("Tu peso en marte es de: " + pesoM);
        System.out.println("Tu peso en pluton es de: " + pesoP);
    
}
}
