
public class BankAccount {
	
	protected double balance;
	
	
	BankAccount(double balance){
		this.balance = balance;
	}
	
	
	public double deposit(double amount) {
		return this.balance;
	}
	
	
	public void withdrwa(double amount) {
	if(amount > 0 && amount <= balance ) {	
			balance -= amount;
			System.out.println(amount + balance);	
		}

		else {
			System.out.println("You have reached your day limit!");
			
		}
	
	}
	
	

}
