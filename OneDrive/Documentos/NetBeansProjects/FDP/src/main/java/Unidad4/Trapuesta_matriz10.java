package Unidad4;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Trapuesta_matriz10 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System. in);
        int[][] matriz, traspuesta;
        int f,c;
       
        //Se define el tamaño de la matriz
        System. out.println("Tamano de la matriz");
        System. out.println("Filas:");
        f = lector.nextInt();
        System. out.println("Columnas:");
        c = lector.nextInt();
        matriz = new int[f][c];
        traspuesta = new int[c][f];
        //Observa que ahora la cantidad de columnas hará referencia a la cantidad de filas
        //y la cantidad de filas a la cantidad de columnas
        
        
        //Se ingresan los valores a la matriz original
        //Con el código matriz.length se obtiene el número de filas
        //Con el código matriz[0].length se obtiene el número de columnas
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
        System. out.println("Ingrese elemento ("+(i+1)+" "+(j+1)+"):");
        
        
        matriz[i][j] = lector.nextInt();
        }
    }
        
    //Se realiza la matriz traspuesta
        for (int i = 0; i < matriz.length; i++) {
        for (int j= 0; j < matriz[0].length; j++) {
        traspuesta[j][i] = matriz[i][j];
        }
    }
        
    //Impresión de la matriz original
        System. out.println("\nMATRIZ ORIGINAL");
        for (int[] fila: matriz) {
        for (int elemento : fila) {
        System.out.print(elemento+"");
        }
        
        System. out.println("");
        }
        
        //Impresión de la matriz traspuesta
        System.out.println("\nMATRIZ TRASPUESTA");
        for (int[] fila : traspuesta) {
        for (int elemento : fila) {
        System.out.print(elemento+"");
        }
        System.out.println("");
        }
    }
    
}
