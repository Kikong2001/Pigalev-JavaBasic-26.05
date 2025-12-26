package hillel.java.pigalev.basic.test;

import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Start to program:----------");
       String string = checkWordLength();
        System.out.print("Enter to function: ");
        int function = scanner.nextInt();
        if (function == 1){
            System.out.println(functionReverseOne(string));
        } else if (function == 2) {
            System.out.println(functionReverseTwo(string));
        } else {
            System.out.println("Error!!!");
        }
    }

    public static String checkWordLength () {
            Scanner scanner = new Scanner(System.in);
            boolean valueValidation = false;
            String text = "";
            String[] textArray;
            while (valueValidation == false) {
                valueValidation = true;
                System.out.println("Enter to string fo check : ");
                text = scanner.nextLine();
                text = text.trim();
                textArray = text.split(" ");
                if (textArray.length < 2) {
                    valueValidation = false;
                } else {
                    for (int i = 0; i < textArray.length; i++) {
                        if (textArray[i].length() < 3) {
                            valueValidation = false;
                            break;
                        }
                    }
                }
                if (valueValidation == false) {
                    System.out.println("The string did not pass validation");
                }
            }
            System.out.println("The string passed validation");
            return text;
        }

    public static String functionReverseOne (String text) {
        String[] textArray = text.split(" ");
        String result = "";
        String reversText = "";
        for (int i = 0; i < textArray.length; ++i) {
            reversText = "";
            for (int j = textArray[i].length() - 1; j >= 0; j--) {
                reversText = reversText + textArray[i].charAt(j);
            }
            result = result + reversText;
            if (i < textArray.length-1){
                result = result + " ";
            }
        }
        return result;
    }
    public static String functionReverseTwo (String text) {
        String result = "";
        int length = text.length() - 1;
        for (int i = length; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;
    }

}
