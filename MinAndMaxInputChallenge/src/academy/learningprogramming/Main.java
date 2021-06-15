package academy.learningprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int min = Integer.MAX_VALUE;   // much better
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {

            System.out.println("Enter number: ");
            boolean isItAnInt = scanner.hasNextInt();

            if (isItAnInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                count++;

//                if (first){
//                    first = false;
//                    min = number;                    // to manage the 0 min problem
//                    max = number;
//                }

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

                if (count == 5) {
                    break;
                }

            } else {
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("The biggest number is: " + max + " and the lowest number is: " + min);
        scanner.close();
    }

}
