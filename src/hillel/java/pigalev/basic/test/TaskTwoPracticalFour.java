package hillel.java.pigalev.basic.test;

import java.util.Scanner;

public class TaskTwoPracticalFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String format = "%02d";
        System.out.println();
        System.out.println("|--------------Star to program--------------| ");
        System.out.println("Enter the First_variant_date: ");
        System.out.print("Day: ");
        int daeOne = scanner.nextInt();
        System.out.print("Month: ");
        int monthOne = scanner.nextInt();
        System.out.print("Year: ");
        int yearOne = scanner.nextInt();
        if (daeOne < 10 && monthOne< 10){
            System.out.print("First_variant_date: ");
            System.out.printf(format,daeOne);
            System.out.print(".");
            System.out.printf(format,monthOne);
            System.out.print("."+yearOne);
        }else if(daeOne< 10){
            System.out.print("First_variant_date: ");
            System.out.printf(format,daeOne);
            System.out.print("."+monthOne+"."+yearOne);
        } else if (monthOne < 10 ) {
            System.out.print("First_variant_date: "+daeOne+".");
            System.out.printf(format,monthOne);
            System.out.print("."+yearOne);
        } else {
            System.out.println("First_variant_date: "+daeOne+"."+monthOne+"."+yearOne);
        }
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Enter the Second_variant_date: " );
        System.out.print("Day: ");
        int daeTwo = scanner.nextInt();
        System.out.print("Month: ");
        int monthTwo = scanner.nextInt();
        System.out.print("Year: ");
        int yearTwo = scanner.nextInt();
        if (daeTwo < 10 && monthTwo< 10){
            System.out.print("First_variant_date: ");
            System.out.printf(format,daeTwo);
            System.out.print(".");
            System.out.printf(format,monthTwo);
            System.out.print("."+yearTwo);
        }else if(daeTwo< 10){
            System.out.print("First_variant_date: ");
            System.out.printf(format,daeTwo);
            System.out.print("."+monthTwo+"."+yearTwo);
        } else if (monthTwo < 10 ) {
            System.out.print("First_variant_date: "+daeTwo+".");
            System.out.printf(format,monthTwo);
            System.out.print("."+yearTwo);
        } else {
            System.out.println("First_variant_date: "+daeOne+"."+monthOne+"."+yearOne);
        }
        System.out.println();
        System.out.println("------------------------------------------");
        if ( yearOne < yearTwo || (yearOne == yearTwo && monthOne < monthTwo)
                || (yearOne == yearTwo && monthOne == monthTwo && daeOne < daeTwo)){
            System.out.println("Message: First_variant_date is earlier, and Second_variant_date are later ");
        } else if ( yearOne > yearTwo || (yearOne == yearTwo && monthOne > monthTwo)
                || (yearOne == yearTwo && monthOne == monthTwo && daeOne > daeTwo)){
            System.out.println("Message: Second_variant_date is earlier, and First_variant_date are later ");
        } else {System.out.println("Both dates are equal"); }
    }
}
