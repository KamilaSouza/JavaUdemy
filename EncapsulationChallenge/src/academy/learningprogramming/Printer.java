package academy.learningprogramming;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;

    }

    public void fillUpToner(int cartridge) {
        if (tonerLevel >= 100) {
            System.out.println("Toner full, don't need to recharge");
        } else {
            this.tonerLevel += cartridge;
            System.out.println("Toner level after charge is: " + tonerLevel);
        }
    }

    public int printing(int numberOfPages) {
        if (this.tonerLevel > 5) {
            System.out.println("Printing pages: " + numberOfPages);
            if (this.duplex) {
                System.out.println("Printing in duplex mode, used " + ((numberOfPages / 2) + (numberOfPages % 2)) + " paper sheets.");
            } else {
                System.out.println("Used " + numberOfPages + " paper sheets.");
            }
        } else {
            System.out.println("Recharge");
        }
        return 0;
    }
}
