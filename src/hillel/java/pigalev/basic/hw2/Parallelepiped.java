package hillel.java.pigalev.basic.hw2;

import java.util.Scanner;

import static java.lang.Math.rint;
import static java.lang.Math.round;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter a value: ");
        System.out.println("1) Length said:");
        double lengthSaid = scanner.nextDouble();
        System.out.println("2) Width said:");
        double widthSaid = scanner.nextDouble();
        System.out.println("3) Height said:");
        double heightSaid = scanner.nextDouble();
        double volume = (lengthSaid * widthSaid) * heightSaid;
        double length = (lengthSaid + widthSaid + heightSaid) * 4;
        System.out.println("volume= " + volume);
        System.out.println("length= " + length);
    }
}
