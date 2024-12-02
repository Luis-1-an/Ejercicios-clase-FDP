package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Funcionsueldonumero15 {
    public static double calc_salarioq(double s){
        return ((s*15) - ((s*15)*0.135) - ((s*15)*0.025));
    }
    
    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double salariod;
        
        //Entrada
        System.out.println("Ingresa tu sueldo diario");
        salariod = sc.nextDouble();
        
        //Salida
        System.out.println("Tu salario quincenal es de:"+ calc_salarioq(salariod));
    }
}
