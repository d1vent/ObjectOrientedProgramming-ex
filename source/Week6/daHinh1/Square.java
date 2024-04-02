package Week6.daHinh1;

public class Square extends Rectangle {

    /**
     * Constructor 1.
     */

    public Square() {
        super();
    }

    /**
     * Constructor 2.
     * @param side the side of the square
     */

    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor 3.
     * @param side the side of the square
     * @param color the color of the square
     * @param filled whether the square is filled
     */

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Get the side of the square.
     * @return the side of the square
     */

    public double getSide() {
        return getWidth();
    }

    /**
     * Set the side of the square.
     * @param side the side of the square
     */

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    /**
     * Override the setWidth method.
     */

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Override the setLength method.
     */

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Override the toString method.
     */

    @Override
    public String toString() {
        return "Square[side=" + getSide() + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }
}
