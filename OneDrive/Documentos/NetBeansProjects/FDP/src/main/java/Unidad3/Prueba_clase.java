package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Prueba_clase {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numMaterias;
        double calificacion,suma = 0,promedio;
        System.out.println("Numero de materias");
        numMaterias = lector.nextInt();
        int i;
        
        for (i=1;i<=numMaterias; i++){
            System.out.println("Calificacion de la materia");
            calificacion = lector.nextDouble();
            suma += calificacion;
        }
        promedio = suma/numMaterias;
        System.out.println("Su promedio de calificacion es"+promedio);
    }
    
}
