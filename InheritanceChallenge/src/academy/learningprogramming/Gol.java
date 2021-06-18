package academy.learningprogramming;

public class Gol extends Car {

    private String model;

    public Gol(String model) {
        super("idk", "Gol", "Red", 5, 4, false);
        this.model = model;
    }

    public void accelerate(int rate) {
        int newVelocity = this.getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }
        if (newVelocity > 0) {
            this.changeVelocity(newVelocity, this.getCurrentDirection());
        }
    }

}
