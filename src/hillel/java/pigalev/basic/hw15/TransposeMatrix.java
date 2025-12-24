package hillel.java.pigalev.basic.hw15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class TransposeMatrix {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Start to program:----------");
        System.out.print("Enter number of string: ");
        int strings = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        int[][] firstMatrix = new int[columns][strings];
        int[][] secondMatrix = new int[strings][columns];
        for (int i = 0; i < firstMatrix.length; i++){
            for (int j = 0; j<firstMatrix[i].length; j++){
                firstMatrix [i][j] = random.nextInt(20);
            }
        }
        System.out.println(" First matrix: ");
        for (int[] row : firstMatrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Second Matrix: ");
        for (int i = 0; i < firstMatrix.length; i++){
            for (int j = 0; j <secondMatrix.length; j++){
                secondMatrix [j][i] = firstMatrix [i][j];
            }
        }
        for (int[] row : secondMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
