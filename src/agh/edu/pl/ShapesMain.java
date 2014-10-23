package agh.edu.pl;

/**
 * Created by student4 on 2014-10-23.
 */
import java.util.*;
public class ShapesMain {
    public static void main(String[] args) {
        String shapeList[] = {"Circle", "Square", "Square", "Circle", "Circle", "Square",};
        List<Shape> shapes = new ArrayList();
        for (String s : shapeList) {
            shapes.add(Shape.create(s));
        }
        Iterator<Shape> it = shapes.iterator();
        while (it.hasNext()) {
            Shape s = (Shape) it.next();
            s.draw();
            s.erase();
        }
    }
}
