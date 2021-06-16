package academy.learningprogramming;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;


    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(){
        this("Default name", 0.0, "Default email");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "Default email");

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}


