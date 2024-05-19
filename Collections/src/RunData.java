import java.util.Scanner;

public class RunData {
	
public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		try {
			Bank bnk = new Bank();
			bnk.accNo(745381111);
			bnk.HolderName("Milan");
			bnk.bal(7458314);
		} catch (BalException b) {
			b.printStackTrace();
		}
	}
}
