package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Examen_2 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //Declaracion de variables
        double calificacion1,calificacion2,calificacion3,promedio;
        //Entrada
        System.out.println("Ingresa la primera calificacion");
        calificacion1=lector.nextDouble();
        System.out.println("Ingresa la segunda calificacion");
        calificacion2=lector.nextDouble();
        System.out.println("Ingresa la tercera calificacion");
        calificacion3=lector.nextDouble();
        //proceso
        promedio = (calificacion1+calificacion2+calificacion3)/3;
        //salida
        System.out.println("El promedio de las calificaciones es:"+promedio);
        
    }
    
}