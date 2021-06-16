package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount clientAccount = new BankAccount("12345", 0.0, "Noah", "noahgorduxo@email.com", "(00) 1234 5678");

//        clientAccount.setAccountNumber("12345");
//        clientAccount.setBalance(0.0);
//        clientAccount.setCustomerName("Noah");
//        clientAccount.setEmail("noahgorduxo@email.com");
//        clientAccount.setPhoneNumber("(00) 1234 5678");

        System.out.println("Account number: " + clientAccount.getAccountNumber());
        System.out.println("Client's balance: " + clientAccount.getBalance());
        System.out.println("Client's name: " + clientAccount.getCustomerName());
        System.out.println("Client's email: " + clientAccount.getEmail());
        System.out.println("Client's phone number: " + clientAccount.getPhoneNumber());

        clientAccount.deposit(100);
        clientAccount.withdraw(100);

        BankAccount clientAccount1 = new BankAccount("Kami", "kami@email", "1234 5678");
        System.out.println(clientAccount1.getAccountNumber() + " name " + clientAccount1.getCustomerName());

        VipCustomer vipCustomer1 = new VipCustomer("Noah", 0.50);
        VipCustomer vipCustomer2 = new VipCustomer();
        VipCustomer vipCustomer3 = new VipCustomer("May", 1000.0, "may@email.com");
        System.out.println("VipCustomer's name " + vipCustomer1.getName() + " has " + vipCustomer1.getCreditLimit() + " credit (" + vipCustomer1.getEmail() + ")");
        System.out.println("VipCustomer's name " + vipCustomer2.getName() + " has " + vipCustomer2.getCreditLimit() + " credit (" + vipCustomer2.getEmail() + ")");
        System.out.println("VipCustomer's name " + vipCustomer3.getName() + " has " +  vipCustomer3.getCreditLimit() + " credit (" + vipCustomer3.getEmail() + ")");

    }
}