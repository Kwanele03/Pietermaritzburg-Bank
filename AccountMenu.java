
public class AccountMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount account = new SavingsAccount(3000);		
		CheckingAccount check = new CheckingAccount (100, 0);
		
	
	System.out.printf("I have deposited %f into my Saving Account.  \n", account.deposit(500));
	check.withdrwa(20);
	check.withdrwa(20);
		

	}

}
