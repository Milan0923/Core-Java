
public class ThreadDemo implements Runnable{
	
	public void ping() {
		for(int i=1; i<=5; i++) {
			System.out.println("Ping");
		}
	}
	
	public void pong() {
		for(int i=1; i<=5; i++) {
			System.out.println("Pong");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
