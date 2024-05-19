
public class Batsman extends Player {

	double runCount;

	public Batsman() {
		runCount = 84;
	}

	public Batsman(String name, MyDate dob, int pId, MyDate nMatchDate, double runCount) {
		super(name, dob, pId, nMatchDate);
		this.runCount = runCount;
	}

	public double getRunCount() {
		return runCount;
	}

	public void setRunCount(double runCount) {
		this.runCount = runCount;
	}
	
	public String toString() {
		return super.toString()+" "+runCount;
	}
	
}
