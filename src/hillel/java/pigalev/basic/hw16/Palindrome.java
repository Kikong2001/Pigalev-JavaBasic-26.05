package hillel.java.pigalev.basic.hw16;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reversed = "";
        System.out.println("----------Start to program:----------");
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed = reversed + string.charAt(i);
        }
        if (string.equals(reversed)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("t is not a palindrome");
        }
    }
}
