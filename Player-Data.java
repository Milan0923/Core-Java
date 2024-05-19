import java.util.Scanner;

public class playData {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Player play = new Player();
		play.display();
		play.calPercent();
		
		System.out.println("-----------------------------");
		
		Player play2 = new Player(18, "Virat", "Cricket", new double[] {82, 85, 105, 59, 72});
		play2.display();
		play2.calPercent();
		
		System.out.println("-----------------------------");
		
		Player play3 = new Player(45, "Rohit", "Cricket", new double[] {32, 75, 43, 13, 63});
		play3.display();
		play3.calPercent();
		
		System.out.println("-----------------------------");
		
		System.out.println("Enter playerId :");
		int pId = scan.nextInt();
		
		System.out.println("Enter the name of player :");
		String pName = scan.next();
		
		System.out.println("Sport Type :");
		String sType = scan.next();
		
		double scr[] = new double[5];
		for (int i=0; i<scr.length; i++) {
			System.out.println("Enter the scores of last 5 matches :"+(i+1));
			scr[i] = scan.nextDouble();
		}
		Player play4 = new Player(pId, pName, sType, scr);
		play4.display();
		play4.calPercent();
		
		double scr1[] = new double[5];
		for (int i=0; i<scr1.length; i++) {
			System.out.println("Enter the scores of last 5 matches :"+(i+1));
			scr1[i] = scan.nextDouble();
		}
		Player play5 = new Player(pId, pName, sType, scr1);
		play5.display();
		play5.calPercent();
	}
}
