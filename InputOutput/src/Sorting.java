import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		
		Comparator<Integer>nm = (nm1, nm2) -> (nm1 > nm2) ? 1: (nm1 < nm2) ? -1: 0;
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		lst.add(34);
		lst.add(23);
		lst.add(12);
		lst.add(56);
		lst.add(45);
		
		ArrayList<String> lst1 = new ArrayList<String>();
		lst1.add("Swapnil");
		lst1.add("Milan");
		lst1.add("Prasad");
		lst1.add("Nidhi");
		lst1.add("Ritik");
		
		ArrayList<Double> lst2 = new ArrayList<Double>();
		lst2.add(3276438.31);
		lst2.add(8548273.827);
		lst2.add(277326.00);
		lst2.add(459471.40);
		lst2.add(1560462.00);
		
		Collections.sort(lst);
		System.out.println(lst);
		
		Collections.sort(lst1);
		System.out.println(lst1);
		
		Collections.sort(lst2);
		System.out.println(lst2);
	}

}



/*   {
 * 
 * public int compare(Employee emp, employee emp2)
 * if (emp.empId() > emp.empId2())
 * return 1;
 * else if (emp.empId() < emp.empId2())
 * return -1;
 * else 
 * return 0;
 * 
 */


















