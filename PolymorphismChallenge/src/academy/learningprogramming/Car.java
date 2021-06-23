package academy.learningprogramming;

public class Car {

    private boolean engine;
    private int cylinders;                   // fuck this car analogies!!!!!!!!!!!!!!!!!!!!!
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
