package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count =0;

        for (int i = 1; i <= 1000; i++){
            if ((i % 3 ==0) && (i % 5 == 0)){
                sum = sum + i;  // sum += i;
                count++;
                System.out.println("Found number " + i);
                if (count == 5){                  // is it better inside or outside the for?
                    System.out.println("Sum is equal to: " + sum);
                    break;
                }
            }
        }
    }
}
