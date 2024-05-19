import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class IODemo {
	public static void main(String[] args) {
		
		FileInputStream fis;
		FileOutputStream fos;
		
		try {
			
			fis = new FileInputStream("Poem.txt");
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
