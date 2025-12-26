package hillel.java.pigalev.basic.test;

import java.util.Scanner;

public class TaskTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of corners n: ");
        int n = sc.nextInt();
        int[] angles = new int[n];
        int sum = 0;
        System.out.println("Enter the corners of the polygon:");
        for (int i = 0; i < n; i++) {
            angles[i] = sc.nextInt();
            if (angles[i] <= 0) {
                System.out.println("The angle cannot be less than or equal to 0!");
                return;
            }
            sum += angles[i];
        }
        int requiredSum = 180 * (n - 2);
        System.out.println("Sum of angles = " + sum);
        System.out.println("Required sum of angles = " + requiredSum);
        if (sum == requiredSum) {
            System.out.println("Such a polygon may exist");
        } else {
            System.out.println("Such a polygon cannot exist");
        }
    }
}
