package Lab_2.Problem4;

public class Parallel extends Circuit{
	private Circuit first;
	private Circuit second;
	private double potentialDiff;
	
	public Parallel(Circuit first, Circuit second) {
		this.first = first;
		this.second = second;
		potentialDiff = 0.0;
	}

	public double getResistance() {
		return 1.0/(1.0/first.getResistance() + 1.0/second.getResistance());
	}

	public double getPotentialDiff() {
		return potentialDiff;
	}

	
	public void applyPotentialDiff(double v) {
		potentialDiff = v;

        first.applyPotentialDiff(v);
        second.applyPotentialDiff(v);
		
	}

}
