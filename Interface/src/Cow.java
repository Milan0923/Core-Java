
public class Cow implements Harbivores {
	
	String habitat;
	
	public Cow() {
		super();
		habitat = "Forest";
	}
	
	public Cow(String habitat) {
		super();
		this.habitat = habitat;
	}

	public void Display() {
		System.out.println("Cow is a Harbivores animal, who eats grass.");
		
	}

	public void walks() {
		System.out.println("This animal walks on four legs and provide's milk.");
		
	}

}
