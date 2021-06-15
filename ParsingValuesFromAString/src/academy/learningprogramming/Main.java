package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        double numberD = Double.parseDouble(numberAsString);
        System.out.println("number = " + numberD);

        numberAsString += 1;
        number += 1;
        numberD += 1;

        System.out.println(numberAsString);
        System.out.println(number);
        System.out.println(numberD);
    }
}
