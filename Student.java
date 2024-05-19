  
public class student {
	
	float Marks[] = {64, 86, 97, 46, 67, 58};
	
	public void avarage() {
		float sum = 0;
		float avg;
		int i;
		
		for (int i1=0; i1<Marks.length; i1++) {
			sum = sum + Marks[i1];
	}
    System.out.println("Total marks obtained is "+ sum);
		avg = sum/Marks.length;
		System.out.println(avg);
}
}