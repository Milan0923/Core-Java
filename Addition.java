
public class Addition {
	public static void main(String[] args) {
		
		int ans;
		int c = 53;
		int d = 97;
		int e = 93;
		
		ans = c + d + e;
		System.out.println(ans);
		System.out.println(c +" "+e);
		System.out.println("d is denoted as "+d);
		
		for (int i =0; i < 10; i++) {
//			System.out.println(i+1 +", ");
			if (i<9)
				System.out.println(i+1 +", ");
			else 
				System.out.println(i+1 +".");
		}
	}
}
