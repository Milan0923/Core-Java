import java.util.Scanner;

public class Bank {
	
	Scanner sc = new Scanner(System.in);
	
	int accNo;
	String HolderName;
	int balance;
	
	public void BalException() {	
	}
	
	public void BalException(int accNo, String HolderName, int balance) {
		this.accNo = accNo;
		this.HolderName = HolderName;
		this.balance = balance;
	}
	
	public void bal(int amt) throws BalException {
		if (amt >50000000) {
			throw new BalException();
		}
		else if (amt <500000000 && amt >1000000) {
			System.out.println("Dream balance"+amt);
		}
		else if (amt <1000000 && amt >10000) {
			System.out.println("Belongs to middle class"+amt);
		}
		else if (amt <10000) {
			System.out.println("Dreaming about balance");
		}
	}
	
	public String toString() {
		return "BalException [balance"+ balance +"]";
	}
	
	public static void main(String[] args) {
		
		try {
			Bank bnk = new Bank();
			bnk.accNo(745381111);
			bnk.HolderName("Milan");
			bnk.bal(7458314);
		} catch (BalException b) {
			b.printStackTrace();
		}
	}

	void accNo(int i) {
		// TODO Auto-generated method stub
		
	}

	void HolderName(String string) {
		// TODO Auto-generated method stub
		
	}
}
