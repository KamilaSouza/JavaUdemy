package academy.learningprogramming;

public class Vehicle {

    private String size;
    private String name;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String size, String name){
        this.currentVelocity = 0;
        this.size = size;
        this.currentDirection = 0;
        this.name = name;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degrees.");
    }

    public void move (int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle().move: Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentVelocity() {
        return this.currentVelocity;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
