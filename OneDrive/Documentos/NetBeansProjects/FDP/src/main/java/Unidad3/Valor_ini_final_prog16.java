package Unidad3;
import java.util.Scanner;
/**
 *
 * @author Luis Angel
 */
public class Valor_ini_final_prog16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorInicial, valorFinal, suma = 0, contador = 0;
        double promedio;

        do {
            System.out.print("Ingrese el valor inicial: ");
            valorInicial = scanner.nextInt();
            System.out.print("Ingrese el valor final: ");
            valorFinal = scanner.nextInt();

            if (valorInicial <= valorFinal + 4) {
                System.out.println("El valor inicial debe ser mayor que el final en al menos 5 unidades.");
            }
        } while (valorInicial <= valorFinal + 4);

        while (valorInicial >= valorFinal) {
            suma += valorInicial;
            contador++;
            valorInicial -= 5;
        }

        promedio = (double) suma / contador;

        System.out.println("El promedio es: " + promedio);
    }
}
   