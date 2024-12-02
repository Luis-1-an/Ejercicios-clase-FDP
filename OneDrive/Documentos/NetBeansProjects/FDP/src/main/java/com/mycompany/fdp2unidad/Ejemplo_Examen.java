package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejemplo_Examen {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        int valor1,valor2,resultado;
        //Entrada
        System.out.println("Ingrese el primer numero");
        valor1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        valor2=leer.nextInt();
        //proceso
        resultado = valor1-valor2;
        //salida
        System.out.println("El resultado de la resta es:"+resultado);
        
        

    }
    
}
