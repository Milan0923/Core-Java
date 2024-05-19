
public class SDE extends Employee {
	
	  private int bonus;

	public SDE(int eId, String eName, double basicSal, int bonus) {
		super(eId, eName, basicSal);
		this.bonus = bonus;
	}
	
	public SDE() {
		super();
		bonus = 12000;
	}

	public SDE(int bonus) {
		super();
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString()+" "+bonus;
	}
	
	public double calSal(double bonus) {
		double val = super.calSal()+bonus;
		System.out.println(val);
		return val;
	}
	
}
