package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base Car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6,"Fusion");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Fiat fiat = new Fiat(6,"Palio");
        System.out.println(fiat.startEngine());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.brake());
    }

}
