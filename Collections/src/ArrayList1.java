import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		
		Stack<Object> lstData = new Stack<Object>();
		
		lstData.add(123);
		lstData.add("Milan");
		lstData.add("Parkhe");
		lstData.add(8256.47);
		lstData.add(true);
		lstData.add(new Object());
		lstData.add("Live");
		lstData.add(634.764f);
		lstData.add(lstData);
		
		System.out.println(lstData);
		
		System.out.println("****************");
		
		lstData.remove(4);
		lstData.remove(5);
		lstData.remove(6);
		
//		for (Object i:lstData) {
//			System.out.println(i);	
//		}
	}

}