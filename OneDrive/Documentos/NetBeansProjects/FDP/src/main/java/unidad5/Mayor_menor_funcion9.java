package unidad5;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Mayor_menor_funcion9 {

    public static void main(String[] args) {
        
       getMenorYMayorPorFilas();
    }
        public static int[][] setTamanioMatriz(){
        Scanner lector = new Scanner(System. in);
        int[][] matriz;
        int f,c;
        
        //Se define el tamano de la matriz
        System. out.println("Tamanio de la matriz");
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
        System.out.println("Ingrese elemento ("+(i+1)+","+(j+1)+"):");
        matriz[i][j]= lector.nextInt();
           }
        }
        return matriz;
    }
        public static void getMenorYMayorPorFilas(){
        int[][] matriz;
        int numMayor, numMenor;
        
        
        //Se define el tamaño de la matriz mediante la invocación de la función setTamanioMatriz()
        matriz = setTamanioMatriz();
        
        //Se ingresan valores en la matriz invocando la función llenarMatrizO
        matriz = llenarMatriz(matriz);
        
        //Ciclos para obtener el elemento mayor y menor de cada fila
        for (int i = 0; i < matriz.length; i++) {
        //Se asignan valores iniciales a las variables que almacenarán el valor mayor 
       //y el valor menor, cada vez que se pasa a una nueva fila
        numMenor = matriz[i][0];
        numMayor = matriz [i][0];
        for (int j = 1; j < matriz[0].length; j++) {
        if (matriz[i][j] > numMayor) //Se comparan los valores de cada elemento para obtener el mayor
        numMayor = matriz [i][j];
        if (matriz[i][j] < numMenor) //Se comparan los valores de cada elemento para obtener el menor
        numMenor = matriz[i][j];
         }
        System.out.println("Fila "+(i+1)+". Numero mayor: "+numMayor+", Numero menor: "+numMenor);
        }
    }

}
