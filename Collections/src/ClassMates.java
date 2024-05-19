import java.util.*;

public class ClassMates {

	public static void main(String[] args) {
		HashMap<String, Integer> mates = new HashMap<String, Integer>();
		
		mates.put("Swapnil", 987654);
		mates.put("Prasad", 7654);
		mates.put("Shivam", 984);
		mates.put("Apoorva", 17654);
		mates.put("Nidhi", 2987);
		mates.put("Hritik", 8654);
		mates.put("Devyani", 5976);
		mates.put("Priyanka", 8876531);
		mates.put("Paras", 9864);
		mates.put("Tajashri", 4965);
		mates.put("DevyaniD", 3654);
		mates.put("Sameer", 6987);
		
		System.out.println(mates);
		
		System.out.println("---------------------------------------------");
		
		System.out.println(mates.get("Nidhi"));
		
		System.out.println("---------------------------------------------");
		
		System.out.println(mates.get("Priyanka"));
		
		mates.remove("Priyanka");
		
		System.out.println("---------------------------------------------");
		
		System.out.println(mates.get("Priyanka"));
		
		System.out.println("---------------------------------------------");
		
	}
}
