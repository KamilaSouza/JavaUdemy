package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("My String is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("my String is equal to " + myString);
        myString = myString + " \u00a9 2019";
        System.out.println("my String is equal to " + myString);
        String numberString = "55.50";
        numberString = numberString + "44.50";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is egual to = " + lastString);
        double doubleNumber = 120.45d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is egual to " + lastString);
        // they are treated lik a string

    }
}
