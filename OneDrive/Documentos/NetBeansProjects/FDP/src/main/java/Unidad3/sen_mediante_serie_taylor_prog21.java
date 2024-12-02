package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class sen_mediante_serie_taylor_prog21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();  


        double seno = 0;
        double termino = x;
        int n = 1;

        while (Math.abs(termino) > 0.001) {
            seno += termino;
            n += 2;
            termino = termino * x * x * (-1) / (n * (n - 1));
        }

        System.out.println("El seno de " + x + " es aproximadamente: " + seno);
    }
    
}
