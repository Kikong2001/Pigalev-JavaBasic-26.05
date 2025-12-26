package hillel.java.pigalev.basic.hw16;

import java.util.Scanner;

public class LongestAndShortes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------Start to program:----------");
            System.out.print("Enter to string: ");
            String text = scanner.nextLine();
            String[] words = text.split(" ");
            String longest = words[0];
            String shortest = words[0];
            for (int i = 1; i < words.length; i++) {
                if (words[i].length() > longest.length()) {
                    longest = words[i];
                }
                if (words[i].length() < shortest.length()) {
                    shortest = words[i];
                }
            }
            System.out.println("Longest word: " + longest +
                    " (number of characters: " + longest.length() + ")");
            System.out.println("Shortest word: " + shortest +
                    " (number of characters: " + shortest.length() + ")");
        }
}
