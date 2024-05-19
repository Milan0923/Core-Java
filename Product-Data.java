import java.util.Scanner;

public class Display {
	
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		Product pro = new Product();
		pro.Data();
//		pro.calPrice();
		
		System.out.println("-----------------------------");
		
		System.out.println("Enter pId :");
		int pId = scan1.nextInt();
		
		System.out.println("Enter the name of product :");
		String pName = scan1.next();
		
		System.out.println("Price :");
		double price = scan1.nextInt();
		
		System.out.println("-----------------------------");
		
		Product pro1 = new Product(pId, pName, price);
		pro1.Data();
	}
}
