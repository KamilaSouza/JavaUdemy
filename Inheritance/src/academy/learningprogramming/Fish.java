package academy.learningprogramming;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, int brain, int size, int weight, int body) {
        super(name, 1, size, weight, 1);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }
}
