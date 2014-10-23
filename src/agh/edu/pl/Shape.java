package agh.edu.pl;

/**
 * Created by student4 on 2014-10-23.
 */
abstract class Shape {
    public abstract void draw();
    public abstract void erase();
    public static Shape create(String type) {
        if (type.equals("Circle"))
            return new Circle();
        if (type.equals("Square"))
            return new Square();
        throw new RuntimeException(
                "Bad shape creation: " + type);
    }
}
