
public class CheckingAccount extends BankAccount{
	
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method with overdraft logic
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.printf("You have Withdrew R%f. Remaining Balance: R%f \n" ,amount, balance);
        } 
	else {
            System.out.println("Exceeded overdraft limit or invalid amount.");
        }
    }
	
}
