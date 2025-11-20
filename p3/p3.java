package p3;
public class p3 {
    public static void main(String[] args) {

        
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

       
        System.out.println("Matrix nach (a):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = matrix[i][j] + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Summe der Elemente: " + sum);

        
        int[][] rotated = new int[3][3];

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
