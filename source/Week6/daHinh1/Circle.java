package Week6.daHinh1;

public class Circle extends Shape {

    protected double radius;

    /**
     * Constructor 1.
     */

    public Circle() {
        super();
        this.radius = 0;
    }

    /**
     * Constructor 2.
     * @param radius radius of the circle
     */

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor 3.
     * @param radius radius of the circle
     * @param color color of the circle
     * @param filled filled or not
     */

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Getter for radius.
     * @return radius
     */

    public double getRadius() {
        return radius;
    }

    /**
     * Setter for radius.
     * @param radius radius of the circle
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculate the area of the circle.
     * @return area
     */

    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Calculate the perimeter of the circle.
     * @return perimeter
     */

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Override toString method.
     */

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}
