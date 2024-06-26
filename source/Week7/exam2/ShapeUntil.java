package Week7.exam2;

import java.util.List;

public class ShapeUtil {

    /**
     * Print list of shapes.
     * @param shapes list
     * @return string
     */

    public String printInfo(List<GeometricObject> shapes) {
        String result = "Circle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                result += shape.getInfo() + "\n";
            }
        }
        result += "Triangle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                result += shape.getInfo() + "\n";
            }
        }
        return result;
    }
}
