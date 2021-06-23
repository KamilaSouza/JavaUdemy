package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        Dimentions dimentions = new Dimentions(20, 20, 5);
        Case theCase = new Case("Dragon", "Pichau", "240", dimentions);
        Monitor theMonitor = new Monitor("A", "AOC", 27, new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6,"help");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

    }
}
