public class SavingsAccount extends BankAccount{

    public SavingsAccount(double initalBalance) {
        super(initalBalance);
    }

    @Override
    public void withdraw(double withDrawAmount) {
        if(getBalance() - withDrawAmount >= 100) {
        super.withdraw(withDrawAmount);
        } else {
            System.out.println("Cant withdraw, you broke.");
        }

    }

    
}
