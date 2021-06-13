package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {


//        for (int i = 2; i < 9; i++) {  // (init; termination; increment) its better to start at 0
//            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }

        for (int i = 8; i > 1; i--) {  // (init; termination; increment) its better to start at 0
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }

}
