package Week5;

public class Division extends BinaryExpression {
    /**
     * Constructor for the division class.
     * @param left the left expression
     * @param right the right expression
     */

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        if (right.evaluate() == 0) {
                throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return left.evaluate() / right.evaluate();
        }
    }

    /**
     * Returns the string representation of the division expression.
     * @return the string representation of the division expression
     */

    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }
}
