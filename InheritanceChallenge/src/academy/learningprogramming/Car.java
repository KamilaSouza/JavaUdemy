package academy.learningprogramming;

public class Car extends Vehicle {

    private String color;
    private int gears;
    private int doors;
    private boolean isManual;

    private int currentGear;

    public Car(String size, String name, String color, int gears, int doors, boolean isManual) {
        super(size, name);
        this.color = color;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);

    }
}
