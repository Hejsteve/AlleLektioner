package Lek11Objekter;

public class BankAccountApp {
    static void main(String[] args) {

        BankAccount account1 = new BankAccount(1000);
        account1.deposit(0);
        account1.withdraw(0);
        System.out.println("Customer ID: " + account1.getId());
        System.out.println("Your balance is: " + account1.getBalance());
        System.out.println("Your balance will be: " + String.format("%.2f",account1.getBalance(10)));
    }
}