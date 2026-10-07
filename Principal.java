public class Principal {

    /**
     * Método principal que ejecuta el programa.
     */
    public static void main(String[] args) {

        // Obtiene la matriz aumentada del sistema
        double[][] matriz = DefMatriz.obtenerMatriz();

        // Aplica el método de Gauss-Jordan
        GaussJordan.resolver(matriz);

        // Obtiene las soluciones directamente de la matriz
        double[] soluciones = GaussJordan.obtenerSoluciones(matriz);

        // Muestra las soluciones obtenidas
        System.out.println("Soluciones del sistema:");

        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}
