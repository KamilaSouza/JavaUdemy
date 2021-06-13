package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        double myFirstDouble = 20d;
        double mySecondDouble = 80d;
        double myThirdDouble = (myFirstDouble + mySecondDouble) * 100;
        System.out.println("my Third double is equal to " + myThirdDouble);
        double myReminder = myThirdDouble % 40d;
        System.out.println("My reminder is equal to " + myReminder);

        boolean isMyReminder = (myReminder == 0)? true : false;
        System.out.println("My reminder is equal to 0: " + isMyReminder);

        if (!isMyReminder){
            System.out.println("Got some remainder");
        }
    }
}
