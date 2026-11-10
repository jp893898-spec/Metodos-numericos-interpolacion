package interpolacion;

public class Main {
    public static void main(String[] args) {
        // Puntos de ejemplo: (1, 2), (2, 3), (4, 10)
        double[] x = {1.0, 2.0, 4.0};
        double[] y = {2.0, 3.0, 10.0};

        // Punto intermedio a interpolar
        double xEval = 3.0;

        System.out.println("==================================================");
        System.out.println(" PRÁCTICA: LAGRANGE VS DIFERENCIAS DE NEWTON");
        System.out.println(" Instituto Tecnológico Superior de Xalapa (ITSX)");
        System.out.println("==================================================");
        System.out.printf("Punto a evaluar (xEval): %.2f\n", xEval);

        // --- 1. EJECUCIÓN MÉTODO DE NEWTON ---
        double[][] tablaDiferencias = InterpolacionNewton.calcularDiferenciasDivididas(x, y);
        InterpolacionNewton.imprimirTabla(x, tablaDiferencias);

        double yNewton = InterpolacionNewton.evaluarPolinomio(x, tablaDiferencias, xEval);
        System.out.println("\n--- RESULTADO MÉTODO DE NEWTON ---");
        System.out.printf("P(%.2f) = %.4f\n", xEval, yNewton);

        // --- 2. EJECUCIÓN MÉTODO DE LAGRANGE ---
        double yLagrange = InterpolacionLagrange.interpolarLagrange(x, y, xEval);
        System.out.println("\n--- RESULTADO MÉTODO DE LAGRANGE ---");
        System.out.printf("P(%.2f) = %.4f\n", xEval, yLagrange);
        System.out.println("==================================================");
    }
}