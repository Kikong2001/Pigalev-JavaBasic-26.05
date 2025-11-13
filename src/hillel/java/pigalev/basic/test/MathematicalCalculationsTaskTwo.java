package hillel.java.pigalev.basic.test;

import java.util.Scanner;

public class MathematicalCalculationsTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("----------Start calculation----------");
        System.out.println("Calculation equation for f(X): ");
        System.out.print("Enter the value of X = ");
        int valueX = scanner.nextInt();
        if (valueX < 8 & valueX > -3) {
            System.out.print("Enter the value of a: ");
            double valueA = scanner.nextDouble();
            System.out.println();
            System.out.print("Enter the value of b: ");
            double valueB = scanner.nextDouble();
            int exponent = 2;
            if (valueX < 3 & valueX > (-3)) {
                double resultExponent = Math.pow(valueX, exponent);
                double resultOne = (3 * resultExponent) - valueA;
                double resultSqrt = Math.sqrt(resultOne);
                System.out.println();
                System.out.println("f(x) = sqrt((3X^2)-a)");
                System.out.println("Step 1: f(x) = sqrt((3" + valueX + "^2)-" + valueA + ")");
                System.out.println("Step 2: f(x) = sqrt(" + (3 * resultExponent) + "-" + valueA + ")");
                System.out.println("Step 3: f(x) = sqrt(" + (3 * resultExponent - valueA) + ")");
                System.out.println("Step 4: f(x) = " + resultSqrt);
            } else if (valueX == 3) {
                double resultTwo = (-1 * valueB) * valueX + 3;
                System.out.println();
                System.out.println("f(x) = -bX+3");
                System.out.println("Step 1: f(x) = -" + valueB + "*" + valueX + "+3");
                System.out.println("Step 2: f(x) = " + resultTwo);
            } else {
                double resultThree = valueX - 4;
                double radians = Math.toRadians(resultThree);
                double cosValue = Math.cos(radians);
                System.out.println();
                System.out.println("f(x) = cos(x-4)");
                System.out.println("Step 1: f(x) = cas(" + resultThree + ")");
                System.out.println("Step 2: f(x) =" + cosValue);
            }
        } else {
            System.out.println();
            System.out.println("Error!!!");
        }

    }
}
