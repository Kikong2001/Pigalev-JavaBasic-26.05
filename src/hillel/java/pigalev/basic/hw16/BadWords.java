package hillel.java.pigalev.basic.hw16;

import java.util.Scanner;

public class BadWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Start to program:----------");
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        String[] badWords = {"hell", "damn"};
        for (int i = 0; i < badWords.length; i++) {
            String word = badWords[i];
            String lowerText = text.toLowerCase();
            String lowerWord = word.toLowerCase();
            int index = lowerText.indexOf(lowerWord);
            while (index != -1) {
                text = text.substring(0, index) + "***" + text.substring(index + word.length());
                lowerText = text.toLowerCase();
                index = lowerText.indexOf(lowerWord);
            }
        }
        System.out.println("Result: " + text);
    }
}
