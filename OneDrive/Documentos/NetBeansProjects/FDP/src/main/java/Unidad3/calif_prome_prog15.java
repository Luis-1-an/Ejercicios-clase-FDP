package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class calif_prome_prog15 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de materias: ");
        int numMaterias = scanner.nextInt();
        
        double sumaCalificaciones = 0;

        for (int i = 1; i <= numMaterias; i++) {
            System.out.print("Ingrese la calificación de la materia " + i + ": ");
            double calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion; 

        }

        
        double promedio = sumaCalificaciones/ numMaterias;

       
        System.out.println("El promedio de tus calificaciones es: " + promedio);
    }
}
