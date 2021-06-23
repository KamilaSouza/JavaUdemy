package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {


        Printer printer = new Printer(55, true);
//      printer.printing(20); // if I use void instead int
        int pagesPrinted = printer.printing(20); // if I use int instead void
        pagesPrinted = printer.printing(25);
//
        printer.fillUpToner(20);
    }
}
