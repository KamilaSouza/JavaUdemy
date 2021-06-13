package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Kami", 20);
        System.out.println("The new score is: " + newScore);

        calculateScore(10);
        calculateScore();

    }
    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score  + " points.");
        return score * 1000;
    }

    public static int calculateScore (int score){
        System.out.println("Unnamed player scored " + score  + " points.");
        return score * 1000;
    }

    public static int calculateScore (){
        System.out.println("Unnamed player, no score.");
        return 0;
    }
}
