import java.util.Scanner;

public class AddEven {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("From No. : ");
		int num = scan.nextInt();
		
		System.out.println("To No. : ");
		int num1 = scan.nextInt();
		
		int sum = 0;
		
		for(int i = num; i<num1; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Addition of Even no. is : "+sum);
	}
}
