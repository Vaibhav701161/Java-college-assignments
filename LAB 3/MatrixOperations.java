// Logic: I ask the user to input two 5x5 matrices. Then I perform addition, subtraction, and multiplication on them using nested loops.
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];

        System.out.println("Enter the elements of the first 5x5 matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second 5x5 matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] resultAdd = new int[5][5];
        int[][] resultSub = new int[5][5];
        int[][] resultMul = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                resultAdd[i][j] = matrix1[i][j] + matrix2[i][j];
                resultSub[i][j] = matrix1[i][j] - matrix2[i][j];
                for (int k = 0; k < 5; k++) {
                    resultMul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Addition Result: ");
        printMatrix(resultAdd);
        System.out.println("Subtraction Result: ");
        printMatrix(resultSub);
        System.out.println("Multiplication Result: ");
        printMatrix(resultMul);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}