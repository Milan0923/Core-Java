
public class Threads extends Thread {
	
	Bank bankAcc = new Bank(341, 5000);
	Bank bankAcc2 = new Bank(342, 6000);
	Thread t1, t2, t3;
	
	public Threads() {
		super();
		
		t1 = new Thread(this);
		t2 = new Thread(this);
		t3 = new Thread(this);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Final values");
		System.out.println("bankAcc");
		System.out.println("bankAcc2");
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		
		if (tName.equals("t1")) {
			deposit(1000, bankAcc);
		} else if (tName.equals("t2")) {
			deposit(2000, bankAcc2);
		} else {
			deposit(3000, bankAcc);
		}
	}
	
	synchronized public void deposit(double amt, Bank bankAcc) {
		System.out.println("Trying to update the bal of Acc. "+bankAcc.getAccNo()+" by Rs. "+amt);
		
		double prevBal = bankAcc.getBal();
		double newBal = prevBal + amt;
		bankAcc.setBal((int) newBal);
		
		System.out.println("Updated Balance of "+bankAcc.getAccNo()+" is Rs. "+newBal);
	}
	
	public static void main(String[] args) {
		
		new Threads();
	}

}
