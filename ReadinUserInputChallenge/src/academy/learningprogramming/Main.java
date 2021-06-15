package academy.learningprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number in position 1");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int count = 0;
            int sum = 0;
            int position = 1;

            while (count < 10) {

                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                count++;
                position ++;
                if (position < 11){
                    System.out.println("Enter number in position " + position);
                }
            }

            System.out.println("The sum of your integers is: " + sum);
        } else {
            System.out.println("Invalid Number");
        }
        scanner.close();


//        professor 's code
//
//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 0;
//        int sum = 0;
//
////        while(true) {
//        while (counter < 10) {
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ":");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
////               if(counter == 10) {
////                   break;
////               }
//            } else {
//                System.out.println("Invalid number");
//            }
//
//            scanner.nextLine(); // handle end of line (enter key)
//        }
//
//        System.out.println("sum = " + sum);
//        scanner.close();
//
//    }

}


