
public class Player {
	
	int playerId;
	String playerName;
	String sportType;
	double[] scores;
	
	// Default Catog.
	public Player() {
		playerId = 07;
		playerName = "Milan";
		sportType = "Cricket";
		scores = new double[] {93, 75, 67, 103, 59};
		
	}
	
	// Paramitarized Catog.
	public Player(int pId, String pName, String sType, double scr[]) {
		playerId = pId;
		playerName = pName;
		sportType = sType;
		scores = scr;
		
	}
	
	public void display() {
		System.out.println("Player's details are as follows :");
		System.out.println(playerId);
		System.out.println(playerName);
		System.out.println(sportType);
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
	}
	
	public void calPercent() {
		double total = 0.0;
		for(int i=0; i<scores.length; i++) {
			total = total + scores[i];
		}
		System.out.println("Avarage percentage of Scores is "+(total/5));
	}
}
