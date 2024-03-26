package Week5;

public class Addition extends BinaryExpression {
    /**
     * Constructor 1.
     * @param left left
     * @param right right
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Evaluates the addition expression.
     * @return the result of the addition
     */

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

    /**
     * Returns the string representation of the addition expression.
     * @return the string representation of the addition expression
     */

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
