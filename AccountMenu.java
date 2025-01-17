
public class AccountMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        // Test SavingsAccount
        SavingsAccount savings = new SavingsAccount(2500, 5);
        savings.deposit(500);
        savings.applyInterest();
        savings.withdraw(300);

        // Test CheckingAccount
        CheckingAccount checking = new CheckingAccount(500, 200);
        checking.deposit(200);
        checking.withdraw(800); // Uses overdraft
        checking.withdraw(50);  // Exceeds overdraft limit
    }

}
