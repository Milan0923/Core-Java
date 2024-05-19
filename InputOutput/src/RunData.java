import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class RunData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		try {
			
		    System.out.println("studId:");
		    int studId = scan.nextInt();
		    System.out.println("studName:");
		    String studName = scan.next();
		    System.out.println("fees:");
		    double fees = scan.nextDouble();
		    
		    Student st = new Student(studId, studName, fees);
		    
		
		    ObjectOutputStream oos = null;
		    FileOutputStream fos = null;
		
		
			fos = new FileOutputStream("Student.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(st);
			System.out.println(st);
			System.out.println("Hello");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
