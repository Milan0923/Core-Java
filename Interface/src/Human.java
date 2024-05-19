
public class Human implements LivingBeing {
	
	String name;
	MyDate dob;
	
	public Human () {
		name = "Romeo";
		dob = new MyDate(12, 10, 2000);
	}
	
	public Human (String name, MyDate dob) {
		this.name = name;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}
	
	public String toString() {
		return name+" "+dob;
	}

	public void walks() {
		System.out.println("human's walks on two legs.");
		
	}

}
