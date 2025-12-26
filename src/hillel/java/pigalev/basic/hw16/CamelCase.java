package hillel.java.pigalev.basic.hw16;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        boolean camelCase = false;
        System.out.println("----------Start to program:----------");
        System.out.print("Enter string: ");
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == '-' || symbol == '_') {
                camelCase = true;
            } else if (camelCase == true) {
                result = result + (symbol + "").toUpperCase();
                camelCase = false;
            } else {
                result = result + symbol;
            }
        }
        System.out.println("Result: " + result);
    }
}

