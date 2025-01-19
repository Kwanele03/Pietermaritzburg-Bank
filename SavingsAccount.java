
public class SavingsAccount extends BankAccount  {
	
    private double interestRate;

    // Constructor
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    // Apply interest method
    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.printf("You are getting there! Your applied interest is R%f. Updated Balance: R%f \n" , interest, balance);
    }

}
