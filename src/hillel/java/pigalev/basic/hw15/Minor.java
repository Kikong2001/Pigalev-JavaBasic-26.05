package hillel.java.pigalev.basic.hw15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("----------Start to program:----------");
        System.out.print("Enter number of strings: ");
        int strings = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        int [][] array = new int [strings][columns];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                array [i][j] = random.nextInt(10);
            }
        }
        System.out.println("Matrix: ");
        for ( int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.print("Strings: ");
        int stringsMinor = scanner.nextInt();
        System.out.print("Columns: ");
        int columnsMinor = scanner.nextInt();

        int [][] matrix = new int [strings-1][columns-1];
        int stringsCount = 0;
        int columnsCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == stringsMinor) {
                continue;
            }
            columnsCount = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (j == columnsMinor){
                    continue;
                }
                matrix [stringsCount][columnsCount] = array[i][j];
                columnsCount = columnsCount + 1 ;
            }
            stringsCount++;
        }

        System.out.println("Minor: ");
        for ( int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
