
public class BalException extends Exception {
	
	public void bal(int amt) throws BalException {
		if (amt >50000000) {
			throw new BalException();
		}
		else if (amt <500000000 && amt >1000000) {
			System.out.println("Dream balance"+amt);
		}
		else if (amt <1000000 && amt >10000) {
			System.out.println("Belongs to middle class"+amt);
		}
		else if (amt <10000) {
			System.out.println("Dreaming about balance");
		}
	}
}


