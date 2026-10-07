public class DefMatriz {

    /**
     * Define la matriz aumentada [A | b]
     * que representa el sistema de ecuaciones lineales.
     *
     * @return Matriz aumentada del sistema.
     */
    public static double[][] obtenerMatriz() {

        return new double[][] {
                { 2.0,  1.0, -1.0,   8.0 },
                {-3.0, -1.0,  2.0, -11.0 },
                {-2.0,  1.0,  2.0,  -3.0 }
        };
    }
}
