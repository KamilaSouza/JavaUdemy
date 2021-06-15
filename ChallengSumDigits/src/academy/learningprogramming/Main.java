package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {


        System.out.println(sumDigits(9));
    }


    public static int sumDigits(int number) {
        if (number >= 10 && number < 100) {
            return ((number / 10) + (number % 10));

        } else if (number >= 100) {
            return ((number / 100) + ((number % 100) / 10) + (number % 10));  // number / 100 = 1 , number % 100 = 25, 25 / 10 = 2, 125 / 10 = 12, 5 reminder
        }
        return -1;

    }
}
// professor's code
//
//        if(number < 10){
//        return-1;
//        }
//
//        int sum=0;
//
//        while(number > 0){
//        int digit = number % 10;
//        sum += digit;
//
//        number /= 10;
//
//        }
//        return sum;
//
//        }
