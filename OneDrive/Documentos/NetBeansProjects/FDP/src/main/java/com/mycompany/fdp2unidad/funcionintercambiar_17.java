package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class funcionintercambiar_17{
    public static int[] obtenerValores(Scanner scanner) {
        int[] valores = new int[2];
        System.out.print("Ingresa el valor de a: ");
        valores[0] = scanner.nextInt();
        System.out.print("Ingresa el valor de b: ");
        valores[1] = scanner.nextInt();
        return valores;
    }

  
    public static int[] intercambiarValores(int a, int b) {
        int aux = a;  
        a = b;        
        b = aux;      
        return new int[]{a, b}; 
    }

    
    public static void mostrarValores(int a, int b, String mensaje) {
        System.out.println(mensaje + " a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
       //Tipo de dato "Int"
        int[] valores = obtenerValores(sc);
        int a = valores[0];
        int b = valores[1];

        // Entrada
        mostrarValores(a, b, "Antes del intercambio:");

        int[] valoresIntercambiados = intercambiarValores(a, b);

        // Salida
        mostrarValores(valoresIntercambiados[0], valoresIntercambiados[1], "Después del intercambio:");
    

    }
}


    
    
