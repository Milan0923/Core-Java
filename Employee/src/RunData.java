
public class RunData {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(23, "Swapnil", 78000);
		
		SDE mngr = new SDE(123, "Milan", 95000, 11000);
		
		Sales sls = new Sales(144, "Roma", 45000, 0.04, 15);
		
		emp.calSal();
		System.out.println(emp);
		
		mngr.calSal(230);
		System.out.println(mngr);
		
		sls.calSal();
		System.out.println(sls);
	}
}
