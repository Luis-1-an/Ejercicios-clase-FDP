package Unidad4;

/**
 *
 * @author Luis Angel
 */
public class Matriz_espiral_de_texto13 {

    public static void main(String[] args) {
        // Definición de la matriz
        String[][] matriz = {
                {"La", "vida", "no", "es", "la"},
                {"momentos", "que", "te", "dejan", "cantidad"},
                {"los", "Hitch", "aliento.", "sin", "de"},
                {"sino", ",", "respiras", "que", "veces"}
        };

        // Impresión por filas
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // Impresión en espiral
        imprimirEspiral(matriz);
    }

    // Función para imprimir la matriz en espiral
    public static void imprimirEspiral(String[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int top = 0, bottom = filas - 1, left = 0, right = columnas - 1;

        while (top <= bottom && left <= right) {
            // Imprimir la fila superior
            for (int i = left; i <= right; i++) {
                System.out.print(matriz[top][i] + " ");
            }
            top++;

            // Imprimir la columna derecha
            for (int i = top; i <= bottom; i++) {
                System.out.print(matriz[i][right] + " ");
            }
            right--;

            // Imprimir la fila inferior (si no está vacía)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matriz[bottom][i] + " ");
                }
                bottom--;
            }

            // Imprimir la columna izquierda (si no está vacía)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matriz[i][left] + " ");
                }
                left++;
            }
        }
    }
    
}
