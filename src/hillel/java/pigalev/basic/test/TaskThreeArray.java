package hillel.java.pigalev.basic.test;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TaskThreeArray {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("|----------Start program----------|");
        System.out.print("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] arrayRandomNumber = new int [size];
        System.out.print("Array: ");
        System.out.print("[");
        for (int i = 0; i <= size-1; i++ ){
            arrayRandomNumber [i] = ThreadLocalRandom.current().nextInt(1, 20);
            System.out.print(arrayRandomNumber[i]);
            if(i <= size-2) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.print("Element to replace: ");
        int elementReplace = scanner.nextInt();
        for (int i = 0; i <= size-1; i++) {
            if (elementReplace == arrayRandomNumber[i]){
                System.out.print("Value to replace: ");
                int valueReplace = scanner.nextInt();
                arrayRandomNumber [i] = valueReplace;
                System.out.print("Rewritten array: ");
                System.out.print("[");
                for (int j = 0; j <= size-1; j++ ){
                    System.out.print(arrayRandomNumber[j]);
                    if(j <= size-2) {
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                break;
            } else if (i == size-1){
                System.out.println("Error!!!");
            }
        }
    }
}
