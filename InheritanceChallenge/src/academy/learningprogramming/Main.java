package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        Gol gol = new Gol("G4");
        gol.steer(30);
        gol.accelerate(45);
        gol.accelerate(10);
        gol.move(30,30);
    }

}
