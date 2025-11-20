public class p3 {
    public static void main(String[] args) {

        // 3x3-Matrix initialisieren
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // (a) Jedes Element um 1 erhöhen und ausgeben
        System.out.println("Matrix nach (a):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = matrix[i][j] + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // (b) Summe aller Elemente
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Summe der Elemente: " + sum);

        // (c) Matrix um 90° im Uhrzeigersinn drehen
        int[][] rotated = new int[3][3];

        // Formel für 90°-Drehung im Uhrzeigersinn:
        // rotated[j][n-1-i] = matrix[i][j], hier n = 3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotated[j][3 - 1 - i] = matrix[i][j];
            }
        }

        System.out.println("Matrix nach (c) (90 Grad im Uhrzeigersinn):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
