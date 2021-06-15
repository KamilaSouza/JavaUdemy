package academy.learningprogramming;

import java.util.Locale;

// we can have private, protected (allows classes in this packet to access your class)
public class Car {

    private int doors;
    private int wheels;          // fields
    private String model;
    private String engine;
    private String colour;

    public void setDoors(int doors) {
        this.doors = doors;  // purple doors = private int doors; white doors = int doors;
    }                        // this = class; the models class will be replaced by model's method?

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }
}


