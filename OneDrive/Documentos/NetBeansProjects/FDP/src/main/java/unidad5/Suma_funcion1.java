package unidad5;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Suma_funcion1 {

    public static void main(String[] args) {
        //Se define el arreglo de tamaño 10
        double[] nums = new double[10];
        
        //Se invoca a la función llenarArreglo y se pasa como parámetro al arreglo "nums"
        nums = llenarArreglo(nums);
        
        //Se invoca y se imprime el resultado de la función sumaCuadrados
        System. out.println("La suma de los cuadrados de los valores contenidos en el array son: "+sumaCuadrados(nums));
    }
        //Se ingresan los valores de tipo real al arreglo
        public static double[] llenarArreglo(double[] nums) {
        Scanner lector = new Scanner(System. in);
        for (int i = 0; i < nums.length; i++) {
        System. out.println("Ingrese valor "+(i+1)+":");
        nums [i] = lector.nextDouble();
       
        }
         return nums;
        
        }
         
         public static double sumaCuadrados(double[] nums) {
            double suma = 0;
            for (int i = 0; i < nums.length; i++) {
            //Se va sumando el cuadrado de cada valor ingresado
            suma = suma + Math.pow(nums [i], 2);
        }
            return suma;
   }
}
