
public class Tiger implements Carnivores {
	
	String habitat;
	
	public Tiger() {
		super();
		habitat = "Forest";
	}
	
	public Tiger(String habitat) {
		super();
		this.habitat = habitat;
	}

	public void Display() {
		System.out.println("Tiger is a carnivores animal, who eats other animals or meat.");
		
	}

	public void walks() {
		System.out.println("This animal walks on four legs and live in dense forest.");
		
	}
	
	public String toString() {
		return habitat + " ";
	}
}
