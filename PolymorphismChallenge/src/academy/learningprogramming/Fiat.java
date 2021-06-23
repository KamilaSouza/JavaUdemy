package academy.learningprogramming;

public class Fiat extends Car {

    public Fiat(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()"; // retrieve the class name
    }

    @Override
    public String accelerate() {
        return "Fiat -> accelerate()";
    }

    @Override
    public String brake() {
        return "Fiat -> brake()";
    }
}
