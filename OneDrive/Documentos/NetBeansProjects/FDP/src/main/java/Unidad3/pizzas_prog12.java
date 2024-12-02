package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class pizzas_prog12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu de Pizzas");
            System.out.println("1. Italiana");
            System.out.println("2. Carnes frias");
            System.out.println("3. Vegetariana");
            System.out.println("4. Pepperoni");
            System.out.println("5. Hawaiana");
            System.out.println("6. Mexicana");
            System.out.println("7. Camaron");
            System.out.println("0. Salir");
            System.out.print("Que pizza desea ordenar: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingredientes de la pizza Italiana: Tomate, mozzarella, albahaca, jamón.");
                    break;
                case 2:
                    System.out.println("Ingredientes de la pizza de Carnes Frías: Tomate, mozzarella, salchichón, jamón, pepperoni.");
                    break;
                case 3:
                    System.out.println("Ingredientes de la pizza Vegetariana: Tomate, mozzarella, pimientos, cebolla, aceitunas.");
                    break;
                case 4:
                    System.out.println("Ingredientes de la pizza Pepperoni: Tomate, mozzarella, pepperoni.");
                    break;
                case 5:
                    System.out.println("Ingredientes de la pizza Hawaiana: Tomate, mozzarella, jamón, piña.");
                    break;
                case 6:
                    System.out.println("Ingredientes de la pizza Mexicana: Tomate, mozzarella, carne molida, jalapeños, cebolla.");
                    break;
                case 7:
                    System.out.println("Ingredientes de la pizza de Camarón: Tomate, mozzarella, camarón, champiñones.");
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, elige una opcion del menu.");
            }
        } while (opcion != 0);
    }
}    

