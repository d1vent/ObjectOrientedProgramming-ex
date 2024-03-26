package Week5;

public class Numeral extends Expression {
    private double value;

    /**
     * Constructor 1.
     */
    public Numeral(){
    }

    /**
     * Constructor 2.
     * @param value val
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * override toString method.
     * @return val
     */
    @Override
    public String toString() {
        return String.format("%.0f", value);
    }

    /**
     * override evaluate method.
     * @return val
     */
    @Override
    public double evaluate() {
        return value;
    }
}
