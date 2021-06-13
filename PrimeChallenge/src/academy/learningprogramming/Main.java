package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        int numberOfPrime = 0;
        for (int i = 10; i < 50; i++) {

            if (isPrime(i)) {
                numberOfPrime++;
                System.out.println("The number " + i + " is prime");
                if (numberOfPrime == 10) {
                    System.out.println("Exiting");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {   // i <= (long) Math.sqrt(n);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
