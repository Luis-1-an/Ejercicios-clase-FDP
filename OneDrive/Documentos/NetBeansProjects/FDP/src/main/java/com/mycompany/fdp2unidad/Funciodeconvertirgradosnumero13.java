package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Funciodeconvertirgradosnumero13 {
     public static double calcular_f(double celsius){
        return (celsius * 1.8) + 32;
    }
    
    public static double calcular_k(double celsius){
        return celsius + 273.15 ;
    }
    
    public static double calcular_r(double celsius){
        return calcular_k(celsius) * 1.8;
    }
    
    public static void main(String[] args) {
        //Definicion de variables
        //tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double c;
        
        //Entrada
        System.out.println("Ingresa el valor en grados celsius: ");
        c = sc.nextDouble();
        
        //Salida 
        System.out.println("El valor " + c + " en grados Celsius equivale a: ");
        System.out.println(calcular_f(c) + " Grados fahrenheit");
        System.out.println(calcular_k(c) + " Grados Kelvin");
        System.out.println(calcular_r(c) + " Grados Rankine");
        
        
    }
    
}
