package hillel.java.pigalev.basic.test;

public class TaskFourArray {
    public static void main(String[] args) {
        double [] arrayOne = new double [90];
        System.out.println("");
        System.out.println("|----------Start program----------|");
        for (int i = 1; i < 90; i++) {
            double radians = Math.toRadians(i);
            double sinValue =Math.sin(radians);
            arrayOne[i-1] = sinValue;
        }
        System.out.println();
        for (int i = 0; i < 90; i++) {
            if ( i < 10) {
                System.out.print(arrayOne[i]);
                System.out.print(",");
                if (i == 9){
                    System.out.println("");
                }
            }
            if ( i > 9 && i < 20 ) {
                System.out.print(arrayOne[i]);
                System.out.print(",");
                if (i == 19){
                    System.out.println("");
                }
            }
            if ( i > 19 && i < 30) {
                System.out.print(arrayOne[i]);
                System.out.print(",");
                if (i == 29){
                    System.out.println("");
                }
            }
            if ( i > 29 && i < 40) {
                System.out.print(arrayOne[i]);
                System.out.print(",");
                if (i == 39){
                    System.out.println("");
                }
            }
            if ( i > 39 && i < 50) {
                System.out.print(arrayOne[i]);
                System.out.print(",");
                if (i == 49){
                    System.out.println("");
                }
            }
            if ( i > 49 && i < 60) {
                System.out.print(arrayOne[i]);
                System.out.print(",");
                if (i == 59){
                    System.out.println("");
                }
            }
            if ( i > 59 && i < 70) {
                System.out.print(arrayOne[i]);
                System.out.print(",");
                if (i == 69){
                    System.out.println("");
                }
            }
            if ( i >69 && i < 80) {
                System.out.print(arrayOne[i]);
                System.out.print(",");
                if (i == 79){
                    System.out.println("");
                }
            }
            if ( i > 79 ) {
                System.out.print(arrayOne[i]);
                System.out.print(",");

            }

        }
    }
}
