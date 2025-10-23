package hillel.java.pigalev.basic.test;

import javax.imageio.spi.ImageInputStreamSpi;
import java.text.MessageFormat;
import java.util.Scanner;

public class PetyHomWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Star to program: ");
        int oneValue = scanner.nextInt();
        double twoValue = scanner.nextDouble();
        scanner.nextLine();
        String threeValue = scanner.nextLine();
        boolean fourValue = scanner.hasNext();
        System.out.println(" Result of program execution: ");

        System.out.println("Format 1. | " + oneValue + " | " + twoValue + " | " + threeValue + " | "
                + fourValue + " |");
        System.out.println("-----------------------------------------------------------------------");
        //
        System.out.println("Format 2. intValue: " + oneValue + ", doubleValue: " + twoValue + ", String: "
                + threeValue + ", boolean: " + fourValue);
        System.out.println("-----------------------------------------------------------------------");
        //
        String formatMessage = MessageFormat.format("intValue: {0}, doubleValue: {1}, String: {2}," +
                " boolean: {3}", oneValue, twoValue, threeValue, fourValue);
        System.out.println("Format 3. " + formatMessage);
        System.out.println("-----------------------------------------------------------------------");
        //
        String formatMessageTwo = MessageFormat.format("intValue: {3}, doubleValue: {2}, String: {0}," +
                " boolean: {1}", oneValue, twoValue, threeValue, fourValue);
        System.out.println("Format 4. " + formatMessageTwo);
        System.out.println("-----------------------------------------------------------------------");
        //
        String formatMessageThree = "intValue: {0}, doubleValue: {1}, String: {2}, boolean: {3}";
        String massageThree = MessageFormat.format(formatMessageThree, oneValue, twoValue, threeValue, fourValue);
        System.out.println("Format 5. " + massageThree);
        System.out.println("-----------------------------------------------------------------------");
        //
        String formatMessageFour = "currency: {0, number,currency}, percent: {1, number,percent}," +
                " String: {2}, boolean: {3}";
        String massageFour = MessageFormat.format (formatMessageFour, oneValue, twoValue, threeValue, fourValue);
        System.out.println("Format 6. " + massageFour);
        System.out.println("-----------------------------------------------------------------------");
        //
        System.out.printf("Format 7.  intValue: %d  doubleValue: %.2f  StringValue: %s  booleanValue: %b",
                oneValue, twoValue, threeValue, fourValue);
        System.out.println("-----------------------------------------------------------------------");
        //
        System.out.println(String.format("Format 8. |  %10d  |  %10.2f  |  %10s  |  %10b  |",
                oneValue, twoValue, threeValue, fourValue));
        System.out.println("-----------------------------------------------------------------------");
        //
        System.out.println(String.format("Format 9. |  %-10d  |  %-10.2f  |  %-10s  |  %-10b  |",
                oneValue, twoValue, threeValue, fourValue));
        System.out.println("-----------------------------------------------------------------------");
        //
        System.out.println(String.format("Format 10. |  %+d  |  %+.2f  |  %.2s  |  %10b  |",
                oneValue, twoValue, threeValue, fourValue));
    }
}
