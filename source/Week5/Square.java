package Week5;

public class Square extends Expression {
    private Expression expression;

    /**
     * Constructor 1.
     * @param expression exp
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * override toString method.
     * @return exp
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
