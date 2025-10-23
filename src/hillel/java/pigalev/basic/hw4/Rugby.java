package hillel.java.pigalev.basic.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        int summa = 0;
        int summa2 = 0;
        int i;
        int j;
        int number = 25;
        System.out.print("����� �������: ");
        for ( i = 0; i < number; i++) {
           int randomValue = ThreadLocalRandom.current().nextInt(18, 41);
            summa = summa + randomValue;
            System.out.print(randomValue + " ");
        }
        double arithmeticMean = (double) summa / number;
        System.out.println("\n������� �� �������: " + Math.round(arithmeticMean));
        System.out.print("����� �������: ");
        for ( j = 0; j < number; j++) {
            int randomValue2 = ThreadLocalRandom.current().nextInt(18, 41);
            summa2 = summa2 + randomValue2;
            System.out.print(randomValue2 + " ");
        }
        double arithmeticMean2 =  (double) summa2 / number;
        System.out.print("\n������� �� �������: " + Math.round(arithmeticMean2));
    }
 }