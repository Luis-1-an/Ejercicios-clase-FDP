package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Sumanumero1 {

    public static void main(String[] args) {
        //Declaracion de variables
        //tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //tipo de dato "Entero"
        int num1,num2,suma;
        //Entrada
        System.out.println("Ingrese el numero 1:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el numero 2:");
        num2 = sc.nextInt();
        //proceso
        suma = num1 + num2;
        //Salida
        System.out.println("Resultado de la suma:"+ suma);
    }
}
  

