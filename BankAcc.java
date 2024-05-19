
public class BankAcc {
	
	int BankAccNo = 6489;
	String accHolderName = "Milan";
	int ifscCode = 85625982;
	String BranchName = "Hinjewadi";
	float bal = 3254f;
	float Transactions[] = {105, 623, -532, -12};
	
	
	public void withdraw(float amt) {
		
		for (int i=0; i<Transactions.length; i++) {
			System.out.println(Transactions[i]);
		}
		bal = bal - amt;
		
		System.out.println("Balance is $"+ bal);
	}
	public void deposit(float amt) {
		bal = bal + amt;
		
		System.out.println("New Balance is $"+ bal);
		
	}
}
