package Lab_1;

public class Temperature { //Problem_3
    private double value;
    private char scale; 

    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = normalizeScale(scale);
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = normalizeScale(scale);
    }

               // --------------------методы получения--------------------

    public double getCelsius() {
        if (scale == 'C') return value;
        // C = 5*(F-32)/9
        return 5.0 * (value - 32.0) / 9.0;
    }

    public double getFahrenheit() {
        if (scale == 'F') return value;
        // F = 9*(C/5)+32  == (9*C/5)+32
        return (9.0 * value / 5.0) + 32.0;
    }

    public char getScale() {
        return scale;
    }

                 // --------------------заданные методы--------------------

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = normalizeScale(scale);
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = normalizeScale(scale);
    }

              // --------------------помогает--------------------

    private char normalizeScale(char s) {
        s = Character.toUpperCase(s);
        if (s == 'C' || s == 'F') return s;
        return 'C';
    }

    public static void main(String[] args) {
        Temperature t1 = new Temperature();      
        Temperature t2 = new Temperature(100);      
        Temperature t3 = new Temperature('F');      
        Temperature t4 = new Temperature(32, 'F'); 

        System.out.println("t1: " + t1.getCelsius() + "C, " + t1.getFahrenheit() + "F");
        System.out.println("t2: " + t2.getCelsius() + "C, " + t2.getFahrenheit() + "F");
        System.out.println("t3: " + t3.getCelsius() + "C, " + t3.getFahrenheit() + "F");
        System.out.println("t4: " + t4.getCelsius() + "C, " + t4.getFahrenheit() + "F");

        t4.setBoth(0, 'C');
        System.out.println("t4 after setBoth: " + t4.getCelsius() + "C, scale=" + t4.getScale());
    }
}
