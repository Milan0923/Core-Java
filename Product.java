
public class Product {
	
	private int pId;
	private String pName;
	private double price;
	
	public Product() {
		
	}
	
	public Product(int pId, String pName, double price) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		
	}
	 
    public void getpId() {
    	System.out.println(pId);
    }

	public void getpName() {
		System.out.println(pName);
	}
	
	public void getprice() {
		System.out.println(price);
	}
	
	public void setpId() {
		System.out.println(pId);
	}
	
	public void setpName() {
		System.out.println(pName);
	}
	
	public void setprice() {
		System.out.println(price);
	}
	
	public void Data() {
		System.out.println(pId);
		System.out.println(pName);
		System.out.println(price);
	}
	
	public void calPrice() {
		
	}
	
	
	
}
