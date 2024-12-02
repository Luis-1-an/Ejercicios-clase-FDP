package Unidad4;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class Mayor_Menor9 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System. in);
        int[][] matriz;
        int f,c, numMayor, numMenor;
        //Se define el tamaño de la matriz
        System. out.println("Tamaño de la matriz") ;
        System. out.println("Filas:");
        f = lector.nextInt();
        System. out.println("Columnas:");
        c = lector.nextInt();
        matriz = new int[f][c];
        //Ingreso de valores en la matriz
        for (int i = 0; i < f; i++){
        for (int j = 0; j < c; j++) {
        System. out.println("Ingrese elemento ("+(i+1)+","+(j+1)+"):");
        matriz[i][j]= lector.nextInt();
        }
        
    }
        
        //Obtener el elemento mayor y menor de cada fila
        for (int i = 0; i < f; i++) {
        //Se asignan valores iniciales a las variables que almacenarán el valor mayor 
       //y el valor menor, cada vez que se pasa a una nueva fila
        numMenor = matriz[i][0];
        numMayor = matriz[i][0];
        
        for (int j = 1; j < c; j++) {
        if (matriz[i][j] > numMayor)
        numMayor = matriz[i][j];
        
        if (matriz[i][j] < numMenor)
        numMenor = matriz[i][j];
            }
        System.out.println("Fila"+(i+1)+". Numero mayor: "+numMayor+", Numero menor: "+numMenor);
       }

    }
    
}
