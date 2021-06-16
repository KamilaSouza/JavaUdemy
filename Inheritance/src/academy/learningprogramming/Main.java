package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1,1,1);
        Dog dog = new Dog("Pincher", 2,1,1,2,1,4,42,"Black");

        dog.eat();
        dog.walk();
        //dog.run();
    }
}
