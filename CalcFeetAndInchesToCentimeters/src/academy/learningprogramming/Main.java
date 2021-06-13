package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(8, 4);
        calcFeetAndInchesToCentimeters(-100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimeters = ((inches * 2.54) + ((12 * feet) * 2.54));
            System.out.println(feet + "ft and " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
        System.out.println("Invalid parameter");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double numberOfFeet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println( inches + " inches are " + numberOfFeet + "ft and " + remainingInches + " inches" );
            return numberOfFeet;
        }
        System.out.println("Invalid parameters");
        return -1;
    }
}

