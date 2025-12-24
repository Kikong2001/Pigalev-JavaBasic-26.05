package hillel.java.pigalev.basic.hw15;

import java.util.Arrays;
import java.util.Scanner;

public class DeterminantOfAMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double determinant = 1;
        int sign = 1;
        int size = 5;
        double [][] matrix = new double [size][size];
        System.out.println("----------Start to program:----------");
        System.out.println("Enter value matrix: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print("["+(i+1)+","+(j+1)+"]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(" matrix: ");
        for (double [] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 0) {
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[k][i] != 0) {
                        double[] revers = matrix[i];
                        matrix[i] = matrix[k];
                        matrix[k] = revers;
                        sign = sign * (-1);
                        break;
                    }
                }
            }
            if (matrix[i][i] == 0) {
                determinant = 0;
                break;
            }
            for (int j = i + 1; j < matrix.length; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < matrix.length; k++) {
                    matrix[j][k] = matrix[i][k] - (factor * matrix[i][k]);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            determinant = determinant * matrix[i][i];
        }
        determinant = determinant * sign;
        System.out.println("Determinant of a matrix = " + determinant);
    }
}
