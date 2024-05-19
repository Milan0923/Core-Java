public class Addition {
	
	float Marks[] = {54, 43, 34, 64, 46};
	
	public void avarage() {
		float sum = 0;
		float avg;
		int i;
		
		for (int i1=0; i1<Marks.length; i1++) {
		    sum = sum + Marks[i1];
		}
		System.out.println("Total marks obtained are "+sum);
		avg = sum/Marks.length;
		System.out.println(avg);
	}
}
