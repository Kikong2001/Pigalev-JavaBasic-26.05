package hillel.java.pigalev.basic.test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TaskOneArray {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 6;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int [] arrayRandomNumber = new int [size];
        System.out.println("");
        System.out.println("|----------Start program----------|");
        System.out.print("Array: ");
        System.out.print("[");
        for (int i = 0; i <= size-1; i++ ){
            arrayRandomNumber [i] = random.nextInt(10);
            System.out.print(arrayRandomNumber[i]);
            if(i <= size-2) {
                System.out.print(",");
            }
            float divided = arrayRandomNumber [i] %2;
            if (divided == 0 ){
                evenNumbers = evenNumbers + 1;
            }else {
                oddNumbers = oddNumbers + 1;
            }
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("Even numbers from an array: " + evenNumbers);
        System.out.println("Odd numbers from an array: " + oddNumbers);
    }
    
}
