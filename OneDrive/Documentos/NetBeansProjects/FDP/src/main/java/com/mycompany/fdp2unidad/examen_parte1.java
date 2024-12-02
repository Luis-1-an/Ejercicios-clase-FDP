package com.mycompany.fdp2unidad;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class examen_parte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        double califExamen,califEjercicios,califInvestigacion,calFinal;
        //Entrada
        System.out.println("Ingrese la calificacion del examen");
        califExamen=sc.nextInt();
        System.out.println("Ingrese la calificacion de los ejercicios");
       califEjercicios=sc.nextDouble();
        System.out.println("Ingrese la calificacion de la investigacion");
        califInvestigacion=sc.nextDouble();
        //Proceso
        calFinal=(califExamen * 0.40) + (califEjercicios * 0.35) + (califInvestigacion * 0.25);
        //Salida
        System.out.println("La calificacion Final de la unidad 2 es "+calFinal);
    
        

    }
    
}
