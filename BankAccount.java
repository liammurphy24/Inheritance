public class BankAccount {
    private double balance;


    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    // Method to withdraw money from the account
    public void withdraw(double withDrawAmount) {
            balance -= withDrawAmount;
        }

    public double getBalance() {
        return balance;
    }
    }
