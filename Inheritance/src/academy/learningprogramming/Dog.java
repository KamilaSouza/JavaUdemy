package academy.learningprogramming;

public class Dog extends Animal {

    private int eyes;
    private int tail;
    private int legs;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int body, int eyes, int tail, int legs, int teeth, String coat) {
        super(name, 1, size, weight, 1);
        this.eyes = eyes;
        this.tail = tail;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
        chew();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);  //goes to the higher class
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
