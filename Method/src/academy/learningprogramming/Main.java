package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true; // this part is not necessary, but makes it easier to understand
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(false, 10000, 8, 200); // this is better
        System.out.println("Your final score was " + highScore); // need to fix this "false" return

    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return finalScore;
        } else { // this is not necessary
            return -1;
        }
    }
}
