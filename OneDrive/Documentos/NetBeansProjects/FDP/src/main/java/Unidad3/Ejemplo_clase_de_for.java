package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Ejemplo_clase_de_for {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Valor de n:");
        n = sc.nextInt();
        
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println("");
        }
    }
    
}
