package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class ciclos_prog14 {

    public static void main(String[] args) {
     System.out.println("Ciclo for:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\nCiclo while:");
        int num = 4;
        while (num <= 24) {
            System.out.print(num + ", ");
            num += 4;
        }

        System.out.println("\nCiclo do-while:");
        num = 5;
        do {
            System.out.print(num + ", ");
            num--;
        } while (num >= 1);
    }
}
