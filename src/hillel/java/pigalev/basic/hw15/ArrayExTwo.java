package hillel.java.pigalev.basic.hw15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("----------Start to program:----------");
        System.out.println("Enter number of strings: ");
        int strings = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = scanner.nextInt();
        double [][] array = new double[strings][columns];
        System.out.println("First matrix: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                array [i][j] = random.nextFloat()*10;
            }
        }
        for (double [] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Second matrix: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                if (i != j){
                    double sqrt = Math.sqrt(array[i][j]);
                    array[i][j] = sqrt;
                }
            }
        }
        for (double [] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
