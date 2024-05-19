import java.util.Scanner;

public class Arrayprob {
	
	Scanner scan = new Scanner(System.in);
	
	//First Class Notation.
	// Size and Data is known.
	int arr[] = {53, 32, 34, 11, 24};
	
	// Size is known Data is unknown.
	int arr2[] = new int[3];
	
	public void addElement() {
		for (int i = 0; i<arr2.length; i++) {
			System.out.println("Enter value for element"+(i+1));
			arr2[i] = scan.nextInt();
		}
		System.out.println(arr2);   // not a proper way to display
		
		System.out.println("___Display with traditional For Loop___");
		
		for (int i = 0; i<arr2.length; i++) {
			System.err.println(arr2[i]);
		}
		System.out.println("___Display with advance For Loop___");
		for(int i:arr2) {
			System.out.println(i);
		}
	}
}
