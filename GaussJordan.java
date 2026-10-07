public class GaussJordan {

    /**
     * Aplica el método de Gauss-Jordan a una matriz aumentada.
     *
     * @param matriz Matriz aumentada [A | b].
     */
    public static void resolver(double[][] matriz) {

        int n = matriz.length;

        // Reutiliza el método de Eliminación Gaussiana
        Gauss.eliminacionGaussiana(matriz);

        // Recorre la matriz de abajo hacia arriba
        for (int i = n - 1; i >= 0; i--) {

            // Obtiene el pivote de la fila actual
            double pivote = matriz[i][i];

            // Normaliza la fila para convertir el pivote en 1
            for (int j = i; j <= n; j++) {
                matriz[i][j] = matriz[i][j] / pivote;
            }

            // Elimina los elementos que están arriba del pivote
            for (int j = i - 1; j >= 0; j--) {

                double factor = matriz[j][i];

                for (int k = i; k <= n; k++) {
                    matriz[j][k] =
                            matriz[j][k] - factor * matriz[i][k];
                }
            }
        }
    }

    /**
     * Obtiene directamente las soluciones de la última
     * columna de la matriz reducida.
     *
     * @param matriz Matriz reducida.
     * @return Arreglo con las soluciones.
     */
    public static double[] obtenerSoluciones(double[][] matriz) {

        int n = matriz.length;
        double[] soluciones = new double[n];

        for (int i = 0; i < n; i++) {
            soluciones[i] = matriz[i][n];
        }

        return soluciones;
    }
}
