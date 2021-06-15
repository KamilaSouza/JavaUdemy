package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car(); // we created an object called porsche based in a template, car.
        Car holden = new Car();
        // System.out.println("The porsche model is: " + porsche.getModel()); // null is the default
        porsche.setModel("Carrer");
        System.out.println("The porsche model is " + porsche.getModel());
    }
}
