package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        // my code

        int result = calculateHighScorePosition(1500);
        displayHighScorePosition("Kamila", result);

        result = calculateHighScorePosition(900);
        displayHighScorePosition("Mayara", result);

        result = calculateHighScorePosition(400);
        displayHighScorePosition("Pedro", result);

        result = calculateHighScorePosition(50);
        displayHighScorePosition("Noah", result);

        // professors code

//        int highScorePosition = calculateHighScorePosition(1500);
//        displayHighScorePosition("Tim", highScorePosition);
//
//        highScorePosition = calculateHighScorePosition(900);
//        displayHighScorePosition("Kami", highScorePosition);
//
//        highScorePosition = calculateHighScorePosition(400);
//        displayHighScorePosition("May", highScorePosition);
//
//        highScorePosition = calculateHighScorePosition(50);
//        displayHighScorePosition("Noah", highScorePosition);
//    }
//
//    public static void displayHighScorePosition (String playerName, int highScorePosition){
//        System.out.println(playerName + " managed to get into position "
//                + highScorePosition + " on the score table");
//    }

    }

    public static void displayHighScorePosition(String name, int result) {
        System.out.println(name + " your Score is: " + result);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) { // score < 1000 is not necessary
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
//          Better way
//
//        int position = 4;
//        if(score >= 1000) {
//            position = 1;
//        } else if (score >= 500) {
//            position = 2;
//        } else if (score >= 100) {
//            position = 1;
//        }
//
//        return position;

}

