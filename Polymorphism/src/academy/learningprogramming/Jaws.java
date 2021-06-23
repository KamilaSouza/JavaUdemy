package academy.learningprogramming;

public class Jaws extends Movie {
    //    public Jaws(String name) {              // default constructor
//        super(name);
//    }
    public Jaws() {
        super("Jaws");                  // professor's constructor
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}
