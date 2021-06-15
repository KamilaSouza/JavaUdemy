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
        clientAccount.withdraw(55);
    }
}
