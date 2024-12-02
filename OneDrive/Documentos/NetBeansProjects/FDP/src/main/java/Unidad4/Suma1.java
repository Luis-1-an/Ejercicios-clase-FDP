package Unidad4;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Suma1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] nums = new double [10];
        double suma = 0;
        //ingreso de 10 valores de tipo real
        for (int i = 0; i< nums.length; i++){
            System.out.println("ingrese valor"+(i+1)+":");
            nums[i] = lector.nextDouble();
            //se va sumando el cuadrado de cada valor ingresado
            suma = suma + Math.pow(nums[i],2);
        }
        System.out.println("La suma de los cuadrados de los valores contenidos en el array son:"+suma);
    }
    
}
