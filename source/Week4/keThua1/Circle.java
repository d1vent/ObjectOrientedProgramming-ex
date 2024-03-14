package Week4.keThua1;

public class Circle {
    private double radius;
    private String color;
    protected static final double PI = Math.PI;

    /**
     * Contructor 1.
     */
    public Circle() {
    }

    /**
     * Contructor 2.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Contructor 3.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * get r.
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set radius.
     * @param radius r
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get color.
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * set color.
     * @param color color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * cal the area.
     * @return area
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color =" + color + "]";
    }
}
