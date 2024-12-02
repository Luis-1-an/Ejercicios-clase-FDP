package unidad5;

/**
 *
 * @author Luis Angel
 */
public class Matriz_espiral_de_texto_funcion13 {

    public static void main(String[] args) {
        
        String[][] matriz = {
                {"La", "vida", "no", "es", "la"},
                {"momentos", "que", "te", "dejan", "cantidad"},
                {"los", "Hitch", "aliento.", "sin", "de"},
                {"sino", ",", "respiras", "que", "veces"}
        };

        // Imprimir la matriz por filas
        System.out.println("Impresión por filas:");
        imprimirPorFilas(matriz);

        // Imprimir la matriz en espiral
        System.out.println("\nImpresión en espiral:");
        imprimirEnEspiral(matriz);
    }

    // Función para imprimir la matriz por filas
    public static void imprimirPorFilas(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // Función para 1  imprimir la matriz en espiral
    public static void imprimirEnEspiral(String[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int top = 0, bottom = filas - 1, left = 0, right = columnas - 1;

        while (top <= bottom && left <= right) {
            // Imprimir la fila superior de izquierda a derecha
            for (int i = left; i <= right; i++) {
                System.out.print(matriz[top][i] + " ");
            }
            top++;

            // Imprimir la columna derecha de arriba hacia abajo
            for (int i = top; i <= bottom; i++) {
                System.out.print(matriz[i][right] + " ");
            }
            right--;

            // Imprimir la fila inferior de derecha a izquierda
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matriz[bottom][i] + " ");
                }
                bottom--;
            }

            // Imprimir la columna izquierda de abajo hacia arriba
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matriz[i][left] + " ");
                }
                left++;
            }
        }
    }
}
