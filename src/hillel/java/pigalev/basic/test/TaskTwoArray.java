package hillel.java.pigalev.basic.test;

import java.util.Scanner;

public class TaskTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість кутів n: ");
        int n = sc.nextInt();
        int[] angles = new int[n];
        int sum = 0;
        System.out.println("Введіть кути багатокутника:");
        for (int i = 0; i < n; i++) {
            angles[i] = sc.nextInt();
            // кути мають бути додатними
            if (angles[i] <= 0) {
                System.out.println("Кут не може бути меншим або рівним 0!");
                return;
            }
            sum += angles[i];
        }
        int requiredSum = 180 * (n - 2);
        System.out.println("Сума введених кутів = " + sum);
        System.out.println("Необхідна сума кутів = " + requiredSum);
        if (sum == requiredSum) {
            System.out.println("Такий багатокутник МОЖЕ існувати.");
        } else {
            System.out.println("Такий багатокутник НЕ може існувати.");
        }
    }
}
