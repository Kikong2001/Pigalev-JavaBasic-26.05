package hillel.java.pigalev.basic.hw16;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Start to program:----------");
        System.out.print("Enter to string: ");
        String string = scanner.nextLine();
        String reversed = "";
        int length = string.length() - 1;
        for (int i = length ; i >= 0; i--) {
            reversed = reversed + string.charAt(i);
        }
        System.out.println("Inversion string: " + reversed);
    }
}
