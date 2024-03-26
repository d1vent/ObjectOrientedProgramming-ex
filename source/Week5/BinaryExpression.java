package Week5;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Contructor 1.
     * @param left left
     * @param right right
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public abstract String toString();

    public abstract double evaluate();
}
