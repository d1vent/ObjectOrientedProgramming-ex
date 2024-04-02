package Week6.daHinh1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Constructor 1.
     */

    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
    }

    /**
     * Constructor 2.
     * @param width width of the rectangle
     * @param length length of the rectangle
     */

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 3.
     * @param width width of the rectangle
     * @param length length of the rectangle
     * @param color color of the rectangle
     * @param filled whether the rectangle is filled or not
     */

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Getter for width.
     * @return width of the rectangle
     */

    public double getWidth() {
        return width;
    }

    /**
     * Setter for width.
     * @param width width of the rectangle
     */

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Getter for length.
     * @return length of the rectangle
     */

    public double getLength() {
        return length;
    }

    /**
     * Setter for length.
     * @param length length of the rectangle
     */

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of the rectangle.
     * @return area of the rectangle
     */

    public double getArea() {
        return width * length;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return perimeter of the rectangle
     */

    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Overrides the toString method.
     */

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }
}
