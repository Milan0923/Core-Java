
public class MyDate {
	private int date;
	private int month;
	private int year;
//	private String splMonth;
		
	public MyDate(int eId, String eName, double basicSal, int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public MyDate() {
		super();
		
	}
	
	public MyDate(int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	public String toString() {
		return super.toString()+" "+date+"/"+month+"/"+year;
		}
    }

