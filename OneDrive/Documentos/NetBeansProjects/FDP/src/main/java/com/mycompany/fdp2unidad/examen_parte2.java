package com.mycompany.fdp2unidad;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class examen_parte2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double VALOR_PUNTOS=0.12;
        //Declaracion de variables
        double saldofinal,saldoinicial,puntos,equivPuntos,puntos_acumulados;
        //Entrada
        System.out.println("Ingrese el saldo inicial");
        saldoinicial=lector.nextDouble();
        System.out.println("Ingrese los puntos acumulados");
       puntos_acumulados=lector.nextDouble();
        //Proceso
        double valorPuntos = puntos_acumulados * VALOR_PUNTOS;   
        double saldoFinal = saldoinicial -valorPuntos;
        //Salida
        System.out.printf("Equivalencia en dinero de los puntos acumulados: $%.2f%n", valorPuntos);
        System.out.printf("Saldo final después de restar los puntos: $%.2f%n", saldoFinal);
        
    }
    
}
