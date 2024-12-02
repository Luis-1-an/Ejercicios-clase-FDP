package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class exa_3_uni_primera_parte {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Este programa calcula el precio a pagar por alumno en el viaje fin de curso\n");
        System.out.print("Número de alumnos: ");
        int numeroAlumnos = entrada.nextInt();

        if (numeroAlumnos >= 100) {
            System.out.println("El pago a la agencia es de " + numeroAlumnos * 250 + " pesos y cada alumno debe pagar 250 pesos");
        } else if (numeroAlumnos >= 50) {
            System.out.println("El pago a la agencia es de " + numeroAlumnos * 370 + " pesos y cada alumno debe pagar 370 pesos");
        } else if (numeroAlumnos >= 30) {
            System.out.println("El pago a la agencia es de " + numeroAlumnos * 495 + " pesos y cada alumno debe pagar 495 pesos");
        } else {
            System.out.println("El coste del autobús es de 19000 pesos y cada alumno debe pagar " + (19000 / numeroAlumnos) + " pesos.");
        }
    }
}
        

        
   