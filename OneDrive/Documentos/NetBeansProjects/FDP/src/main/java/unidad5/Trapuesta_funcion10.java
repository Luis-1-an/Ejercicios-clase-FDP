package unidad5;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Trapuesta_funcion10 {

    public static void main(String[] args) {
        int[][] matriz, traspuesta;
        
        //Se define el tamaño de la matriz original
        matriz = setTamanioMatriz();
        
        //Se define el tamaño de la matriz traspuesta y para ello 
       //se invierten valores [ columnas ] [ filas ]
        traspuesta = new int [matriz[0].length][matriz.length];
        
        //Se agregan elementos a la matriz original
        matriz = llenarMatriz(matriz);
        
        //Se realiza la matriz traspuesta
        traspuesta = matrizTraspuesta(matriz,traspuesta);
        
        //Impresión de la matriz original
        imprimirMatriz("MATRIZ ORIGINAL",matriz);
        
        //Impresión de la matriz traspuesta
        imprimirMatriz("MATRIZ TRASPUESTA",traspuesta);
    }
        
        public static int[][] setTamanioMatriz(){
        Scanner lector = new Scanner(System. in);
        int[][] matriz;
        int f,c;
        
        //Se define el tamano de la matriz
        System. out.println("Tamanio de la matriz") ;
        System. out.println("Filas:");
        f = lector.nextInt();
        System. out.println("Columnas:");
        c = lector.nextInt();
        matriz = new int[f][c];
        return matriz;
        
    }
        public static int[][] llenarMatriz(int[][] matriz){
        Scanner lector = new Scanner(System. in);
        //Ingreso de valores en la matriz
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
        System. out.println("Ingrese elemento ("+(i+1)+","+(j+1)+"):");
        matriz[i][j]= lector.nextInt();
        }
    }
         return matriz;
    
}
        public static int[][] matrizTraspuesta(int[][] matriz, int[][] traspuesta){
        //Se realiza la matriz traspuesta
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
        traspuesta[j][i] = matriz[i][j];
        }
     }
        return traspuesta;
     }
        public static void imprimirMatriz(String mensaje, int[][] matriz){
        System. out.println("in"+mensaje);
        for (int[] fila : matriz) {
        for (int elemento : fila) {
        System.out.print(elemento+" ");
        }
        System.out.println("");
        
        }
    }
        
}