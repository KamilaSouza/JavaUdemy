package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        getDurationString(7, 35);
        getDurationString(455);
    }

    public static int getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hour = minutes / 60;
            int minutesLeft = minutes % 60;
            //System.out.println(hour + " hour and " + minutesLeft + " minutes and " + seconds + " seconds ");
            System.out.println(hour + "h " + minutesLeft + "m " + seconds + "s");
            return 0;
        }
        System.out.println("Invalid Parameter");
        return -1;
    }

    public static int getDurationString(int seconds) {
        if (seconds >= 0) { // or you can use the invalid parameter first: if (seconds < 0) { System.out.println("Invalid parameter"); return -1; }
            int minutes = seconds / 60;
            int secondsLeft = seconds % 60;
            int hour = minutes / 60;
            int minutesLeft = minutes % 60;
            //System.out.println(seconds + " seconds are: "+ hour + " hours and " + minutesLeft + " minutes and " + secondsLeft + " seconds");
            System.out.println(hour + "h " + minutesLeft + "m " + secondsLeft + "s");
            return 0;
        }
        System.out.println("Invalid parameter");
        return -1;
    }
}
