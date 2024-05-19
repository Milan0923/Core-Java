
public class Sales extends Employee {
	
	private double commissionPct;
	private int conLeads;
	
	public Sales(int eId, String eName, double basicSal,double commissionPct, int conLeads) {
		super(eId, eName, basicSal);
		this.commissionPct = commissionPct;
		this.conLeads = conLeads;
	}
	
	public Sales() {
		super();
		commissionPct = 0.02;
		conLeads = 20;
	}
	
	public Sales(double commissionPct, int conLeads) {
		super();
		this.commissionPct = commissionPct;
		this.conLeads = conLeads;
	}

	public double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}

	public int getConleads() {
		return conLeads;
	}

	public void setConleads(int conLeads) {
		this.conLeads = conLeads;
	}
	
	public String tostring() {
		return super.toString()+" "+commissionPct+" "+conLeads;
	}
	
//	public void display() {
//		System.out.println("SDE Data :");
//		System.out.println(commissionPct);
//		System.out.println(conLeads);
//	}
	
	public double calSal() {
		
		double comm = super.calSal() * commissionPct;
		double monthcomm = conLeads * comm;
		return monthcomm;
		
	}
}
