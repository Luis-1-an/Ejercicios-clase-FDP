package Unidad4;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */

public class Ejerciciox {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numMaterias;
        double calificacion[],suma = 0,promedio;
        System.out.println("Numero de materias");
        numMaterias = lector.nextInt();
        calificacion = new double[numMaterias];
 
        
        for (int i=0;i<numMaterias; i++){
            System.out.println("Calificacion de la materia: ");
            calificacion[i] = lector.nextDouble();
            suma += calificacion[i];
        }
        promedio = suma/numMaterias;
        System.out.println("Su promedio de calificacion es"+promedio);
    }
    
}
   
