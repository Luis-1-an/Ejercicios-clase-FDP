package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class horas_trabajadas_prog9 {

    public static void main(String[] args) {
        int horas_trabajadas,horas_extra,pagoT;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa las horas trabajadas "); 
        horas_trabajadas= sc.nextInt();
        
        if (horas_trabajadas > 40){
        horas_extra = horas_trabajadas - 40;
        horas_trabajadas = horas_trabajadas - horas_extra;
        pagoT = (horas_trabajadas*100 + horas_extra * 200);
        System.out.println("EL PAGO SERA DE: ");
        System.out.println("Horas a la semana: $" + horas_trabajadas * 100);
        System.out.println("Horas extra: $" + horas_extra * 200);
        System.out.println("El total a pagar sera de: $" + pagoT );
        }
        else{
            System.out.println("El pago de las horas trabajadas es de: " + horas_trabajadas * 100);
        }
    }
    
}
