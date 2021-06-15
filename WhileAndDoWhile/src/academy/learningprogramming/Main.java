package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        for (count = 1; count != 6; count++){
            System.out.println("Count value is " + count);
        }

        count = 1; // count = 6; use break  if (count > 100){ break;}
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
    }


}
