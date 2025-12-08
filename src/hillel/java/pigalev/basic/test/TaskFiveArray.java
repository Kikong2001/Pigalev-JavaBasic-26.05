package hillel.java.pigalev.basic.test;

import java.util.concurrent.ThreadLocalRandom;

public class TaskFiveArray {
    public static void main(String[] args) {
        int size = 5;
        int [] array = new int [size];
        System.out.println("");
        System.out.println("|----------Start program----------|");
        System.out.print("Array: ");
        System.out.print("[");
        for (int i = 0; i <= size-1; i++ ) {
            array [i] = ThreadLocalRandom.current().nextInt(1, 20);
            System.out.print(array[i]);
            if(i <= size-2) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        for (int i = 0; i<=size-1; i++){
            if (array[i] > array[i+1]) {
                System.out.println("");
                System.out.println("This array not ascending");
                break;
            }
        }
        System.out.println("aaaa");
    }
}
