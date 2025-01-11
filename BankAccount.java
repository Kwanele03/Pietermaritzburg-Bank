
public class BankAccount {
	
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("You have deposited R%f. New Balance: R%f \n" ,amount, balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("You have Withdrew R%f. Remaining Balance: R%f \n" ,amount, balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Check balance method
    public double getBalance() {
        return balance;
    }

}