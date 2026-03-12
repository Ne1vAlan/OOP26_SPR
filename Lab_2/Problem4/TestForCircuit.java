package Lab_2.Problem4;

public class TestForCircuit {
	public static void main(String[] args) {

        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);

        Circuit c1 = new Series(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Series(c1, c2);

        System.out.println("Equivalent resistance = " + circuit.getResistance());

        circuit.applyPotentialDiff(24.0);

        System.out.println("Circuit voltage = " + circuit.getPotentialDiff());
        System.out.println("Circuit current = " + circuit.getCurrent());
        System.out.println("Circuit power = " + circuit.getPower());

        System.out.println("R1 voltage = " + r1.getPotentialDiff());
        System.out.println("R2 voltage = " + r2.getPotentialDiff());
        System.out.println("R3 voltage = " + r3.getPotentialDiff());
        System.out.println("R4 voltage = " + r4.getPotentialDiff());
    }
}


