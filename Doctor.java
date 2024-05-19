
public class Doctor {
	String hospitalName;
	String specialist;
	String docName;
	int licensceNo;
	String[] services;
	
	public Doctor() {
		
	    hospitalName = "Vidhansabha";
		specialist = "Gupta-Rog";
		docName = "Dr. Vaidhya Joshi";
		licensceNo = 969696;
		services = new String[] {"Heart Disease", "Lungs Cancer", "Brain damage"};
		
	}
	
	public Doctor(String hospName, String spec, String dName, int licNo, String[] ser) {
		
		hospitalName = hospName;
		specialist = spec;
		docName = dName;
		licensceNo = licNo;
		services = ser;
		
	}
	
	public void Doc() {
		System.out.println("Doctor's details are as follows :");
		System.out.println(hospitalName);
		System.out.println(specialist);
		System.out.println(docName);
		System.out.println(licensceNo);
		for(int i=0; i<services.length; i++) {
			System.out.println(services[i]);
		}
	}	
}
