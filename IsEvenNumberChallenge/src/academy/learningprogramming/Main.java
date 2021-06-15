package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int count = 0;


        while (number <= finishNumber) {

            boolean result = isEvenNumber(number);
            if (result) {
                count++;
                System.out.println("The number " + number + " is even");
            }
            number++;
            if (count >= 5) {
                System.out.println("Even numbers found: " + count);
                break;
            }
        }
    }

// professor's code
//
//        int number = 4;
//        int finishNumber = 20;
//        int evenNumbersFound = 0;
//
//        while(number <=finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//            evenNumbersFound++;
//            if (evenNumbersFound >= 5) {
//                break;
//            }
//        }
//        System.out.println("Total even numbers found = " + evenNumbersFound);
//    }


    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;

        }
        return false;
    }

}

