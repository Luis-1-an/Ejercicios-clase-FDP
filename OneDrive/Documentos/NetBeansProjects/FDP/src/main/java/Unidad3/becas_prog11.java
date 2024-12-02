package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class becas_prog11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el semestre en el que se encuentra: ");
        int semestre = scanner.nextInt();

        System.out.print("Ingrese su promedio general: ");
        double promedio = scanner.nextDouble();

        if (semestre >= 4 && semestre <= 9 && promedio >= 80) {
            System.out.println("¡Felicidades! Eres elegible para la beca de manutención.");
        } else if (semestre >= 1 && semestre <= 3 && promedio >= 75) {
            System.out.println("¡Felicidades! Eres elegible para la beca de transporte.");
        } else {
            System.out.println("Lo sentimos, no cumples con los requisitos para ninguna beca.");
        }

    }
    
}
