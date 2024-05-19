
public class Employee {
	
	private int eId;
	private String eName;
	private double basicSal;
	
	public Employee () {
		eId = 1234;
		eName = "Romeo";
		basicSal = 60000;
		
	}

	public Employee(int eId, String eName, double basicSal) {
		this.eId = eId;
		this.eName = eName;
		this.basicSal = basicSal;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}
	
	public String toString() {
		return eId+ " " + eName +" "+ basicSal; 
	}
	
	
	public double calSal() {
		basicSal = basicSal - (basicSal * 0.1);
		return basicSal;
	}
	
}
