
abstract public class Player extends Human {
	
	int pId;
	MyDate nMatchDate;
	
	public Player() {
		pId = 456;
		nMatchDate = new MyDate(15,7,2023);
	}
	
	public Player(String name, MyDate dob, int pId, MyDate nMatchDate) {
		super(name, nMatchDate);
		this.pId = pId;
		this.nMatchDate = nMatchDate;
	}
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public MyDate getnMatchDate() {
		return nMatchDate;
	}

	public void setnMatchDate(MyDate nMatchDate) {
		this.nMatchDate = nMatchDate;
	}

	public String toString() {
		return super.toString()+" "+pId+" "+nMatchDate;
	}
	public void calPerform() {
		
	}
}
