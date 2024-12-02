package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Datos_hom_muje_prog19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numPersonas = 0;
        double totalPesoHombres = 0, totalAlturaHombres = 0, totalPesoMujeres = 0, totalAlturaMujeres = 0;
        int contadorHombres = 0, contadorMujeres = 0;

        System.out.print("Ingrese el número de personas: ");
        numPersonas = sc.nextInt();

        for (int i = 0; i < numPersonas; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            System.out.print("Edad: ");
            int edad = sc.nextInt();

            if (edad >= 18) {
                if (sexo == 'M' || sexo == 'm') {
                    totalPesoHombres += peso;
                    totalAlturaHombres += altura;
                    contadorHombres++;
                } else if (sexo == 'F' || sexo == 'f') {
                    totalPesoMujeres += peso;
                    totalAlturaMujeres += altura;
                    contadorMujeres++;
                }
            }
        }

       
        double promedioPesoHombres = contadorHombres > 0 ? totalPesoHombres / contadorHombres : 0;
        double promedioAlturaHombres = contadorHombres > 0 ? totalAlturaHombres / contadorHombres : 0;
        double promedioPesoMujeres = contadorMujeres > 0 ? totalPesoMujeres / contadorMujeres : 0;
        double promedioAlturaMujeres = contadorMujeres > 0 ? totalAlturaMujeres / contadorMujeres : 0;

        
        System.out.println("\nPromedios para personas mayores de 18 años en Veracruz:");
        System.out.println("Hombres:");
        System.out.println("  Peso promedio: " + promedioPesoHombres + " kg");
        System.out.println("  Altura promedio: " + promedioAlturaHombres + " cm");
        System.out.println("Mujeres:");
        System.out.println("  Peso promedio: " + promedioPesoMujeres + " kg");
        System.out.println("  Altura promedio: " + promedioAlturaMujeres + " cm");
    }
}    