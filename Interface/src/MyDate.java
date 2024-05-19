
public class MyDate {
	private int date;
	private int month;
	private int year;
//	private String splMonth;
	
	public MyDate() {
		super();
		date = 01;
		month = 01;
		year = 1900;
	}
		
	public MyDate(String Human, int date, int month, int year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
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
	
	public void Mydate (int date, int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (date>0 && date<32) {
				this.date = date;
			}
			else {
				System.out.println("Invalid Date");
			}
		}
		
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (date>0 && date<31) {
				this.date = date;
			}
			else {
				System.out.println("Invalid Date");
			}
		}
		
		if(month == 2) {
			if (year%4 == 0) {
				if (date>0 && date<30) {
					this.date = date;
				}
				else {
					if(date>0 && date<29) {
						this.date = date;
					}
					else {
						System.out.println("Invalid Date");
					}
				}
			}
		}
	}
		
	public String toString() {
		return " "+date+"/"+month+"/"+year;
		}
}
