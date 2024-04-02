package Week6.daHinh2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Layer {

    private List<Shape> shapes;

    /**
     * Constructor.
     */

    public Layer() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Add a shape to the layer.
     * @param shape the shape to add
     */

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Remove a shape from the layer.
     */

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Get information about the shapes in the layer.
     * @return a information about the shapes in the layer
     */

    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : this.shapes) {
            info.append(shape.toString()).append("\n");
        }
        return info.toString();
    }

    /**
     * Remove duplicate shapes from the layer.
     */

    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                }
            }
        }
    }
}

