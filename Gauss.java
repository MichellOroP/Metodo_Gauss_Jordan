public class Gauss {

    /**
     * Método que realiza la triangulación de la matriz
     * utilizando Eliminación Gaussiana simple.
     *
     * @param matriz Matriz aumentada [A | b].
     */
    public static void eliminacionGaussiana(double[][] matriz) {

        int n = matriz.length;

        // Selecciona el renglón pivote actual
        for (int i = 0; i < n; i++) {

            // Recorre los renglones que están debajo del pivote
            for (int j = i + 1; j < n; j++) {

                // Calcula el factor para eliminar el elemento
                double factor = matriz[j][i] / matriz[i][i];

                // Realiza la operación entre filas
                for (int k = i; k <= n; k++) {

                    matriz[j][k] =
                            matriz[j][k] - factor * matriz[i][k];
                }
            }
        }
    }
}
