package Week7.exam2;

public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Construct 1.
     * @param center center
     * @param radius radius
     */

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Get center of the circle.
     * @return center
     */

    public Point getCenter() {
        return center;
    }

    /**
     * Set center of the circle.
     * @param center center
     */

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Get radius of the circle.
     * @return radius
     */

    public double getRadius() {
        return radius;
    }

    /**
     * Set radius of the circle.
     * @param radius radius
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get the area of the circle.
     * @return area
     */

    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Get the perimeter of the circle.
     * @return perimeter
     */

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]",
                center.getPointX(), center.getPointY(), radius);
    }
}

