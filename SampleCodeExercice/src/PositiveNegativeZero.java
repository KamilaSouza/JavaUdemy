public class PositiveNegativeZero {

    public static void main(String[] args) {

        checknumber(0);

    }

    public static void checknumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
}
