package Unidad3;
import java.util.Scanner;
/**
 *
 * @author Luis Angel
 */
public class examen_3_unidad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte numero, i=1;
        System.out.println("Ingrese un numero");
        numero=entrada.nextByte();
        System.out.println("QUE HACE ESTE PROGRAMA?\n");
        while(i<11){
            System.out.println(i+"x"+numero+"="+(i*numero));
            i++;
        }
        

    }
    
}
