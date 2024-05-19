import java.io.Serializable;

public class Student implements Serializable  {
	
	private int studId;
	private String studName;
	private double fees;
	
	public Student() {
		
	}
	
	public Student(int bookId, String bookName, double price) {
		super();
		this.studId = bookId;
		this.studName = bookName;
		this.fees = price;
	}

	public int getBookId() {
		return studId;
	}

	public void setBookId(int bookId) {
		this.studId = bookId;
	}

	public String getBookName() {
		return studName;
	}

	public void setBookName(String bookName) {
		this.studName = bookName;
	}

	public double getPrice() {
		return fees;
	}

	public void setPrice(double price) {
		this.fees = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studId+" "+studName+" "+fees;
	}
}
