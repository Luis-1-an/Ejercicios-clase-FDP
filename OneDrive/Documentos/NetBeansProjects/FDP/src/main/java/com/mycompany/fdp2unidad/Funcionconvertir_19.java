package com.mycompany.fdp2unidad;

import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Funcionconvertir_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tiempo en segundos: ");
        long segundos = scanner.nextLong();
        
        // Llamar a la función para convertir el tiempo
        convertirTiempo(segundos);
        
        
    }

    // Función para convertir y mostrar el tiempo
    public static void convertirTiempo(long segundos) {
        long dias = segundos / 86400; // 86400 segundos en un día
        segundos %= 86400; // Obtener los segundos restantes después de los días
        long horas = segundos / 3600; // 3600 segundos en una hora
        segundos %= 3600; // Obtener los segundos restantes después de las horas
        long minutos = segundos / 60; // 60 segundos en un minuto
        long segundosRestantes = segundos % 60; // Obtener los segundos restantes
        
        // Mostrar el resultado
        System.out.println("Equivalencia:");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundosRestantes + " segundos");
    }
}

