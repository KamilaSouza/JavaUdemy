package academy.learningprogramming;

public class Animal {

    private String name;
    private int brain;
    private int size;
    private int weight;
    private int body;

//constructor uppercase and method lowercase?
//each time an object is created using new() keyword at least one constructor (it could be default constructor) is invoked

    public Animal(String name, int brain, int size, int weight, int body) {
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
        this.body = body;
    }

    public void move(int speed){
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }
    public void eat(){
        System.out.println("Animal.eat() called");

    }

    public void move(){

    }
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getBody() {
        return body;
    }
}
