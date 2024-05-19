
public class Bowler extends Player {
	
	int wicketCount;
	
	
	public Bowler() {
		super();
		wicketCount = 15;
	}


	public Bowler(String name, MyDate dob, int pId, MyDate nMatchDate, int wicketCount) {
		super(name, dob, pId, nMatchDate); 
		this.wicketCount = wicketCount;
	}


	public int getWicketCount() {
		return wicketCount;
	}


	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}


	public String toString() {
		return super.toString()+" "+wicketCount;
	}

}
