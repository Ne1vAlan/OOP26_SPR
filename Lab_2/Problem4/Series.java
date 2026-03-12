package Lab_2.Problem4;

public class Series extends Circuit{
	private Circuit first;
	private Circuit second;
	private double potentialDiff;
	
	public Series(Circuit firts, Circuit second) {
		this.first = firts;
		this.second = second;
		this.potentialDiff = 0.0;
	}
	
	public double getResistance() {
		return first.getResistance() + second.getResistance();
	}

	public double getPotentialDiff() {
		return potentialDiff;
	}

	public void applyPotentialDiff(double v) {
		potentialDiff = v;
		double totalResistance = getResistance();
		double current = v / totalResistance;
		double v1= current * first.getResistance();
		double v2 = current * second.getResistance();
		
		first.applyPotentialDiff(v1);
		second.applyPotentialDiff(v2);
		
	}
	
}
