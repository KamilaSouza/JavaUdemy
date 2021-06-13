package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        char challenge = 'F';

        switch (challenge) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("You got " + challenge);
                break;

            default:
                System.out.println("Char was not A, B, C, D or E, it was " + challenge);
                break;
        }
    }
}

