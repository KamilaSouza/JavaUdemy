package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not one or 2");
//        }


        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Was not between 1 or 5");
                break; // its not necessary
        }
    }
}
