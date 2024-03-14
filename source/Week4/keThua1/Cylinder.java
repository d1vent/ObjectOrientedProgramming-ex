package Week4.keThua1;

public class Cylinder extends Circle {
    private double height;

    /**
     * Constructor 1.
     */

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    /**
     * Constructor 2.
     * @param radius r
     */

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }
    /**
     * Constructor 3.
     * @param radius r
     * @param height h
     */

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor 4.
     * @param radius r
     * @param color c
     * @param height h
     */

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Getter for the height.
     * @return height
     */

    public double getHeight() {
        return height;
    }

    /**
     * Setter for the height.
     * @param height height
     */

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the volume of the cylinder.
     * @return v
     */

    public double getVolume() {
        return getArea() * height;
    }

    /**
     * Overrides the toString method.
     */

    @Override
    public String toString() {
        return "Cylinder[Circle[radius=" + getRadius() + ",color="
                + getColor() + "],height=" + getHeight() + "]";
    }

    /**
     * Overrides the getArea method.
     */

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}