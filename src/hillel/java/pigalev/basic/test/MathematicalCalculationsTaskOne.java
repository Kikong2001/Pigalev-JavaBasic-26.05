package hillel.java.pigalev.basic.test;

public class MathematicalCalculationsTaskOne {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Start calculation");
        System.out.println("Calculation equation for X: ");
        double a = 2.389;
        double b = 3.1;
        int c = 17;
        int exponent = 3;
        double resultExponent = Math.round(Math.pow(b, exponent)*1000.0)/1000.0;
        double resultSqrt = Math.round(Math.sqrt(resultExponent/(b-a))*1000.0)/1000.0;
        double resultLn= Math.round(Math.log(a)*1000.0)/1000.0;
        double resultEquationOne = Math.round((resultSqrt - resultLn)*1000.0)/1000.0;
        double radians = Math.toRadians(c);
        double sinValue = Math.round(Math.sin(radians)*1000.0)/1000.0;
        double cosValue = Math.round(Math.cos(radians)*1000.0)/1000.0;
        double sinExponentValue = Math.round(Math.pow(sinValue, exponent)*1000.0)/1000.0;
        double cosExponentValue = Math.round(Math.pow(cosValue, exponent)*1000.0)/1000.0;
        double resultEquationTwo = Math.round(((a * sinExponentValue) + (b * cosExponentValue))*1000.0)/1000.0;
        System.out.println("X= Square root((" + b + "^3)" + "/("+ b + "-" + a + "))-ln(" + a + ")");
        System.out.println("1 Step: X= Square root("+ resultExponent + "/" + (b+a) + ")-"+resultLn);
        System.out.println("2 Step: X= " + resultSqrt +"-"+ resultLn);
        System.out.println("3 Step: X= " + resultEquationOne);
        System.out.println();
        System.out.println("Calculation equation for Y: ");
        System.out.println("Y= " + a + "*sin^3(" + c + ")+" + b + "*cos^3(" + c + ")");
        System.out.println("1 Step: Y= " + a + "*" + "sin^3(" + sinValue + ")+" + b + "*"
                + "cos^3(" + cosValue + ")");
        System.out.println("2 Step: Y= " + a + "*" + sinExponentValue +"+"+ b + "*"+ cosExponentValue);
        System.out.println("3 Step: Y= "+ (Math.round((a*sinExponentValue)*1000.0)/1000.0) + "+"
                +(Math.round((b*cosExponentValue)*1000.0)/1000.0));
        System.out.println("4 Step: Y= " + resultEquationTwo);
    }
}
