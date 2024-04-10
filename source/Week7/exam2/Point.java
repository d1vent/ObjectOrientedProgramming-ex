package Week7.exam2;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor 1.
     * @param pointX x
     * @param pointY y
     */

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Get the x coordinate of the point.
     * @return x
     */

    public double getPointX() {
        return pointX;
    }

    /**
     * Set the x coordinate of the point.
     * @param pointX x
     */

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Get the y coordinate of the point.
     * @return y
     */

    public double getPointY() {
        return pointY;
    }

    /**
     * Set the y coordinate of the point.
     * @param pointY y
     */

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculate the distance.
     * @param p the other point
     * @return distance
     */

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getPointX() - this.getPointX(), 2)
                + Math.pow(p.getPointY() - this.getPointY(), 2));
    }

    /**
     * Check equal of two points.
     * @param otherPoint the other point
     * @return true if the points are equal
     */

    public boolean equals(Point otherPoint) {
        return this.pointX == otherPoint.pointX && this.pointY == otherPoint.pointY;
    }

    /**
     * Get a string representation.
     * @return string
     */

    public String getInfo() {
        return String.format("(%.2f,%.2f)", this.getPointX(), this.getPointY());
    }
}
