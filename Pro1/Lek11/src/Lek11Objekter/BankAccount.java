package Lek11Objekter;

public class BankAccount {
    private double balance;
    private int id;
    private static int count = 0;
    private int years = 0;


    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public int years() {
        return years;
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
        // Giv denne konto det næste ledige id, lige når den bliver oprettet
        this.id = ++count;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public double getBalance(int years) {
       if (id < 10) {
           return balance * Math.pow(1.05, years);
       }
       else {
           return balance * Math.pow(1.035, years);
       }
    }
}