package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1000;
        int levelComplete = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000){ //we can do it without the {}, it will work
//            System.out.println("Your Score was 5000 but greater than 1000");
//
//        } else if (score < 1000){
//            System.out.println("Your Score was less than 1000");
//
//        } else {
//            System.out.println("Got Here");
//        }

        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }

// Second (professor's) Solution for challenge

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}

// the codeblock can access a variable created outside the block
// int savedFinalScore = finalScore; // you cant access the variable inside de codeblock if you call it after closing the {}

//      First (mine) Solution for challenge

//        int score2 = 10000;
//        int levelcomplete2 = 8;
//        int bonus2 = 200;
//
//        if (gameOver){
//            int finalScore = score2 + (levelcomplete2 * bonus2);
//            System.out.println("Your second Final score was " + finalScore);
//        }





