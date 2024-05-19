
public class Bank {
	
	private double accNo;
	private int bal;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getAccNo() {
		return accNo;
	}
	public Bank(double accNo, int i) {
		super();
		this.accNo = accNo;
		this.bal = i;
	}


	public void setAccNo(double accNo) {
		this.accNo = accNo;
	}
	
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
