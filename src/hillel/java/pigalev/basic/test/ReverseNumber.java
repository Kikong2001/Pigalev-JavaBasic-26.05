package hillel.java.pigalev.basic.test;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        Integer number = scanner.nextInt();
        int reverseNumber = 0;
        int count = number;
        while (count != 0) {
            int digit = count % 10;
            reverseNumber = reverseNumber * 10 + digit;
            count = count / 10;
            if (number % 10 != 0) {
                System.out.println("Reverse number: " + reverseNumber);
            } else {
                String numberLength = Integer.toString(number);
                int length = numberLength.length();
                System.out.printf("Reverse number: %0" + length + "d%n", reverseNumber);
            }
        }
    }
}
