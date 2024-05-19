
public class MyThread {

	public static void main(String[] args) {
		
		Thread thr = new Thread (
				() -> {
					for(int i=1; i<11; i++)
						System.out.println(i);
				}
				);
			thr.start();	
	}
}
